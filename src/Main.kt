class Main {




}

fun Carrera (Estrategia: Array<String>, Circuito: String ) {

    val circuitoArray: List<String> = Circuito.split("")
    val circuito: MutableList<String> = circuitoArray.toMutableList()
    var respuestaGrafica: MutableList<String> = mutableListOf()
    var cagada: MutableList<String> = mutableListOf()

    circuito.removeAt(0)
    circuito.removeAt(circuito.size - 1)

    var suficiente: Int = 0
    var respuesta: Boolean = true
    var opcion: Int = 0

    var diferencia: Int = 0

    diferencia = circuito.size - Estrategia.size

    if (diferencia < 0 ) {
        diferencia = diferencia * -1
    }

    for (x in 0 until  diferencia) {
        cagada.add("?")
        respuesta = false
        suficiente++
    }

    for (obstaculo in circuito) {

        if (opcion < Estrategia.size  && Estrategia[opcion] == "correr") {

            if (obstaculo == "|") {
                respuestaGrafica.add("/")
                respuesta = false
            } else if (obstaculo == "_") {
                respuestaGrafica.add("_")
                if (suficiente == 0) {
                    respuesta = true
                    suficiente++
                }
            } else {
                cagada.add("?")
            }

        } else if (opcion < Estrategia.size &&  Estrategia[opcion] == "saltar") {

            if (obstaculo == "|") {
                respuestaGrafica.add("|")
                if (suficiente == 0) {
                    respuesta = true
                    suficiente++
                }
            } else if (obstaculo == "_") {
                respuestaGrafica.add("x")
                    respuesta = false
                    suficiente++

            } else {
                cagada.add("?")
            }
        }
        opcion++
    }

   if (respuesta) {
       println("$respuestaGrafica$cagada true")
   } else if (respuesta == false) {
       println("$respuestaGrafica$cagada false")
   }
}

fun main () {

    val lista = arrayOf("correr", "saltar", "correr", "saltar", "correr")
    Carrera( lista,"_|_|_")
    val lista2 = arrayOf("correr", "correr", "correr", "saltar", "correr")
    Carrera( lista2,"_|_|_")
    val lista3 = arrayOf("correr", "correr", "saltar", "saltar", "correr")
    Carrera( lista3,"_|_|_")
    val lista4 = arrayOf("correr", "correr", "saltar", "saltar", "correr")
    Carrera( lista4,"_|_|_|_")
    val lista5 = arrayOf("correr", "saltar", "correr", "saltar")
    Carrera( lista5,"_|_|_")
    val lista6 = arrayOf("correr", "saltar", "correr", "saltar", "correr", "saltar", "correr")
    Carrera( lista6,"_|_|_")
    val lista7 = arrayOf("saltar", "saltar", "saltar", "saltar", "saltar")
    Carrera( lista7,"|||||")
    val lista8 = arrayOf("saltar", "saltar", "saltar", "saltar", "saltar")
    Carrera( lista8,"||_||")


}