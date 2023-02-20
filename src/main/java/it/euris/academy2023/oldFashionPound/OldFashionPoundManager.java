package it.euris.academy2023.oldFashionPound;

import java.util.StringJoiner;

public class OldFashionPoundManager {

    private Converter converter;

    public OldFashionPoundManager(Converter converter) {
        this.converter = converter;
    }

    public String sum(String price1, String price2) {
        Price p1 = converter.convert(price1);
        Price p2 = converter.convert(price2);
        StringJoiner joiner = new StringJoiner(" ");
        int poundSum = p1.getPound().getValue() + p2.getPound().getValue();
        int shillingSum = p1.getShilling().getValue() + p2.getShilling().getValue();
        int penceSum = p1.getPence().getValue() + p2.getPence().getValue();
        if (penceSum > 12) {
            shillingSum += penceSum / 12;
            penceSum = penceSum % 12;
        }
        if (p1.getShilling().getValue() + p2.getShilling().getValue() > 20) {
            poundSum += shillingSum / 12;
            shillingSum = shillingSum % 20;
        }
        joiner.add(poundSum + "p");
        joiner.add(shillingSum + "s");
        joiner.add(penceSum + "d");
        return joiner.toString();
    }

    public String sub(String price1, String price2) {
        Price p1 = converter.convert(price1);
        Price p2 = converter.convert(price2);
        StringJoiner joiner = new StringJoiner(" ");
        joiner.add((p1.getPound().getValue() - p2.getPound().getValue()) + "p");
        joiner.add((p1.getShilling().getValue() - p2.getShilling().getValue()) + "s");
        joiner.add((p1.getPence().getValue() - p2.getPence().getValue()) + "d");
        return joiner.toString();
    }

    public String mul(String price, String value) {
        Price p1 = converter.convert(price);
        StringJoiner joiner = new StringJoiner(" ");
        joiner.add((p1.getPound().getValue() * Integer.parseInt(value.trim())) + "p");
        joiner.add((p1.getShilling().getValue() * Integer.parseInt(value.trim())) + "s");
        joiner.add((p1.getPence().getValue() * Integer.parseInt(value.trim())) + "d");
        return joiner.toString();
    }

    public String div(String price, String value) {
        Price p1 = converter.convert(price);
        StringJoiner joiner = new StringJoiner(" ");
        joiner.add((p1.getPound().getValue() / Integer.parseInt(value.trim())) + "p");
        joiner.add((p1.getShilling().getValue() / Integer.parseInt(value.trim())) + "s");
        joiner.add((p1.getPence().getValue() / Integer.parseInt(value.trim())) + "d");
        return joiner.toString();
    }

}
