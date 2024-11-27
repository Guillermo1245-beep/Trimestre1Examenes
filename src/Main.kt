class Main {




}

fun Carrera (Estrategia: Array<String>, Circuito: String ): Boolean {

    val circuito: List<String> = Circuito.split("")
    var respuestaGrafica: MutableList<String> = mutableListOf()
    var cagada: MutableList<String> = mutableListOf()
    var respuesta: Boolean = true
    var opcion: Int = 0
    for (obstaculo in circuito){

        if (opcion <= circuito.size && Estrategia[opcion] == "correr") {

            if (obstaculo == "|") {
                respuestaGrafica.add("/")
                respuesta = false
            } else if (obstaculo == "_") {
                respuestaGrafica.add("_")
                respuesta = true
            } else {
                cagada.add("?")
            }

        } else if (opcion <= circuito.size &&  Estrategia[opcion] == "saltar") {

            if (obstaculo == "|") {
                respuestaGrafica.add("|")
                respuesta = true
            } else if (obstaculo == "x") {
                respuesta = false
            } else {
                cagada.add("?")
            }
        }
        opcion++
    }


}

fun main () {

    var lista: Array<String> = ArrayList()
    Carrera( lista,"_|_|_")

}