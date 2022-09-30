import java.util.LinkedList;

public class ExercicioLinkedList {
    public static void main(String[] args) {
        System.out.println("Crie uma nova lista chamada lista2 " + "e coloque todos os elementos da list ArrayList nessa nova lista: ");
        LinkedList<Double> notas2 = new LinkedList<Double>();
        notas2.add(7D);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5D);
        notas2.add(7D);
        notas2.add(0D);
        notas2.add(3.6);

        System.out.println("Mostre a primeira nota da lista sem remove-la: " + notas2.get(0));
        System.out.println(notas2);


        System.out.println("Mostre a primeira nota da lista removendo-a: " + notas2.get(0));
        notas2.remove(0);
        System.out.println(notas2);

    }
}
