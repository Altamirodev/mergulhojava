public class CalduladoraJurosCompostosTempo {
    public static void main(String[] args) {
        double valorAcumulado = 10_000;
        double taxaJuros = 0.8;
        int periodicidadeMensal = 12;

        for (int mes = 1; mes <= periodicidadeMensal; mes++) {
            valorAcumulado += valorAcumulado * taxaJuros / 100;
            System.out.println("Mês " + mes + " = " + valorAcumulado);
        }
    }
}
