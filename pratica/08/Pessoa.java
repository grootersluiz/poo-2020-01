
package pkg08;

public class Pessoa {
    private String nome;

    public pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "pessoa{" + "nome=" + nome + "}\n";
    }
    
    
}