

public class constructor {
    int x;  // Create a class attribute
    int modelYear;
  String modelName;

    // Create a class constructor for the Main class
    public constructor(int y, int modeYear,String modeName) {
        System.out.println("Hellow i am constructor "); 
      x = y;  // Set the initial value for the class attribute x
      modelYear=modeYear;
      modelName=modeName;
    }
  
    public static void main(String[] args) {
      constructor myObj = new constructor(67,765,"Mbwm456"); // Create an object of class Main (This will call the constructor)
      System.out.println(myObj.x); // Print the value of x
      System.out.println(myObj.modelName);
      System.out.println(myObj.modelYear);
    

    }
    
}
