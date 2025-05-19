 🍔 Sistema de Pedidos - Java com Padrões de Projeto

Este é um sistema de pedidos de lanches implementado em Java, com foco no uso prático de Padrões de Projeto. O sistema permite criar pedidos de diferentes tipos de lanches e escolher o método de pagamento desejado.

---

## 🧱 Padrões de Projeto Utilizados

- **Factory Method**: Para criar diferentes tipos de lanches (`XBurger`, `XSalada`, etc).
- **Strategy**: Para tratar diferentes formas de pagamento (Cartão, PIX, Dinheiro).
- **Builder**: Para montar objetos `Pedido` de forma flexível e legível.

---

## 🗂️ Estrutura de Pastas

src/

├── lanches/

│ ├── Lanche.java

│ ├── LancheFactory.java

│ ├── XBurger.java

│ └── XSalada.java

├── pagamentos/

│ ├── PagamentoStrategy.java

│ ├── PagamentoCartao.java

│ ├── PagamentoPIX.java

│ └── PagamentoDinheiro.java

├── Pedido.java

└── Main.java



---

## 🚀 Como Executar

1. Compile o projeto:

```bash
javac -d bin -sourcepath src src/Main.java
Execute o projeto:

bash
Copiar
Editar
java -cp bin Main

📌 Exemplo de Saída
yaml
Copiar
Editar
Pedido criado:
Lanche: X-Salada
Pagamento via: PIX
Total: R$ 17.0
