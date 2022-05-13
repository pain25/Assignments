package SHA;

public class MessageSchedule {

    public static void main(String[] args) {

    }
    public static int[] returnMessageSchecdule(final int[] intArray2,int[]a2,int[]b2,final int[] intArray14,int[]a14,int[]b14, int[] intArray1, int[] intArray9){
        String s="11111111111111111111111111111111";
        int[] intArray2a = new int[s.length()];
        int[] AA2=new int[s.length()];
        int[] BB2=new int[s.length()];
        int[] intArray14a=new int[s.length()];
        int[] AA14=new int[s.length()];
        int[] BB14=new int[s.length()];
        returnConvertArray(s,intArray2a,intArray2);
        returnConvertArray(s,AA2,a2);
        returnConvertArray(s,BB2,b2);
        returnConvertArray(s,intArray14a,intArray14);
        returnConvertArray(s,AA14,a14);
        returnConvertArray(s,BB14,b14);
        int n =7;
        int m=18;
        int k=3;
        int n1 =17;
        int m1=19;
        int k1=10;
        int[] z1,zi1,intArray16;
//        System.out.println("round 2");
//        printArray(intArray2a);
//        System.out.print("after rotation of 7");
        SHA.returnRotate(intArray2a,n);
//        printArray(intArray2a);
//        System.out.print("after rotation of 18");
        SHA.returnRotate(AA2,m);
//        printArray(AA2);
//        System.out.print("after shifting of 3");
        SHA.returnRotate(BB2,k);
        BB2[0]=0;
        BB2[1]=0;
        BB2[2]=0;
//        printArray(BB2);
//        System.out.println("array3------------------");


      //  System.out.print("after rotation of 17");
        SHA.returnRotate(intArray14a,n1);
//        printArray(intArray14a);
//        System.out.println("before rotation of 19");
//        printArray(AA14);
//        System.out.print("after rotation of 19");
        SHA.returnRotate(AA14,m1);
//        printArray(AA14);
//        System.out.print("after shifting of 10");
        SHA.returnRotate(BB14,k1);
        BB14[0]=0;
        BB14[1]=0;
        BB14[2]=0;
        BB14[3]=0;
        BB14[4]=0;
        BB14[5]=0;
        BB14[6]=0;
        BB14[7]=0;
        BB14[8]=0;
        BB14[9]=0;
//        printArray(BB14);
//        System.out.print("after XOR of w1");
        z1=XOR.xor(intArray2a,AA2,BB2);
//        System.out.print("after xor of w14");
//        System.out.println();
//        System.out.println();System.out.println("XOR code for z1");
//        System.out.println("--------------------------------------------------------------");
//        printArray(intArray2);
//        printArray(intArray2a);
//        printArray(AA2);
//        printArray(BB2);
//        System.out.println("zi:");
//        printArray(z1);
//        System.out.println("-----------------------------------------------------------------");
//
//        System.out.println();

        zi1=XOR.xor(intArray14a,AA14,BB14);
//        System.out.println("XOR code for zi1");
//        System.out.println("--------------------------------------------------------------");
//        printArray(intArray14);
//        System.out.println("---------------------------------");
//        printArray(intArray14a);
//        printArray(AA14);
//        printArray(BB14);
//        System.out.println("---------------------------------");
//        System.out.print("zi1:");
//        printArray(zi1);
//        System.out.println("-----------------------------------------------------------------");
//        //printArray(zi1);
//        System.out.println("w1");
//        printArray(intArray1);
//        System.out.println("z1");
//        printArray(z1);
//        System.out.println("w10");
//        printArray(intArray9);
//        System.out.println("zi1");
//        printArray(zi1);

       // System.out.println("after adding all 4 of ");
        intArray16=Add2.addAll4(intArray1,z1,intArray9,zi1);
        return intArray16;
    }
    public static void printArray(int[]array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }
    public static int[] returnConvertArray(String s,int[] Array,int[] Array2) {
        for (int i = 0; i <s.length(); i++) {
            Array[i] = Array2[i];
        }
        return new int[Array.length];
    }

}

