package it.euris.academy2023.utils;

import java.util.List;
import java.util.StringJoiner;

public class JoinerResult {

    public String join(List<Integer> values) {
        StringJoiner joiner = new StringJoiner(" ");
        joiner.add(values.get(0) + "p");
        joiner.add(values.get(1) + "s");
        joiner.add(values.get(2) + "d");
        return joiner.toString();
    }

    public String joinForDiv(List<Integer> values) {
        // TODO
        return null;
    }
}
