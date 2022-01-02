package one.digitalinnovation;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Mauro");
        filaBanco.add("Pedro");
        filaBanco.add("José");
        filaBanco.add("Augusto");
        System.out.println("#############################");
        System.out.println(filaBanco);
        System.out.println("#############################");
        String cliente = filaBanco.poll();
        System.out.println(cliente);
        System.out.println(filaBanco);
        System.out.println("#############################");
        cliente = filaBanco.peek();
        System.out.println(cliente);
        System.out.println(filaBanco);
    }
}
