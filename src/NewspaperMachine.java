public class NewspaperMachine {
    private int money;
    public int amountsOperations;
    public int newspaper1;
    public int newspaper2;
    public int newspaper3;
    public int newspaper4;

    NewspaperMachine() {
        money = 100;
        setNewspaperAmount();
    }

    NewspaperMachine(int money) {
        this.money = money;
        setNewspaperAmount();
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public int getAmountsOperations() { return amountsOperations; }

    public void setNewspaperAmount() {
        newspaper1 = 5;
        newspaper2 = 5;
        newspaper3 = 5;
        newspaper4 = 5;
    }

    public void setNewspaperAmount(int newspaper1, int newspaper2, int newspaper3, int newspaper4) {
        this.newspaper1 = newspaper1;
        this.newspaper2 = newspaper2;
        this.newspaper3 = newspaper3;
        this.newspaper4 = newspaper4;
    }

    public void setNewspaper4() {
        newspaper4 = 10;
    }
}
