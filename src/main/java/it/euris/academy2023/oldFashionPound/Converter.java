package it.euris.academy2023.oldFashionPound;

public class Converter {

    public Price convert(String value) {
        String tokens[] = value.split(" ");
        return new Price(new Pound(Integer.parseInt(tokens[0].substring(0, tokens[0].indexOf("p"))))
                , new Shilling(Integer.parseInt(tokens[1].substring(0, tokens[1].indexOf("s")))),
                new Pence(Integer.parseInt(tokens[2].substring(0, tokens[2].indexOf("d")))));
    }
}
