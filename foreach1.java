public class foreach1 {

    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            if (i=="BMW")
                {
                    System.out.println("Hi iam continue the code at bmw ");
                    continue;

                }
          System.out.println(i);
        }    

        for (int i = 0; i < 10; i++) {
            if (i >= 4) {
                if (i==8)
                {
                    System.out.println("Hi iam break the code at 8 ");
                    break;

                }
                else{
                    System.out.println("Hi iam continue the code at greater than 4");
                    continue;

                }
              
            }
            System.out.println(i);
          }
      }
    
}
