package ejercicio_3;

public class Debil implements EstadoGolondrina{

    Golondrina golondrina;

    public Debil(Golondrina golondrina){
        this.golondrina = golondrina;
    }
    @Override
    public void realizarDeseo() {
        golondrina.comer(50);
    }
}
