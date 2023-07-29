public class OlaMergulhador {
    public static void main(String[] args) {
        System.out.println("Olá Mergulhador! Parabéns por criar o seu primeiro programa em Java.");
        //Adicionar uma linha para separar as impressões
        System.out.printf("\n");

        String nomeCompleto = "Altamiro Xavier Toledo Junior";
        System.out.println("Olá " + nomeCompleto + ", seja bem vindo ao Mergulho Java!");
        System.out.printf("\n");

        int minhaIdade = 40;
        int suaIdade = 35;
        int totalIdade = minhaIdade + suaIdade;
        System.out.println("A soma total das idades é: " + totalIdade);
        System.out.printf("\n");

        double peso = 82.1d;
        System.out.println("O seu peso é: "+ peso);
        System.out.printf("\n");

        float taxa = 1294.34f;
        float taxa1 = 1_294.34f;
        System.out.println("As taxas são: " + taxa + " e " + taxa1);
        System.out.printf("\n");

        boolean compraAprovada = false;
        System.out.println(compraAprovada);
        boolean maiorDeIdade = minhaIdade > 18;
        System.out.println(maiorDeIdade);
        maiorDeIdade = minhaIdade > 41;
        System.out.println(maiorDeIdade);

    }
}
