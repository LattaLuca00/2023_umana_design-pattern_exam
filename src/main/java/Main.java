import it.euris.academy2023.oldFashionPound.Converter;
import it.euris.academy2023.oldFashionPound.OldFashionPoundBuilder;
import it.euris.academy2023.oldFashionPound.OldFashionPoundManager;

public class Main {

    public static void main(String[] args) {

        Converter converter = new Converter();
        OldFashionPoundManager manager = new OldFashionPoundManager(converter);
        OldFashionPoundBuilder builder = new OldFashionPoundBuilder(manager);
        String element1 = args[0].substring(0, args[0].indexOf("d")+1);
        String operator = args[0].substring(args[0].indexOf("d")+2, args[0].indexOf("d") + 3);
        String element2 = args[0].substring(args[0].indexOf("d")+4);
        System.out.println(builder.buildResult(operator, element1, element2));


    }

}
