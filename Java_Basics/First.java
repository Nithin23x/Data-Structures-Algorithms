import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class First {
    public static void main(String[] args ){
        System.out.println("Hello World") ;
        //System.out.println(args[1]) ;
        System.out.println() ;

        Scanner sc = new Scanner(System.in) ; 
        int a = sc.nextInt() ;

        System.out.println("Integer is " + a);
        System.out.println(a + " is an integer");
        sc.close();

    }
}

//Explaining everything wrote here ...
// In java every file is considered as a class . So every line of code we write is inside the class only.
// Also the naming convention of the Main class should be same as the name of the file
// in our case the file name is First.java ... so the class name  should be First ..
// It is helpful to use Capital letter in first letter the naming convention...


// public -- This lets the main class(First) is availble thorught the system/file scope and can be imported if wanted.
// class First --- name of the class 

// main function -- here the "main" is reserved keyword in the java.And it is the entry point of the program.
// If the main function is not there in the class then it will throw an error or program will not run .

//public static void main(String[] args )

    // public - as this is the main funcion it is normal to give access to all the available scope
    // static -- it is used to create the object of the class before it is executed ... you will understand it in OOPS
    // void -- return type of the fuction i.e it indicated the type of value it is returning when the main function execution ends.
        // if it is void - then doesn't return anything 
        // if it is int - then returns a number 
        // if float - then retruns a float/decimal 

    // main function -- here the "main" is reserved keyword in the java.And it is the entry point of the program.
    // String[] args -- the command line arguements it takes as an array . The input of the array should be given at runtime 
        // java Class-name Apple Bat .... We can any number of arguements at a time ..

        
// Inputs in Java 
    //Scanner sc = new Scanner(System.in) ; 

    // The inputs in java can be taken with the Scanner class which is used to scan the input from various sources 
    // The Scanner is class . it is used to parse the text given from input sources (also includes input from keyboard,file etc ..)
    // sc is an object initialization/name of Scanner class , this is sc object is used to take the primitive inputs (not includes String , as string is not primitive )...The strings can be taken as input using regular expression
    // new Scanner() is calling the constructor method which is default to call a class constructor to create an object. 
    // In calling the constructor we mention the source of input frrom where we are taking 
    // if we want to input from keyboard then it is Scanner(System.in)

    // Scanner input = new Scanner(FileInputStream.) for taking input from Files ... 


    // after that we take the inputs as various datatype . 
    // if we are expecting an integer then it is nextInt() , for float nextFloat() , for chat it's nextChar() 
    // int a = sc.nextInt()

    // Literal and identifiers 

    // Literals -In primitive dataytpes ,  Literals are the syntactical representation of the primitive data types .
    //Indentifier - the reference variable is knowm as the identifier 

    // int a = 10 ; 10 is a literal and "a" is an indentifier 
    // for entering a integer in an number system use "_" as a separator 


// TYpe conversion and TYpe casting 
    // when one type of data is assigned to another type of data vaiable then the Type Converision/Implicit Conversion/Automatic takes place if follwing conditons are true :
    // 1. IF two datatypes are compatible to each other 
    // 2. if the receiving data type is on higher end than the input end .. 

    // for example if float datatype is  higher than int . so even if we give an int type to a float input . it will acccept 
    // But it wil not happen other way around.. 

    // IF we want to convert non compatible data types then it is "Type Casting/ Explicit conversion"
    // example int to float etc , 
    // int a = (int)(55.533f) it gives the integral part of the number

    // int a = 'n' //sout .it gives the ASCII value
    // 

