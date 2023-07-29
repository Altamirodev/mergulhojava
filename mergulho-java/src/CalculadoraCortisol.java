public class CalculadoraCortisol {
    public static void main(String[] args) {
        double cortisol = 1;
        boolean resultadoNormal = cortisol >=6.0 && cortisol <=18.4;
        boolean resultadoAnormal = !resultadoNormal;
        //Outra forma é utilizar o operador OU - ||
        boolean resultadoAnormal1 = cortisol < 6 || cortisol > 18.4;
        System.out.println("Cortisol normal: " + resultadoNormal);
        System.out.println("Cortisol anormal: " + resultadoAnormal);
        System.out.println("Cortisol anormal: " + resultadoAnormal1);

        //If, Elseif e Else
        if (cortisol >= 6.0 && cortisol<=18.4) {
            System.out.println("Cortisol normal.");
        } else if (cortisol > 18.4) {
            System.out.println("Cortisol Alto!");
        }
        else System.out.println("Cortisol Baixo.");
    }
}
