package br.fatecrl.mvcdemo.model;

public class Carro {
    private String marca;
    private String cor;
    private String tipo;
    private int valor;

    public Carro(String marca, String cor, String tipo, int valor) {
        this.marca = marca;
        this.cor = cor;
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public String getCor() {
        return cor;
    }

    public String getTipo() {
        return tipo;
    }

    public int getValor() {
        return valor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}

