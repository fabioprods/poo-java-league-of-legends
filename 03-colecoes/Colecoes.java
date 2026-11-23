import java.util.ArrayList;

public class Colecoes {
    public static void main(String[] args) {
        ArrayList<String> itens = new ArrayList<String>();
        itens.add("Espada");
        itens.add("Escudo");
        itens.add("Pocao");

        System.out.println(itens.size());
        System.out.println(itens.get(1));
        itens.remove("Escudo");
        System.out.println(itens.size());

        for (String item : itens) {
            System.out.println(item);
        }
    }
}
