import java.util.*

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



    var respuesta1: Boolean = false
    var corcheteizq1: Int = 0
    var corcheteder1: Int = 0
    var parentesisizq1: Int = 0
    var parentesisder1: Int = 0
    var apostrodeizq1: Int = 0
    var apostofreder1: Int = 0
    for (letra in comprobacion1) {


        if (letra == '(') {
            corcheteizq1++
        } else if (letra == ')') {
            corcheteder1++
        } else if (letra == '[') {
            parentesisizq1++
        } else if (letra == ']') {
            parentesisder1++
        } else if (letra == '{') {
            apostrodeizq1++
        } else if (letra == '}') {
            apostofreder1++
        }

        if ((corcheteizq1 == corcheteder1) && (parentesisizq1 == parentesisder1) && (apostrodeizq1 == apostofreder1)) {
            respuesta1 = true
        }

    }

    if (respuesta1 == true) {
        println ("Correcto equacion1")
    } else {
        println ("Incorrecto equacion1")
    }

    var respuesta2: Boolean = false
    var corcheteizq2: Int = 0
    var corcheteder2: Int = 0
    var parentesisizq2: Int = 0
    var parentesisder2: Int = 0
    var apostrodeizq2: Int = 0
    var apostofreder2: Int = 0
    for (letra in comprobacion1) {


        if (letra == '(') {
            corcheteizq2++
        } else if (letra == ')') {
            corcheteder2++
        } else if (letra == '[') {
            parentesisizq2++
        } else if (letra == ']') {
            parentesisder2++
        } else if (letra == '{') {
            apostrodeizq2++
        } else if (letra == '}') {
            apostofreder2++
        }

        if ((corcheteizq2 == corcheteder2) && (parentesisizq2 == parentesisder2) && (apostrodeizq2 == apostofreder2)) {
            respuesta2 = true
        }

    }

    if (respuesta2 == true) {
        println ("Correcto equacion2")
    } else {
        println ("Incorrecto equacion2")
    }

    var respuesta3: Boolean = false
    var corcheteizq3: Int = 0
    var corcheteder3: Int = 0
    var parentesisizq3: Int = 0
    var parentesisder3: Int = 0
    var apostrodeizq3: Int = 0
    var apostofreder3: Int = 0
    for (letra in comprobacion2) {


        if (letra == '(') {
            corcheteizq3++
        } else if (letra == ')') {
            corcheteder3++
        } else if (letra == '[') {
            parentesisizq3++
        } else if (letra == ']') {
            parentesisder3++
        } else if (letra == '{') {
            apostrodeizq3++
        } else if (letra == '}') {
            apostofreder3++
        }

        if ((corcheteizq3 == corcheteder3) && (parentesisizq3 == parentesisder3) && (apostrodeizq3 == apostofreder3)) {
            respuesta3 = true
        }

    }

    if (respuesta3 == true) {
        println ("Correcto equacion3")
    } else {
        println ("Incorrecto equacion3")
    }

    var respuesta4: Boolean = false
    var corcheteizq4: Int = 0
    var corcheteder4: Int = 0
    var parentesisizq4: Int = 0
    var parentesisder4: Int = 0
    var apostrodeizq4: Int = 0
    var apostofreder4: Int = 0
    for (letra in comprobacion3) {


        if (letra == '(') {
            corcheteizq4++
        } else if (letra == ')') {
            corcheteder4++
        } else if (letra == '[') {
            parentesisizq4++
        } else if (letra == ']') {
            parentesisder4++
        } else if (letra == '{') {
            apostrodeizq4++
        } else if (letra == '}') {
            apostofreder4++
        }

        if ((corcheteizq4 == corcheteder4) && (parentesisizq4 == parentesisder4) && (apostrodeizq4 == apostofreder4)) {
            respuesta4 = true
        }

    }

    if (respuesta4 == true) {
        println ("Correcto equacion4")
    } else {
        println ("Incorrecto equacion4")
    }

    var respuesta5: Boolean = false
    var corcheteizq5: Int = 0
    var corcheteder5: Int = 0
    var parentesisizq5: Int = 0
    var parentesisder5: Int = 0
    var apostrodeizq5: Int = 0
    var apostofreder5: Int = 0
    for (letra in comprobacion4) {


        if (letra == '(') {
            corcheteizq5++
        } else if (letra == ')') {
            corcheteder5++
        } else if (letra == '[') {
            parentesisizq5++
        } else if (letra == ']') {
            parentesisder5++
        } else if (letra == '{') {
            apostrodeizq5++
        } else if (letra == '}') {
            apostofreder5++
        }

        if ((corcheteizq5 == corcheteder5) && (parentesisizq5 == parentesisder5) && (apostrodeizq5 == apostofreder5)) {
            respuesta5 = true
        }

    }

    if (respuesta5 == true) {
        println ("Correcto equacion5")
    } else {
        println ("Incorrecto equacion5")
    }

    var respuesta6: Boolean = false
    var corcheteizq6: Int = 0
    var corcheteder6: Int = 0
    var parentesisizq6: Int = 0
    var parentesisder6: Int = 0
    var apostrodeizq6: Int = 0
    var apostofreder6: Int = 0
    for (letra in comprobacion5) {


        if (letra == '(') {
            corcheteizq6++
        } else if (letra == ')') {
            corcheteder6++
        } else if (letra == '[') {
            parentesisizq6++
        } else if (letra == ']') {
            parentesisder6++
        } else if (letra == '{') {
            apostrodeizq6++
        } else if (letra == '}') {
            apostofreder6++
        }

        if ((corcheteizq6 == corcheteder6) && (parentesisizq6 == parentesisder6) && (apostrodeizq6 == apostofreder6)) {
            respuesta6 = true
        }

    }

    if (respuesta6 == true) {
        println ("Correcto equacion6")
    } else {
        println ("Incorrecto equacion6")
    }

    var respuesta7: Boolean = false
    var corcheteizq7: Int = 0
    var corcheteder7: Int = 0
    var parentesisizq7: Int = 0
    var parentesisder7: Int = 0
    var apostrodeizq7: Int = 0
    var apostofreder7: Int = 0
    for (letra in comprobacion6) {


        if (letra == '(') {
            corcheteizq7++
        } else if (letra == ')') {
            corcheteder7++
        } else if (letra == '[') {
            parentesisizq7++
        } else if (letra == ']') {
            parentesisder7++
        } else if (letra == '{') {
            apostrodeizq7++
        } else if (letra == '}') {
            apostofreder7++
        }

        if ((corcheteizq7 == corcheteder7) && (parentesisizq7 == parentesisder7) && (apostrodeizq7 == apostofreder7)) {
            respuesta7 = true
        }

    }

    if (respuesta7 == true) {
        println ("Correcto equacion7")
    } else {
        println ("Incorrecto equacion7")
    }
}


fun main () {

    comprobacionMatematica()

}