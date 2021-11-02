public class Room {
    //Variables needed for room class 
    private String roomName;
    private double roomLength;
    private double roomWidth;
    private String shadeAmount;
    private AirConditioner airConditioner;

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
    public Room(String rName, double rLength, double rWidth, String sAmount, AirConditioner airC){
        roomName = rName;
        roomLength = rLength;
        roomWidth = rWidth;
        shadeAmount = sAmount;
        airConditioner = new AirConditioner(airC);
    }

    /**
     * Setters
     * mutators to set the value of the fields of the class
     */

     public void setName(String rName){
         this.roomName = rName;

     }

     public void setLength(double rLength){
         this.roomLength = rLength;
     }

     public void setWidth(double rWidth){
         this.roomWidth = rWidth;
     }

     public void setShade(String sAmount){
         this.shadeAmount = sAmount;
     }

     public void setAirConditioner(AirConditioner airC){
         this.airConditioner = new AirConditioner(airC);
     }

     /**
      * Getters
      a acccesor to get the value of fields in the class
      */

      public String getName(){
          return this.roomName;
      }

      public double getLength(){
          return this.roomLength;
      }

      public double getWidth(){
          return this.roomWidth;
      }

      public String getShade(){
          return this.shadeAmount;
      }

      public AirConditioner gAirConditioner(){
          return new AirConditioner(airConditioner);
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
           double btuNeeded = 0.0;
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

           if(shadeAmount.equals("Little")){
               btuNeeded *= 1.15;
           }

           if(shadeAmount.equals("Abundant")){
               btuNeeded *= .90;
           }

           return btuNeeded;

       }

       /**
        * Method to check if air conditioner has adaquete cooling
        * Will check if the btu's needed to cool the room is more or less than the air conditioner's capability 
        *@return true if the conditioner has more capacity, returns false if not
        */
        public boolean hasAdaueteCooling(){
            //Create boolean value 
            boolean bool = false;

            if(getBTUs() < airConditioner.getBTUCapacity()){
                bool = true;
            }

            return bool;
        }

    /**
     * toString method to display the info of the object 
     * @return a String that has all the info of the object 
     */
    public String toString(){
        return String.format("Room Name: " + roomName +
                             "\nRoom Aread(in square feet): " + getArea() +
                             "\nBTU's per Hour Needed: %,.2f" + 
                             "\n" + airConditioner.toString(), getBTUs());
    }

    
}
