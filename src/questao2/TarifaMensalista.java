package questao2;

public class TarifaMensalista implements EstrategiaTarifa {
    public static final double VALOR_FIXO = 250.0;

    @Override
    public double calcular(int minutosPermanencia) {
        return VALOR_FIXO;
    }
}
