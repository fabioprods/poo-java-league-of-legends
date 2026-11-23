public class Excecoes {
    public static void main(String[] args) {
        String[] valores = {"10", "abc", "0"};

        for (String v : valores) {
            try {
                int numero = Integer.parseInt(v);
                int resultado = 100 / numero;
                System.out.println("100 / " + numero + " = " + resultado);
            } catch (NumberFormatException e) {
                System.out.println(v + " nao e numero");
            } catch (ArithmeticException e) {
                System.out.println("divisao por zero");
            } finally {
                System.out.println("-- fim de " + v);
            }
        }
    }
}
