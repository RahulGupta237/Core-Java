public class javaprac1 {
    

    public static void main(String[] args) {
    int i = 0;
    while (i < 5) {
      System.out.println(i);
      i++;
    };
   int j;
    for (j = 0; j < 5; j=j+2) {
        System.out.println(j);
      };
      System.out.println(j);
    



   //  Nested Loop


System.out.println("########### nested loop practice ##################");
   // Outer loop
for (int k = 1; k <= 2; k++) {
    System.out.println("Outer: " + k); // Executes 2 times
    
    // Inner loop
    for (int l = 1; l <= 3; l++) {
      System.out.println(" Inner: " + l); // Executes 6 times (2 * 3)
    }
  } 
   
  }



  
  
    
    
}
