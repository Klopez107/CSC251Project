import java.io.*;
import java.util.*;

public class Project_Kevin_Lopez {
    
    public static void main(String[] args) throws IOException{

        //Read Rooms.txt File
        File file = new File("Rooms.txt");

        //Create Input Scanner 
        Scanner inputFile = new Scanner(file);

        //Variables needed
        String roomName;
        double roomLength;
        double roomWidth;
        String shadeAmount = "";
        int littleRooms = 0, moderateRooms = 0, abundantRooms = 0;

        //ArrayList to hold room objects
        ArrayList<Room> roomList = new ArrayList<>();


        //Read The file
        while(inputFile.hasNext()){

            roomName = inputFile.nextLine();
            roomLength = inputFile.nextDouble();
            roomWidth = inputFile.nextDouble();
            inputFile.nextLine();
            shadeAmount = inputFile.nextLine();

            if(inputFile.hasNext()){
                inputFile.nextLine();
            }

            //Create Object 
            Room customerRoom = new Room(roomName, roomLength, roomWidth, shadeAmount);

            //Add Object to Array 
            roomList.add(customerRoom);

           
        }

        //Close file
        inputFile.close();

         //Print results by iterating over ArrayList 
         for(int i = 0; i < roomList.size(); i++){

            //Refrence object in the Array List to call methods 
            Room customerRoom = roomList.get(i);
            
            //Print results 
            System.out.println("\nRoom name: " + customerRoom.getName());
            System.out.println("\nRoom Area (in square feet): " + customerRoom.getArea());
            System.out.println("\nAmount ot shade: " + customerRoom.getShade());
            System.out.printf("\nBTUs per hour needed: %,.0f\n",  customerRoom.getBTUs());
        }
    }
    
}
