//package SHA;
//
//public class test2 {
//    public static void main(String[] args) {
//        String x="11100";
//        String y="10101";
//        String c="00010001010000101111110110101101";
//        String d1="00111111100100101010001101000000";
////        int n=x.length();
//        String ravi=addBinary(x,y);
//        String ravi1=addBinary(ravi,c);
//        String ravi2=addBinary(ravi1,d1);
//        System.out.println(ravi2);
//
//
//    }
//
//    static String addBinary(String a, String b)
//    {
//
//        // Initialize result
//        StringBuilder result = new StringBuilder("");
//
//        // Initialize digit sum
//        int s = 0;
//
//        // Traverse both strings starting
//        // from last characters
//        int i = a.length() - 1, j = b.length() - 1;
//        while (i >= 0 || j >= 0 || s == 1)
//        {
//
//            // Comput sum of last
//            // digits and carry
//            s += ((i >= 0)? a.charAt(i) - '0': 0);
//            s += ((j >= 0)? b.charAt(j) - '0': 0);
//
//            // If current digit sum is
//            // 1 or 3, add 1 to result
//            result.append((char)(s % 2 + '0'));
//
//            // Compute carry
//            s /= 2;
//
//            // Move to next digits
//            i--; j--;
//        }
//
//        // Remove leading zeros, if any
//        int start = result.length()-1;
//
//        while(start >=0 && result.charAt(start) == '0') {
//            start--;
//        }
//
//        if(start != result.length()-1) {
//            result.delete(start+1,result.length());
//        }
//
//        return result.reverse().toString();
//    }
//
//    //Driver code
//
//}
