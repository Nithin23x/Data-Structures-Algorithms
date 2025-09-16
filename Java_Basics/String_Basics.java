import java.util.ArrayList;
import java.util.Arrays;
public class String_Basics {
    public static void main(String[] args) {

        // The strings are saved in heap memory and it has a separate section called string pool where all the strings are saved.
        // 
        // The "==" checks if the reference variables are pointing to the same object.
        // THe hashcode only checks the security code of the object it may not be the best indicator to check the distinciveness of variables.
        String name = "Harry Kane" ; 

        String name_two = "Harry Kane" ; // here "name" and "name_two" variables are pointing towards the same object in the string pool.
        System.out.println(name== name_two);

        //Strings are immutable i.e the objects created in the string pool cannot be changed 
        // but they can be re-assigned to another newly created string object , but cannot modify the string it pointed before.


        String clubName = "Bayern Munich" ;
        String trebleWinners = "Bayern Munich" ; // trebleWinners variable pointing to the "Bayern Munich" same 
        //string object clubName is pointing . And the hashcodes of the both variables are same because they are pointing to the same object.
        System.out.println(clubName.equals(trebleWinners));
        System.out.println(clubName==trebleWinners);; // true
        // we can also use == mehtod to check if the variables are pointing the same object or not 


        trebleWinners = "Ajax FC" ;  // here we are assigning the "trebleWinners" variable a new String object "Ajax FC".
        // It is not modifying the "Bayern Munich" instead an entirely new object is created .and this new string object will be created in string pool . 

        System.out.println(clubName.hashCode()); 
        System.out.println(trebleWinners.hashCode());
        System.out.println(trebleWinners== clubName); // false

        String a = new String("Harry");
        String b = new String("Harry") ;

        System.out.println(a==b); // flase ... pointing to different objects 
        System.out.println(a.equals(b)); // ture .. just chekcing the values of the strings

        int e,c,d ; 
        e=10 ;c=30;d=90 ;
        String alpha = (e +c > d) /*condition */ ? "Interstellar" /*true code */: "Dunkrik" /*false code */ ;
        System.out.println(alpha);
        String beta = "Christopher" ; 
        System.out.println("CHar at 0 index " + beta.charAt(0));  // to get a chat at any index we use this method not like array arr[index] ;

        //String and char concatenation .. 
        System.out.println('a' + 'b'); // codes of "a" and "b" addtion "a" is char not string
        System.out.println("a" + "b"); // concatenation of strings
        System.out.println('a' + 59); // unicode of "a" + 59 
        System.out.println("A" + 45); // the int calls the Integer wrapper class where it converted to a string 
        // so it concatenaiton 

        System.out.println("Berlin " + new ArrayList<>());  // String + Object
        //System.out.println("Frankfurt" + new Integer(45)); // String + integer obecjt of Integer wrapper class 

        //String Performance ... 
        String alphaSeries = "" ;
        for(int i=0; i<26 ; i++) {
            char ch = (char)('a' + i) ; 
            alphaSeries = alphaSeries + ch ; 
            
        }
        System.out.println(alphaSeries);
        // here the alphaSeries string variable is initialized and put in the loop of char ch = (char)('a' + i) ; 
        // where 'a' + i is explicitly converted to a char and appended to alphaseries string ; 
        //but as strings are immutable every time the string is appended it is not updating the present object instead it is 
        // creating a new object to accomodate the new string object which is heavy on memory or wastage of space  ..

        // to overcome this we have stringbuilder class. by using this class we can create strings which are mutable and doesnot create new objects evrytime it is changed 

        StringBuilder sb = new StringBuilder(7) ;
        sb.append(trebleWinners) ; // explore the methods in String Builder ... 

        System.out.println(sb);
        sb = sb.deleteCharAt(2) ; // deletes character at given index .
        System.out.println(sb); // Mutable string and it did not created any new object .
        System.out.println(sb.reverse());

        System.out.println(sb); // String builders are synchronized in nature evry method operation we do will be relfected . even if we did not assign it to vairbale . it happens internally 

        System.out.println(Arrays.toString(trebleWinners.toCharArray()) + "CHar array " );
        System.out.println(trebleWinners.toLowerCase() + "  " + trebleWinners.toUpperCase());
    }

}


// The "==" checks if the reference variables are pointing to the same object or not.

// how to create a new object with same value . 

// String a = "Harry"; 
// String b = "Harry" these two are pointing to the same object even if the variable names are different 
// we can verify this by using ==

// to create a new object with same value 
// String a = new String("Harry")
// String b = new String("Harry") ; // it gives two different string objects with same value 

// the ".equals" method is used to check the if the values are same or not . 
// they do not check the object they are refering to just the check the value of variable they are assigned to

