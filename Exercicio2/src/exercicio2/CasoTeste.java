package exercicio2;

public class CasoTeste {
    public static void main(String[] args) {
        Reserva r = new Reserva(15,"João",500,13,20);

        r.reservar();
        System.out.println(r.situacao());
    }
}
