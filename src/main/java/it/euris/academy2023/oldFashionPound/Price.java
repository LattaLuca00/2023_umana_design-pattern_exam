package it.euris.academy2023.oldFashionPound;

public class Price {
    private Pound pound;
    private Shilling shilling;
    private Pence pence;

    public Price(Pound pound, Shilling shilling, Pence pence) {
        this.pound = pound;
        this.shilling = shilling;
        this.pence = pence;
    }

    public Pound getPound() {
        return pound;
    }

    public Shilling getShilling() {
        return shilling;
    }

    public Pence getPence() {
        return pence;
    }

}
