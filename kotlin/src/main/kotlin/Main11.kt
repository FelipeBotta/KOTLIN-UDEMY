fun maiorDeIdade(idade: Int){
    if (idade > 18){
        println("Maior de Idade")

        if (idade > 60){
            println("Terceira Idade")
        }
    } else if (idade < 10) {
        println("Criança")
    } else {
        println("Menor de Idade")
    }
}

fun saudacao (dia: Boolean) = if (dia){
        "Bom dia !"
    } else{
        "Boa noite"
    }


fun main() {

    maiorDeIdade(idade = 19)
    maiorDeIdade(idade = 15)
    maiorDeIdade(idade = 72)
    maiorDeIdade(idade = 8)

}