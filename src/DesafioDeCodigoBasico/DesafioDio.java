package DesafioDeCodigoBasico;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DesafioDio {
    public static void main(String[] args) {
        List<Integer> valores = new ArrayList<>();
        valores.add(2);
        valores.add(3);
        valores.add(5);
        valores.add(7);
        valores.add(11);
        valores.add(13);
        valores.add(18);
        valores.add(34);

        Iterator<Integer> iterator = valores.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 != 0) {
                iterator.remove();
            }
        }
        for (int i = 0; i < valores.size(); i++) {
            System.out.println(valores.get(i));
        }

    }
}
