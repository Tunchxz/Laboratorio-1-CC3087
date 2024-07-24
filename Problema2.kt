val palabrasDelUsuario: MutableList<String> = mutableListOf()
var contadorPalindromas: Int = 0
var contadorVocales: Int = 0
var contadorConsonantes: Int = 0

fun nuevasPalabras() {
    println("\nIngresa una nueva palabra:")
    val palabra = readLine().toString().lowercase()
    palabrasDelUsuario.add(palabra)
}

fun esPalindroma(palabra: String) = palabra == palabra.reversed()

fun tieneDosVocalesDistintas(palabra: String): Boolean {
    val vocales = setOf('a', 'e', 'i', 'o', 'u')
    val vocalesDistintas = palabra.filter { it in vocales }.toSet()
    return vocalesDistintas.size >= 2
}

fun iniciaConConsonante(palabra: String): Boolean {
    val primerCaracter = palabra.first().lowercaseChar()
    val consonantes = "bcdfghjklmnpqrstvwxyz"
    return primerCaracter in consonantes
}

fun main() {
    while (true) {
        println("\n¿Deseas agregar una nueva palabra?\n1. Si\n2. No")
        val opcion = readLine()?.toIntOrNull()
        when (opcion) {
            1 -> nuevasPalabras()
            2 -> break
            else -> println("\nIngresa una opción válida del menú.")
        }
    }
    
    for (palabra in palabrasDelUsuario) {
        if (esPalindroma(palabra)) {
            contadorPalindromas++
        }
        if (tieneDosVocalesDistintas(palabra)) {
            contadorVocales++
        }
        if (iniciaConConsonante(palabra)) {
            contadorConsonantes++
        }
    }

    println("\nCantidad de palabras palíndromas: $contadorPalindromas")
    println("Cantidad de palabras que tienen 2 vocales distintas: $contadorVocales")
    println("Cantidad de palabras que inician con consonante: $contadorConsonantes\n")
}