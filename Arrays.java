
/**
 * Write a description of class Arrays here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Arrays
{
    public static void main(String[] args) {
        String[] strArray = {"Alpha", "Bravo", "Charlie", "Delta", "Echo"};
        for (int i = 0; i < strArray.length; i++)
        System.out.println(strArray[i]);
        for (int i = 0; i < strArray.length; i++)
        System.out.print(strArray[i]);
        System.out.println();
        for (int i = 0; i < strArray.length-1; i++)
        System.out.print(strArray[i]+"-");
        System.out.print(strArray[strArray.length-1]);
    }
}

