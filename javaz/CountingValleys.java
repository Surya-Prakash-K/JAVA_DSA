package javaz;

public class CountingValleys {
    public static void main(String[] args) {
        System.out.println(countingValleys(8,"UDDDUDUU"));
    }

    public static int countingValleys(int steps, String path) {
        int altitude = 0;
        int valley_count = 0;
        int sea_level= 0;
        for (int i = 0; i < steps; i++) {
            if(path.charAt(i) == 'U'){
                altitude++;
            } else if (path.charAt(i) == 'D') {
                altitude--;
            }

            if( altitude == sea_level && path.charAt(i) == 'U'){
                valley_count++;
            }

        }
        return valley_count;
    }
}
