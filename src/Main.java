import lanches.Lanche;
import lanches.LancheFactory;
import pagamentos.PagamentoPIX;

public class Main {
    public static void main(String[] args) {
        // Criando o lanche com a Factory
        Lanche lanche = LancheFactory.criarLanche("xsalada");

        // Montando o pedido
        Pedido pedido = new Pedido.Builder()
            .lanche(lanche)
            .bebida("Suco")
            .sobremesa("Pudim")
            .build();

        pedido.setValor(35.00); // valor fictício do pedido
        pedido.setPagamento(new PagamentoPIX());

        pedido.exibirResumo();
        pedido.realizarPagamento();
    }
}
