import entities.Audio;
import entities.Immagine;
import entities.Media;
import entities.Video;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Media[] multimedia= new Media[5];
        System.out.println("creaiamo 5 Elementi multimediali insieme!");



        //inizia la creazione degli elementi dell'array
        for (int i=0; i<5;i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Seleziona scrivendo il tipo di file: immagine video o audio");
            String name = input.nextLine();

            // controllo su quale elemento creare
            switch (name) {
                case "immagine": {
                    System.out.println("Hai creato un'immagine");
                    Scanner imageTitleInput = new Scanner(System.in);
                    System.out.println("insersci il titolo");
                    String imageTitle = imageTitleInput.nextLine();

                    // try catch per controllare che passi una stringa numerica
                    // e non una stringa non numerica cosi il parse int non da errore
                    boolean ok=false;
                    Scanner imageBrightnessInput = new Scanner(System.in);
                    int imageBrightness = 0;
                    do {
                        System.out.println("inserisci la lumonista' da 1 a 10'");
                        try {
                            imageBrightness= Integer.parseInt(imageBrightnessInput.nextLine());

                            //controllo per fare in modo che il numero sia tra 1 e 10

                            if (imageBrightness>0 && imageBrightness<11){
                                ok = true;
                            } else System.out.println("non e' un numero valido");

                        } catch (NumberFormatException e) {
                            System.out.println("non e' un numero valido");
                        }
                    } while (!ok);
                    Immagine image =new Immagine(imageTitle,imageBrightness);
                    multimedia[i]=image;
                    break;
                    //creazione dell'elemento immagine completata
                }
                case "audio": {
                    System.out.println("Hai creato un audio");

                    Scanner audioTitleInput = new Scanner(System.in);
                    System.out.println("insersci il titolo");
                    String audioTitle = audioTitleInput.nextLine();

                    // try catch per controllare che passi una stringa numerica
                    // e non una stringa non numerica cosi il parse int non da errore
                    boolean ok=false;
                    Scanner audiolengthInput = new Scanner(System.in);
                    int audioLength = 0;
                    do {
                        System.out.println("inserisci la durata");
                        try {
                            audioLength= Integer.parseInt(audiolengthInput.nextLine());
                            ok=true;
                        } catch (NumberFormatException e) {
                            System.out.println("non e' un numero valido");
                        }
                    } while (!ok);

                    // try catch per controllare che passi una stringa numerica
                    // e non una stringa non numerica cosi il parse int non da errore
                    boolean ok1=false;
                    Scanner audioVolumeInput = new Scanner(System.in);
                    int audioVolume = 0;
                    do {
                        System.out.println("inserisci il volume da 1 a 10'");
                        try {
                            audioVolume= Integer.parseInt(audioVolumeInput.nextLine());

                            //controllo per fare in modo che il numero sia tra 1 e 10
                            if (audioVolume>0 && audioVolume<11){
                            ok1 = true;
                            } else System.out.println("non e' un numero valido");

                        } catch (NumberFormatException e) {
                            System.out.println("non e' un numero valido");
                        }
                    } while (!ok1);

                    Audio audio =new Audio(audioTitle,audioVolume,audioLength);
                    multimedia[i]=audio;
                    break;
                }
                case "video": {
                    System.out.println("Hai scelto video");

                    Scanner videoTitleInput = new Scanner(System.in);
                    System.out.println("insersci il titolo");
                    String videoTitle = videoTitleInput.nextLine();

                    // try catch per controllare che passi una stringa numerica
                    // e non una stringa non numerica cosi il parse int non da errore
                    boolean ok=false;
                    Scanner videolengthInput = new Scanner(System.in);
                    int videoLength = 0;
                    do {
                        System.out.println("inserisci la durata");
                        try {
                            videoLength= Integer.parseInt(videolengthInput.nextLine());
                            ok=true;
                        } catch (NumberFormatException e) {
                            System.out.println("non e' un numero valido");
                        }
                    } while (!ok);

                    // try catch per controllare che passi una stringa numerica
                    // e non una stringa non numerica cosi il parse int non da errore
                    boolean ok1=false;
                    Scanner videoVolumeInput = new Scanner(System.in);
                    int videoVolume = 0;
                    do {
                        System.out.println("inserisci il volume da 1 a 10'");
                        try {
                            videoVolume= Integer.parseInt(videoVolumeInput.nextLine());
                            //controllo per fare in modo che il numero sia tra 1 e 10
                            if (videoVolume>0 && videoVolume<11){
                                ok1 = true;
                            } else System.out.println("non e' un numero valido");

                        } catch (NumberFormatException e) {
                            System.out.println("non e' un numero valido");
                        }
                    } while (!ok1);

                    // try catch per controllare che passi una stringa numerica
                    // e non una stringa non numerica cosi il parse int non da errore
                    boolean ok2=false;
                    Scanner videoBrightnessInput = new Scanner(System.in);
                    int videoBrightness = 0;
                    do {
                        System.out.println("inserisci la lumonista' da 1 a 10'");
                        try {
                            videoBrightness= Integer.parseInt(videoBrightnessInput.nextLine());

                            //controllo per fare in modo che il numero sia tra 1 e 10
                            if (videoBrightness>0 && videoBrightness<11){
                                ok2 = true;
                            } else System.out.println("non e' un numero valido");

                        } catch (NumberFormatException e) {
                            System.out.println("non e' un numero valido");
                        }
                    } while (!ok2);

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

        //inizio del input per decidere cosa mostrare


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

    }

}