package BreakPalindrom;

public class Palindrome {
    public static String BreakPalindrome(String str){
        int n = str.length();
        if(n == 1){
            return "";
        }
        for(int i = 0; i < n; i++){
            if(str.charAt(i) != 'a' && !(n % 2 != 0 && i == n / 2)){
                str = str.substring(0, i) + 'a' + str.substring(i + 1);
                return str;
            }
        }
        str = str.substring(0, n - 1) + 'b';
        return str;
    }
    public static void main(String[] args) {
    }
}