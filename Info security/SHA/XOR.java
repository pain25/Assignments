package SHA;

public class XOR {
    public static void main(String[] args) {
    }
    public static int[] xor(int[] a, int[] b,int[]c1){
        int[] c=new int[32];
        int[] d1=new int[32];
        for (int i = 0; i < 32; i++) {
            c[i]=a[i]^b[i];
            d1[i]=c[i]^c1[i];
        }
      //  System.out.println();
        return d1;
    }


}
