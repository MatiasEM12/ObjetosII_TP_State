package ejercicio_3;


public class Golondrina {
    private int energia; //joules

    public Golondrina() {
        this.energia = 45;
    }

    public void comer(int gramos) {
        this.energia += 5*gramos;
    }

    public void volar( double km) {

       this.energia -= (10 + km);
    }


    private EstadoGolondrina estadoActual() {

        if (energia < 50) {
            return new Debil(this);
        }

        if (energia > 500) {
            return new Euforica(this);
        }

        return new Normal(this);
    }

    public void realizarDeseo() {
        estadoActual().realizarDeseo();
    }
    public int energia(){
        return energia;
    }
}