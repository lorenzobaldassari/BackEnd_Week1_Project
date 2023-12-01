package entities;

public abstract class Media  {

    public String title;

    public Media(String title) {
        this.title=title;
    }

    //methods


    @Override
    public String toString() {
        return "Media{" +
                "title='" + title + '\'' +
                '}';
    }


}
