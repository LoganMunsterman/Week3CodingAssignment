import java.lang.reflect.Array;
import java.util.Arrays;

public class Application {

  public static void main(String[] args) {
    
    // ********************** PART 1 *****************************
    
    int[] ages = new int[] { 3,9,23,64,2,8,28,93 };
      int firstInt = ages.length - ages.length;
      int lastInt = ages.length - 1;
      int difference = ages[firstInt] - ages[lastInt];
      
       System.out.println(difference);
       
       int sum = 0;
           
    for (int i = 0; i < ages.length; i++) {
        sum += ages[i];
    }
    
   int average = sum / ages.length;
     System.out.println(average);
   
   // ********************** PART 2 *****************************
   
   String[] names = new String[] { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
     double sumOfNameLengths = 0;
   
     for (int i = 0; i < names.length; i++ ) {
       sumOfNameLengths += names[i].length();
   }
   
     double avgNameLength = sumOfNameLengths / names.length;
       System.out.println(avgNameLength);
       
    StringBuffer concatenator = new StringBuffer();
       for(int i = 0; i < names.length; i++) {
         concatenator.append(names[i] + " ");
       }
    String allNames = concatenator.toString();
       System.out.println(allNames);
       
    // ********************** PART 3 *****************************
    // 5.   Create a new array of int called nameLengths. Write a loop to 
    //   iterate over the previously created names array and add the length of each 
    //   name to the nameLengths array.  
       
    int nameLengths[] = new int[names.length]; 
      
    for (int i = 0; i < nameLengths.length; i++) {
      nameLengths[i] = names[i].length();
    
   }
    System.out.println(Arrays.toString(nameLengths));
    
    //*********************METHOD TESTS *****************************
    // ***below created to test method for PART5***
    
    String firstName = "Steve";
    String lastName = "Jones";
    String fullName = makeFullName(firstName, lastName);
      System.out.println(fullName);
      
    // ***below created to test method for PART6***  
      
    System.out.println(isGreaterThanOneHundred(ages));
    
    // ***below created to test method for PART7*** 
    
    double[] partSeven = { 15.1, 32.4, 75.2, 22.7, 13.5 }; 
    System.out.println(averageOfArray(partSeven));
    
    //***below created to test method for PART8*** 
    
    double[] partEight = { 3, 7, 5, 2};
   
    System.out.println(averageOfArrays(partSeven, partEight));
    
    //***below created to test method for PART9*** 
    
    System.out.println(willBuyDrink(true, 6));
    System.out.println(willBuyDrink(true, 11.75));
    
   //***below created to test method for PART10***
    
    System.out.println(isItaCat(true, 4));
    
    System.out.println(isItaCat(false, 4));
    
    // ********************** PART 4 *****************************
    
    System.out.println(concatenatesWord("Hello", 3));
    
      }
    public static String concatenatesWord(String word, int n) {
    String result = "";
      for (int i = 0; i < n; i++) {
        result += word;
      }
      return result;
      }
    
    // ********************** PART 5 *****************************
    
    public static String makeFullName(String x, String y) {
  
      return x + " " + y;
}
    // ********************** PART 6 *****************************
    
    public static boolean isGreaterThanOneHundred(int[] numbers) {
       int sum = 0;
       for (int number : numbers) {
         sum += number;
         if (sum > 100) {
           return true;
         }
       }
      return false;
    }
    
    // ********************** PART 7 *****************************
    
    
    public static double averageOfArray(double[] numbers) {
      double sum = 0;
        for (double number : numbers) {
          sum += number;
          
        }
   
      return sum / numbers.length;
    }
    
    // ********************** PART 7 *****************************
   
    public static boolean averageOfArrays(double[] numbers3, double[] numbers4) {
      double sum = 0;
      double sum2 = 0;
        
     for (double number : numbers3) {
       sum += number;
      
     
     for (double number2 : numbers4) {
       sum2 += number2;
   
       }
   
    }
    return (sum / numbers3.length) > (sum2 / numbers4.length);
    }
    
    // ********************** PART 8 *****************************
    
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
    
      return (isHotOutside = true) && (moneyInPocket > 10.5);
    }
    
    // ********************** PART 9 *****************************
    // 13.   Create a method of your own that solves a problem. In comments, 
    // write what the method does and why you created it.
    
    public static boolean isItaCat(boolean saysMeow, int numberOfLegs) {
      if (saysMeow == true && numberOfLegs == 4) {
       
        System.out.println("Hooray, that is probably a cat!");
    
    } else{
      
        System.out.println("Sorry, that is probably not a cat.");
 
    }
      return false;
     
    }
}