public class Principal {
    public static void main(String[] args) {
        Pessoa  titular1 = new Pessoa();
        titular1.setNome("Altamirão");
        titular1.setDocumento("203040");

        Pessoa titular2 = new Pessoa();
        titular2.setNome("Paty Lane");
        titular2.setDocumento("506080");

        Conta minhaConta = new Conta(titular1, 3678, 1233453);
        System.out.println("Primeiro Titular: "+ minhaConta.getTitular().getNome());
        minhaConta.depositar(1000);
        System.out.println("Valor depositado: "+ minhaConta.getSaldo());
        minhaConta.sacar(300,10);
        System.out.println("Saldo ao sacar: "+ minhaConta.getSaldo());

        Conta suaConta = new Conta(titular2, 3678, 563421);
        System.out.println("Segundo Titular : "+ suaConta.getTitular().getNome());
        suaConta.depositar(1300);
        System.out.println("Valor depositado: "+ suaConta.getSaldo());
        suaConta.sacar(1200,20);
        System.out.println("Saldo ao sacar: "+ suaConta.getSaldo());

    }
}
