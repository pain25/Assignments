package SHA;

public class convertStringToInt {
    public static void main(String[] args) {

    String ss = "01101000011001010110110001101100";
    int[]sa1 = new int[32];
    int[]sb1 = new int[32];
    int[] intArray2 =new int[ss.length()];

        for(int i = 0; i < ss.length();i++) {
        intArray2[i] = Character.digit(ss.charAt(i), 10);
    }
    returnConvertArray(ss,sa1,intArray2,sb1);
//    returnConvertArray(ss,sb1,intArray2);
    calculate2.printArray(sa1);
    calculate2.printArray(sb1);
    calculate2.printArray(intArray2);
}
    public static int[][] returnConvertArray(String s,int[] Array,int[] Array2,int[] Array3) {
        int[] a=new int[s.length()];
        int[] b=new int[s.length()];
        for (int i = 0; i <s.length(); i++) {
            a[i] = Array2[i];
            b[i]= Array2[i];
        }
        return new int[a.length][b.length];
    }
}
