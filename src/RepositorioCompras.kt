class RepositorioCompras{

    private val compras = mutableListOf<Compra>()

    fun agregarCompra(compra: Compra){
        compras.add(compra)
    }

    fun domicilios(): Set<String>{
        return compras.map { it.cliente.domicilio.dirCompleta() }.toSet()
    }

}