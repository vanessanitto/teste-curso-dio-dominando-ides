package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("O problema dos 3 corpos", 300);
        System.out.println(livro1);
//        int a = 5;
//        int b = 3;
//        System.out.println("Hello World! " + (a+b));
    }
}

class Livro {
    private String name;
    private Integer numPaginas;

    public Livro(String name, Integer numPaginas) {
        this.name = name;
        this.numPaginas = numPaginas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "name='" + name + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}


