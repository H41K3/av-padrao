package questao3;

public class Chantilly extends Complemento {
    private static final double PRECO = 3.0;

    public Chantilly(Pedido pedido) {
        super(pedido, "Chantilly", PRECO);
    }
}
