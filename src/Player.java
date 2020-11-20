import java.util.Scanner;

public class Player {

    boolean compass, flashlight, copper_cable, battery, electrical_tape, light_bulb, light, escape;
    boolean lightAssembly1, lightAssembly2, lightAssembly3;
    Scanner read = new Scanner(System.in);

    public void inspectInventory(){

        do{
            System.out.println("\n*********************************");
            escape = false;
            checkLight();
            if(compass){
                System.out.println("1 - Inspect Compass");
            }
            if(flashlight){
                System.out.println("2 - Inspect Flashlight");
            }
            if(copper_cable){
                System.out.println("3 - Inspect Copper Cable");
            }
            if(battery){
                System.out.println("4 - Inspect Battery");
            }
            if(electrical_tape){
                System.out.println("5 - Electrical Tape");
            }
            if(light_bulb){
                System.out.println("6 - Light Bulb");
            }
            if(light){
                System.out.println("7 - Battery Powered Light Bulb");
            }
            System.out.println("0 - Go Back");
            System.out.println("***********************************\n");
            int choice = read.nextInt();

            if(choice == 1){
                if(compass){
                    inspectCompass();
                }else{
                    System.out.println("Sorry you don't have that item.");
                }
            }else if(choice == 2){
                if(flashlight){
                    inspectFlashlight();
                }else{
                    System.out.println("Sorry you don't have that item.");
                }
            }else if(choice == 3){
                if(copper_cable){
                    inspectCopperCable();
                }else{
                    System.out.println("Sorry you don't have that item.");
                }
            }else if(choice == 4){
                if(battery){
                    inspectBattery();
                }else{
                    System.out.println("Sorry you don't have that item.");
                }
            }else if(choice == 5){
                if(electrical_tape){
                    inspectTape();
                }else{
                    System.out.println("Sorry you don't have that item.");
                }
            }else if(choice == 6){
                if(light_bulb){
                    inspectLightBulb();
                }else{
                    System.out.println("Sorry you don't have that item.");
                }
            }else if(choice == 7){
                if(light){
                    inspectLight();
                }else{
                    System.out.println("Sorry you don't have that item.");
                }
            }else{
                escape = true;
            }
        }while(!escape);
    }

    public void inspectCompass(){
        Display.narrative(Display.compass);
    }

    public void inspectFlashlight(){
        Display.narrative(Display.flashlight);
        Display.choices(Display.flashlightC);
        int choice = read.nextInt();
        if(choice == 1){
            Display.narrative(Display.flashlightOn);
        }else{
            if(battery){
                Display.narrative(Display.flashlightDead);
            }else{
                battery = true;
                Display.narrative(Display.flashlightShake);
            }
        }
    }

    public void inspectCopperCable(){
        Display.narrative(Display.cableN);
        if(battery && light_bulb){
            Display.choices(Display.cableC1);
        }else if(battery){
            Display.choices(Display.cableC2);
        }else if(light_bulb){
            Display.choices(Display.cableC3);
        }

        int choice = read.nextInt();

        if(lightAssembly2 && lightAssembly3 && choice == 1){
            Display.narrative(Display.cableN4);
            lightAssembly1 = true;
        }else if(electrical_tape && choice == 1){
            Display.narrative(Display.cableN1);
            lightAssembly1 = true;
        }else if(lightAssembly3 && choice == 2 && lightAssembly1){
            Display.narrative(Display.cableN2);
            lightAssembly2 = true;
        }else if(electrical_tape && choice == 2){
            Display.narrative(Display.cableN3);

            lightAssembly2 = true;
        }else if((choice == 1 && !battery) || (choice == 2 && !light_bulb)){
            Display.narrative(Display.cableN5);
        }else if(choice == 1){
            Display.narrative(Display.cableN6);
        }else if(choice == 2){
            Display.narrative(Display.cableN7);
        }
    }

    public void inspectBattery(){
        Display.narrative(Display.battery);

    }

    public void inspectTape(){
        Display.narrative(Display.tapeN);
    }

    public void inspectLightBulb(){
        Display.narrative(Display.lightBulb);
        if(battery){
            Display.choices(Display.lightbulbC);
            int choice = read.nextInt();
            if(lightAssembly1 && lightAssembly2 && choice == 1){
                lightAssembly3 = true;
                Display.narrative(Display.lightbulbN1);
            }else if(choice == 1 && electrical_tape){
                lightAssembly3 = true;
                Display.narrative(Display.lightbulbN2);
            }else{
                Display.narrative(Display.lightbulbN3);
            }
        }
    }

    public void inspectLight(){
        Display.narrative(Display.light);
    }

    public void checkLight(){
        if(lightAssembly1 && lightAssembly2 && lightAssembly3){
            light = true;
            battery = false;
            light_bulb = false;
            copper_cable = false;
        }
    }

    public boolean hasCompass() {
        return compass;
    }

    public void setCompass(boolean compass) {
        this.compass = compass;
    }

    public boolean hasFlashlight() {
        return flashlight;
    }

    public void setFlashlight(boolean flashlight) {
        this.flashlight = flashlight;
    }

    public boolean hasCopper_cable() {
        return copper_cable;
    }

    public void setCopper_cable(boolean copper_cable) {
        this.copper_cable = copper_cable;
    }

    public boolean hasBattery() {
        return battery;
    }

    public void setBattery(boolean battery) {
        this.battery = battery;
    }

    public boolean hasElectrical_tape() {
        return electrical_tape;
    }

    public void setElectrical_tape(boolean electrical_tape) {
        this.electrical_tape = electrical_tape;
    }

    public boolean hasLight_bulb() {
        return light_bulb;
    }

    public void setLight_bulb(boolean light_bulb) {
        this.light_bulb = light_bulb;
    }

    public boolean hasLight() {
        return light;
    }

    public void setLight(boolean light) {
        this.light = light;
    }
}
