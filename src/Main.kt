fun comprobacionMatematica() {
    var comprobacion1: String = "{a + b [c] * (2x2)}}}}"
    var comprobacion2: String = "{ [ a * ( c + d ) ] - 5 }"
    var comprobacion3: String = "{ a * ( c + d ) ] - 5 }"
    var comprobacion4: String = "{a^4 + (((ax4)}"
    var comprobacion5: String = "{ ] a * ( c + d ) + ( 2 - 3 )[ - 5 }"
    var comprobacion6: String = "{{{{{{(}}}}}}"
    var comprobacion7: String = "(a"

    val frase1: List<String> = comprobacion1.split("")
    val frase2: List<String> = comprobacion2.split("")
    val frase3: List<String> = comprobacion3.split("")
    val frase4: List<String> = comprobacion4.split("")
    val frase5: List<String> = comprobacion5.split("")
    val frase6: List<String> = comprobacion6.split("")
    val frase7: List<String> = comprobacion7.split("")

    var operaciones: MutableList<List<String>> = mutableListOf(frase1, frase2, frase3, frase4, frase5, frase6, frase7)

    for (operacion in operaciones) {
        var ListraFiltrada: MutableList<String> = mutableListOf()
        var funciona: Boolean = true

        for (simbolo in operacion) {

            if (simbolo == "(" || simbolo == "{" || simbolo == "[") {
                ListraFiltrada.add(simbolo)
            }

            if (simbolo == ")" || simbolo == "}" || simbolo == "]") {
                if (ListraFiltrada.isEmpty()) {
                    funciona = false
                    break
                }

                if (ListraFiltrada.last() == "(" && simbolo == ")") {
                    ListraFiltrada.removeAt(ListraFiltrada.size - 1)
                } else if (ListraFiltrada.last() == "{" && simbolo == "}") {
                    ListraFiltrada.removeAt(ListraFiltrada.size - 1)
                } else if (ListraFiltrada.last() == "[" && simbolo == "]") {
                    ListraFiltrada.removeAt(ListraFiltrada.size - 1)
                } else {
                    funciona = false
                }
            }
        }

        if (ListraFiltrada.size == 0 && funciona) {
            println("¿Está balanceada? = true")
        } else {
            println("¿Está balanceada? = false")
        }
    }
}

fun main() {
    comprobacionMatematica()
}