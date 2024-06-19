package edu.dio.poo.dispositivos.reprodutores_musicais;

public class MP3Player implements ReprodutorMusical {

    @Override
    public void pausar() {
        System.out.println("MP3Player: música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("MP3Player: música '" + musica + "' selecionada.");

    }

    @Override
    public void tocar() {
        System.out.println("MP3Player: tocando música...");

    }

}
