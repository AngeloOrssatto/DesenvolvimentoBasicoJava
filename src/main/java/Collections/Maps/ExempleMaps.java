package Collections.Maps;

import java.util.HashMap;
import java.util.Map;

public class ExempleMaps {

    public static void main(String[] args) {

        HashMap<String, Integer> selecoesCampeas = new HashMap<>();

        selecoesCampeas.put("Brasil", 5);
        selecoesCampeas.put("Alemanha", 4);
        selecoesCampeas.put("Franca", 1);
        selecoesCampeas.put("Italia", 4);

        System.out.println(selecoesCampeas);

        selecoesCampeas.put("Franca", 2);
        System.out.println(selecoesCampeas);

        System.out.println("O Brasil ganhou a copa " + selecoesCampeas.get("Brasil") + " vezes!");

        System.out.println("A Belgica esta entre as campeas? -> " + selecoesCampeas.containsKey("Belgica"));

        for(Map.Entry<String, Integer> entry: selecoesCampeas.entrySet()){
            System.out.println("A selecao do(a) " + entry.getKey() + " ganhou " + entry.getValue() + " vezes!");
        }

        for(String key: selecoesCampeas.keySet()){
            System.out.println(key + " --- " + selecoesCampeas.get(key));
        }


    }

}
