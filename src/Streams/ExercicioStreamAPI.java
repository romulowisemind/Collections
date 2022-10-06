package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.*;
import java.util.stream.Collectors;

public class ExercicioStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("Imprima todos os elementos dessa lista de String: ");

//        numerosAleatorios.stream()
//                .forEach(System.out::println);
//        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros numeros e coloque dentro de um Set: ");

//        Set<String> collectSet = numerosAleatorios.stream()
//                .limit(5)
//                .collect(Collectors.toSet());

//        numerosAleatorios.stream()
//                .limit(5)
//                .collect(Collectors.toSet())
//                .forEach(System.out::println);

        System.out.println("Tranforme essa lista de String em uma lista de numeros inteiros: ");

        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());


//        List<Integer> collectList = numerosAleatorios.stream()
//                .map(Integer::parseInt)
//                .collect(Collectors.toList());

        System.out.println("Pegue os numeros pares e menores que 2 e coloque em uma lista: ");

//        numerosAleatorios.stream()
//                .map(Integer::parseInt)
//                .filter(i -> i % 2 == 0 && i > 2)
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

//        List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
//                .map(Integer::parseInt)
//                .filter(i -> i % 2 == 0 && i > 2)
//                .collect(Collectors.toList());
//        System.out.println(listParesMaioresQue2);

        System.out.println("Mostre a média dos números: ");

//        numerosAleatorios.stream()
//                .mapToInt(Integer::parseInt)
//                .average()
//                .ifPresent(System.out::println);



//        numerosAleatorios.stream()
//                .mapToInt(Integer::parseInt)
//                .average()
//                .ifPresent(new DoubleConsumer() {
//                    @Override
//                    public void accept(double value) {
//                      System.out.println(value);
//                    }
//                });

        System.out.println("Remova os valores impares: ");

        numerosAleatoriosInteger.removeIf(i -> i % 2 != 0);
        System.out.println(numerosAleatoriosInteger);

    }
}
