import java.util.ArrayList;
import java.util.Arrays;

public class Functions_and_Arrays {

    public static void main(String[] args ) {
        int a = 20 ; 
        // int b = 30 ; 

        mind(a) ;
        System.out.println(a +" after mind func");

        int[] arr = {3,4,22,1} ;

        brain(arr);
        System.out.println(Arrays.toString(arr) + "After Brain Func");

        int[] ten = new int[5] ;

        for (int i =0; i<5 ; i++){
            ten[i] = i+3*2; 
        }

        System.out.println(Arrays.toString(ten)); 

        String[] tyron = new String[5] ;
        for (int i =0 ; i<5 ; i++) {
            tyron[i] = "Nithin";
        }
        System.out.println(Arrays.toString(tyron));

        ArrayList<Integer> intList = new ArrayList<>(5) ;

        int code = 45 ;
        for(int i =0 ; i<13 ; i++) {
            int equation = code*3 + (i*5)  - 45 ;
            intList.add(equation) ;
        }
        System.out.println(intList + "Int list" + intList.size());
    }

    static void mind(int a) {
        System.out.println(a + "x");
        a = 30;
        System.out.println(a + "x");
    }

    static void brain(int[] less) {
        less[0] = 44 ; 
        System.out.println( Arrays.toString(less)+ "Less Operation") ;
        int [] more = less ;

        more[1] = 55 ;  
        System.out.println(Arrays.toString(more) + "More OPeer"); 
    }

    

}

//Block Scope , Loop scope , Mehtod/Function Scope varibale 

// In java , for arguements the value are passed by only value for primitive data types 
// it means the arguements in functions will only refer to the primitive datatypes , when changes occur they remain to function level and does not reflect in main code.
    // ex: int a = 20 ; 
    // static void mind(int a) {
    //     System.out.println(a + "x"); 
    //     a = 30;
    //     System.out.println(a + "x");
    // }
    //  mind(a) ;
    //  System.out.println(a +" after mind function"); output is 20 
    //Here we tried to change the value of a in the funtion but the value of a doesn't change 

//for datatypes like Array , they are passed by value reference , so when array is passed as arguement to functional block 
// the changes made in functional block are reflected everywhere ... 
// Method Overloading : Functions with same names can exist they have different type of vairbales or arguements 

// //example 
// lap(45);
// static void lap (int x ){
//     System.out.println(x);
// }

// static void lap(String y) {
//     System.out.println(y);
// }