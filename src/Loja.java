import edu.dio.poo.dispositivos.IPhone;
import edu.dio.poo.dispositivos.navegadores_internet.Firefox;
import edu.dio.poo.dispositivos.reprodutores_musicais.MP3Player;
import edu.dio.poo.dispositivos.telefones.Nokia;

public class Loja {

    public static void main(String[] args) throws Exception {
        
        Nokia nokia = new Nokia();
        nokia.atender();
        nokia.iniciarCorreioVoz();
        nokia.ligar("3199998888");

        MP3Player mp3DaChina = new MP3Player();
        mp3DaChina.selecionarMusica("Talking to the moon");
        mp3DaChina.tocar();
        mp3DaChina.pausar();
        mp3DaChina.tocar();

        Firefox firefox = new Firefox();
        firefox.adicionarNovaAba();
        firefox.exibirPagina("https://www.dio.me");
        firefox.atualizarPagina();
        
        IPhone _15ProxMax = new IPhone();

        _15ProxMax.atender();
        _15ProxMax.iniciarCorreioVoz();
        _15ProxMax.ligar("31977776666");

        _15ProxMax.selecionarMusica("Locked out of heaven");
        _15ProxMax.tocar();
        _15ProxMax.pausar();
        _15ProxMax.tocar();

        _15ProxMax.adicionarNovaAba();
        _15ProxMax.exibirPagina("https://github.com/digitalinnovationone");
        _15ProxMax.atualizarPagina();

    }
}
