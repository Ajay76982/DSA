package src.pattern;


/*
i/p => n = 3;
o/p =>    1
        2   2
      3   3   3


 */
public class NumberPyramid {

    public static void main(String[] args) {

        NumberPyramid numberPyramid = new NumberPyramid();
        numberPyramid.printPyramid1(9);
        numberPyramid.printPyramid2(9);
        numberPyramid.printPyramid3(9);
        numberPyramid.printPyramid4(2);
    }

    private void printPyramid1(int n){
        int row = n ;
        int totalSpace = n;
        for(int i = 0; i< row ; i++) {
            int col = 2*i + 2;
            for(int k=0 ; k< totalSpace ; k++){
                System.out.print(" ");
            }
            for( int j=0 ; j <= col ; j++) {
                if(j%2 == 0){
                    System.out.print(" ");
                }else {
                    System.out.print(i+1);
                }
            }
            System.out.println();
            totalSpace--;
        }

    }


    private void printPyramid2(int n){
        int row = n ;
        int totalSpace = n;
        for(int i = 0; i< row ; i++) {
            int col = 2*i + 2;
            for(int k=0 ; k< totalSpace ; k++){
                System.out.print(" ");
            }
            int rN = 1;
            for( int j=0 ; j <= col ; j++) {
                if(j%2 == 0){
                    System.out.print(" ");
                }else {
                    System.out.print(rN);
                    rN++;
                }
            }
            System.out.println();
            totalSpace--;
        }

    }

    private void printPyramid3(int n){
        int row = n ;
        int totalSpace = n;
        for(int i = 0; i< row ; i++) {
            int col = 2*i + 2;
            for(int k=0 ; k< totalSpace ; k++){
                System.out.print(" ");
            }
            for( int j=0 ; j <= col ; j++) {
                if(j%2 == 0){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
            totalSpace--;
        }

    }

    private void printPyramid4(int n){
        int row = n ;
        int totalSpace = n;
        for(int i = 0; i< row ; i++) {
            int col = 2*i + 2;
            for(int k=0 ; k< totalSpace ; k++){
                System.out.print(" ");
            }
            int mNumber = 1;
            for( int j=0 ; j <= col ; j++) {
                if(j%2 == 0){
                    System.out.print(" ");
                }else {
                    if(j<= i+2){
                        System.out.print(mNumber);
                        mNumber++;
                    } else {
                        mNumber--;
                        System.out.print(mNumber);
                    }
                }
            }
            System.out.println();
            totalSpace--;
        }

    }
}
