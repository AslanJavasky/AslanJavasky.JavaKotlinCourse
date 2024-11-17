package mod10_design_pattern.lesson8_bridge.java;

public class Knuts implements Currency {
    @Override
    public String getCurrencyName() {
        return "Knuts";
    }

    @Override
    public double getExchangeRate() {
        return 0.05;//1 галлеон=17 сиклей, 1 сикль= 29 кнатов, 1 галлеон=17*29=493
    }
}
