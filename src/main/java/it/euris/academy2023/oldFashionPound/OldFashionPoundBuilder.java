package it.euris.academy2023.oldFashionPound;

public class OldFashionPoundBuilder {
    private OldFashionPoundManager manager;

    public OldFashionPoundBuilder(OldFashionPoundManager manager) {
        this.manager = manager;
    }

    public String buildResult(String operator,String element1,String element2){
        return switch (operator) {
            case "+" -> manager.sum(element1, element2);
            case "-" -> manager.sub(element1, element2);
            case "*" -> manager.mul(element1, element2);
            case "/" -> manager.div(element1,element2);
            default -> throw new RuntimeException("Bad operator");
        };
    }
}
