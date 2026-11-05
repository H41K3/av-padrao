package questao1;

public class AreaCompras implements AreaInteressada {
    private static final int LIMITE_ESTOQUE_BAIXO = 5;
 
    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        if (novaQuantidade < LIMITE_ESTOQUE_BAIXO) {
            System.out.println("[Compras] ALERTA: estoque baixo de " + nomeProduto + " (" + novaQuantidade + " unidades)");
        }
    }
}
