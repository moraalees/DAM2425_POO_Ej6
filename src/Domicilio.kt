data class Domicilio(val calle: String, val numero: Int){

    fun dirCompleta(): String {
        return "Calle: $calle, Número: $numero."
    }

}