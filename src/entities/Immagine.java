package entities;

import entities.interfaces.DecreaseBrightness;
import entities.interfaces.IncreaseBrigthness;
import entities.interfaces.Show;

public class Immagine extends Media implements IncreaseBrigthness, DecreaseBrightness, Show {


    private int brigthness;

    public Immagine(String title, int brigthness) {
        super(title);
        this.brigthness = brigthness;
    }


    @Override
    public int decreaseBrigthness() {
        return this.brigthness--;
    }

    @Override
    public int increaseBrigthness() {
        return this.brigthness++;
    }

    @Override
    public void show() {
        System.out.println("hai scelto un'Immagine");
        String barrow="";
        for(int i=0;i<brigthness;i++){
            barrow=barrow+"*";
        }
        System.out.println(
                "Title: "+title+" "+barrow
        );

    }


}
