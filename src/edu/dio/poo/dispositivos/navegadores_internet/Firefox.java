package edu.dio.poo.dispositivos.navegadores_internet;

public class Firefox implements NavegadorInternet{

    @Override
    public void adicionarNovaAba() {
        System.out.println("Firefox: nova aba adicionada no navegador de internet.");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Firefox: página da internet atualizada.");

    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Firefox: página '" + url + "' atualizada.");

    }
    
}
