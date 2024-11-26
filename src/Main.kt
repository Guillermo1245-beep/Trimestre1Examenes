class Main {




}

fun comprobacionMatematica () {

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
        var Listacontador: Int = 0
        for (simbolo in operacion) {

            if (simbolo == "(" || simbolo == "{" || simbolo == "[" || simbolo == ")" || simbolo == "}" || simbolo == "]") {
                ListraFiltrada.add(simbolo)
                Listacontador++
            }

            if (Listacontador > 0) {
                if (ListraFiltrada[Listacontador] == ListraFiltrada[Listacontador - 1]) {
                    ListraFiltrada.removeAt(Listacontador)
                    Listacontador--
                }
            }
        }

        if (ListraFiltrada.size == 0) {
            println("Operacion Matematica correcta")
        } else {
            println("Operacion Matematica incorrecta")
            println(ListraFiltrada)
        }
    }
}

fun main () {

    comprobacionMatematica()

}

/*
C:\Users\guillermo.garcia\.jdks\openjdk-23\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.2.3\lib\idea_rt.jar=51309:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.2.3\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\guillermo.garcia\Documents\Trimestre1Examenes\out\production\ExamenesTrimestre1;C:\Users\guillermo.garcia\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib\2.0.20\kotlin-stdlib-2.0.20.jar;C:\Users\guillermo.garcia\.m2\repository\org\jetbrains\annotations\13.0\annotations-13.0.jar MainKt
Operacion Matematica incorrecta
[{, [, ], (, ), }, }, }, }]
Operacion Matematica incorrecta
[{, [, (, ), ], }]
Operacion Matematica incorrecta
[{, (, ), ], }]
Operacion Matematica incorrecta
[{, (, (, (, ), }]
Operacion Matematica incorrecta
[{, ], (, ), (, ), [, }]
Operacion Matematica incorrecta
[{, {, {, {, {, {, (, }, }, }, }, }, }]
Operacion Matematica incorrecta
[(]

Process finished with exit code 0

*/