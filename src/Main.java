import entities.Audio;
import entities.Immagine;
import entities.Media;
import entities.Video;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Media[] multimedia= new Media[5];

        for (int i=0; i<5;i++) {
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
                    System.out.println("inserisci una lumnosita' da 1 a 10");
                    int imageBrightness = Integer.parseInt(imageBrightnessInput.nextLine());
                    if (imageBrightness<1 || imageBrightness>11){
                        imageBrightness=5;
                        System.out.println("luminosita' non accettata! assegnato volume di default 5");
                    }
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

                    Scanner audioVolumeInput = new Scanner(System.in);
                    System.out.println("inserisci il volume' da 1 a 10");
                    int audioVolume = Integer.parseInt(audioVolumeInput.nextLine());
                    if (audioVolume<1 || audioVolume>11){
                        audioVolume=5;
                        System.out.println("volume non accettato! assegnato volume di default 5");
                    }

                    Audio audio =new Audio(audioTitle,audioVolume,audioLength);
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

                    System.out.println("inserisci il volume da 1 a 10");
                    Scanner videoVolumeInput = new Scanner(System.in);
                    int videoVolume = Integer.parseInt(videoVolumeInput.nextLine());
                    if (videoVolume<1 || videoVolume>11){
                        videoVolume=5;
                        System.out.println("volume non accettato! assegnato volume di default 5");
                    }

                    Scanner videoBrightnessInput = new Scanner(System.in);
                    System.out.println("inserisci la lumnosita' da 1 a 10");
                    int videoBrightness = Integer.parseInt(videoBrightnessInput.nextLine());
                    if (videoBrightness<1 || videoBrightness>11){
                        videoBrightness=5;
                        System.out.println("luminosita' non accettata! assegnato volume di default 5");
                    }
                    Video video =new Video(videoTitle,videoVolume,videoLength,videoBrightness);
                    multimedia[i]=video;
                    break;
                }
                default: {
                    System.out.println("Riprova inserendo la parola giusta");
                    i--;
                    break;
                }

            }
        }

//


        while(1>0) {
        Scanner input = new Scanner(System.in);
        System.out.println("Scegli cosa mostrare");
        int choose = Integer.parseInt(input.nextLine());
            if(choose==0){
                break;
            }else{
                switch (choose) {
                    case 1: {
                    if (multimedia[0] instanceof Audio) {
                        ((Audio) multimedia[0]).play();
                    } else if (multimedia[0] instanceof Video) {
                        ((Video) multimedia[0]).play();
                    } else if(multimedia[0] instanceof Immagine) {
                        ((Immagine) multimedia[0]).show();
                    }else{
                        System.out.println("questo media non e' stato inserito correttamente");
                    }
                    break;
                }
                    case 2: {
                    if (multimedia[1] instanceof Audio) {
                        ((Audio) multimedia[1]).play();
                    } else if (multimedia[1] instanceof Video) {
                        ((Video) multimedia[1]).play();
                    } else if(multimedia[1] instanceof Immagine) {
                        ((Immagine) multimedia[1]).show();
                    }else{
                        System.out.println("questo media non e' stato inserito correttamente");
                    }
                    break;
                }
                case 3: {
                    if (multimedia[2] instanceof Audio) {
                        ((Audio) multimedia[2]).play();
                    } else if (multimedia[2] instanceof Video) {
                        ((Video) multimedia[2]).play();
                    } else if (multimedia[2] instanceof Immagine) {
                        ((Immagine) multimedia[2]).show();
                    }else{
                        System.out.println("questo media non e' stato inserito correttamente");
                    }
                    break;
                }
                case 4: {
                    if (multimedia[3] instanceof Audio) {
                        ((Audio) multimedia[3]).play();
                    } else if (multimedia[3] instanceof Video) {
                        ((Video) multimedia[3]).play();
                    } else if(multimedia[3] instanceof Immagine){
                        ((Immagine) multimedia[3]).show();
                    }else{
                        System.out.println("questo media non e' stato inserito correttamente");
                    }
                    break;
                }
                case 5: {
                    if (multimedia[4] instanceof Audio) {
                        ((Audio) multimedia[4]).play();
                    }
                    else if (multimedia[4] instanceof Video) {
                        ((Video) multimedia[4]).play();
                    } else if(multimedia[4] instanceof Immagine){
                        ((Immagine) multimedia[4]).show();
                    }else{
                        System.out.println("questo media non e' stato inserito correttamente");
                    }
                    break;
                }
                default: {
                    System.out.println("No! inserisci un numero tra 0 e 5");
                }
            }
            }
        }







        //methods



    }




}