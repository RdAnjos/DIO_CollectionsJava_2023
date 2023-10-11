package main.java.list.OperacoesBasicas;

public class Item {

    String Nome;
    Double Preco;
    int Quantidade;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Double getPreco() {
        return Preco;
    }

    public void setPreco(Double preco) {
        Preco = preco;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int quantidade) {
        Quantidade = quantidade;
    }

    public Item(String nome, Double preco, int quantidade) {
        Nome = nome;
        Preco = preco;
        Quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Item{" +
                "Nome='" + Nome + '\'' +
                ", Preco=" + Preco +
                ", Quantidade=" + Quantidade +
                '}';
    }
}
