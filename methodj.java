public class methodj {


    // define function return void means no return value
    static void myMethod(String fname) {
        System.out.println("I just got executed!"+fname);
      }
    // define function  return int value define as int
      static int Method(int x) {
        return 5 + x;
      }


      static int myMethods(int x, int y) {
        return x + y;
      }


      // check the age function
      static void checkAge(int age) {

        // If age is less than 18, print "access denied"
        if (age < 18) {
          System.out.println("Access denied - You are not old enough!");
    
        // If age is greater than, or equal to, 18, print "access granted"
        } else {
          System.out.println("Access granted - You are old enough!");
        }
    
      }
    
     
    // below code call the function 
      public static void main(String[] args) {
        myMethod("rahul");
        myMethod("Shiv Sisye");
        myMethod("shiv ki daya hai");
        
        System.out.println(Method(3));
        int z = myMethods(55, 3);
        System.out.println(z);
        checkAge(20);  // call the checkAge function
        
      }



  
      
    
}
