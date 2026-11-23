public class Interfaces {
    public static void main(String[] args) {
        Garen g = new Garen();
        Soraka s = new Soraka();
        Nami n = new Nami();
        Atacante a = new Garen();
        a.atacar();
        a = new Nami();
        a.atacar();
        
        g.atacar();
        s.curar();
        n.atacar();
        n.curar();
    }
}

interface Atacante {
    void atacar();
}

interface Curador {
    void curar();
}

class Garen implements Atacante {
    public void atacar() {
        System.out.println("Garen gira a espada");
    }
}

class Soraka implements Curador {
    public void curar() {
        System.out.println("Soraka cura um aliado");
    }
}

class Nami implements Atacante, Curador {
    public void atacar() {
        System.out.println("Nami lanca uma bolha");
    }

    public void curar() {
        System.out.println("Nami cura com a mare");
    }
}
