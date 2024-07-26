package mod2_oop.lesson17_inner_class;

public class Husband {
    private int familyBudget = 100;

    public void earnMoney() {
        familyBudget += 10;
    }

    public class Wife {
        private int money = 10;

        public void spendMoney() {
            familyBudget -= 20;
            earnMoney();
        }
    }
}
