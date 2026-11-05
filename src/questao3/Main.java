package questao3;

public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new Espresso();
        pedido1 = new Leite(pedido1);
        pedido1 = new Chantilly(pedido1);

        Pedido pedido2 = new Cha();
        pedido2 = new Calda(pedido2);

        Pedido pedido3 = new Espresso();
        pedido3 = new Leite(pedido3);
        pedido3 = new Leite(pedido3);
        pedido3 = new Calda(pedido3);

        Pedido pedido4 = new Cha();

        imprimir(pedido1);
        imprimir(pedido2);
        imprimir(pedido3);
        imprimir(pedido4);
    }

    private static void imprimir(Pedido pedido) {
        System.out.printf("%s = R$ %.2f%n", pedido.getDescricao(), pedido.getPreco());
    }
}
