package entities;

import entities.interfaces.DecreaseVolume;
import entities.interfaces.IncreaseVolume;
import entities.interfaces.Play;

public class Audio extends Media implements IncreaseVolume, DecreaseVolume, Play {
    private int volume;
    private int length;

    public Audio(String title, int volume, int length) {
        super(title);
        this.volume = volume;
        this.length = length;
    }

    //methods


    @Override
    public String toString() {
        return "Audio{" +
                "volume=" + volume +
                ", length=" + length +
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
    public void play() {
        System.out.println("hai scelto un Audio");
        String barrow="";
        for(int i=0;i<volume;i++){
            barrow=barrow+"!";
        }
        for(int i=0;i<length;i++){
        System.out.println(
                "Title: "+title+" "+barrow
        );
        }
    }
}


