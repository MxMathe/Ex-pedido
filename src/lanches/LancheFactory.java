package lanches;

public class LancheFactory {
    public static Lanche criarLanche(String tipo) {
        switch (tipo.toLowerCase()) {
            case "xburger":
                return new XBurger();
            case "xsalada":
                return new XSalada();
            default:
                throw new IllegalArgumentException("Tipo de lanche desconhecido: " + tipo);
        }
    }
}
