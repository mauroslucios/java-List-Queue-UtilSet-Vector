package one.digitalinnovation;

import java.util.List;
import java.util.Vector;

public class ExemploVector {
    public static void main(String[] args) {
        List<String> esportes = new Vector<>();

        esportes.add("futebol");
        esportes.add("basquete");
        esportes.add("volei");
        esportes.add("handebol");
        System.out.print(esportes + "\t");
        System.out.println("");
        //Altera o valor da posição 2 do vetor
        esportes.set(2,"ping pong");
        System.out.print(esportes + "\t");
        System.out.println("");
        //Remove o esporte da posição 2
        esportes.remove(2);
        System.out.print(esportes + "\t");
        System.out.println("");
        System.out.print("Esportes: ");
        for(String espn : esportes){
            System.out.print(espn+" ");
        }
    }
}
