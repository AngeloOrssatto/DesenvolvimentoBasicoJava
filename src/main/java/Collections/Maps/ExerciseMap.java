package Collections.Maps;

import java.util.HashMap;
import java.util.Map;

public class ExerciseMap {

    public static void main(String[] args) {

        HashMap<String, String> estadosBR = new HashMap<>();

        estadosBR.put("RS", "rio grande do sul");
        estadosBR.put("SC", "santa catarina");
        estadosBR.put("PR", "parana");
        estadosBR.put("SP", "sao paulo");
        estadosBR.put("MS", "mato grosso do sul");
        estadosBR.put("MT", "mato grosso");
        estadosBR.put("GO", "goias");
        estadosBR.put("RJ", "rio de janeiro");
        estadosBR.put("MG", "minas gerais");
        System.out.println(estadosBR);

        estadosBR.remove("MG", "minas gerais");
        System.out.println(estadosBR);

        estadosBR.put("DF", "distrito federal");
        System.out.println(estadosBR);

        System.out.println(estadosBR.size());

        estadosBR.remove("MS");
        System.out.println(estadosBR);

        for(Map.Entry<String, String> entry: estadosBR.entrySet()){
            System.out.println(entry.getValue() + "(" + entry.getKey() + ")");
        }

        System.out.println(estadosBR.containsKey("SC"));

        System.out.println(estadosBR.containsValue("maranhao"));

    }

}
