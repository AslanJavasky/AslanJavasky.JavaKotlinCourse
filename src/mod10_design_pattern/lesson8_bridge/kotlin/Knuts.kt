package mod10_design_pattern.lesson8_bridge.kotlin

class Knuts : Currency {
    override fun getCurrencyName() = "Knuts"

    override fun getExchangeRate() = 0.05
}