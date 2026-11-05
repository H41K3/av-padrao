package questao2;

public class TarifaRotativa implements EstrategiaTarifa {
    public static final double VALOR_HORA = 8.0;
    private static final int MINUTOS_POR_HORA = 60;

    @Override
    public double calcular(int minutosPermanencia) {
        int horasIniciadas = (int) Math.ceil(minutosPermanencia / (double) MINUTOS_POR_HORA);
        return horasIniciadas * VALOR_HORA;
    }
}
