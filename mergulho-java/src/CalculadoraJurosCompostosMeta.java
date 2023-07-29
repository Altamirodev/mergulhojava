public class CalculadoraJurosCompostosMeta {
    public static void main(String[] args) {
        double valorAcumulado = 10_000;
        double valorMeta = 20_000;
        double taxaDeJurosMensal = 0.8;
        int meses = 0;
        while (valorAcumulado < valorMeta) {
            valorAcumulado += valorAcumulado * taxaDeJurosMensal / 100;
            meses ++;
        }
        System.out.println("Demorou " + meses + " meses para chegar à meta. Você acumulou " + valorAcumulado);
    }
}
