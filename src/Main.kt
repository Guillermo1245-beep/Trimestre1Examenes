import java.util.*

class Main {




}

fun telefono () {

    var contacto1: Contacto = Contacto("Manuela", "32412423")
    var contacto2: Contacto = Contacto("Manuela", "324124")
    var contacto3: Contacto = Contacto("Manuela", "324124")
    var contactos: MutableList<Contacto> = mutableListOf(contacto1, contacto2, contacto3)
    var medidor: Int = 0
    val sc = Scanner(System.`in`)

    println("1. Añadir contacto")
    println("2. Listar contactos")
    println("3. Buscar contacto")
    println("4. Existe contacto")
    println("5. Eliminar contacto")
    println("6. Contactos disponibles")
    println("7. Agenda llena")
    println("8. Salir")
    println("Escriba una de las opciones")
    val opcion = sc.nextLine()

    //Echo
    if (opcion == "1") {

        println("Introduzca el nombre y telefono del contacto")
        val nombre = sc.nextLine()
        val telefono = sc.nextLine()
        var nuevoContacto: Contacto = Contacto(nombre, telefono)


        if (contactos.size < 10) {
            contactos.add(nuevoContacto)
        } else {
            println("Lista de contactos llena")
            return
        }

    //Echo
    } else if (opcion == "2") {

        if (contactos.size > 0) {
            for (contacto in contactos) {
                println(contacto.nombre)
            }
        } else {
            println("Lista de contactos vacia")
            return
        }

    //
    } else if (opcion == "3") {

        println("Introduzca el contacto")
        val contactoAbuscar = sc.nextLine()

        if (contactos.size > 0) {
            for (contacto in contactos) {
                if (contacto == contactoAbuscar){

                }
            }

        } else {
            println("Lista de contactos llena")
            return
        }

    } else if (opcion == "4") {

    } else if (opcion == "5") {

    } else if (opcion == "6") {

    } else if (opcion == "7") {

    } else if (opcion == "8") {

    } else {
        return
    }


}


fun main () {

    telefono()

}