package controller;

import model.Empresa;
import model.Cliente;
import service.Taxa;

public class Transacao {
    public static void deposito(Cliente cliente, Empresa empresa, double valor) {
      double taxa = Taxa.taxaCalc(valor);
        double valorFinal = valor - taxa;

        cliente.depositar(valorFinal);
        empresa.depositar(valor);
        
        String msgCliente = "Depósito de R$" + valor + " realizado com sucesso!";
        String msgEmpresa = "Depósito de R$" + valorFinal + " realizado com sucesso!";


        cliente.callback(msgCliente);
        empresa.callback(msgEmpresa);
    }

    public static void saque(Cliente cliente, Empresa empresa, double valor) {
        double taxa = Taxa.taxaCalc(valor);
        double valorFinal = valor + taxa;

        cliente.sacar(valorFinal);
        empresa.depositar(valor);

        String msgCliente = "Saque de R$" + valor + " realizado com sucesso!";
        String msgEmpresa = "Depósito de R$" + valor + " realizado com sucesso!";

        cliente.callback(msgCliente);
        empresa.callback(msgEmpresa);
    }
}
