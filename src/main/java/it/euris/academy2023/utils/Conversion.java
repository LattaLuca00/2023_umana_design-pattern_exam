package it.euris.academy2023.utils;

import java.util.ArrayList;
import java.util.List;

public class Conversion {

    public List<Integer> conversion(int pounds, int shillings, int pences) {
        List<Integer> newValues = new ArrayList<>();
        if (pences > 240) {
            pounds = pences / 240;
            pences = pences % 240;
        }
        if (pences > 12 && pences < 240) {
            shillings += pences / 12;
            pences = pences % 12;
        }
        if (shillings > 20) {
            pounds += shillings / 20;
            shillings = shillings % 20;
        }
        newValues.add(pounds);
        newValues.add(shillings);
        newValues.add(pences);
        return newValues;
    }

    public List<Integer> conversionSub(int pounds, int shillings, int pences) {
        List<Integer> newValues = new ArrayList<>();
        if (pences > 240) {
            pounds = pences / 240;
            pences = pences % 240;
        }
        if (pences > 12 && pences < 240) {
            shillings += pences / 12;
            pences = pences % 12;
        }
        if (shillings > 20) {
            pounds += shillings / 20;
            shillings = shillings % 20;
        }
        if (pences < 0 && shillings > 12) {
            pences += 12;
            shillings--;
        }
        if (shillings < 0 && pounds > 1) {
            shillings += 20;
            pounds--;
        }
        newValues.add(pounds);
        newValues.add(shillings);
        newValues.add(pences);
        return newValues;
    }

}
