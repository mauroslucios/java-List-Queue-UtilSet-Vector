package one.digitalinnovation.stream;

import java.io.*;

public class CopiaDeArquivo {
    public static void copiarArquivo() throws IOException {
        File f = new File("/home/mauros/IdeaProjects/aulas-digital-innovation/filmes.txt");
        String nomeArquivo = f.getName();

//        Reader r = new FileReader(nomeArquivo);
//        BufferedReader br = new BufferedReader(r);
        BufferedReader br = new BufferedReader(new FileReader(nomeArquivo));
        String line = br.readLine();

        String nomeArquivoCopy = nomeArquivo.substring(0,nomeArquivo.indexOf(".")).concat("-copy.txt");
        File fcopy = new File(nomeArquivoCopy);

        BufferedWriter bw = new BufferedWriter(new FileWriter(fcopy.getName()));

        do{
            bw.write(line);
            bw.newLine();
            line = br.readLine();
            bw.flush();
        }while(!(line == null));

        System.out.printf("Arquivo \"%S\" copiado com sucesso", f.getName());
        System.out.printf("Arquivo \"%S\" copiado com sucesso", fcopy.getName());

        PrintWriter pw = new PrintWriter(System.out);
        pw.println("\nRecomende 3 livros: ");
        pw.flush();

        adicionarInfoNoArquivo(fcopy.getName());

        pw.printf("Informações adicionadas ao arquivo", fcopy.getName());
        br.close();
        bw.close();
        pw.close();
    }

    public static void adicionarInfoNoArquivo(String arquivo) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true));

        do{
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        }while(!(line.equalsIgnoreCase("fim")));
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException{
        copiarArquivo();
    }
}
