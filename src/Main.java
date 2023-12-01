import entities.Audio;
import entities.Immagine;
import entities.Media;
import entities.Video;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Media[] multimedia= new Media[2];

        for (int i=0; i<2;i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Scrivi: immagine video o audio");
            String name = input.nextLine();
            switch (name) {
                case "immagine": {
                    System.out.println("Hai scelto immagine");
                    Scanner imageTitleInput = new Scanner(System.in);
                    System.out.println("insersci il titolo");
                    String imageTitle = imageTitleInput.nextLine();
                    Scanner imageBrightnessInput = new Scanner(System.in);
                    System.out.println("inserisci la lumnosita'");
                    int imageBrightness = Integer.parseInt(imageBrightnessInput.nextLine());
                    Immagine image =new Immagine(imageTitle,imageBrightness);
                    multimedia[i]=image;
                    break;
                }
                case "audio": {
                    System.out.println("Hai scelto audio");
                    Scanner audioTitleInput = new Scanner(System.in);
                    System.out.println("insersci il titolo");
                    String audioTitle = audioTitleInput.nextLine();
                    Scanner audiolengthInput = new Scanner(System.in);
                    System.out.println("inserisci la durata'");
                    int audioLength = Integer.parseInt(audiolengthInput.nextLine());
                    System.out.println("inserisci il volume'");
                    Scanner audioVolumeInput = new Scanner(System.in);
                    int audioVolume = Integer.parseInt(audioVolumeInput.nextLine());
                    Audio audio =new Audio(audioTitle,audioVolume,audioVolume);
                    multimedia[i]=audio;
                    break;
                }
                case "video": {
                    System.out.println("Hai scelto video");
                    Scanner videoTitleInput = new Scanner(System.in);
                    System.out.println("insersci il titolo");
                    String videoTitle = videoTitleInput.nextLine();
                    Scanner videolengthInput = new Scanner(System.in);
                    System.out.println("inserisci la durata'");
                    int videoLength = Integer.parseInt(videolengthInput.nextLine());
                    System.out.println("inserisci il volume'");
                    Scanner videoVolumeInput = new Scanner(System.in);
                    int videoVolume = Integer.parseInt(videoVolumeInput.nextLine());
                    Scanner videoBrightnessInput = new Scanner(System.in);
                    System.out.println("inserisci la lumnosita'");
                    int videoBrightness = Integer.parseInt(videoBrightnessInput.nextLine());
                    Video video =new Video(videoTitle,videoVolume,videoVolume,videoBrightness);
                    multimedia[i]=video;
                    break;
                }
                default: {
                    System.out.println("Riprova inserendo la parola giusta");
                    break;
                }

            }
        }
        System.out.println(Arrays.toString(multimedia));


        //methods


    }




}