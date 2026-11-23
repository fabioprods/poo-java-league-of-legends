public class Heranca {
    public static void main(String[] args) {
        Campeao c = new Campeao("Garen", 600);
        c.apresentar();

        Mago m = new Mago("Lux", 500, 80);
        m.apresentar();
    }
}

class Campeao {
    private String nome;
    private int vida;

    Campeao(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public String getNome() {
        return this.nome;
    }

    public int getVida() {
        return this.vida;
    }

    void apresentar() {
        System.out.println("Campeao: " + this.nome + " com " + this.vida + " de vida");
    }
}

class Mago extends Campeao {
    private int poderMagico;

    Mago(String nome, int vida, int poderMagico) {
        super(nome, vida);
        this.poderMagico = poderMagico;
    }

    public int getPoderMagico() {
        return this.poderMagico;
    }

    @Override
    void apresentar() {
        super.apresentar();
        System.out.println("Poder magico: " + this.poderMagico);
    }
}
