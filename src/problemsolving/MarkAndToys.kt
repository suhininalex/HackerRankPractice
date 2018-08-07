import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.sequences.*
import kotlin.text.*

/**
 * https://www.hackerrank.com/challenges/mark-and-toys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting
 */
fun maximumToys(prices: List<Int>, money: Int): Int {
    var moneyLeft = money
    return prices.sorted().asSequence().onEach { moneyLeft -= it }.takeWhile { moneyLeft >= 0 }.count()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val money = scan.nextLine().split(" ").last().toInt()

    val prices = scan.nextLine().split(" ").map{ it.trim().toInt() }

    val result = maximumToys(prices, money)

    println(result)
}
