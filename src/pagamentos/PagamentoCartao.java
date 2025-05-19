package pagamentos;

public class PagamentoCartao implements PagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " efetuado com Cartão de Crédito.");
    }
}

