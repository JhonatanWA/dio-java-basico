package iphone11;

import funcoes.internet.Internet;
import funcoes.ligacao.Ligacao;
import funcoes.musica.Musica;

public class Iphone11 implements Musica, Ligacao, Internet {
    
    public void tocar() {
        System.out.println("Tocando música no Iphone 11");
    }

    public void pausar() {
        System.out.println("Pausando música no Iphone 11");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música "+ musica +" no Iphone 11");
    }

    // Ligacao
    public void ligar(long numero) {
        System.out.println("Ligando no Iphone 11 para o número " + numero);
    }

    public void atender() {
        System.out.println("Atendendo o Iphone 11");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando um correio de voz no Iphone 11");
    }


    // Internet
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página do site "+ url +" no Iphone 11");
    }

    public void adiconarNovaAba() {
        System.out.println("Adicionando uma nova aba no Iphone 11");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a página no Iphone 11");
    }

}
