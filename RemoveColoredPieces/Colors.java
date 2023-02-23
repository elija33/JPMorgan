package RemoveColoredPieces;

public class Colors {
    public static boolean winnerColorGame(String colors){
        int colorAA = 0;
        int colorBB = 0;
        for(int i = 1; i + 1 < colors.length(); i++){
            if(colors.charAt(i - 1) == colors.charAt(i) && colors.charAt(i) == colors.charAt(i + 1)){
                if(colors.charAt(i) == 'A'){
                    colorAA++;
                }
                else{
                    colorBB++;
                }
            }
        }
        return colorAA > colorBB;
    }
    public static void main(String[] args) {
        String colors = "AAA";
        System.out.println(winnerColorGame(colors));
    }
}
