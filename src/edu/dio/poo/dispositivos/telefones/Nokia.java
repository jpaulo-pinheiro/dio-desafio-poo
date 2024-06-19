package edu.dio.poo.dispositivos.telefones;

public class Nokia implements AparelhoTelefonico {

    @Override
    public void atender() {
        System.out.println("Nokia: telefone atendido.");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Nokia: iniciando correio de voz.");

    }

    @Override
    public void ligar(String numero) {
        System.out.println("Nokia: ligando para " + numero + ".");

    }

}
