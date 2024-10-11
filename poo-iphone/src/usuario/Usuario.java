package usuario;

// import iphone10.Iphone10;
import iphone11.Iphone11;

public class Usuario {
    
    public static void main(String[] args) {
        
        
        // Iphone10 iphone = new Iphone10();
        Iphone11 iphone = new Iphone11();

        iphone.ligar(912345678);
        iphone.iniciarCorreioVoz();
        iphone.atender();

        iphone.selecionarMusica("Música Teste");
        iphone.tocar();
        iphone.pausar();

        iphone.exibirPagina("https://www.google.com/");
        iphone.adiconarNovaAba();
        iphone.atualizarPagina();



    }

}
