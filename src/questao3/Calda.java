package questao3;

public class Calda extends Complemento {
    private static final double PRECO = 2.5;

    public Calda(Pedido pedido) {
        super(pedido, "Calda", PRECO);
    }
}
