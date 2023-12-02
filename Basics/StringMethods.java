import java.util.Scanner;

public class StringMethods{
    public static void main(String[] args){
        String name = "         Hello World!";


        // length of string
        int length = name.length();

        System.out.println(length);


        // convert string into lower / upper case

        String lwcase = name.toLowerCase();

        String upcase = name.toUpperCase();
        
        System.out.println(lwcase);

        System.out.println(upcase);
    
    
        // removes white spaces from front and back

        String concatinated = name.trim();

        System.out.printf("%s\n", concatinated);
    


        // give substring with start index till end index(excluding last given index)

        System.out.println(name.substring(9, 19));



        // replace a character / word by anoher character / word

        System.out.println(name.replace('l', 'a'));

        System.out.println(name.replace("llo", "hee"));
    
    
        // check if string start or end with a substring

        System.out.println(name.startsWith("     "));

        System.out.println(name.endsWith("rld!"));


        // finding and giving of indices (starting from given index number)

        System.out.println(name.indexOf('o', 14));

        System.out.println(name.charAt(9));


        // finding last index of a given character / substring

        System.out.println(name.lastIndexOf('l'));



        // checking string equality

        System.out.println(name.equals("         Hello World!"));

        System.out.println(name.equalsIgnoreCase("         hello world!"));
    }
}