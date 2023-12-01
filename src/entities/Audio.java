package entities;

public class Audio extends Media{
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
}
