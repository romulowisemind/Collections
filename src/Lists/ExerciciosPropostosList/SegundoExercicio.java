package Lists.ExerciciosPropostosList;

import java.util.*;

public class SegundoExercicio {
    public static void main(String[] args) {
        List<String> perguntasCrime = new ArrayList<String>();

            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            perguntasCrime.add("Telefonou para a vitima?");
        System.out.println(perguntasCrime.get(0));
            String resposta1 = scanner.next();
            perguntasCrime.add("Esteve no Local do Crime?");
        System.out.println(perguntasCrime.get(1));
            String resposta2 = scanner.next();
            perguntasCrime.add("Mora perto da vitima?");
        System.out.println(perguntasCrime.get(2));
            String resposta3 = scanner.next();
            perguntasCrime.add("Devia para a vitima?");
        System.out.println(perguntasCrime.get(3));
            String resposta4 = scanner.next();
            perguntasCrime.add("Já trabalhou com a vitima?");
        System.out.println(perguntasCrime.get(4));
            String resposta5 = scanner.next();



            if (resposta1 == resposta2) {
                System.out.println("Suspeito");

            }
            System.out.println("Digite uma resposta válida!");

        System.out.println("Questionário: ");
        for (String perguntaCrime : perguntasCrime) System.out.println(perguntaCrime);
    }
}
