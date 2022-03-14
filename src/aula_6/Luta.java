package aula_6;


import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int numeroDeRounds;
    private boolean lutaAprovada;

    public Luta(Lutador desafiado, Lutador desafiante, int numeroDeRounds) {
        this.desafiado = desafiado;
        this.desafiante = desafiante;
        this.numeroDeRounds = numeroDeRounds;
        marcarLuta();
    }

    public void marcarLuta() {

        if (desafiado != desafiante && desafiado.getCategoria() == desafiante.getCategoria()) {
            this.lutaAprovada = true;
            System.out.println("A luta está marcada...");
        } else {
            this.lutaAprovada = false;

        }


    }

    public void lutar() {
        boolean aprovacao = this.lutaAprovada;
        int vencedor = new Random().nextInt(3);

        if (aprovacao) {
            System.out.println(this.getDesafiado().apresentar());
            System.out.println(this.getDesafiante().apresentar());
            switch (vencedor) {
                case 0:
                    System.out.println("Empatou!!!!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("O desafiante " + this.getDesafiante().getNome() + " é o vencedor!!! ");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                case 2:
                    System.out.println("O desafiado " + this.getDesafiado().getNome() + " é o vencedor!!! ");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
            }


        } else {
            System.out.println("Esta luta não pode acontecer");
        }

    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador deafiante) {
        this.desafiante = deafiante;
    }

    public int getNumeroDeRounds() {
        return numeroDeRounds;
    }

    public void setNumeroDeRounds(int numeroDeRounds) {
        this.numeroDeRounds = numeroDeRounds;
    }

    public boolean isLutaAprovada() {
        return lutaAprovada;
    }

    public void setLutaAprovada(boolean lutaAprovada) {
        this.lutaAprovada = lutaAprovada;
    }
}
