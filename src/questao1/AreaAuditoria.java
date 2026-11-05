package questao1;
 
import java.util.ArrayList;
import java.util.List;

public class AreaAuditoria implements AreaInteressada {
    private final List<String> registros = new ArrayList<>();

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        String registro = nomeProduto + " -> " + novaQuantidade;
        registros.add(registro);
        System.out.println("[Auditoria] Registro: " + registro);
    }

    public List<String> getRegistros() {
        return new ArrayList<>(registros);
    }
}
