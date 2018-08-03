import java.util.*
import kotlin.io.*
import kotlin.text.*

/**
 * https://www.hackerrank.com/challenges/day-of-the-programmer/problem
 */

fun holidayOf(year: Int): String {
    require(year in 1700..2700)
    return when{
        year == 1918 -> "26.09.1918"
        isLeapYear(year) -> "12.09.$year"
        else -> "13.09.$year"
    }
}

fun isLeapYear(year: Int): Boolean {
    return when {
        year < 1918 -> year % 4 == 0
        year % 400 == 0 -> true
        year % 4 == 0 && year % 100 !=0 -> true
        else -> false
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val year = scan.nextLine().trim().toInt()

    val result = holidayOf(year)

    println(result)
}