package mod10_design_pattern.lesson8_bridge.kotlin

fun main() {

    val debitAccountSickles=DebitAccount(Sickles())
    debitAccountSickles.dislayBalance()

    debitAccountSickles.deposit(150.0)
    debitAccountSickles.dislayBalance()

    debitAccountSickles.deposit(300.0)
    debitAccountSickles.dislayBalance()

    debitAccountSickles.withdraw(300.0)
    debitAccountSickles.dislayBalance()

}