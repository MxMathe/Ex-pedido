import lanches.Lanche;
import pagamentos.PagamentoStrategy;

public class Pedido {
    private Lanche lanche;
    private String bebida;
    private String sobremesa;
    private double valor;
    private PagamentoStrategy pagamento;
    

    private Pedido(Builder builder) {
        this.lanche = builder.lanche;
        this.bebida = builder.bebida;
        this.sobremesa = builder.sobremesa;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setPagamento(PagamentoStrategy pagamento) {
        this.pagamento = pagamento;
    }

    public void exibirResumo() {
        System.out.println("Pedido:");
        if (lanche != null) lanche.preparar();
        System.out.println("Bebida: " + bebida);
        System.out.println("Sobremesa: " + sobremesa);
    }

    public void realizarPagamento() {
        if (pagamento != null) {
            pagamento.pagar(valor);
        } else {
            System.out.println("Forma de pagamento não definida.");
        }
    }

    public static class Builder {
        private Lanche lanche;
        private String bebida;
        private String sobremesa;

        public Builder lanche(Lanche lanche) {
            this.lanche = lanche;
            return this;
        }

        public Builder bebida(String bebida) {
            this.bebida = bebida;
            return this;
        }

        public Builder sobremesa(String sobremesa) {
            this.sobremesa = sobremesa;
            return this;
        }

        public Pedido build() {
            return new Pedido(this);
        }
    }
}
