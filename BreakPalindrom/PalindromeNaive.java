package BreakPalindrom;

public class PalindromeNaive {
    public static String Navie(String str){
        int len = str.length();
        char strArr[] = str.toCharArray();
        if(len == 1){
            return "";
        }
        for(int i = 0; i < len / 2; i++){
            if(strArr[i] != 'a'){
                strArr[i] = 'a';
                return String.valueOf(strArr);
            }
        }
        strArr[len - 1] = 'b';
        return String.valueOf(strArr);
    }
    public static void main(String[] args) {
        
    }
}
