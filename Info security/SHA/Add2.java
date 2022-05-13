package SHA;

public class Add2 {
    public static void main(String[] args) {

        int[]a={1,0,0,0,0,0,1,1,0,0,0,0,0,0,1,1,0,1,0,1,1,1,1,1,1,1,1,0,1,0,0,1};
        int[]b={1,1,1,1,0,1,0,1,0,1,0,1,0,0,0,0,1,0,1,0,0,1,1,0,1,0,1,1,1,1,1,0};
        int[]c={1,1,0,0,0,1,0,0,1,0,1,0,1,1,0,0,1,0,0,1,1,0,0,0,0,0,1,1,1,0,1,0};
        int[]d={1,0,1,1,1,1,1,1,0,0,0,1,0,1,1,0,1,0,1,1,0,0,0,0,0,0,1,0,1,0,0,1};
        calculate2.printArray(addAll4(a,b,c,d));
    }

    public static int[]addAll4(int[] a,int[] b,int[] c,int[] d){
        int[] ravi=new int[a.length];
        int[] rav2=new int[a.length];
        int[] ravi3=new int[a.length];
        ravi=add1(a,b);
       // calculate2.printArray(ravi);
       // System.out.println();
        rav2=add1(c,d);
      //  calculate2.printArray(rav2);
      //  System.out.println();
        ravi3=add1(ravi,rav2);
       // calculate2.printArray(ravi3);

        return ravi3;

    }
    public static int[] add1(int[] a,int[] b){
        int[]c=new int[a.length];
        int d=0;

        for (int i = a.length-1; i >=0; i--) {
            if(b[i] != a[i] && d==0){
                c[i]=1;
            }
            else if (a[i]+b[i]+d==3) {
                c[i]=1;
                d=1;
            }else if (b[i] != a[i] && d==1) {
                c[i]=0;
                d=1;
            }else if (a[i]+b[i]+d==1 ) {
                c[i]=1;
            }
            else if (a[i]+b[i]+d==0 ) {
                c[i]=0;
            } else if (a[i]+b[i]==2) {
                c[i]=0;
                d=1;
            }
            if (a[i]+b[i]+d==2 || a[i]+b[i]+d==3){
                d=1;
            } else if (a[i]!=b[i] || a[i]+b[i]==0) {
                d=0;
            }
        }
        return c;
    }
}
