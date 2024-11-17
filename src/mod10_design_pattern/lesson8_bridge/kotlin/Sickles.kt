package mod10_design_pattern.lesson8_bridge.kotlin

class Sickles : Currency {
    override fun getCurrencyName() = "Sickles"

    override fun getExchangeRate() = 0.2
}