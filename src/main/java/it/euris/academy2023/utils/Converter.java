package it.euris.academy2023.utils;

import it.euris.academy2023.money.Price;

public class Converter {

    public Price convert(String value) {
        String tokens[] = value.split(" ");
        return new Price(Integer.parseInt(tokens[0].substring(0, tokens[0].indexOf("p")))
                , Integer.parseInt(tokens[1].substring(0, tokens[1].indexOf("s"))),
                Integer.parseInt(tokens[2].substring(0, tokens[2].indexOf("d"))));
    }
}
