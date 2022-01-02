package one.digitalinnovation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("mauro");
        nomes.add("everton");
        nomes.add("evelyn");
        nomes.add("ethelin");

        System.out.println(nomes);

//        nomes.set(0,"roberta");
//        System.out.println(nomes);
//        Collections.sort(nomes);
//        System.out.println(nomes);

//        nomes.remove(3);
//        System.out.println(nomes);
//
//        String nome = nomes.get(1);
//        System.out.println(nome);
//
//        int tamanho = nomes.size();
//        System.out.println(tamanho);
//
//        boolean temMauro = nomes.contains("ethelin");
//        System.out.println(temMauro);
//
//        nomes.clear();
//        boolean listaVazia = nome.isEmpty();
//        System.out.println(listaVazia);

//        int pos = nomes.indexOf("ethelin");
//        System.out.println(pos);
//
//        for(String name: nomes){
//            System.out.print(name+ "\t");
//        }
        Iterator<String> iterator = nomes.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + "\t");
        }
    }
}
