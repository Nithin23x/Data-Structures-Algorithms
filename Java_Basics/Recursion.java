public class Recursion {

    public static void main(String[] args ){
        
        System.out.println("Recursion code"); 


        printNumbers(1) ;
    }

    static  void printNumbers(int n) {          // return is used exit the function at a point .

        if(n==6) {
            System.out.println();
            return;
        }

        System.out.println("Number " + n); 
        printNumbers(n+1); 

        System.out.println("After Functions " + n); 
    }
}


// this is recursive functions , the function printNumbers() will call itself for number of times until a base/break condition is met.

// The Function call stack is used to track the functions .
// A function is first defined , it will be only executed when it is called . 
// after the execution of called function it returns to the point where it was called and from there the code resumes .. 