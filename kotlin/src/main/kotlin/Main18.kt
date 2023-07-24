fun main() {

    val s = "Kotlin"
    var i = 10

    while (i > 0){
        print(i)
        i--
    }

    while (i < s.length){
        print("${s[i]}")
        i++
    }
}