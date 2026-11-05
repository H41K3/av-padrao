package questao2;

public class TarifaConveniado implements EstrategiaTarifa {
    public static final double VALOR_HORA = 8.0;
    public static final int MINUTOS_GRATUITOS = 30;
    public static final double PERCENTUAL_DESCONTO = 0.25;
    private static final int MINUTOS_POR_HORA = 60;

    @Override
    public double calcular(int minutosPermanencia) {
        int minutosCobrados = Math.max(0, minutosPermanencia - MINUTOS_GRATUITOS);
        int horasIniciadas = (int) Math.ceil(minutosCobrados / (double) MINUTOS_POR_HORA);
        return horasIniciadas * VALOR_HORA * (1 - PERCENTUAL_DESCONTO);
    }
}
