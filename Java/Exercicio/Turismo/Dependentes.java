package Turismo;

public class Dependentes {
    private String nome;

    public Dependentes(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public String toString(){
        return this.nome;
    }
}
