package Lists.ExerciciosPropostosList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrimeiroExercicio {
    public static void main(String[] args) {
        List<Temperatura> temperaturaAtual = new ArrayList<Temperatura>() {{
            add(new Temperatura("Janeiro", 18));
            add(new Temperatura("Fevereiro", 6));
            add(new Temperatura("Março", 4));
            add(new Temperatura("Abril", 3));
            add(new Temperatura("Maio", 32));
            add(new Temperatura("Junho", 27));
        }};
        System.out.println(temperaturaAtual);

        for (int i = 0; i < temperaturaAtual.size(); i++) {
            //if (temperaturaAtual.get()) {
             //   System.out.println(temperaturaAtual);
            //}

        }

        Iterator<Temperatura> iterator = temperaturaAtual.iterator();
        int soma = 0;
        while (iterator.hasNext()) {
            int next = iterator.next().getTemperatura();
            soma += next;
        }
        System.out.println(("A média das temperaturas dos 6 primeiros meses é: " + soma / temperaturaAtual.size()));


    }
}

class Temperatura implements Comparable<Temperatura> {


    private final int temperatura;
    private final String mes;

    public Temperatura(String mes, int temperatura) {
        this.mes = mes;
        this.temperatura = temperatura;
    }

    public Integer getTemperatura() {
        return temperatura;
    }

    public String getMes() {
        return mes;
    }

    @Override
    public String toString() {
        return "Temperatura{" +
                "temperatura=" + temperatura +
                ", mes='" + mes + '\'' +
                '}';
    }

    @Override
    public int compareTo(Temperatura temperatura) {
        return 0;
    }
}

