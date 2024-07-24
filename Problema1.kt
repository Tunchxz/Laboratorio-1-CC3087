fun decimalABinario(numero: Int): String {
    if (numero == 0) return "0"
    
    var variable = numero
    var resultado = ""
    
    while(variable != 0) {
        if (variable % 2 == 0){
            resultado += "0"
        } else if (variable % 2 != 0){
            resultado += "1"
        }
        variable = variable/2
    }
    return resultado.reversed()
}

fun main() {
    println("\nIngresa un numero en base decimal: ")
    val numeroAConvertir = readLine()?.toIntOrNull()
    
    if (numeroAConvertir != null) {
        println("$numeroAConvertir en bianrio es ${decimalABinario(numeroAConvertir)}.\n")
    } else {
        println("\nIngresa un número válido.\n")
    }
}