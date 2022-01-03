package one.digitalinnovation;

import java.util.Scanner;

public class DesafioColchao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int A = leitor.nextInt();//Espessura do colchão
        int B = leitor.nextInt();//Altura do colchão
        int C = leitor.nextInt();//Largura do colchão
        int H = leitor.nextInt();// Altura da porta
        int L = leitor.nextInt();// Largura da porta
        if(H > B || L > B){
            System.out.println("S");
        }else{
            System.out.println("N");
        }
    }
}
