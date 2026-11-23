public class ClasseAbstrata {
    public static void main(String[] args) {
        Blitz b = new Blitz("Blitzcrank");
        Lux l = new Lux("Lux");
        

        b.usarHabilidade();
        l.usarHabilidade();
    }
}

abstract class Campeao {
    private String nome;

    Campeao(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public abstract void usarHabilidade();
}

class Blitz extends Campeao {
    Blitz(String nome) {
        super(nome);
    }

    @Override
    public void usarHabilidade() {
        System.out.println(getNome() + " lanca o gancho");
    }
}

class Lux extends Campeao {
    Lux(String nome) {
        super(nome);
    }

    @Override
    public void usarHabilidade() {
        System.out.println(getNome() + " dispara o laser");
    }
}
