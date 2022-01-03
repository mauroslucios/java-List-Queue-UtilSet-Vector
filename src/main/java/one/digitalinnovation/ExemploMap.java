package one.digitalinnovation;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    public static void main(String[] args) {

        Map<String, Integer> campeonatoMundialFifa = new HashMap<>();

        //Adiciona os campeões mundiais fifa no mapa
        campeonatoMundialFifa.put("Brasil",5);
        campeonatoMundialFifa.put("Alemnha",4);
        campeonatoMundialFifa.put("Itália",4);
        campeonatoMundialFifa.put("Uruguai",2);
        campeonatoMundialFifa.put("Argentina",2);
        campeonatoMundialFifa.put("França",2);
        campeonatoMundialFifa.put("Inglaterra",1);
        campeonatoMundialFifa.put("Espanha",1);
        System.out.println(campeonatoMundialFifa);

        //Atualiza o valor para a chave Brasil
        campeonatoMundialFifa.put("Brasil",6);
        System.out.println(campeonatoMundialFifa);

        //Retorna a Argentina
        System.out.println(campeonatoMundialFifa.get("Argentina"));

        //Retorna se existe ou não a França
        System.out.println(campeonatoMundialFifa.containsKey("França"));

        //Remove a França
        System.out.println(campeonatoMundialFifa.remove("França"));

        //Retorna se existe a França
        System.out.println(campeonatoMundialFifa.containsKey("França"));

        //Retorna se contém algum hexacampeão
        System.out.println(campeonatoMundialFifa.containsValue(6));

        //Retorna o tamanho do mapa
        System.out.println(campeonatoMundialFifa.size());

        System.out.println(campeonatoMundialFifa);
    }
}
