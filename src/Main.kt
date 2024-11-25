class Main {




}

fun tablaMultiplicar() {

    var numero : Int = 0
    for (x in 0 .. 100) {
        var respuesta: Boolean = false

        if (numero % 3 == 0 && numero % 5 == 0){
            println("triqui")
            respuesta = true
        } else if (numero % 3 == 0 && respuesta == false){
            println("tri")
        } else if (numero % 5 == 0 && respuesta == false) {
            println("qui")
        } else {
            println(numero)
        }
        numero++
    }

}


fun main () {

    tablaMultiplicar()

}