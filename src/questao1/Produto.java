package questao1;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private final String nome;
    private int quantidade;
    private final List<AreaInteressada> areas = new ArrayList<>();

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void adicionarArea(AreaInteressada area) {
        if (!areas.contains(area)) {
            areas.add(area);
        }
    }

    public void removerArea(AreaInteressada area) {
        areas.remove(area);
    }

    public void alterarQuantidade(int novaQuantidade) {
        if (novaQuantidade == quantidade) {
            return;
        }
        quantidade = novaQuantidade;
        notificarAreas();
    }

    private void notificarAreas() {
        for (AreaInteressada area : new ArrayList<>(areas)) {
            area.atualizar(nome, quantidade);
        }
    }
}
