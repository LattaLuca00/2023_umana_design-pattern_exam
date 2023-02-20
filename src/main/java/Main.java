import it.euris.academy2023.oldFashionPound.OldFashionPoundBuilder;
import it.euris.academy2023.oldFashionPound.OldFashionPoundManager;
import it.euris.academy2023.utils.Conversion;
import it.euris.academy2023.utils.Converter;
import it.euris.academy2023.utils.JoinerResult;

public class Main {

    public static void main(String[] args) {

        Converter converter = new Converter();
        Conversion conversion = new Conversion();
        JoinerResult joinerResult = new JoinerResult();
        OldFashionPoundManager manager = new OldFashionPoundManager(converter, conversion, joinerResult);
        OldFashionPoundBuilder builder = new OldFashionPoundBuilder(manager);
        String element1 = args[0].substring(0, args[0].indexOf("d") + 1);
        String operator = args[0].substring(args[0].indexOf("d") + 2, args[0].indexOf("d") + 3);
        String element2 = args[0].substring(args[0].indexOf("d") + 4);
        System.out.println(builder.buildResult(operator, element1, element2));


    }

}
