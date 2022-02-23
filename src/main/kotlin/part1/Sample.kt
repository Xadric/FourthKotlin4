package part1
//Оператор when
/*
Напишите программу, которая считывает число и выводит "A", если оно двузначное, "B", если оно трёхзначное и "C" во всех остальных случаях.
Гарантируется, что число положительное.
 */
fun solution(a: Int): Char {
    return 'A'
}

fun main() {
    println("some")
    println(solution(5))     // C
    println(solution(99))    // A
    println(solution(45))    // A
    println(solution(235))   // B
    println(solution(176))  // C
}
//kighyluygudd


