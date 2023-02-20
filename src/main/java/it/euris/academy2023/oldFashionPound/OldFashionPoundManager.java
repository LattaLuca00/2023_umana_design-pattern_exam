package it.euris.academy2023.oldFashionPound;

import it.euris.academy2023.money.Price;
import it.euris.academy2023.utils.Conversion;
import it.euris.academy2023.utils.Converter;
import it.euris.academy2023.utils.JoinerResult;

public class OldFashionPoundManager {

    private final Converter converter;
    private final Conversion conversion;
    private final JoinerResult joinerResult;

    public OldFashionPoundManager(Converter converter, Conversion conversion, JoinerResult joinerResult) {
        this.converter = converter;
        this.conversion = conversion;
        this.joinerResult = joinerResult;
    }

    public String sum(String price1, String price2) {
        Price p1 = converter.convert(price1);
        Price p2 = converter.convert(price2);
        int poundSum = p1.getPound() + p2.getPound();
        int shillingSum = p1.getShilling() + p2.getShilling();
        int penceSum = p1.getPence() + p2.getPence();
        return joinerResult.join(conversion.conversion(poundSum, shillingSum, penceSum));

    }

    public String sub(String price1, String price2) {
        Price p1 = converter.convert(price1);
        Price p2 = converter.convert(price2);
        int subPound = p1.getPound() - p2.getPound();
        int subShilling = p1.getShilling() - p2.getShilling();
        int subPences = p1.getPence() - p2.getPence();
        return joinerResult.join(conversion.conversionSub(subPound, subShilling, subPences));

    }

    public String mul(String price, String value) {
        Price p1 = converter.convert(price);
        int mulPound = p1.getPound() * Integer.parseInt(value.trim());
        int mulShilling = p1.getShilling() * Integer.parseInt(value.trim());
        int mulPences = p1.getPence() * Integer.parseInt(value.trim());
        return joinerResult.join(conversion.conversion(mulPound, mulShilling, mulPences));
    }

    public String div(String price, String value) {
        Price p1 = converter.convert(price);
        int divPound = p1.getPound() / Integer.parseInt(value.trim());
        int divShilling = p1.getShilling() / Integer.parseInt(value.trim());
        int divPence = p1.getPence() / Integer.parseInt(value.trim());
        return joinerResult.join(conversion.conversion(divPound, divShilling, divPence));
    }

}
