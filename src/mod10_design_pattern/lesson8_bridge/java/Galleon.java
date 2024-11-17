package mod10_design_pattern.lesson8_bridge.java;

public class Galleon implements Currency{
    @Override
    public String getCurrencyName() {
        return "Galleons";
    }

    @Override
    public double getExchangeRate() {
        return 1.0;
    }
}
