package one.digitalinnovation;

public class Estudante implements Comparable<Estudante>{
    private final String nome;
    private final Integer idade;

    public Estudante(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }
    public Integer getIdade(){
        return idade;
    }

    @Override
    public String toString(){
        return nome + " - " + idade;
    }

    public int compareTo(Estudante o){
        return this.getIdade() - o.getIdade();
    }
}
