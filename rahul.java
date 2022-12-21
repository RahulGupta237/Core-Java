public class rahul {
    public static void main(String[] args){
    String firstName = "Rahul learning ";
String lastName = "Gupta ";
String fullName = firstName + lastName;
System.out.println(fullName);
byte myNum = 100;
System.out.println(myNum);

int myInt = 9;
double myDouble = myInt; // Automatic casting: int to double

System.out.println(myInt);      // Outputs 9
System.out.println(myDouble);
int x = 10;
x += 5;
System.out.println(x);

String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
System.out.println("The length of the txt string is: " + txt.length());
System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
System.out.println(txt.toLowerCase());   
String txts = "Please locate where 'locate' occurs!";
System.out.println(txts.indexOf("locate")); // Outputs 7


String firstNames = "John ";
String lastNames = "Doe";
System.out.println(firstNames.concat(lastNames));
String txtnew = "We are the so-called \"Vikings\" from the north.";
System.out.println(txtnew);
System.out.println(Math.max(5, 10)); 

int randomNum = (int)(Math.random() * 101);  // 0 to 100
System.out.println(randomNum);

// comparison operator and if condition
int myAge = 2;
int votingAge = 18;

if (myAge >= votingAge) {
  System.out.println("Old enough to vote!");
} else {
  System.out.println("Not old enough to vote.");
}



int time = 22;
if (time < 10) {
  System.out.println("Good morning.");
} else if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}
// 


int tertime = 2;
String result = (tertime < 18) ? "Good day." : "Good evening.";
System.out.println(result);




// switch case

int day = 4;
day = 44;
switch (day) {
    
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    break;
  case 5:
    System.out.println("Friday");
    break;
  case 6:
    System.out.println("Saturday");
    break;
  case 7:
    System.out.println("Sunday");
    break;
  default:
    System.out.println("Looking forward to the Weekend");
}
// Outputs "Thursday" (day 4)


    }
    
}
