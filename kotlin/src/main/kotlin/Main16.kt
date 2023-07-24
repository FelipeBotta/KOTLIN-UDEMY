fun quadrado() {
    print("Informe o primeiro valor:")
    val lado1 = readLine()

    print("Informe o segundo valor:")
    val lado2 = readLine()

    if (lado1 != null && lado2 != null) {
        val x = lado1.toInt()
        val y = lado2.toInt()

        if (x == y) {
            println("Quadrado !")
        } else {
            println("Retângulo !")
        }
    }
}

fun triangulo() {
    print("Informe o primeiro valor:")
    val lado1 = readLine()

    print("Informe o segundo valor:")
    val lado2 = readLine()

    print("Informe o terceiro valor:")
    val lado3 = readLine()

    if (lado1 != null && lado2 != null && lado3 != null) {
        val x = lado1.toInt()
        val y = lado2.toInt()
        val z = lado3.toInt()

        if (x == y && y == z) {
            println("Equilátero")
        } else {
            println("Isóceles ou escaleno")
        }
    }

}

fun qualASaida(num: Int) {
    if (num >= 0) {
        if (num == 0)
            println("Primeira string")
    } else println("Segunda string")
    println("Terceira string")
}

fun portaria() {
    print("Qual sua idade ?")
    val idade = readLine()


    if (idade != null && idade != "") {
        if (idade.toInt() < 18) {
            println("Negado. Menores de idade não são permitidos!")
            return
        }
    }
    print("Qual é o tipo de convite?")
    var tipoConvite = readLine()

    if (tipoConvite != null && tipoConvite != ""){
        tipoConvite = tipoConvite.lowercase()
        if (tipoConvite == "comum" || tipoConvite == "premium" || tipoConvite == "luxo"){

            print("Qual o código do convite?")
            var codigo = readLine()

            if (codigo != null && codigo != ""){
                codigo = codigo.lowercase()
                if (tipoConvite == "comum" && codigo.startsWith(prefix = "xt")){
                    println("Welcome :)")
                } else if (tipoConvite == "premium" || tipoConvite == "luxo" && codigo.startsWith("xl")){
                    println("Welcome :)")
                } else{
                    println("Negado. Convite inválido!")
                }
            }

        }else{
            println("Negado. Convite inválido!")
            return
        }
    }
}


fun main() {
    portaria()
}