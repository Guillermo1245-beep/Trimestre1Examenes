class Main {




}

fun Carrera (Estrategia: Array<String>, Circuito: String ): Boolean {

    val circuito: List<String> = Circuito.split("")
    var respuestaGrafica: MutableList<String> = mutableListOf()
    var cagada: MutableList<String> = mutableListOf()
    var respuesta: Boolean = true
    var opcion: Int = 0
    for (obstaculo in circuito){

        if (Estrategia[opcion] == "correr") {

            if (circuito.equals("|")) {
                respuestaGrafica.add("/")
                respuesta = false
            } else if (circuito.equals("_")) {
                respuestaGrafica.add("_")
                respuesta = true
            } else {
                cagada.add("?")
            }

        } else if (Estrategia[opcion] == "saltar") {

            if (circuito.equals("|")) {
                respuestaGrafica.add("|")
                respuesta = true
            } else if (circuito.equals("x")) {
                respuesta = false
            } else {
                cagada.add("?")
            }
        }
    }

    println"respuestaGrafica"
}

fun main () {

    Carrera()

}