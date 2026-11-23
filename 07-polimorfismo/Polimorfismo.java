public class Polimorfismo {
    public static void main(String[] args) {
        Animal a1 = new Cachorro();
        Animal a2 = new Gato();

        a1.falar();
        a2.falar();
        a1.respirar();
    }
}

class Animal {
    public void falar() {
        System.out.println("Animal faz um som");
    }

    public void respirar() {
        System.out.println("Animal respira");
    }
}

class Cachorro extends Animal {
    @Override
    public void falar() {
        System.out.println("Cachorro late");
    }

    public void abanarRabo() {
        System.out.println("Cachorro abana o rabo");
    }
}

class Gato extends Animal {
    @Override
    public void falar() {
        System.out.println("Gato mia");
    }
}
