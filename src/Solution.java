class Solution {
    static void main(String[] args) {
        String s = "011010";
        canReach(s, 2, 3);
    }
    public static boolean canReach(String s, int minJump, int maxJump) {

        boolean min = false;
        boolean max = false;
        int currentIndex = 0;

        while (currentIndex <= s.length()){

            if (s.charAt(minJump + 1) == '0' && min == false){
                currentIndex += minJump;
                min = true;
            } else if (s.charAt(maxJump + 1) == '0' && max == false) {
                currentIndex += maxJump;
                max = true;
            } else {

                if (currentIndex != s.length()){
                    return false;
                }
            }
        }

        return true;
    }
}