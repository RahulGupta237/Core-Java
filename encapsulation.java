public class encapsulation {
    private String name; // private = restricted access

    // Getter
    public String getName() {
      return name;
    }
  
    // Setter
    public void setName(String newName) {
      this.name = newName;
    }

    public static void main(String[] args) {
        encapsulation myObj = new encapsulation();
        myObj.name = "John";
        System.out.println(myObj.name);
      }
}
