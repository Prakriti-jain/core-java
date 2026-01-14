package ControlFlow;

public class JumpStm {
    static void main() {
        for(int i=0 ; i<10 ; i++) {
            if(i==9){
                System.out.println(i);
                break;
            } if (i%2!=0) {
                continue;
            }
            System.out.println(i);
        }

        //
    }
}
