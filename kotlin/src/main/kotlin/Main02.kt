fun conversaoAnos(anos: Int) {
    println("${anos} ano(s) equivalem a:")
    println("${anos * 12} meses")
    println("${anos * 365} dias")
    println("${anos * 365 * 24} horas")
    println("${anos * 365 * 24 * 60} minutos")
    println("${anos * 365 * 24 * 60 * 60} segundos")
}

fun tamanoString(str: String): Int {
    return str.length
}

fun cubo(n: Int): Int {
    return (n * n * n)
}

fun milhas(km: Float): Float {
    return km * 1.6f
}

fun trocaLetras(str: String): String {
    return str.lowercase().replace("a", "x")
}

fun tamanhoString2(str: String) = str.length

fun cubo2(n: Int) = n * n * n

fun milhas2(a: Float) = a * 1.6f


fun main() {
    println(conversaoAnos(5))

    println(tamanoString("Teste da função"))

    println(cubo(3))

    println(milhas(5f))

    println(trocaLetras("Sera que vai trocar mesmo ?"))
}



