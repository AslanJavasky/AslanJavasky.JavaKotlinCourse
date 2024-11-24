package mod11_gringotts_concurrency.lesson13_fork_join.kotlin

class Transfer(
    private val srcAccount: BankAccount,
    private val targetAccount: BankAccount,
    private val amount: Int
) {
    fun execute() {
        srcAccount.transferFunds(targetAccount, amount)
    }

}