package it.euris.academy2023.money;

public class Price {
    private int pound;
    private int shilling;
    private int pence;

    public Price(int pound, int shilling, int pence) {
        this.pound = pound;
        this.shilling = shilling;
        this.pence = pence;
    }

    public int getPound() {
        return pound;
    }

    public int getShilling() {
        return shilling;
    }

    public int getPence() {
        return pence;
    }

}
