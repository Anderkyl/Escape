import java.util.Scanner;
public class Room {

    boolean compass, lamp, flashlight, copper_cable, battery, electrical_tape, light_bulb, light, book, escape, pullBed;
    int currentStation = 0;
    Scanner read = new Scanner(System.in);

    public int switchStation(){
        if(currentStation == 1){
            System.out.println("2 - Inspect The Dresser \n3 - Inspect the Bookcase \n4 - Inspect the Door");
            return read.nextInt();

        }else if(currentStation == 2){
            System.out.println("1 - Inspect the Bed \n3 - Inspect the Bookcase \n4 - Inspect the Door");
            return read.nextInt();

        }else if(currentStation == 3){
            System.out.println("1 - Inspect the Bed \n2 - Inspect The Dresser \n4 - Inspect the Door");
            return read.nextInt();

        }else if(currentStation == 4){
            System.out.println("1 - Inspect the Bed \n2 - Inspect The Dresser \n3 - Inspect the Bookcase");
            return read.nextInt();

        }else{
            System.out.println("1 - Inspect the Bed \n2 - Inspect The Dresser \n3 - Inspect the Bookcase \n4 - Inspect the Door");
            return read.nextInt();
        }
    }

    public int bed(){
        currentStation = 1;
        if(light){
            pullBed = true;
            System.out.println("There is a small bed against the wall. You see a brown down pillow and black rough blanket. Now with the light you notice grooves in the floor by each leg of the bed as if the bed has been pulled multiple times. You pull on the bed and you hear a click from the bookcase.");
        }else{
            System.out.println("There is a small bed against the wall. You can see the outlines of a pillow and rough blanket. You might be able to see more if you had a light.");
        }
        return switchStation();
    }

    public int dresser(){
        currentStation = 2;
        System.out.println("The dresser sits crooked, the frame slightly worn over time. The two bottom drawers are missing, but the top drawer is still intact. A Lamp sits on the top, without a lamp shade. Just a light-bulb on a fancy pole.");
        System.out.println("1 - Inspect the Room \n2 - Inspect the Drawer \n3 - Inspect the Lamp");
        int choice = read.nextInt();
        if(choice == 1){
            return switchStation();
        }else if(choice == 2){
            return inspectDrawer();
        }else{
            return inspectLamp();
        }
    }

    public int bookcase(){
        currentStation = 3;
        System.out.println("The bookcase is slightly dusty with a few books and a compass on the shelf. Two books really catch your eye.");
        System.out.println("1 - Inspect the Room \n2 - Inspect the Books \n3 - Take the Compass");
        int choice = read.nextInt();
        if(choice == 1){
            return switchStation();
        }else if(choice == 2){
            return inspectBooks();
        }else{
            compass = true;
            System.out.println("You take the compass.");
            return current();
        }
    }

    public int inspectBooks(){
        System.out.println("The two books on the shelf are both bound in hard leather covers. The titles are etched in gold on the side.");
        System.out.println("1 - Inspect \"Ben's Kites: Modern Discoveries\" \n2 - Inspect \"Edison Contraptions\"");

        int choice = read.nextInt();
        if(choice == 1){
            System.out.println("You flip through many dusty pages of flying contraptions with various devices attached to them. One such kite, had a compass attached. Reading by dim light is hard, so you have no clue why a compass would be on a kite. You put the book back.");
        }else{
            book = true;
            System.out.println("This book is filled with images of contraptions which could illuminate a light bulb. There are many which use fruits and potatoes. This is making you hungry. But one such contraption shows a light bulb taped to the negative post of a battery and a copper cable connected from the positive post to the light bulb. You put the book back.");
        }
        return current();
    }

    public int door(){
        currentStation = 4;
        System.out.println("What a strange door. No handle. Solid metal. There's no getting through that. It looks like there's a light switch next to the door, but there's something odd about it.");
        System.out.println("1 - Inspect the Room \n2 - Inspect the Light Switch");
        int choice = read.nextInt();
        if(choice == 1){
            return switchStation();
        }
        else{
            if(copper_cable && electrical_tape){
                System.out.println("You notice some bare wires sticking out of the light switch. There isn't anything else you can do but stare at the door again.");
                return current();
            }else if(copper_cable){
                electrical_tape = true;
                System.out.println("You notice some wires sticking out of the light switch. Someone did a really bad job of taping those up. You could easily take the tape and reuse it.");
                return current();
            }else if(electrical_tape){
                copper_cable = true;
                System.out.println("You notice some bare wires sticking out of the light switch and a few copper cable scraps on the ground.");
                return current();
            }
            else{
                System.out.println("You notice some bare wire sticking out of the light switch and a few copper cable scraps on the ground. Someone did a really bad job of taping those up. You could easily take the tape and reuse it.");
                System.out.println("1 - Take the Tape \n2 - Take the Copper Cables");
                int choice2 = read.nextInt();
                if(choice2 == 1){
                    electrical_tape = true;
                }else{
                    copper_cable = true;
                }
                return current();
            }
        }
    }

    public int inspectDrawer(){
        if(flashlight){
            System.out.println("You open the drawer to find it empty.");
        }else{
            flashlight = true;
            System.out.println("You open the drawer to find a flashlight. You take the flashlight.");
        }

        return current();
    }

    public int inspectLamp(){
        if(book){
            light_bulb = true;
            System.out.println("You look closely at the lamp and notice the power cord coming out the bottom. The cord doesn't interest you though, you came for the light bulb. You take the light bulb.");
        }else{
            System.out.println("You look closely at the lamp and notice the power cord coming out the bottom. You follow the cord with your hands until you find the frayed end. No plug. Bad luck that one.");
        }

        return current();
    }

    public int current(){
        System.out.println("Hit Enter to Continue ... ");
        read.nextLine();
        read.nextLine();

        return currentStation;
    }
}
