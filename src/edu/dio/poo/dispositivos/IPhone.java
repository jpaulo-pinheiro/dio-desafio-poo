package edu.dio.poo.dispositivos;

import edu.dio.poo.dispositivos.navegadores_internet.NavegadorInternet;
import edu.dio.poo.dispositivos.reprodutores_musicais.ReprodutorMusical;
import edu.dio.poo.dispositivos.telefones.AparelhoTelefonico;

public class IPhone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

    @Override
    public void pausar() {
        System.out.println("IPhone: música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("IPhone: música '" + musica + "' selecionada.");

    }

    @Override
    public void tocar() {
        System.out.println("IPhone: tocando música...");

    }

    @Override
    public void atender() {
        System.out.println("IPhone: telefone atendido.");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("IPhone: iniciando correio de voz.");

    }

    @Override
    public void ligar(String numero) {
        System.out.println("IPhone: ligando para " + numero + ".");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("IPhone: nova aba adicionada no navegador de internet.");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("IPhone: página da internet atualizada.");

    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("IPhone: página '" + url + "' atualizada.");

    }



}
