package pagamentos;

public class PagamentoPIX implements PagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " efetuado via PIX.");
    }
}
