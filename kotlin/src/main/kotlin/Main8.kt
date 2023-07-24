fun main() {
    val str = "Programação Kotlin."

    println("Tamanho da String: ${str.length}")

    println("Posição (Index) 0 da String: ${str[0]}")

    println(str.startsWith(prefix = "Pro"))

    println(str.endsWith(suffix = "abc"))

    println(str.substring(startIndex = 2, 4))

    println(str.replace("Kotlin", "Kotlin é Show !"))

    println(str.lowercase())

    println(str.uppercase())

println("     Meu nome é      ".trim())




}