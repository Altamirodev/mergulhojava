import java.util.Objects;
/*Quando vamos utilizar uma classe INSTANCIÁVEL, podemos colocar as variáveis fora dos métodos, para que
sejam comuns às demais classes que a utilizarão. */
public class Conta {
    private Pessoa titular;
    private int agencia;
    private int numero;
    private double saldo;
//Abaixo temos a criação de um CONSTRUTOR que exige ao usuário os parâmetros obrigatoriamente:
    Conta(Pessoa titular, int agencia, int numero){
        Objects.requireNonNull(titular);
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }
//Abaixo a criação de um CONSTRUTOR genérico, que não exige parâmetros:
    Conta(){

    }


    void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero.");
        }
        saldo = saldo + valor;
    }

    void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que zero.");
        }
        if (saldo - valor < 0) {
            throw new IllegalStateException("Saldo insuficiente para efetuar o saque.");
        }
        saldo = saldo - valor;
    }
    //Abaixo temos uma SOBRECARGA(OVERLOADING) em que aproveitamos um método e suas características, dentro de outro:
    void sacar (double valor, double taxaSaque){
        sacar(valor + taxaSaque);
    }

    public Pessoa getTitular() {
        return titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

}
