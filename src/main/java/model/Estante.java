/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import model.enums.Status;

/**
 *
 * @author Diiego
 */
public class Estante {

    private static List<Livro> estante = new ArrayList();

    public static void adicionarLivro(Livro livro) {
        estante.add(livro);
    }

    public static void deletarLivro(String nomeDoLivro) {
        estante.removeIf(livro -> livro.getNome().equalsIgnoreCase(nomeDoLivro));
    }

    public static Livro encontrarLivro(String nomeDoLivro) {
        for (Livro livro : estante) {
            if (livro.getNome().equalsIgnoreCase(nomeDoLivro.trim())) {
                return livro;
            }
        }
        return null;
    }

    public static List<Livro> encontrarLivrosDisponiveis() {
        return estante.stream()
                .filter(livro -> livro.getStatus() == Status.DISPONIVEL)
                .collect(Collectors.toList());
    }

    public static List<Livro> todosLivros() {
        return new ArrayList(estante);
    }
    
    public static List<Livro> buscarLivrosPorNomeParcial(String texto) {
    String textoMinusculo = texto.toLowerCase();
    return estante.stream()
        .filter(livro -> livro.getNome().toLowerCase().contains(textoMinusculo))
        .collect(Collectors.toList());
}

    public static void popularEstante() {
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "1954");
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis", "1899");
        Livro livro3 = new Livro("1984", "George Orwell", "1949");
        Livro livro4 = new Livro("A Revolução dos Bichos", "George Orwell", "1945");
        Livro livro5 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", "1943");
        Livro livro6 = new Livro("Harry Potter e a Pedra Filosofal", "J.K. Rowling", "1997");
        Livro livro7 = new Livro("Cem Anos de Solidão", "Gabriel García Márquez", "1967");
        Livro livro8 = new Livro("O Alquimista", "Paulo Coelho", "1988");
        Livro livro9 = new Livro("A Metamorfose", "Franz Kafka", "1915");
        Livro livro10 = new Livro("O Hobbit", "J.R.R. Tolkien", "1937");
        Livro livro11 = new Livro("Crime e Castigo", "Fiódor Dostoiévski", "1866");
        Livro livro12 = new Livro("O Grande Gatsby", "F. Scott Fitzgerald", "1925");
        Livro livro13 = new Livro("Orgulho e Preconceito", "Jane Austen", "1813");
        Livro livro14 = new Livro("Moby Dick", "Herman Melville", "1851");
        Livro livro15 = new Livro("O Processo", "Franz Kafka", "1925");
        Livro livro16 = new Livro("A Guerra dos Mundos", "H.G. Wells", "1898");
        Livro livro17 = new Livro("O Conde de Monte Cristo", "Alexandre Dumas", "1844");
        Livro livro18 = new Livro("Anna Kariênina", "Liev Tolstói", "1877");
        Livro livro19 = new Livro("Drácula", "Bram Stoker", "1897");
        Livro livro20 = new Livro("Frankenstein", "Mary Shelley", "1818");
        Livro livro21 = new Livro("O Sol é Para Todos", "Harper Lee", "1960");
        Livro livro22 = new Livro("O Apanhador no Campo de Centeio", "J.D. Salinger", "1951");
        Livro livro23 = new Livro("Jane Eyre", "Charlotte Brontë", "1847");
        Livro livro24 = new Livro("As Aventuras de Sherlock Holmes", "Arthur Conan Doyle", "1892");
        Livro livro25 = new Livro("O Morro dos Ventos Uivantes", "Emily Brontë", "1847");
        Livro livro26 = new Livro("A Divina Comédia", "Dante Alighieri", "1320");
        Livro livro27 = new Livro("O Retrato de Dorian Gray", "Oscar Wilde", "1890");
        Livro livro28 = new Livro("O Caçador de Pipas", "Khaled Hosseini", "2003");
        Livro livro29 = new Livro("A Menina que Roubava Livros", "Markus Zusak", "2005");
        Livro livro30 = new Livro("O Diário de Anne Frank", "Anne Frank", "1947");

        adicionarLivro(livro1);
        adicionarLivro(livro2);
        adicionarLivro(livro3);
        adicionarLivro(livro4);
        adicionarLivro(livro5);
        adicionarLivro(livro6);
        adicionarLivro(livro7);
        adicionarLivro(livro8);
        adicionarLivro(livro9);
        adicionarLivro(livro10);
        adicionarLivro(livro11);
        adicionarLivro(livro12);
        adicionarLivro(livro13);
        adicionarLivro(livro14);
        adicionarLivro(livro15);
        adicionarLivro(livro16);
        adicionarLivro(livro17);
        adicionarLivro(livro18);
        adicionarLivro(livro19);
        adicionarLivro(livro20);
        adicionarLivro(livro21);
        adicionarLivro(livro22);
        adicionarLivro(livro23);
        adicionarLivro(livro24);
        adicionarLivro(livro25);
        adicionarLivro(livro26);
        adicionarLivro(livro27);
        adicionarLivro(livro28);
        adicionarLivro(livro29);
        adicionarLivro(livro30);
    }

}
