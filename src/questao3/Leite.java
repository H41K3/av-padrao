package questao3;

public class Leite extends Complemento {
    private static final double PRECO = 2.0;

    public Leite(Pedido pedido) {
        super(pedido, "Leite", PRECO);
    }
}
