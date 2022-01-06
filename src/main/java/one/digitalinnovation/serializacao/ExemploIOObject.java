package one.digitalinnovation.serializacao;

import java.io.IOException;
import java.io.*;

public class ExemploIOObject{
    public static void serializacao() throws IOException{
        Gato gato = new Gato("Simba",6,"amarelo", true, false);

        File f = new File("gato");
//      OutputStream os = new FileOutputStream(f.getNome());
//      ObjectOutputStream oos = new ObjectOutputStream(os);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f.getName()));
        oos.writeObject(gato);

        PrintStream ps =  new PrintStream(System.out);
        ps.printf("Arquivo \"%S\" criado com sucesso! Tamanho '%d' byte", f.getName(), f.length());

        oos.close();
        ps.close();
    }

    public static void desserializacao(String arquivo) throws IOException, ClassNotFoundException{

//      InputStream is = new FileInputStream(arquivo);
//      ObjectOutputStream ois = ObjectOutputStream(is);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo));
        Gato objetoGato = (Gato) ois.readObject();

        System.out.printf("\nNome.............: %s\n", objetoGato.getNome());
        System.out.printf("\nIdade............: %s\n", objetoGato.getIdade());
        System.out.printf("\nCor..............: %s\n", objetoGato.getCor());
        System.out.printf("\nCastrado.........: %s\n", objetoGato.isCastrado());
        System.out.printf("\nRonrona..........: %s\n", objetoGato.isRonrona());
        System.out.println("\n"+objetoGato);

        ois.close();

    }

    public static void main(String[] args) throws IOException ,ClassNotFoundException{
//        serializacao();
        desserializacao("/home/mauros/IdeaProjects/aulas-digital-innovation/gato");
    }
}
