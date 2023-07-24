fun bonus(cargo: String): Float {
    var bonus = 0f
    if (cargo == "Gerente") {
        bonus = 2000f
    } else if (cargo == "Coordenador") {
        bonus = 1500f
    } else if (cargo == "Engenheiro") {
        bonus = 1000f
    } else if (cargo == "Estagiario") {
        bonus = 500f
    }

    return bonus
}


fun main() {
    val bonus = bonus("Gerente")
    println(bonus)

}








