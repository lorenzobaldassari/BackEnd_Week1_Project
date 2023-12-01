package entities;

public class Immagine extends Media{


    private int brigthness;

    public Immagine(String title, int brigthness) {
        super(title);
        this.brigthness = brigthness;
    }

    @Override
    public String toString() {
        return "Immagine{" +
                "brigthness=" + brigthness +
                ", title='" + title + '\'' +
                '}';
    }
}
