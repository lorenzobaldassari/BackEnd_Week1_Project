package entities;

public class Video extends Media {

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
}
