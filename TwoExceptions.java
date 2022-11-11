// Peter Gerdin
public class TwoExceptions {
    public static void main(String[] arg){
        int num1 = 5;
        int num2 = 0;
        String myString = "";

        try{
            int divisionNum = num1/num2;
            int num4 = Integer.parseInt(myString);
        }
        catch (ArithmeticException e){
            System.out.println("Can't divide by zero");
        }
        catch (NumberFormatException e) {
            System.out.println("Can't cast a String to an Integer");
        }
        finally {
            System.out.println("Thanks for running");
            System.exit(0);
        }
    }
}
