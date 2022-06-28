package poo.ejercicio1.libro.Entidades;

public class Libro {

    private String Titulo;
    private String Autor;
    private int Numerodepaginas;
    private int ISBN;

    public Libro() {
    }

    public Libro(String Titulo, String Autor, int Numerodepaginas, int ISBN) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Numerodepaginas = Numerodepaginas;
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumerodepaginas() {
        return Numerodepaginas;
    }

    public void setNumerodepaginas(int Numerodepaginas) {
        this.Numerodepaginas = Numerodepaginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

}
