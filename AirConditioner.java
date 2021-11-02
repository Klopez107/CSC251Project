public class AirConditioner {

    private String manufacturer;
    private String type;
    private double btuCapacity;

    //No-args constructor
    public AirConditioner(){
        this.manufacturer = "";
        this.type = "";
        this.btuCapacity = 0.0;
    }

    //Args constructor
    public AirConditioner(String manu, String type, double btuCap){
        this.manufacturer = manu;
        this.type = type;
        this.btuCapacity = btuCap;
    }

    /**
     * Copy constructor to prevent security holes 
     * @return copy of the second object
     */
    public AirConditioner(AirConditioner object2){
        this.manufacturer = object2.manufacturer;
        this.type = object2.type;
        this.btuCapacity = object2.btuCapacity;
    }

    //Setters
    public String getManufacturer(){
        return this.manufacturer;
    }

    public String getType(){
        return this.type;
    }
    
    public double getBTUCapacity(){
        return this.btuCapacity;
    }
    
    //Getters 
    public void setManufacturer(String manu){
        this.manufacturer = manu;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setBtuCapacity(Double btuCap){
        this.btuCapacity = btuCap;
    }

    /**
     * A toString method to display the contents of the object
     */
    public String toString(){
        String str = "Air Conditioner Manufacturer: " + manufacturer +
                     "\nAir Conditioner Type: " + type + 
                     "\nAir Conditioner BTU Cooling Capacity: " + btuCapacity;
        
        return str;

    }
}
