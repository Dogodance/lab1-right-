import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) {
        for(int i = 0; i<args.length; i++)
        {
            if(isPalindrome(args[i]))
                System.out.println(args[i] + " - является палиндромом");
            else
                System.out.println(args[i] + " - не является палиндромом");
        }
    }
    //реверсит слово
    public static String reverseString(String s){
        String s1 = "";
        for(int i = s.length() - 1; i >= 0 ; i--){
            s1 += s.charAt(i);
        }
        return s1;
    }
    //проверка на палиндром
    public static boolean isPalindrome(String s){
        String s1 = reverseString(s);
        if (s.equals(s1))
            return true;
        else
            return false;
    }
}