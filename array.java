public class array {

    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[0] = "Opel";
        System.out.println(cars.length);

        String[] carss = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < carss.length; i++) {
          System.out.println(carss[i]);
        }
// array for each

        for (String i : carss) {
            System.out.println(i);
          }


    // two dimesnsional arrays

    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
System.out.println(myNumbers[1][2]); // Outputs 7

    for (int i = 0; i < myNumbers.length; ++i) {
      for(int j = 0; j < myNumbers[i].length; ++j) {
        System.out.println(myNumbers[i][j]);
      }
    }
  }  
          

      
      
    
}
