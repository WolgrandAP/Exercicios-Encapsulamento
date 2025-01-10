package exercicio1;

public class CasosTestes {

    public static void main(String[] args) {

        ContaBancaria c[] = new ContaBancaria[3];

        c[0] = new ContaBancaria(1000,1000);
        c[1] = new ContaBancaria(1111, 0);
        c[2] = new ContaBancaria(2222, 500);

        c[0].sacar(400);
        System.out.println(c[0].verificarSaldo());

        c[1].depositar(18000);
        System.out.println(c[1].verificarSaldo());

        c[2].sacar(800);
        System.out.println(c[2].verificarSaldo());
    }
}
