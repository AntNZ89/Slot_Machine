import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] result = showSlots();

        System.out.println(Arrays.toString(result));

        showResult(result);

    }


    public static void showResult(String[] slots){


        if (slots[0] == slots[1] || slots[1] == slots[2] || slots[0] == slots[2]             ) {

            if (slots[0] == slots[1] && slots[0] == slots[2]) {

                if (slots[0].equals("STAR")) {

                    System.out.println("YOU HAVE WON 100 CREDITS!");

                } else if (slots[0].equals("APPLE")) {

                    System.out.println("YOU HAVE WON 10 CREDITS");

                } else if (slots[0].equals("CHERRY")) {

                    System.out.println("YOU HAVE WON 50 CREDITS");

                }

            }
            else if (slots[0] == slots[1] || slots[0] == slots[2]){

                if (slots[0].equals("STAR")) {

                    System.out.println("YOU HAVE WON 10 CREDITS!");

                } else if (slots[0].equals("APPLE")) {

                    System.out.println("YOU HAVE WON 1 CREDIT");

                } else if (slots[0].equals("CHERRY")) {

                    System.out.println("YOU HAVE WON 5 CREDITS");

                }

            }
            else if (slots[1] == slots[2]){

                if (slots[1].equals("STAR")) {

                    System.out.println("YOU HAVE WON 10 CREDITS!");

                } else if (slots[1].equals("APPLE")) {

                    System.out.println("YOU HAVE WON 1 CREDIT");

                } else if (slots[1].equals("CHERRY")) {

                    System.out.println("YOU HAVE WON 5 CREDITS");

                }
            }
        }
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