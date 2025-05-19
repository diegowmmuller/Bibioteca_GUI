/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.enums.Status;

/**
 *
 * @author Diiego
 */
public class Livro {

    private String nome;
    private String autor;
    private String anoDeLancamento;
    private Status status;

    public Livro() {
    }

    public Livro(String nome, String autor, String anoDeLancamento) {
        this.nome = nome;
        this.autor = autor;
        this.anoDeLancamento = anoDeLancamento;
        this.status = status.DISPONIVEL;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(String anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "<html>"
                + "<b>Título:</b> " + nome + "<br>"
                + "<b>Autor:</b> " + autor + "<br>"
                + "<b>Ano de Lançamento:</b> " + anoDeLancamento + "<br>"
                + "<b>Status:</b> " + status
                + "</html>";
    }

    public String toStringLivrosDisponiveis() {
        return nome + " - " + autor + " (" + anoDeLancamento + ")";
    }

}
