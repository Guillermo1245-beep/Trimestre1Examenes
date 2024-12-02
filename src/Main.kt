class Main {




}

fun Matrices (lista: MutableList<MutableList<String>>): String {


    var MatrizAlineada: MutableList<String> = mutableListOf()
    var ganador: String = "Empate"
    var X: Int = 0
    var O: Int = 0

    for (Linea in lista) {
        for (valor in Linea) {
            MatrizAlineada.add(valor)
            if (valor == "X") {
                X++
            } else if (valor == "O"){
                O++
            }
        }
    }

    // revisar verticales
    for (x in 0..2) {
        if (MatrizAlineada[x] == "X" && MatrizAlineada[x + 3] == "X" && MatrizAlineada[x + 3] == "X") {
            ganador = "X"
        } else if (MatrizAlineada[x] == "O" && MatrizAlineada[x + 3] == "O" && MatrizAlineada[x + 3] == "O") {
            ganador = "O"
        }
    }

    // revisar horizontales
    var multiplo: Int = 0
    for ( x in 0 .. 2) {
        if (MatrizAlineada[multiplo] == "X" && MatrizAlineada[multiplo + 1] == "X" && MatrizAlineada[multiplo + 2] == "X") {
            ganador ="X"
        } else if (MatrizAlineada[multiplo] == "O" && MatrizAlineada[multiplo + 1] == "O" && MatrizAlineada[multiplo + 2] == "O") {
            ganador = "O"
        }
        multiplo = multiplo + 3
    }

    //revisar diagonales

    if ((MatrizAlineada[0] == "X" && MatrizAlineada[4] == "X" && MatrizAlineada[8] == "X")) {
        ganador = "X"
    } else if (MatrizAlineada[0] == "O" && MatrizAlineada[4] == "O" && MatrizAlineada[8] == "O"){
        ganador= "O"
    }

    if ((MatrizAlineada[2] == "X" && MatrizAlineada[4] == "X" && MatrizAlineada[6] == "X")) {
        ganador = "X"
    } else if (MatrizAlineada[2] == "O" && MatrizAlineada[4] == "O" && MatrizAlineada[6] == "O") {
        ganador= "O"
    }


   if (X - O > 1 || O - X > 1) {
       return "null"
   } else {
       return ganador
   }

}


fun main () {

    var linea1m1: MutableList<String> = mutableListOf("X", "O", "X")
    var linea2m1: MutableList<String> = mutableListOf("O", "X", "O")
    var linea3m1: MutableList<String> = mutableListOf("O", "O", "X")
    var Matriz1 : MutableList<MutableList<String>> = mutableListOf(linea1m1,linea2m1,linea3m1)
    var linea1m2: MutableList<String> = mutableListOf("", "O", "X")
    var linea2m2: MutableList<String> = mutableListOf("", "X", "O")
    var linea3m2: MutableList<String> = mutableListOf("", "O", "X")
    var Matriz2 : MutableList<MutableList<String>> = mutableListOf(linea1m2,linea2m2,linea3m2)
    var linea1m3: MutableList<String> = mutableListOf("O", "O", "O")
    var linea2m3: MutableList<String> = mutableListOf("O", "X", "X")
    var linea3m3: MutableList<String> = mutableListOf("O", "X", "X")
    var Matriz3 : MutableList<MutableList<String>> = mutableListOf(linea1m3,linea2m3,linea3m3)
    var linea1m4: MutableList<String> = mutableListOf("X", "O", "X")
    var linea2m4: MutableList<String> = mutableListOf("X", "X", "O")
    var linea3m4: MutableList<String> = mutableListOf("X", "X", "X")
    var Matriz4 : MutableList<MutableList<String>> = mutableListOf(linea1m4,linea2m4,linea3m4)

    println(Matrices(Matriz1))
    println(Matrices(Matriz2))
    println(Matrices(Matriz3))
    println(Matrices(Matriz4))

}