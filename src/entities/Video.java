package entities;

import entities.interfaces.*;

public class Video extends Media implements DecreaseVolume, IncreaseBrigthness,
            IncreaseVolume, DecreaseBrightness,Play {

    private int volume;
    private int length;
    private int brigthness;

    public Video(String title, int volume, int length, int brigthness) {
        super(title);
        this.volume = volume;
        this.length = length;
        this.brigthness = brigthness;
    }

    @Override
    public String toString() {
        return "Video{" +
                "volume=" + volume +
                ", length=" + length +
                ", brigthness=" + brigthness +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public int decreaseVolume() {
        return this.volume--;
    }
    @Override
    public int increaseVoluime() {
        return this.volume++;
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
    public void play() {
        System.out.println("hai scelto un Video");
        String exclamation="";
        for(int i=0;i<volume;i++){
            exclamation=exclamation+"!";
        } String barrow="";
        for(int i=0;i<brigthness;i++){
            barrow=barrow+"*";
        }
        for(int i=0;i<length;i++){
            System.out.println(
                    "Title: "+title+" "+exclamation+" "+barrow
            );
        }
    }
}
