public class Recursion_Basics {
    // program to print five numbers 

    // Basics blocks to understand how Function call Stack works .. and how this helps in understanding recursion .. 
    // Pinned checkpoints in the code to track the execution flow .. 

   public static void main(String[] args) {

    // 1 . main function invoked and pushed into the fucntion call stack ;

    //print(1);  // 2.  this func is called now ...this print() is added to the call stack and the print() func is executed now

    // the code below print() func is not executed now as print() func takes control of the flow of program 

    // After completelty excetuing print() the program returns to mark "2" and from there the program execution resumes

    System.out.println("\nPrinted all 5 numbers "); // 22 prints statements .. 

    // Function call stack working 

    // main() function is completely executed and now removed from stack .. now call stack is empty.. 
    // it means every function which are called after the executing the main program are now executed along with main function

     

    System.out.println("\n RECURSION CODE \n");
    // RECURSION CODE // 
    
    printRecursive(1) ; 

        System.out.println("\n RECURSION CODE  OVER \n");

    int funcResult = addFunction(5, 32) + addFunction(55, 78) ;
    System.out.println(funcResult); 
   }

   static void printRecursive(int number) {
        
        if(number ==5 ) {                                   
            System.out.println(number);   
            System.out.println("Number reverse " + number);           
            return ; // 
        }

        System.out.println(number); 
        printRecursive(number+1 );

        System.out.println("Number reverse " + number);
   }

// So if we compare to the manual code we wrote before for printing numbers 1 to 5 
//there was a pattern for print() to print4() functions where it prints the numbers in first statement and calls the function in second statement 
// and prin the number again in third statement 
// for print5()  it only prints the number 5 and function is finished and the output was given ...


   static int addFunction (int numberOne , int numberTwo) { 
        int sum = numberOne*3 + numberTwo*5 ;
        return  sum;
   }













    static void print(int i ) {
        // 3. print() invoked and pushed to  call stack

        System.out.println(i); // 4 . prints statement 

        print2(2); // 5. Now print2() is called while main() and print() being in call stack and print2() taked over the program 

        // After completelty excetuing print2() the program returns to mark "5" and from there the program execution resumes
        
         // print() is completely executed and now removed frm stack and returns to the point where it is called 
        // i.e mark "2"

        System.out.println("Printed 1 "); // 21 prints statements 

        // print() is completely executed and now removed frm stack and returns to the point where it is called 
        // i.e mark "2"

    }

    static void print2 (int i ) {
        // 6. print2() invoked and pushed to  call stack
        System.out.println(i); // 7 . prints statement

        print3(3);// 8. Now print3() is called while main(), print(), print1(),print2() being in call stack and print3() taked over the program

        // After completelty excetuing print3() the program returns to mark "8" and from there the program execution resumes 


        System.out.println("Printed 2 "); // 20 Prints statements

        // print2() is completely executed and now removed frm stack and returns to the point where it is called 
        // i.e mark "5"
    }

    static void print3 (int i ) {
        // 9 . print3() invoked and pushed to  call stack
        System.out.println(i); // 10 . prints statemtnt

        print4(4); // 11. Now print4() is called while main(), print(), print1(), print2(),print3() being in call stack and print4() taked over the program

         // After completelty excetuing print4() the program returns to mark "11" and from there the program execution resumes 

        System.out.println("Printed 3 "); // 19 prints statemts 
        // print3() is completely executed and now removed frm stack and returns to the point where it is called 
        // i.e mark "8"
    }

    static void print4 (int i ) {
        // 12 . print4() invoked and pushed to  call stack

        System.out.println(i); // 13 prints statemtents 

        print5(5); // 14. Now print5() is called while main(), print(), print1(), print2(),print3(), print4() being in call stack and print5() taked over the program

        // After completelty excetuing print5() the program returns to mark "14" and from there the program execution resumes 

        System.out.println("Printed 4 "); // 18 Prints statemetn 

        // print4() is completely executed and now removed frm stack and returns to the point where it is called 
        // i.e mark "11" 
    }

    static void print5 (int i ) {
        // 15 .print5() invoked and pushed to  call stack
        System.out.println(i); // 16. Prints statemtn 

        System.out.println("Printed 5 "); // 17. statement 

        // here the print5() is  now completely executed
        //  now it is removed from the call stack returns the place where it called i.e in mark number "14"
        // and from there the remaining program is executed .... 
    }

}


// Function Call Stack 

// the first function which is executed in java program is "main" function

// In the above java program , the main() function is executed first as of java rules it is pushed into the stack . 
//A function can only exit the stack when it completely executed .. 

// How this is able to relate to recursion .. 
// In the above code we see pattern where we repetatively call funcitons, take arguments and print the numbers 
// so what if there is a way to do it a very minimal way .. this where recursion comes 

 // In recursion a function calls itself for a number of times until a break point occurs .. it is same as the code we wrote before 
// like how distintive functions like  print(),print1(),print(2) ... were in call stack and executed one after other based on call stack and how it cleared ..

// But in recursion instead of different functions , there will be same function / one funciton in the call stack which is called number of times until a break point occurs 
// then the code is executed and the stack is cleared 