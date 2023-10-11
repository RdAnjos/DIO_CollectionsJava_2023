package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;
public class CarrinhoDeCompras {

    List<Item> carrinhoList;

    public CarrinhoDeCompras() {
        this.carrinhoList = new ArrayList<>();
    }

    public void adicionarItem(String nome, Double preco, int quantidade){
        carrinhoList.add(new Item(nome,preco,quantidade));
    }

    public void removerItem(String nome){
        //Implementar codigo
    }

    public int calcularValorTotal(int quantidade){
        return quantidade;
    }

    public void exibirItens(){

    }


    public static void main(String[] args) {

    }



}
