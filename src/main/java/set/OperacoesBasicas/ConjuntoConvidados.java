package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributo
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidadoSet(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome,codigoConvite));
    }

    public void removerConvidadePorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c: convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem " +conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados.");

        conjuntoConvidados.adicionarConvidadoSet("Rodrigo Anjos" ,1456);
        conjuntoConvidados.adicionarConvidadoSet("Joao" ,1589);
        conjuntoConvidados.adicionarConvidadoSet("Rosangela" ,4569);
        conjuntoConvidados.adicionarConvidadoSet("Jenifer Oliveira" ,2530);
        conjuntoConvidados.adicionarConvidadoSet("Rodrigo Anjos" ,9444);
        conjuntoConvidados.adicionarConvidadoSet("Rosangela" ,1234);
        conjuntoConvidados.adicionarConvidadoSet("Joao" ,7026);

        System.out.println("Existem " +conjuntoConvidados.contarConvidados() + " convidados dentro do Set de convidados.");

        conjuntoConvidados.exibirConvidados();
        conjuntoConvidados.removerConvidadePorCodigoConvite(9444);
        conjuntoConvidados.exibirConvidados();



    }



}
