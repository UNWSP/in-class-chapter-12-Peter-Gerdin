

public class GoTooFar {
    public static void main(String[] arg){
        int[] fiveNum = {2,4,6,8,10};

        try {
            for (int sub = 0; sub < 100; sub++) {
                System.out.println(fiveNum[sub]);
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
             System.out.println("Now you've gone too far");
        }
    }
}
