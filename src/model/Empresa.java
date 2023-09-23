package model;

public class Empresa {
    private String nome;
    private String cnpj;
    private double saldo;

    public Empresa(String nome, String cnpj, double saldo) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnpj(String cnpj) {
        if (cnpj.length() == 14) {
            this.cnpj = cnpj;
        } else {
            System.out.println("CNPJ inválido!");
        }
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void callback(String msg) {
        System.out.println(msg);
    }
}
