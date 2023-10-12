package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome,telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisaPorNome(String nome){
        Integer numeroPornome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPornome = agendaContatoMap.get(nome);
        }
        return numeroPornome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Rodrigo", 123456);
        agendaContatos.adicionarContato("Joao", 5424578);
        agendaContatos.adicionarContato("Rosangela", 1357855);
        agendaContatos.adicionarContato("Jenifer", 33345678);
        agendaContatos.adicionarContato("Nayara", 4577742);

        agendaContatos.exibirContato();
        agendaContatos.removerContato("Rodrigo");
        agendaContatos.exibirContato();

        System.out.println("O numero é " + agendaContatos.pesquisaPorNome("Rosangela"));

    }


}
