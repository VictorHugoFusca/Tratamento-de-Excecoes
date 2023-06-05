package principal;

import entidades.Conta;
import excecoes.ContaExcecao;

public class TesteConta {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.setSaldo(1000);
        minhaConta.setLimite(500);
        minhaConta.setCodigoIdentificacao("123456");

        double valorSaque = 1500;
        boolean saldoSuficiente = false;

        do {
            try {
                minhaConta.sacar(valorSaque);
                saldoSuficiente = true;
            } catch (ContaExcecao e) {
                System.err.println("Erro: " + e.getMessage());
                System.out.println("Saldo disponível: " + minhaConta.getSaldo());
                // Código para solicitar novo valor de saque do usuário
                // e atualizar a variável valorSaque
            }
        } while (!saldoSuficiente);
    }
}




