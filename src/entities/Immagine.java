package entities;

public class Immagine extends Media{


    private int brigthness;

    public Immagine(String title, int brigthness) {
        super(title);
        this.brigthness = brigthness;
    }
}
