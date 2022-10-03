package Sets.ExerciciosPropostos;

import java.util.*;

public class ExercicioProposto1 {
    public static void main(String[] args) {
        System.out.println("Cores do Arco Iris: ");
        Set<ArcoIris> cores = new HashSet() {
            {
                add(new ArcoIris("Vermelho"));
                add(new ArcoIris("Laranja"));
                add(new ArcoIris("Amarelo"));
                add(new ArcoIris("Verde"));
                add(new ArcoIris("Azul"));
                add(new ArcoIris("Anil"));
                add(new ArcoIris("Violeta"));
            }
        };
        for (ArcoIris minhasCores : cores) System.out.println(minhasCores.getCor());

        System.out.println("Quantidade de cores que o Arco-Iris tem: " + cores.size());

        System.out.println("Exiba as cores em ordem alfabética: ");
        Set<ArcoIris> cores1 = new TreeSet<>(new ComparatorCor());
        cores1.addAll(cores);
        for (ArcoIris minhasCores : cores1) System.out.println(minhasCores.getCor());

        System.out.println("Exiba as cores na ordem inversa da que foi informada: ");
        Set<String> cores2 = new LinkedHashSet<>(
                Arrays.asList("Violeta", "Anil", "Azul", "Verde", "Amarelo", "Laranja", "Vermelho"));
        System.out.println(cores2);
        List<String> coresArcoIrisList = new ArrayList<>(cores2);
        Collections.reverse(coresArcoIrisList);

        System.out.printf("Exiba todas as cores que começam com a letra v: ");
        for (ArcoIris cor : cores) {
            if (cor.startsWith("V")) {
                System.out.println(cor);
            }
        }

        System.out.println("Remova todas as cores que começam com a letra v: ");
        Iterator<ArcoIris> iterator = cores.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().startsWith("V")) iterator.remove();
        }
        System.out.println(cores);

        System.out.println("Limpe o conjunto: ");
        cores.clear();
        System.out.println(cores);


        System.out.println("Confira se o conjunto está vazio: ");
        System.out.println(cores.isEmpty());

    }
}

class ArcoIris {
    private String cor;

    public ArcoIris(String cor) {

        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "{" +
                "cor='" + cor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArcoIris arcoIris = (ArcoIris) o;
        return cor.equals(arcoIris.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cor);
    }

    public boolean startsWith(String V) {
        return true;
    }
}

class ComparatorCor implements Comparator<ArcoIris> {

    @Override
    public int compare(ArcoIris c1, ArcoIris c2) {
        int cor = c1.getCor().compareTo(c2.getCor());
        if (cor != 0) return cor;
        return cor;
    }
}