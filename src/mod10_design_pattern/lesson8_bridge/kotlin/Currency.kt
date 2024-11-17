package mod10_design_pattern.lesson8_bridge.kotlin

interface Currency {
    fun getCurrencyName(): String
    fun getExchangeRate(): Double
}