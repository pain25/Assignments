package SHA;

public class AndOrGate {

        public static void main(String[] args) {
}
        public static int[] Choice(int[] e,int[] f,int[] g){
            int[] c=new int[e.length];
            int[] n=new int[e.length];
            int[] m=new int[e.length];
            int[] o=new int[e.length];
            c=AndGate(e,f);
            n=NotGate(e);
            m=AndGate(n,g);
            o=xor(c,m);
            return o;

        }
public static int[] AndGate(int[]a,int[] b){
            int[]c = new int[a.length];

//        String[] c = {"1,0,1,0"};
            for (int i = 0; i < a.length; i++) {
                if ((a[i] == 1 && b[i] == 1)) {
                    c[i]=1;
                }
                if ((a[i] == 0 && b[i] == 1) || (a[i] == 1 && b[i] == 0 || (a[i] == 0 && b[i] == 0))){
                    c[i]=0;
                }
            }return c;}
    public static int[] NotGate(int[] d){
            int i;
            int[]ans=new int[d.length];
            for (i = 0; i < d.length; i++) {
                if (d[i] == 0)
                    ans[i] = 1;
                else
                    ans[i] = 0;
            }
            return ans;
        }
    public static int[] xor(int[] a, int[] b){
        int[] c=new int[32];
        for (int i = 0; i < 32; i++) {
            c[i]=a[i]^b[i];
        }
        //  System.out.println();
        return c;
    }
}



