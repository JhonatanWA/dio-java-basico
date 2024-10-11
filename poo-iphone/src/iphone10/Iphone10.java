package iphone10;

import funcoes.ligacao.Ligacao;
import funcoes.musica.Musica;

public class Iphone10 implements Musica, Ligacao {
    
    public void tocar() {
        System.out.println("Tocando música no Iphone 10");
    }

    public void pausar() {
        System.out.println("Pausando música no Iphone 10");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música "+ musica +" no Iphone 10");
    }

    // Ligacao
    public void ligar(long numero) {
        System.out.println("Ligando no Iphone 10 para o número " + numero);
    }

    public void atender() {
        System.out.println("Atendendo o Iphone 10");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando um correio de voz no Iphone 10");
    }

}
