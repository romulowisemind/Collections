package Maps.ExerciciosPropostos;

import java.util.*;

public class ExercicioPropostoUm {
    public static void main(String[] args) {
        System.out.println("Crie um dicionario e relacione os estados e suas populações: ");
        Map<String, Integer> estadosBrasileiros = new HashMap<String, Integer>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estadosBrasileiros);

        System.out.println("Substitua a população do estado do RN por 3534165");
        estadosBrasileiros.put("RN", 3534165);
        System.out.println(estadosBrasileiros);

        System.out.println("Confira se o estado PB está no dicionario: " + estadosBrasileiros.containsKey("PB"));

        System.out.println("Caso não adicione: PB - 4039277");
        estadosBrasileiros.put("PB", 4039277);
        System.out.println(estadosBrasileiros);

        System.out.println("Exiba a população de PE: " + estadosBrasileiros.get("PE"));

        System.out.println("Exiba todos os estados na ordem em que foram informados: ");
        Map<String, Integer> estadosBrasileiros1 = new LinkedHashMap<String, Integer>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        System.out.println(estadosBrasileiros1);

        System.out.println("Exiba os estados e suas populações em ordem alfabética: ");
        Map<String, Integer> estadosBrasileiros2 = new  TreeMap<>(estadosBrasileiros1);
        System.out.println(estadosBrasileiros2.toString());

        System.out.println("Exiba o estado com sua menor pupulação e sua quantidade: ");

        Collection<Integer> populacao = estadosBrasileiros.values();
        Integer maisPopuloso = Collections.max(estadosBrasileiros.values());
        Integer menosPopuloso = Collections.min(estadosBrasileiros.values());
        String estadoMaiorPupulacao = "";
        String estadoMenorPupulacao = "";
        for (Map.Entry<String, Integer> entry : estadosBrasileiros.entrySet()) {
            if (entry.getValue().equals(maisPopuloso)) {
                estadoMaiorPupulacao = entry.getKey();
                System.out.println("O estado com maior população e sua quantidade respectivamente é: " + estadoMaiorPupulacao + " - " + maisPopuloso);
            }
            if (entry.getValue().equals(menosPopuloso)) {
                estadoMenorPupulacao = entry.getKey();
                System.out.println("O estado com menor população e sua quantidade respectivamente é: " + estadoMenorPupulacao + " - " + menosPopuloso);
            }
        }

        Iterator<Integer> iterator = estadosBrasileiros.values().iterator();
        Integer soma = 0;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Exiba a soma da população desses estados: " + soma);

        System.out.println("Exiba a media de população desses estados: " + soma / estadosBrasileiros.size());

        System.out.println("Remova os estados com a populaç~çao menor que 4000000: ");
        Iterator<Integer> iterator1 = estadosBrasileiros.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next() <= 4000000) {
                iterator1.remove();
            }
        }
        System.out.println(estadosBrasileiros);

        System.out.println("Apague o dicionario: ");
        estadosBrasileiros.clear();
        System.out.println(estadosBrasileiros);


        System.out.println("Confira se o dicionario está vazio: " + estadosBrasileiros.isEmpty());


    }
}
