import java.util.*

fun main() {
    var amountMoney = readLine()!!.toInt()
    val scanner = Scanner(System.`in`)
    var lastScaneer = 0
    while (scanner.hasNext()) {
        amountMoney -= scanner.next().toInt()
        lastScaneer = scanner.next().toInt()
    }
    if(amountMoney > 0){
        println("Thank you for choosing us to manage your account! You have $amountMoney money.")
    }
    else{
        println("Error, insufficient funds for the purchase. You have ${amountMoney*lastScaneer}, but you need $lastScaneer.")
    }
}
