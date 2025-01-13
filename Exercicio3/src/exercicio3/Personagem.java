package exercicio3;

public class Personagem implements Acoes {
    private String nome;
    private int pontosSaude;
    private int experiencia;

    public Personagem(String nome) {
        this.setNome(nome);
        this.setPontosSaude(100);
        this.setExperiencia(0);
    }

    private void setNome(String nome) {
        this.nome = nome;
    }
    private String getNome() {
        return this.nome;
    }

    private void setPontosSaude(int pts) {
        this.pontosSaude = pts;
    }
    public int getPontosSaude() {
        return this.pontosSaude;
    }

    private void setExperiencia(int exp) {
        this.experiencia = exp;
    }
    private int getExperiencia() {
        return this.experiencia;
    }


    @Override
    public void sofrerDano() {
        switch(this.getExperiencia()) {
            case 0:
                this.setPontosSaude(this.getPontosSaude() - 10);
                break;

            case 100:
                this.setPontosSaude(this.getPontosSaude() - 9);
                break;

            case 200:
                this.setPontosSaude(this.getPontosSaude() - 8);
                break;

            case 300:
                this.setPontosSaude(this.getPontosSaude() - 7);
                break;

            case 400:
                this.setPontosSaude(this.getPontosSaude() - 6);
                break;

            case 500:
                this.setPontosSaude(this.getPontosSaude() - 5);
                break;

            case 600:
                this.setPontosSaude(this.getPontosSaude() - 4);
                break;

            case 700:
                this.setPontosSaude(this.getPontosSaude() - 3);
                break;

            case 800:
                this.setPontosSaude(this.getPontosSaude() - 2);
                break;

            case 900:
                this.setPontosSaude(this.getPontosSaude() - 1);
                break;

            }
        if (this.getPontosSaude() <= 0) {
            this.setPontosSaude(0);
        }
    }

    @Override
    public void recuperarSaude() {
        this.setPontosSaude(this.getPontosSaude() + 10);
        if (this.getPontosSaude()>100) {
            this.setPontosSaude(100);
        }
    }

    @Override
    public void ganharExperiencia() {
        this.setExperiencia(this.getExperiencia() + 100);
        if (this.getExperiencia()>900) {
            this.setExperiencia(900);
        }
    }


    public String status() {
        return "Personagem {" +
                "nome='" + nome + '\'' +
                ", pontosSaude=" + pontosSaude +
                ", experiencia=" + experiencia +
                '}';
    }
}
