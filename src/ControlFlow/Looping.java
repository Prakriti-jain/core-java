package ControlFlow;

public class Looping {
    static void main() {
        //for loop - used to iterate over a objects like lists, tuple, string etc
        for(int i=0 ; i<5 ; i++) {
            System.out.println(i);
        }

        //while loop - used to iterate a block of code till the condition is true
        int i=6;
        while(i>=0) {
            System.out.println(i);
            i--;
        }

        //do while loop - used to iterate a block of code atleast once and continue till the conditon is true
        int j=0;
        do {
            System.out.println(j);
            j++;
        } while (j<0);


        //nested loops
        for(int k=0 ; k<2 ; k++) {
            for (int h=0 ; h<2 ; h++) {
                System.out.println(k + " " + h);
            }
        }
    }
}
