public class Room {
    //Variables needed for room class 
    private String roomName;
    private double roomLength;
    private double roomWidth;
    private String shadeAmount;

    /**
     * Construcor with no args
     */
    public Room(){ 
        roomName = "";
        roomLength = 0.0;
        roomWidth = 0.0;
        shadeAmount = "";
    }

    /**
     * Constructor 
     * @param rName the room name 
     * @param rLength room length 
     * @param rWidth room width 
     * @param sAmount shade amount of the room 
     */
    public Room(String rName, double rLength, double rWidth, String sAmount){
        roomName = rName;
        roomLength = rLength;
        roomWidth = rWidth;
        shadeAmount = sAmount;
    }

    /**
     * Setters
     * mutators to set the value of the fields of the class
     */

     public void setName(String rName){
         roomName = rName;

     }

     public void setLength(double rLength){
         roomLength = rLength;
     }

     public void setWidth(double rWidth){
         roomWidth = rWidth;
     }

     public void setShade(String sAmount){
         shadeAmount = sAmount;
     }

     /**
      * Getters
      a acccesor to get the value of fields in the class
      */

      public String getName(){
          return roomName;
      }

      public double getLength(){
          return roomLength;
      }

      public double getWidth(){
          return roomWidth;
      }

      public String getShade(){
          return shadeAmount;
      }

      /**
       * Area method 
       * No arg method that returns area 
       */
      public double getArea(){
          return roomWidth * roomLength;
      }

      /**
       * BTU calculation method 
       * No arg method that retunrns BTUs needed for room 
       * If Little shade, BTU should be increased by 15%
       * If Abundant shade,  BTU should be decreased by 10%
       */

       public double getBTUs(){
           double btuNeeded;
           double area = roomLength * roomWidth;

           if(area < 250){
               btuNeeded = 5500;
           } else if(area <= 500 ){
               btuNeeded = 10000;
           } else if (area < 1000){
               btuNeeded = 17500;
           }else {
               btuNeeded = 24000;
           }


           if(shadeAmount == "Little"){
               btuNeeded *= 1.15;
           }

           if(shadeAmount == "Abundant"){
               btuNeeded *= .90;
           }

           return btuNeeded;

       }

    
}
