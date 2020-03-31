package com.example.demo.model;

/**
 * Carro
 */
public class Carro { 
    private int num;
    private String nomeMarca;
    private String cor;

    public Carro(int num,String nomeMarca , String cor) {
        this.nomeMarca = nomeMarca;
        this.num = num;
        this.cor = cor;
    }

    public String getNomeMarca() {
        return nomeMarca;
    }

    public void setNomeMarca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

     @Override
    public String toString() {
        return "Carro [cor=" + cor + ", nomeMarca=" + nomeMarca + ", num=" + num + "]";
    }

   

}