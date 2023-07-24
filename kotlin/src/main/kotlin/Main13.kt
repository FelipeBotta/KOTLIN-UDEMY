fun bonus(cargo: String, experiencia: Int): Float {
    var bonus = 0f
    if (cargo == "Gerente") {
        if (experiencia < 2) {
            bonus = 2000f
        } else {
            bonus = 3000f
        }
    } else if (cargo == "Coordenador") {
        if (experiencia < 1) {
            bonus = 1500f
        } else {
            bonus = 1800f
        }
    } else if (cargo == "Engenheiro") {
        bonus = 1000f

    } else if (cargo == "Estagiario") {
        bonus = 500f
    }
    return bonus
}

fun main() {
    val bonus = bonus("Gerente", 5)
    println(bonus)
}