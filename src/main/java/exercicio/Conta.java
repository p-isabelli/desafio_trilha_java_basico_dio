package exercicio;

public class Conta {
    private int numero;
    private int agencia;
    private String nomeCliente;
    private double saldo = 0;

    public Conta() {
    }

    public Conta(int numero, int agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposita(double valor) {
            if (valor > 0) {
                this.saldo += valor;
                System.out.println("Depósito realizado com sucesso!");
            } else {
                System.out.println("O valor do depósito deve ser positivo.");
            }
        }


    public void saca(double valor) {
            if (valor > 0 && valor <= this.saldo) {
                this.saldo -= valor;
                System.out.println("Saque realizado com sucesso!");
            } else {
                System.out.println("Saque inválido. Verifique o valor e o saldo disponível.");
            }
    }
}
