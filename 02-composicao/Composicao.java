public class Composicao {
    public static void main(String[] args) {
        Arma espada = new Arma("Espada", 40);
        Guerreiro g = new Guerreiro("Garen", espada);

        System.out.println(g.getNome());
        System.out.println(g.getArma().getNome());
        System.out.println(g.getArma().getDano());
    }
}

class Arma {
    private String nome;
    private int dano;

    Arma(String nome, int dano) {
        this.nome = nome;
        this.dano = dano;
    }

    public String getNome() {
        return this.nome;
    }

    public int getDano() {
        return this.dano;
    }
}

class Guerreiro {
    private String nome;
    private Arma arma;

    Guerreiro(String nome, Arma arma) {
        this.nome = nome;
        this.arma = arma;
    }

    public String getNome() {
        return this.nome;
    }

    public Arma getArma() {
        return this.arma;
    }
}
