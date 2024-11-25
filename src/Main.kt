import java.util.*

class Main {




}

fun Parecido () {

    //aaaaaaaaaaaaa

    val sc = Scanner(System.`in`)

    println("Ponga la primera palabra")
    val primeraPalabra = sc.nextLine()
    println(primeraPalabra)
    println("Ponga la segunda palabra")
    val segundaPalabra = sc.nextLine()



    val frase1: List<String> = primeraPalabra.split("")
    val frase2: List<String> = segundaPalabra.split("")


    if (frase1.size != frase2.size){
        return println("Las palabras $primeraPalabra y $segundaPalabra son iguales = false")
    }

    var contador: Int = 0
    for (letra1 in frase1.indices){
        for (letra2 in frase2.indices){
            if (letra1 == letra2){
                contador++
                break
            }
        }
    }

    if (contador == frase1.size){
        return println("Las palabras $primeraPalabra y $segundaPalabra son iguales = true")
    } else {
        return println("Las palabras $primeraPalabra y $segundaPalabra son iguales = false")
    }

}


fun main () {

    Parecido()

}