public class Display {

    static String starterOpener = "You open your eyes. You are laying on a floor in a dimly lit room, a small faint light streaming in from under a door. You stand up and look around. You can only just make out a few shapes around you, a bed, a bookcase, a dresser and the door.";
    static String starterChoices = "0 - Inspect Inventory \n1 - Inspect the Bed \n2 - Inspect The Dresser \n3 - Inspect the Bookcase \n4 - Inspect the Door";

    static String bedN = "There is a small bed against the wall. You can see the outlines of a pillow and rough blanket. You might be able to see more if you had a light.";

    static String bedP = "There is a small bed against the wall. You see a brown down pillow and black rough blanket. Now with the light you notice grooves in the floor by each leg of the bed as if the bed has been pulled multiple times. You pull on the bed and you hear a click from the bookcase.";

    static String dresserNoLight = "The dresser sits crooked, the frame slightly worn over time. The two bottom drawers are missing, but the top drawer is still intact. A Lamp sits on the top, without a lamp shade or a light bulb.";

    static String dresserN = "The dresser sits crooked, the frame slightly worn over time. The two bottom drawers are missing, but the top drawer is still intact. A Lamp sits on the top, without a lamp shade. Just a light-bulb on a fancy pole.";

    static String dresserC = "1 - Inspect the Drawer \n2 - Inspect the Lamp";

    static String drawerNoLight = "You open the drawer to find it empty.";
    static String drawerN = "You open the drawer to find a flashlight. You take the flashlight.";

    static String lampNoLight = "You look closely at the lamp and notice the power cord coming out the bottom. The cord doesn't interest you though, you came for the light bulb. You take the light bulb.";

    static String lampN = "You look closely at the lamp and notice the power cord coming out the bottom. You follow the cord with your hands until you find the frayed end. No plug. Bad luck that one.";

    static String bookcaseBedPull = "The bookcase is slightly ajar from the wall. You can see a hallway behind it.";
    static String bookcaseNoCompass = "The bookcase is slightly dusty with a few books. Two books really catch your eye.";
    static String bookcaseN = "The bookcase is slightly dusty with a few books and a compass on the shelf. Two books really catch your eye.";

    static String bookcaseC1 = "1 - Inspect the Books";
    static String bookcaseC2 = "1 - Inspect the Books \n2 - Take the Compass";

    static String compassN = "You take the compass.";

    static String books = "The two books on the shelf are both bound in hard leather covers. The titles are etched in gold on the side.";
    static String bookC = "1 - Inspect \"Ben's Kites: Modern Discoveries\" \n2 - Inspect \"Edison Contraptions\"";
    static String book1 = "You flip through many dusty pages of flying contraptions with various devices attached to them. One such kite, had a compass attached. Reading by dim light is hard, so you have no clue why a compass would be on a kite. You put the book back.";
    static String book2 = "This book is filled with images of contraptions which could illuminate a light bulb. There are many which use fruits and potatoes. This is making you hungry. But one such contraption shows a light bulb taped to the negative post of a battery and a copper cable connected from the positive post to the light bulb. You put the book back.";
    static String doorNoTape = "What a strange door. No handle. Solid metal. There's no getting through that. There's normally a light switch next to the door, but there some odd shape where a light switch should be.";
    static String doorNoTapeC = "2 - Inspect the Light Switch";
    static String doorN = "What a strange door. No handle. Solid metal. There's no getting through that. There's normally a light switch next to the door, but there some odd shape where a light switch should be. You see the outline of a small item sitting on the frame on top of the door.";
    static String doorC = "1 - Inspect the Item \n2 - Inspect the Light Switch";

    static String tape = "Squinting, you see its a small round object. You reach up to take it. You have found a small roll of electrical tape. Must have been left by an electrician or something. ";

    static String lightNoCable = "Dang. The light switch has been removed and one copper wire is shorter than the other. You are glad it wasn't powered.";

    static String lightN = "Dang. The light switch has been removed. Just copper wires sticking it out. Wonder if its even powered?";

    static String lightC1 = "1 - Touch the Wires Together \n 2 - Break a Piece of Cable";
    static String lightC2 = "1 - Touch the Wires Together";
    static String touchWires = "Luckily there's no spark. Un-luckily there's no power supplied either. Better keep searching.";
    static String cable = "You pull the copper cable out more and bend it back and forth until it breaks. You take the piece of copper cable.";

    static String compass = "It is a rather unremarkable compass. It just simply points north.";
    static String flashlight = "A cheap plastic flashlight. You remember them being heavier.";
    static String flashlightC = "1 - Turn on Flashlight \n2 - Shake Flashlight";
    static String flashlightOn = "You push the button to turn on the flashlight. Nothing happens. Just a disappointing click.";
    static String flashlightDead = "You shake the flashlight, wondering why you are shaking an empty dead flashlight.";
    static String flashlightShake = "Why do people always shake a flashlight? In this case, it proves useful as you hear the sound of a single battery sliding back in forth. You open the flashlight and take the battery.";

    static String cableN = "A standard copper electrical wire used to conduct electricity.";

    static String cableC1 = "1 - Put Cable on Battery \n2 - Put Cable on Light Bulb";
    static String cableC2 = "1 - Put Cable on Battery";
    static String cableC3 = "2 - Put Cable on Light Bulb";

    static String cableN1 = "You used the electrical tape to attach one end of the copper cable to the battery.";

    static String cableN2 = "You used the electrical tape to attach one end of the copper cable to the light bulb. The light bulb whirls to life. You can now see more details of the room.";

    static String cableN3 = "You used the electrical tape to attach one end of the copper cable to the light bulb.";

    static String cableN4 = "You used the electrical tape to attach one end of the copper cable to the battery. The light bulb whirls to life. You can now see more details of the room.";

    static String cableN5 = "Sorry, you can't do that yet.";
    static String cableN6 = "You touched the cable to the battery.";
    static String cableN7 = "You touched the cable to the light bulb";

    static String tapeN = "A small roll of electrical tape. Electrical tape is made of rubber and doesn't conduct electricity. It's perfect for safeguarding cable connections to power sources.";

    static String battery = "A nice big D-sized battery with a positive post and a negative post.";

    static String lightBulb = "A standard 60 watt light bulb. If given power, it will light up a room and allow you to see hidden clues.";

    static String lightbulbC = "1 - Put Light Bulb on Battery";

    static String lightbulbN1 = "You use the electrical tape to attach the light bulb to the battery. Power flows through the copper cable and the light bulb lights up. You can now see more details of the room.";

    static String lightbulbN2 = "You use the electrical tape to attach the light bulb to the battery.";

    static String lightbulbN3 = "You touch the light bulb to the battery. Nothing happens.";

    static String light = "A make-shift light source containing a battery, a light bulb, a copper cable, some tape and hope!";


    public static void narrative(String phrase){
        System.out.println(phrase);
    }

    public static void choices(String choices){
        System.out.println("\n********************************");
        System.out.println(choices);
        System.out.println("********************************\n");
    }

}
