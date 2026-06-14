package ejercicio_3;

public class Euforica implements EstadoGolondrina{

    Golondrina golondrina;

    public Euforica(Golondrina golondrina){
        this.golondrina = golondrina;
    }

    @Override
    public void realizarDeseo() {
        golondrina.volar(10); //5km de ida + 5km de vuelta

    }
}
