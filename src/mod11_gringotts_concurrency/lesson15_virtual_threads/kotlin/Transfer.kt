package mod11_gringotts_concurrency.lesson15_virtual_threads.kotlin

class Transfer(
    private val srcAccount: BankAccount,
    private val targetAccount: BankAccount,
    private val amount: Int
) {
    fun execute() {
        srcAccount.transferFunds(targetAccount, amount)
    }

}