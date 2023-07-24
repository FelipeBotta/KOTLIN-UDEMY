fun ex01() {
    var i = 0
    for (i in 1..50){
        print("$i ")
    }
}

fun ex02(){
    var i = 0
    for (i in 50 downTo 1){
        print("$i ")
    }
}

fun ex03(){
    var i = 0
    for (i in 1..50){
        if (i % 5 == 0){
            continue
        }
        print("$i ")

    }

}

fun ex04(){
    var soma = 0
    for (i in 1..500){
        soma += i
        }
    print("Soma: $soma")
}

fun ex05(n: Int){
    for (i in 1..n){
        for (j in 1..i){
            print("#")
        }
        println()
    }

}


fun main() {

ex05(10)


}