import java.util.Arrays;
class Solution {    
    public static final String[] FIND_SYMBOLS = {"IV", "IX", "XL", "XC", "CD", "CM"};
    public static final String[] SYMBOLS = {"I", "V", "X", "L", "C", "D", "M", "IV", "IX", "XL", "XC", "CD", "CM"};
    public static final int[] VALUES = {1, 5, 10, 50, 100, 500, 1000,4, 9, 40, 90, 400, 900};
 
    public int romanToInt(String s) {
      int output = 0; 
      this.processSubtractSymbols(s);
      output = this.convertToInt(s);
      return output;
    }

    public int processSubtractSymbols(String str) {
        int output = 0;
        // MCMXCI
        // M = 1000
        // CM = 900
        // XC = 90
        // IV = 4

        String newString = "";

        for (String findSymbol : FIND_SYMBOLS) {
            System.out.println(findSymbol);
            if (str.contains(findSymbol)) {
                System.out.println("FOUND MATCH for " + findSymbol);
                int index = Arrays.asList(SYMBOLS).indexOf(findSymbol);
                System.out.println("VALUES[index] " + VALUES[index]);
                output += VALUES[index];
                newString = str.replace(findSymbol, "");

            }
        }

        System.out.println("New String = " + newString);
        System.out.println("output = " + output);

      return output;
    }

    public int convertToInt(String s) {
      int output = 0;
      
      for (int i = 0;i < s.length(); i++){
        System.out.println("INPUT: " + s.charAt(i));
        int index = Arrays.asList(SYMBOLS).indexOf(s.charAt(i)+"");
        output += VALUES[index];

      }

      return output;
    }

}
