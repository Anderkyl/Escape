import java.util.Scanner;

public class StarterRoom {

    boolean escape, pullBed, book, tookFlashlight, tookLightbulb, tookCompass, tookCable, tookTape;
    Scanner read = new Scanner(System.in);
    Player player = new Player();


    public void inspectRoom(){
        Display.narrative(Display.starterOpener);
        do{
            Display.choices(Display.starterChoices);
            int choice = read.nextInt();
            if(choice == 1){
                bed();
            }else if(choice == 2){
                dresser();
            }else if(choice == 3){
                bookcase();
            }else if(choice == 4){
                door();
            }else{
                player.inspectInventory();
            }
            read.nextLine();
        }while(!escape);
    }

    public void bed(){
        if(player.hasLight()){
            pullBed = true;
            Display.narrative(Display.bedP);
        }else{
            Display.narrative(Display.bedN);
        }
    }

    public void dresser(){
        if(tookLightbulb){
            Display.narrative(Display.dresserNoLight);
        }else{
            Display.narrative(Display.dresserN);
        }
        Display.choices(Display.dresserC);
        int choice = read.nextInt();
        if(choice == 1){
            inspectDrawer();
        }else{
            inspectLamp();
        }
    }

    public void inspectDrawer(){
        if(tookFlashlight){
            Display.narrative(Display.drawerNoLight);
        }else{
            player.setFlashlight(true);
            tookFlashlight = true;
            Display.narrative(Display.drawerN);
        }
    }

    public void inspectLamp(){
        if(book){
            player.setLight_bulb(true);
            tookLightbulb = true;
            Display.narrative(Display.lampNoLight);
        }else{
            Display.narrative(Display.lampN);
        }
    }


    public void bookcase(){
        if(pullBed) {
            Display.narrative(Display.bookcaseBedPull);
            escape = true;
        }else{
            if(tookCompass){
                Display.narrative(Display.bookcaseNoCompass);
                Display.choices(Display.bookcaseC1);
            }else{
                Display.narrative(Display.bookcaseN);
                Display.choices(Display.bookcaseC2);
            }
            int choice = read.nextInt();

            if(choice == 1){
                inspectBook();
            }else{
                player.setCompass(true);
                tookCompass = true;
                Display.narrative(Display.compassN);
            }
        }
    }

    public void inspectBook(){
        Display.narrative(Display.books);
        Display.choices(Display.bookC);

        int choice = read.nextInt();
        if(choice == 1){
            Display.narrative(Display.book1);
        }else {
            book = true;
            Display.narrative(Display.book2);
        }
    }

    public void door(){
        if(tookTape){
            Display.narrative(Display.doorNoTape);
            Display.choices(Display.doorNoTapeC);
        }else{
            Display.narrative(Display.doorN);
            Display.choices(Display.doorC);
        }

        int choice = read.nextInt();
        if(choice == 1){
            player.setElectrical_tape(true);
            tookTape = true;
            Display.narrative(Display.tape);
        }else{
            if(tookCable){
                Display.narrative(Display.lightNoCable);
            }else{
                Display.narrative(Display.lightN);
                if(book){
                    Display.choices(Display.lightC1);
                }else{
                    Display.choices(Display.lightC2);
                }

                int choice2 = read.nextInt();
                if(choice2 == 1){
                    Display.narrative(Display.touchWires);
                }else{
                    player.setCopper_cable(true);
                    tookCable = true;
                    Display.narrative(Display.cable);
                }
            }
        }
    }
}
