package pagamentos;

public class PagamentoDinheiro implements PagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " efetuado em Dinheiro.");
    }
}

