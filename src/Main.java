import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SlotMachine();

    }

    public static void SlotMachine(){

        Scanner scanner = new Scanner(System.in);

        int credits = 4;

        int creditsUpdate;

        String weiter = "y";

        while (weiter.toLowerCase().equals("y")) {

            if (credits < 5){

                System.out.println("YOU DONT HAVE ENOUGH CREDITS! HERE ARE 5 MORE!\n------------------------------------------------");
                credits = credits + 5;

            }

            creditsUpdate = credits - 5;

            System.out.println("Anzahl an credits davor: " + credits + " - 5 = " + creditsUpdate);

            String[] result = showSlots();

            System.out.println(Arrays.toString(result));

            creditsUpdate = creditsUpdate + showResult(result);

            System.out.println("Anzahl an credits danach: " + creditsUpdate);

            credits = creditsUpdate;

            System.out.println("continue? Y/N");

            weiter = scanner.next();

        }

        if (credits == 1){
            System.out.println("------------------------------------------------\nYOU FINISHED WITH " + credits + " CREDIT!");
        }
        else {
            System.out.println("------------------------------------------------\nYOU FINISHED WITH " + credits + " CREDITS!");
        }
    }



    public static int showResult(String[] slots){

        if (Objects.equals(slots[0], slots[1]) || Objects.equals(slots[1], slots[2]) || Objects.equals(slots[0], slots[2])) {

            if (Objects.equals(slots[0], slots[1]) && Objects.equals(slots[0], slots[2])) {

                switch (slots[0]){

                    case "STAR" : System.out.println("YOU HAVE WON 100 CREDITS! (3x star)"); return 100;
                    case "APPLE" : System.out.println("YOU HAVE WON 10 CREDITS! (3x apple)"); return 10;
                    case "CHERRY" : System.out.println("YOU HAVE WON 50 CREDITS! (3x cherry)"); return 50;

                }
            }
            else if (Objects.equals(slots[0], slots[1]) || Objects.equals(slots[0], slots[2])){

                switch (slots[0]){

                    case "STAR" : System.out.println("YOU HAVE WON 10 CREDITS! (2x star)"); return 10;
                    case "APPLE" : System.out.println("YOU HAVE WON 1 CREDIT! (2x apple)"); return 1;
                    case "CHERRY" : System.out.println("YOU HAVE WON 5 CREDITS! (2x cherry)"); return 5;

                }
            }
            else if (Objects.equals(slots[1], slots[2])){

                switch (slots[1]){

                    case "STAR" : System.out.println("YOU HAVE WON 10 CREDITS! (2x star)"); return 10;
                    case "APPLE" : System.out.println("YOU HAVE WON 1 CREDIT! (2x apple)"); return 1;
                    case "CHERRY" : System.out.println("YOU HAVE WON 5 CREDITS! (2x cherry)"); return 5;

                }
            }
        }
        return 0;
    }


    public static String[] showSlots(){

        String[] slots = new String[3];

        double slot1 = Math.random();
        double slot2 = Math.random();
        double slot3 = Math.random();

        if (slot1 >= 0 && slot1 < 0.34){

            slots[0] = "STAR";

        }
        else if (slot1 >= 0.34 && slot1 < 0.67){

            slots[0] = "APPLE";

        }
        else if (slot1 >= 0.67 && slot1 <= 1){

            slots[0] = "CHERRY";

        }

        if (slot2 >= 0 && slot2 < 0.34){

            slots[1] = "STAR";

        }
        else if (slot2 >= 0.34 && slot2 < 0.67){

            slots[1] = "APPLE";

        }
        else if (slot2 >= 0.67 && slot2 <= 1){

            slots[1] = "CHERRY";

        }

        if (slot3 >= 0 && slot3 < 0.34){

            slots[2] = "STAR";

        }
        else if (slot3 >= 0.34 && slot3 < 0.67){

            slots[2] = "APPLE";

        }
        else if (slot3 >= 0.67 && slot3 <= 1){

            slots[2] = "CHERRY";

        }

        return slots;

    }
}