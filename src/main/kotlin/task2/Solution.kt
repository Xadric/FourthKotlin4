package tasks.task2

/*
Измените функцию sum так, чтобы она была объявлена как расширение List<Int>
 */
public fun List<Int>.sum(): Int {
    var sum: Int = 0
    for (element in this) {
        sum += element
    }
    return sum
}

fun main() {
    val sum = listOf(1, 2, 3).sum()
    println(sum)    // 6
}