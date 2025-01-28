fun main(){
    //Creamos los domicilios
    val domicilio1 = Domicilio("Calle Las Flores", 355)
    val domicilio2 = Domicilio("Mirasol", 218)
    val domicilio3 = Domicilio("La Mancha", 761)

    //Luego, anexamos los domicilios a los clientes
    val cliente1 = Cliente("Nuria Costa", domicilio1)
    val cliente2 = Cliente("Jorge Russo", domicilio2)
    val cliente3 = Cliente("Julián Rodriguez", domicilio3)

    //Unimos los clientes a una compra
    val compra1 = Compra(cliente1, 5, 12780.78)
    val compra2 = Compra(cliente2, 7, 699.0)
    val compra3 = Compra(cliente1, 7, 532.90)
    val compra4 = Compra(cliente3, 12, 5715.99)
    val compra5 = Compra(cliente2, 15, 958.0)

    //Creamos una variable para la clase y agregamos las compras a la variable
    val repositorio = RepositorioCompras()
    repositorio.agregarCompra(compra1)
    repositorio.agregarCompra(compra2)
    repositorio.agregarCompra(compra3)
    repositorio.agregarCompra(compra4)
    repositorio.agregarCompra(compra5)

    //Por último, asignamos la variable a otra nueva que va a eliminar los domicilios duplicados
    val domiciliosUnicos = repositorio.domicilios()
    println("Domicilios únicos a los que se debe enviar factura:")
    domiciliosUnicos.forEach { println(it) }
}