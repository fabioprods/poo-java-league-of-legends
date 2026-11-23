public class Encapsulamento {
    public static void main(String[] args) {
        Thresh c = new Thresh("verde", 100, 100);
        c.levarDano(50);
        c.curar(200);
        System.out.println(c.getVidaAtual());
        System.out.println(c.getEstaVivo());
        System.out.println(c.estaComVidaBaixa());
    }
}

class Thresh {
    private String cor;
    private int vidaAtual;
    private int manaAtual;
    private boolean estaVivo;

    Thresh() {
        this.cor = "verde";
        this.vidaAtual = 500;
        this.manaAtual = 100;
        this.estaVivo = true;
    }

    Thresh(String cor, int vidaAtual, int manaAtual) {
        this.cor = cor;
        this.vidaAtual = vidaAtual;
        this.manaAtual = manaAtual;
        this.estaVivo = true;
    }

    public int getVidaAtual() {
        return this.vidaAtual;
    }

    public void setVidaAtual(int vidaAtual) {
        if (vidaAtual < 0) {
            this.vidaAtual = 0;
        } else {
            this.vidaAtual = vidaAtual;
        }
    }

    public boolean getEstaVivo() {
        return this.estaVivo;
    }

    void levarDano(int dano) {
        this.vidaAtual = this.vidaAtual - dano;
        if (this.vidaAtual <= 0) {
            this.vidaAtual = 0;
            this.estaVivo = false;
        }
    }

    void curar(int cura) {
        if (this.estaVivo) {
            this.vidaAtual = this.vidaAtual + cura;
        }
    }

    boolean podeHookar() {
        return this.estaVivo && this.manaAtual >= 80;
    }

    boolean estaComVidaBaixa() {
        return this.vidaAtual < 100;
    }
}
