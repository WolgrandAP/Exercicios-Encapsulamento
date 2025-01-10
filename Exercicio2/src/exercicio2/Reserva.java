package exercicio2;

public class Reserva {
    //Horário do Check-in e do Check-out - 13:00hrs
    private boolean reserva;
    private int numeroQuarto;
    private String nomeHospede;
    private float valorDiaria;
    private int dataCheckin;
    private int dataCheckout;

    public Reserva(int numeroQuarto, String nome, float valorDiaria, int dataCheckin, int dataCheckout) {
        this.setNumeroQuarto(numeroQuarto);
        this.setNomeHospede(nome);
        this.setValorDiaria(valorDiaria);
        this.setDataCheckin(dataCheckin);
        this.setDataCheckout(dataCheckout);
    }

    public void setReserva(boolean r) {
        this.reserva = r;
    }
    public boolean getReserva() {
        return this.reserva;
    }

    public void setNumeroQuarto(int nq) {
        this.numeroQuarto = nq;
    }
    public int getNumeroQuarto() {
        return this.numeroQuarto;
    }

    public void setNomeHospede(String nh) {
        this.nomeHospede = nh;
    }
    public String getNomeHospede() {
        return this.nomeHospede;
    }

    public void setValorDiaria(float vd) {
        this.valorDiaria = vd;
    }
    public float getValorDiaria() {
        return this.valorDiaria;
    }

    public void setDataCheckin(int dc) {
        this.dataCheckin = dc;
    }
    public int getDataCheckin() {
        return this.dataCheckin;
    }

    public void setDataCheckout(int dc) {
        this.dataCheckout = dc;
    }
    public int getDataCheckout() {
        return this.dataCheckout;
    }

    public void reservar() {
        this.setReserva(true);

        int diarias = this.getDataCheckout() - this.getDataCheckin();

        if (diarias>=5 || diarias<=9) {
            this.setValorDiaria(this.getValorDiaria()*0.95f);
        } else if (diarias>=10) {
            this.setValorDiaria(this.getValorDiaria()*0.9f);
        }
    }

    public void cancelarReserva() {
        this.setReserva(false);
        this.setNumeroQuarto(Integer.parseInt(null));
        this.setNomeHospede(null);
        this.setValorDiaria(Float.parseFloat(null));
        this.setDataCheckin(Integer.parseInt(null));
        this.setDataCheckout(Integer.parseInt(null));
    }

    public String situacao() {
        if (reserva) {
            return "Hóspede: " + this.getNomeHospede() +
                    " /Número do quarto: " + this.getNumeroQuarto() +
                    " /Valor por diária com desconto:" + this.getValorDiaria();
        } else {
            return "Reserva cancelada";
        }
    }

}
