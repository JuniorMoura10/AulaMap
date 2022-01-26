package one.digitalinnovation;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {

    public static void main(String[] args){

        HashMap<String, Integer> campeoesMundiaisFifa = new HashMap<>();

        //Adicionando os campeões mundiais fifa no mapa
        campeoesMundiaisFifa.put("Brasil", 5);
        campeoesMundiaisFifa.put("Alemanha", 4);
        campeoesMundiaisFifa.put("Itália", 4);
        campeoesMundiaisFifa.put("Uruguai", 2);
        campeoesMundiaisFifa.put("Argentina", 2);
        campeoesMundiaisFifa.put("França", 2);
        campeoesMundiaisFifa.put("Espanha", 1);
        campeoesMundiaisFifa.put("Inglaterra", 1);

        System.out.println(campeoesMundiaisFifa);
        System.out.println("\t---------------------\t");

        //Atualiza o valor para a chave Brasil
        campeoesMundiaisFifa.put("Brasil", 6);
        System.out.println(campeoesMundiaisFifa);
        System.out.println("\t---------------------\t");

        //Retorna a Argentina
        System.out.println(campeoesMundiaisFifa.get("Argentina"));
        System.out.println("\t---------------------\t");

        //Retorna se existe ou não um campeão França
        System.out.println("A França já foi campeão mundial? "
                + campeoesMundiaisFifa.containsKey("França"));
        System.out.println("\t---------------------\t");

        //Remove o campeão França
        campeoesMundiaisFifa.remove("França");
        System.out.println(campeoesMundiaisFifa);
        System.out.println("\t---------------------\t");

        //Retorna se existe ou não um campeão França
        System.out.println("A campeã mundial França está na lista? "
                + campeoesMundiaisFifa.containsKey("França"));
        System.out.println("\t---------------------\t");

        //Retorna se existe ou não um hexacampeão
        System.out.println("Existe alguma seleção hexacampeã? " + campeoesMundiaisFifa.containsValue(6));
        System.out.println("\t---------------------\t");

        //Retorna o tamanho do mapa
        System.out.println(campeoesMundiaisFifa.size());
        System.out.println(campeoesMundiaisFifa);
        System.out.println("\t---------------------\t");

        //Navegando pelo mapa 1 usando chave e valor (key & value)
        System.out.println("Navegando usando Key & Value");
        for (Map.Entry<String, Integer> campeoes : campeoesMundiaisFifa.entrySet()) {
            System.out.println(campeoes.getKey() + "-->" + campeoes.getValue());
        }
        System.out.println("\t---------------------\t");

        //Navegando pelo mapa 2 usando apenas a chave (key)
        System.out.println("Navegando usando apenas a Key");
        for (String chave : campeoesMundiaisFifa.keySet()) {
            System.out.println(chave + "-->" + campeoesMundiaisFifa.get(chave));
        }
        System.out.println("\t---------------------\t");

    }
}
