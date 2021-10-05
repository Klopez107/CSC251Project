import java.io.*;
import java.util.*;

public class Project_Kevin_Lopez {
    
    public static void main(String[] args) throws IOException{

        PrintWriter outputFile = new PrintWriter("Rooms.txt");

        //Create Input Scanner 
        Scanner keyboard = new Scanner(System.in);

        //Variables needed
        String roomName;
        double roomLength;
        double roomWidth;
        int shadeChoice;
        String shadeAmount;


        //Variables for shade amount 
        final String SHADE_DEFAULT = "Moderate";
        final String SHADE_CHOICE1 = "Little";
        final String SHADE_CHOICE3 = "Abundant";

        //Get the necessary inputs  
        System.out.print("Please enter the name of the room: ");
        roomName = keyboard.nextLine();

        System.out.print("Please enter the length of the room(in feet): ");
        roomLength = keyboard.nextDouble();

        System.out.print("Please enter the width of the room(in feet): ");
        roomWidth = keyboard.nextDouble();

        System.out.println("What is the amount of shade that this room receives?");
        System.out.println("\n1. Little shade");
        System.out.println("2. Moderate shade");
        System.out.println("3. Abudent Shade");
        System.out.print("\nPlease select from the options above: ");
        shadeChoice = keyboard.nextInt();

        //Shade amount should change depending on choice 
        shadeAmount = SHADE_DEFAULT;

        if(shadeChoice == 1){
            shadeAmount = SHADE_CHOICE1;
        }
        if(shadeChoice == 3){
            shadeAmount = SHADE_CHOICE3;
        }

        //Create object for room 
        Room customerRoom = new Room(roomName, roomLength, roomWidth, shadeAmount);

        //Output data 
        System.out.println("Room name: " + customerRoom.getName());
        System.out.println("Room Area (in square feet): " + customerRoom.getArea());
        System.out.println("Amounf ot shade " + customerRoom.getShade());
        System.out.println("BTUs per hour needed: " +  customerRoom.getBTUs());


    }
    
}
