package Model;

public class Salary<T> {
    private int month;
    private T money;

    public Salary() {
    }

    public Salary(int month, T money) {
        this.month = month;
        this.money = money;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public T getMoney() {
        return money;
    }

    public void setMoney(T money) {
        this.money = money;
    }
}
