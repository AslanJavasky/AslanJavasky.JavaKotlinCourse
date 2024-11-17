package mod10_design_pattern.lesson8_bridge.kotlin

class Galleon : Currency {
    override fun getCurrencyName() = "Galleons"

    override fun getExchangeRate() = 1.0
}