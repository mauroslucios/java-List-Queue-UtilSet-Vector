package one.digitalinnovation.stream;

import java.io.*;
import java.util.Scanner;

public class CriandoArquivo {
    public static void lerTecladoEscreverDocuemnto()throws IOException{
        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Digite 3 filmes");
        pw.flush();

        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        File f = new File("filmes.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(f.getName()));

        do{
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = scan.nextLine();
        }while(!(line.equalsIgnoreCase("fim")));

        pw.printf("Arquivo \"%S\" criado com sucesso!",f.getName());

        pw.close();
        bw.close();
        scan.close();

    }

    public static void main(String[] args) throws IOException {
        lerTecladoEscreverDocuemnto();
    }
}
