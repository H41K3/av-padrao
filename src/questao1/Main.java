package questao1;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Teclado Mecanico", 10);

        AreaInteressada compras = new AreaCompras();
        AreaInteressada vendas = new AreaVendas();
        AreaInteressada auditoria = new AreaAuditoria();

        produto.adicionarArea(compras);
        produto.adicionarArea(vendas);
        produto.adicionarArea(auditoria);

        System.out.println("--- Estoque 10 -> 7");
        produto.alterarQuantidade(7);

        System.out.println("--- Estoque 7 -> 7 (sem mudanca)");
        produto.alterarQuantidade(7);

        System.out.println("--- Estoque 7 -> 3");
        produto.alterarQuantidade(3);

        System.out.println("--- Estoque 3 -> 0");
        produto.alterarQuantidade(0);

        System.out.println("--- Estoque 0 -> 12");
        produto.alterarQuantidade(12);

        System.out.println("--- Removendo Compras");
        produto.removerArea(compras);

        System.out.println("--- Estoque 12 -> 2");
        produto.alterarQuantidade(2);

        System.out.println("--- Estoque 2 -> 0");
        produto.alterarQuantidade(0);

        System.out.println("--- Estoque 0 -> 8");
        produto.alterarQuantidade(8);
    }
}
