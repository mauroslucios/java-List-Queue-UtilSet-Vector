package one.digitalinnovation.stream;

import java.io.*;
import java.nio.file.FileStore;
import java.util.Scanner;

public class ExemploFileArmazenaTxt{
    public static void lerTecladoEscreverDocumento() throws IOException{
        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Digite 3 filmes");
        pw.flush();

        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();

        File f = new File("netcine.txt");

        BufferedWriter bw = new BufferedWriter(new FileWriter(f.getName()));

        do{
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = scan.nextLine();
        }while(!(line.equalsIgnoreCase("fim")));

        pw.printf("Arquivo criado\"%S\" com sucesso!", f.getName());

        pw.close();
        scan.close();
        bw.close();

    }
    public static void main(String[] args) throws IOException {
        lerTecladoEscreverDocumento();
    }
}
