package mod10_design_pattern.lesson8_bridge.java;

public class Sickles  implements Currency{
    @Override
    public String getCurrencyName() {
        return "Sickles";
    }

    @Override
    public double getExchangeRate() {
        return 0.2;// В 1 галлеоне= 17 сиклей
    }
}
