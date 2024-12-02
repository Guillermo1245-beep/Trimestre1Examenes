import java.util.*

class Main {




}

var contactos: MutableList<Contacto> = mutableListOf()
val sc = Scanner(System.`in`)

fun MenuInicial () {

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
        opcion1(contactos)
    } else if (opcion == "2") {
        opcion2(contactos)
    } else if (opcion == "3") {
        opcion3(contactos)
    } else if (opcion == "4") {
        opcion4(contactos)
    } else if (opcion == "5") {
        opcion5(contactos)
    } else if (opcion == "6") {
        opcion6(contactos)
    } else if (opcion == "7") {
        opcion7(contactos)
    } else if (opcion == "8") {
        return
    } else {
        return
    }
}

//Funciona correctamente
fun opcion1 (contactos:MutableList<Contacto>) {

    var existente: Boolean = false
    println("Introduzca el nombre del contacto")
    val nuevoNombre = sc.nextLine()
    println("Introduzca el telefono del contacto")
    val nuevoTelefono = sc.nextLine()
    var nuevoContacto: Contacto = Contacto(nuevoNombre, nuevoTelefono)


    if  (contactos.size == 10) {
        println("Lista de contactos llena")
        MenuInicial()
    }

    for (contacto in contactos) {
        if (contacto.nombre.lowercase() == nuevoNombre.lowercase() || contacto.telefono.lowercase() == nuevoTelefono.lowercase()) {
            existente = true
        }
    }

    if (existente == true) {
        println("Ese nombre o telefono ya existe")
    } else if (existente == false){
        contactos.add(nuevoContacto)
    }

    MenuInicial()
}

//Funciona correctamente
fun opcion2 (contactos:MutableList<Contacto>) {

    if (contactos.size > 0) {
        for (contacto in contactos) {
            println("nombre = " + contacto.nombre +", Teléfono = " + contacto.telefono)
        }
        MenuInicial()
    } else {
        println("Lista de contactos vacia")
        MenuInicial()
    }



}

fun opcion3 (contactos:MutableList<Contacto>) {


    println("Introduzca el contacto")
    val contactoAbuscar = sc.nextLine()
    var telefono: String = ""
    var encontrado: Boolean = false

    if (contactos.size > 0) {
        for (contacto in contactos) {
            if (contacto.nombre.lowercase() == contactoAbuscar.lowercase()){
                telefono = contacto.telefono
                encontrado = true
            }
        }
    } else {

    }

    if (encontrado == true) {
        println("Su telefono es $telefono")
    } else if (encontrado == false){
        println("No se ha encontrado el contacto")
    }
    MenuInicial()

}

fun opcion4 (contactos:MutableList<Contacto>) {


    println("Introduzca el contacto")
    val contactoAbuscar = sc.nextLine()
    var telefono: String = ""
    var encontrado: Boolean = false

    if (contactos.size > 0) {
        for (contacto in contactos) {
            if (contacto.nombre.lowercase() == contactoAbuscar.lowercase()) {
                encontrado = true
            }
        }
    }

    if (encontrado == true) {
        println("Existe contacto")
    } else if (encontrado == false){
        println("No existe contacto")
    }
    MenuInicial()


}

fun opcion5 (contactos:MutableList<Contacto>) {


    println("Introduzca el contacto")
    val contactoAbuscar = sc.nextLine()
    var encontrado: Boolean = false
    var indice: Int = 0

    if (contactos.size > 0) {
        for (contacto in contactos) {
            if (contacto.nombre.lowercase() == contactoAbuscar.lowercase()) {
                contactos.removeAt(indice)
                encontrado = true
                break
            }
            indice++
        }
    }

    if (encontrado == true) {
        println("Borrado con exito")
        MenuInicial()
    } else if (encontrado == false) {
        println("No se ha eliminado el contacto")
        MenuInicial()
    }

}

fun opcion6 (contactos:MutableList<Contacto>) {


    var espacio: Int = 10 - contactos.size
    println("Hay $espacio contacos libres")
    MenuInicial()

}

fun opcion7 (contactos:MutableList<Contacto>) {

    if (contactos.size == 10) {
        println("La agenda esta llena")
        MenuInicial()
    } else {
        println("Todavia queda espacio")
        MenuInicial()
    }

}



fun main () {

    MenuInicial()

}