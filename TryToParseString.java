
public class TryToParseString {
    public static void main(String[] arg){
        String x = "this is a string not an int";

        try{
            int y = Integer.parseInt(x);
        }
        catch(NumberFormatException e){
            System.out.println("ERROR: tried to convert a non-number to a number");
        }
    }
}
