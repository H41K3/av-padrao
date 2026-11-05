package questao2;

public class Main {
    public static void main(String[] args) {
        int minutos = 135;

        Ticket rotativo = new Ticket("ABC-1234", minutos, new TarifaRotativa());
        Ticket mensalista = new Ticket("DEF-5678", minutos, new TarifaMensalista());
        Ticket conveniado = new Ticket("GHI-9012", minutos, new TarifaConveniado());

        System.out.println("Permanencia: " + minutos + " minutos");
        System.out.printf("Rotativo:   R$ %.2f%n", rotativo.calcularValor());
        System.out.printf("Mensalista: R$ %.2f%n", mensalista.calcularValor());
        System.out.printf("Conveniado: R$ %.2f%n", conveniado.calcularValor());

        System.out.println();
        Ticket ticket = new Ticket("JKL-3456", minutos, new TarifaRotativa());
        System.out.printf("Ticket %s como Rotativo:   R$ %.2f%n", ticket.getPlaca(), ticket.calcularValor());

        ticket.setEstrategia(new TarifaConveniado());
        System.out.printf("Ticket %s como Conveniado: R$ %.2f%n", ticket.getPlaca(), ticket.calcularValor());

        ticket.setEstrategia(new TarifaMensalista());
        System.out.printf("Ticket %s como Mensalista: R$ %.2f%n", ticket.getPlaca(), ticket.calcularValor());
    }
}
