package one.digitalinnovation.stream;

import java.io.*;

public class ExemploFile {
    public static void receberTecladoImprimirConsole() throws IOException {
//        InputStream is = System.in;
//        InputStreamReader isr = new InputStreamReader(is);
//        BufferedReader br = new BufferedReader(isr);
        System.out.println("Recomende 3 filmes");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

//        OutputStream os = System.out;
//        OutputStreamWriter wr = new OutputStreamWriter(os);
//        BufferedWriter bw = new BufferedWriter(wr);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            //lendo e escrevendo do teclado
            bw.write(line);//escreve uma linha
            bw.newLine();//pula uma linha
            line = br.readLine();//recarrega a linha novamente
        }while(!line.isEmpty());
        bw.flush();
        br.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        receberTecladoImprimirConsole();
    }
}
