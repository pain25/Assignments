package SHA;

import java.util.Scanner;

public class SHA{
    public static void main(String[] args) {
      //  calculate2 cha=new calculate2();

      //this converts each char to binary
      System.out.println("Enter the input");
      Scanner sc=new Scanner(System.in);
      String text ;
      text=sc.nextLine();
      byte[] bytes = text.getBytes();
      StringBuilder binary = new StringBuilder();
      for (byte b : bytes) {
        int val = b;
        for (int i = 0; i < 8; i++) {
          binary.append((val & 128) == 0 ? 0 : 1);
          val <<= 1;
        }
        //binary.append(",");
      }

      //System.out.println(binary.append(1));
      /**
       * TotalLengthOfBinary : it is the length of the StringBuilder
       */
      String TotalLengthOfBinary = String.valueOf(binary.toString().replace(" ", "").length());//24
      /**
       * here we are appending one at the end of the binary values
       */
      binary.append(1);
      /**
       * TotalLengthOfBinaryAfter1Append : it shows the length of the StringBuilder binary after adding one
       */
      String TotalLengthOfBinaryAfter1Append = String.valueOf(binary.toString().replace(" ", "").length()); //25
      //System.out.println(TotalLengthOfBinary);

      /**
       * converting StringBUilder length to int
       */
      int parse = Integer.parseInt(TotalLengthOfBinary);

      /**
       * k :Is the value of number of times the 0 should be padded
       * parse : It is the length of in Int form
       */
      int K = 448 - (parse + 1);
      StringBuilder AfterApending0 = null;
      for (int i = 0; i < K; i++) {
        binary.append(0);
      }

      /**
       * AfterAdding432zero : It shows the length after adding 0's
       */
      String AfterAdding432zero = String.valueOf(binary.toString().replace(" ", "").length());
//      System.out.println(AfterAdding432zero);  /** prints the length */
      /**  converts the length from String to int */
      int ra = Integer.parseInt(Integer.toBinaryString(parse));
//      System.out.println(ra);  // prints the int length

      /**
       * now we need to append the remaning  64 bits
       *
       */
      int r = Integer.toBinaryString(parse).length();

      for (int i = 0; i < Remaning64bits(r); i++) {
        binary.append(0);
      }
      /** Appending the binary value of the length (parse)*/
      binary.append(ra);
      /**
       * converting all the values to string in order to split them into 32 bits
       */
      String ravistr = binary.toString();
      /**
       * here the entire values are split in 32 bits each block inside the String array
       */
      String[] thisCombo2 = ravistr.split("(?<=\\G................................)");
      StringBuilder sbs = new StringBuilder();

      /**
       * Here all the thisCombo2 array is appnded inside StringBUilder
       */
      for (int i = 0; i < thisCombo2.length; i++) {
        sbs.append(thisCombo2[i]);

      }
      /**
       * this for loop is used to make 64 block of 32 bits each by appending 0
       */

      for (int i = 0; i < 48 * 32; i++) {
        sbs.append(0);
      }
      //  System.out.println(sbs);

      String ravistr2 = sbs.toString();
      /**
       * Here again the entire thing is split into 32 bits each block
       */
      String[] thisCombo3 = ravistr2.split("(?<=\\G................................)");
//        System.out.println(thisCombo3.length);
//        for (String a:thisCombo3
//             ) {
//            System.out.println(a);
//        }//  System.out.println(sbs);

      int n = 7;
      int m = 18;
      int k = 3;
      int n1 = 17;
      int m1 = 19;
      int k1 = 10;
      /**
       * Here every 32 bit block is assigned to a new array
       */

      String s1 = thisCombo3[0];
      int[] a1 = new int[32];
      int[] b1 = new int[32];
      String s2 = thisCombo3[1];
      int[] a2 = new int[32];
      int[] b2 = new int[32];
      int[] z1, zi1;
      String s3 = thisCombo3[2];
      int[] a3 = new int[32];
      int[] b3 = new int[32];
      String s4 = thisCombo3[3];
      int[] a4 = new int[32];
      int[] b4 = new int[32];
      String s5 = thisCombo3[4];
      int[] a5 = new int[32];
      int[] b5 = new int[32];
      String s6 = thisCombo3[5];
      int[] a6 = new int[32];
      int[] b6 = new int[32];
      String s7 = thisCombo3[6];
      int[] a7 = new int[32];
      int[] b7 = new int[32];
      String s8 = thisCombo3[7];
      int[] a8 = new int[32];
      int[] b8 = new int[32];
      String s9 = thisCombo3[8];
      int[] a9 = new int[32];
      int[] b9 = new int[32];
      String s10 = thisCombo3[9];
      int[] a10 = new int[32];
      int[] b10 = new int[32];
      String s11 = thisCombo3[10];
      int[] a11 = new int[32];
      int[] b11 = new int[32];
      String s12 = thisCombo3[11];
      int[] a12 = new int[32];
      int[] b12 = new int[32];
      String s13 = thisCombo3[12];
      int[] a13 = new int[32];
      int[] b13 = new int[32];
      String s14 = thisCombo3[13];
      int[] a14 = new int[32];
      int[] b14 = new int[32];
      String s15 = thisCombo3[14];
      int[] a15 = new int[32];
      int[] b15 = new int[32];
      String s16 = thisCombo3[15];
      int[] a16 = new int[32];
      int[] b16 = new int[32];
      String s17 = thisCombo3[16];
      int[] a17 = new int[32];
      int[] b17 = new int[32];
      String s18 = thisCombo3[17];
      int[] a18 = new int[32];
      int[] b18 = new int[32];
      String s19 = thisCombo3[18];
      int[] a19 = new int[32];
      int[] b19 = new int[32];
      String s20 = thisCombo3[19];
      int[] a20 = new int[32];
      int[] b20 = new int[32];
      String s21 = thisCombo3[20];
      int[] a21 = new int[32];
      int[] b21 = new int[32];
      String s22 = thisCombo3[21];
      int[] a22 = new int[32];
      int[] b22 = new int[32];
      String s23 = thisCombo3[22];
      int[] a23 = new int[32];
      int[] b23 = new int[32];
      String s24 = thisCombo3[23];
      int[] a24 = new int[32];
      int[] b24 = new int[32];
      String s25 = thisCombo3[24];
      int[] a25 = new int[32];
      int[] b25 = new int[32];
      String s26 = thisCombo3[25];
      int[] a26 = new int[32];
      int[] b26 = new int[32];
      String s27 = thisCombo3[26];
      int[] a27 = new int[32];
      int[] b27 = new int[32];
      String s28 = thisCombo3[27];
      int[] a28 = new int[32];
      int[] b28 = new int[32];
      String s29 = thisCombo3[28];
      int[] a29 = new int[32];
      int[] b29 = new int[32];
      String s30 = thisCombo3[29];
      int[] a30 = new int[32];
      int[] b30 = new int[32];
      String s31 = thisCombo3[30];
      int[] a31 = new int[32];
      int[] b31 = new int[32];
      String s32 = thisCombo3[31];
      int[] a32 = new int[32];
      int[] b32 = new int[32];
      String s33 = thisCombo3[32];
      int[] a33 = new int[32];
      int[] b33 = new int[32];
      String s34 = thisCombo3[33];
      int[] a34 = new int[32];
      int[] b34 = new int[32];
      String s35 = thisCombo3[34];
      int[] a35 = new int[32];
      int[] b35 = new int[32];
      String s36 = thisCombo3[35];
      int[] a36 = new int[32];
      int[] b36 = new int[32];
      String s37 = thisCombo3[36];
      int[] a37 = new int[32];
      int[] b37 = new int[32];
      String s38 = thisCombo3[37];
      int[] a38 = new int[32];
      int[] b38 = new int[32];
      String s39 = thisCombo3[38];
      int[] a39 = new int[32];
      int[] b39 = new int[32];
      String s40 = thisCombo3[39];
      int[] a40 = new int[32];
      int[] b40 = new int[32];
      String s41 = thisCombo3[40];
      int[] a41 = new int[32];
      int[] b41 = new int[32];
      String s42 = thisCombo3[41];
      int[] a42 = new int[32];
      int[] b42 = new int[32];
      String s43 = thisCombo3[42];
      int[] a43 = new int[32];
      int[] b43 = new int[32];
      String s44 = thisCombo3[43];
      int[] a44 = new int[32];
      int[] b44 = new int[32];
      String s45 = thisCombo3[44];
      int[] a45 = new int[32];
      int[] b45 = new int[32];
      String s46 = thisCombo3[45];
      int[] a46 = new int[32];
      int[] b46 = new int[32];
      String s47 = thisCombo3[46];
      int[] a47 = new int[32];
      int[] b47 = new int[32];
      String s48 = thisCombo3[47];
      int[] a48 = new int[32];
      int[] b48 = new int[32];
      String s49 = thisCombo3[48];
      int[] a49 = new int[32];
      int[] b49 = new int[32];
      String s50 = thisCombo3[49];
      int[] a50 = new int[32];
      int[] b50 = new int[32];
      String s51 = thisCombo3[50];
      int[] a51 = new int[32];
      int[] b51 = new int[32];
      String s52 = thisCombo3[51];
      int[] a52 = new int[32];
      int[] b52 = new int[32];
      String s53 = thisCombo3[52];
      int[] a53 = new int[32];
      int[] b53 = new int[32];
      String s54 = thisCombo3[53];
      int[] a54 = new int[32];
      int[] b54 = new int[32];
      String s55 = thisCombo3[54];
      int[] a55 = new int[32];
      int[] b55 = new int[32];
      String s56 = thisCombo3[55];
      int[] a56 = new int[32];
      int[] b56 = new int[32];
      String s57 = thisCombo3[56];
      int[] a57 = new int[32];
      int[] b57 = new int[32];
      String s58 = thisCombo3[57];
      int[] a58 = new int[32];
      int[] b58 = new int[32];
      String s59 = thisCombo3[58];
      int[] a59 = new int[32];
      int[] b59 = new int[32];
      String s60 = thisCombo3[59];
      int[] a60 = new int[32];
      int[] b60 = new int[32];
      String s61 = thisCombo3[60];
      int[] a61 = new int[32];
      int[] b61 = new int[32];
      String s62 = thisCombo3[61];
      int[] a62 = new int[32];
      int[] b62 = new int[32];
      String s63 = thisCombo3[62];
      int[] a63 = new int[32];
      int[] b63 = new int[32];
      String s64 = thisCombo3[63];
      int[] a64 = new int[32];
      int[] b64 = new int[32];

      int[] intArray1 = new int[s1.length()];
      for (int i = 0; i < s1.length(); i++) {
        intArray1[i] = Character.digit(s1.charAt(i), 10);
      }
      int[] intArray2 = new int[s2.length()];
      for (int i = 0; i < s2.length(); i++) {
        intArray2[i] = Character.digit(s2.charAt(i), 10);
      }
      int[] intArray3 = new int[s3.length()];
      for (int i = 0; i < s3.length(); i++) {
        intArray3[i] = Character.digit(s3.charAt(i), 10);
      }
      int[] intArray4 = new int[s4.length()];
      for (int i = 0; i < s4.length(); i++) {
        intArray4[i] = Character.digit(s4.charAt(i), 10);
      }
      int[] intArray5 = new int[s5.length()];
      for (int i = 0; i < s5.length(); i++) {
        intArray5[i] = Character.digit(s5.charAt(i), 10);
      }
      int[] intArray6 = new int[s6.length()];
      for (int i = 0; i < s6.length(); i++) {
        intArray6[i] = Character.digit(s6.charAt(i), 10);
      }
      int[] intArray7 = new int[s7.length()];
      for (int i = 0; i < s7.length(); i++) {
        intArray7[i] = Character.digit(s7.charAt(i), 10);
      }
      int[] intArray8 = new int[s8.length()];
      for (int i = 0; i < s8.length(); i++) {
        intArray8[i] = Character.digit(s8.charAt(i), 10);
      }
      int[] intArray9 = new int[s9.length()];
      for (int i = 0; i < s9.length(); i++) {
        intArray9[i] = Character.digit(s9.charAt(i), 10);
      }
      int[] intArray10 = new int[s10.length()];
      for (int i = 0; i < s10.length(); i++) {
        intArray10[i] = Character.digit(s10.charAt(i), 10);
      }
      int[] intArray11 = new int[s9.length()];
      for (int i = 0; i < s11.length(); i++) {
        intArray11[i] = Character.digit(s11.charAt(i), 10);
      }
      int[] intArray12 = new int[s12.length()];
      for (int i = 0; i < s12.length(); i++) {
        intArray12[i] = Character.digit(s12.charAt(i), 10);
      }
      int[] intArray13 = new int[s13.length()];
      for (int i = 0; i < s9.length(); i++) {
        intArray13[i] = Character.digit(s13.charAt(i), 10);
      }
      int[] intArray14 = new int[s14.length()];
      for (int i = 0; i < s14.length(); i++) {
        intArray14[i] = Character.digit(s14.charAt(i), 10);
      }
      int[] intArray15 = new int[s15.length()];
      for (int i = 0; i < s15.length(); i++) {
        intArray15[i] = Character.digit(s15.charAt(i), 10);
      }
      int[] intArray16 = new int[s16.length()];
      for (int i = 0; i < s16.length(); i++) {
        intArray16[i] = Character.digit(s16.charAt(i), 10);
      }
      int[] intArray17 = new int[s17.length()];
      for (int i = 0; i < s17.length(); i++) {
        intArray17[i] = Character.digit(s17.charAt(i), 10);
      }
      int[] intArray18 = new int[s18.length()];
      for (int i = 0; i < s18.length(); i++) {
        intArray18[i] = Character.digit(s18.charAt(i), 10);
      }
      int[] intArray19 = new int[s19.length()];
      for (int i = 0; i < s19.length(); i++) {
        intArray19[i] = Character.digit(s19.charAt(i), 10);
      }
      int[] intArray20 = new int[s20.length()];
      for (int i = 0; i < s20.length(); i++) {
        intArray20[i] = Character.digit(s20.charAt(i), 10);
      }
      int[] intArray21 = new int[s21.length()];
      for (int i = 0; i < s21.length(); i++) {
        intArray21[i] = Character.digit(s21.charAt(i), 10);
      }
      int[] intArray22 = new int[s22.length()];
      for (int i = 0; i < s22.length(); i++) {
        intArray22[i] = Character.digit(s22.charAt(i), 10);
      }
      int[] intArray23 = new int[s23.length()];
      for (int i = 0; i < s23.length(); i++) {
        intArray23[i] = Character.digit(s23.charAt(i), 10);
      }
      int[] intArray24 = new int[s24.length()];
      for (int i = 0; i < s24.length(); i++) {
        intArray24[i] = Character.digit(s24.charAt(i), 10);
      }
      int[] intArray25 = new int[s25.length()];
      for (int i = 0; i < s25.length(); i++) {
        intArray25[i] = Character.digit(s25.charAt(i), 10);
      }
      int[] intArray26 = new int[s26.length()];
      for (int i = 0; i < s26.length(); i++) {
        intArray26[i] = Character.digit(s26.charAt(i), 10);
      }
      int[] intArray27 = new int[s27.length()];
      for (int i = 0; i < s27.length(); i++) {
        intArray27[i] = Character.digit(s27.charAt(i), 10);
      }
      int[] intArray28 = new int[s28.length()];
      for (int i = 0; i < s28.length(); i++) {
        intArray28[i] = Character.digit(s28.charAt(i), 10);
      }
      int[] intArray29 = new int[s29.length()];
      for (int i = 0; i < s29.length(); i++) {
        intArray29[i] = Character.digit(s29.charAt(i), 10);
      }
      int[] intArray30 = new int[s30.length()];
      for (int i = 0; i < s30.length(); i++) {
        intArray30[i] = Character.digit(s30.charAt(i), 10);
      }
      int[] intArray31 = new int[s31.length()];
      for (int i = 0; i < s31.length(); i++) {
        intArray31[i] = Character.digit(s31.charAt(i), 10);
      }
      int[] intArray32 = new int[s32.length()];
      for (int i = 0; i < s32.length(); i++) {
        intArray32[i] = Character.digit(s32.charAt(i), 10);
      }
      int[] intArray33 = new int[s33.length()];
      for (int i = 0; i < s33.length(); i++) {
        intArray33[i] = Character.digit(s33.charAt(i), 10);
      }
      int[] intArray34 = new int[s34.length()];
      for (int i = 0; i < s34.length(); i++) {
        intArray34[i] = Character.digit(s34.charAt(i), 10);
      }
      int[] intArray35 = new int[s35.length()];
      for (int i = 0; i < s35.length(); i++) {
        intArray35[i] = Character.digit(s35.charAt(i), 10);
      }
      int[] intArray36 = new int[s36.length()];
      for (int i = 0; i < s36.length(); i++) {
        intArray36[i] = Character.digit(s36.charAt(i), 10);
      }
      int[] intArray37 = new int[s37.length()];
      for (int i = 0; i < s37.length(); i++) {
        intArray37[i] = Character.digit(s37.charAt(i), 10);
      }
      int[] intArray38 = new int[s38.length()];
      for (int i = 0; i < s38.length(); i++) {
        intArray38[i] = Character.digit(s38.charAt(i), 10);
      }
      int[] intArray39 = new int[s39.length()];
      for (int i = 0; i < s39.length(); i++) {
        intArray39[i] = Character.digit(s39.charAt(i), 10);
      }
      int[] intArray40 = new int[s40.length()];
      for (int i = 0; i < s40.length(); i++) {
        intArray40[i] = Character.digit(s40.charAt(i), 10);
      }
      int[] intArray41 = new int[s41.length()];
      for (int i = 0; i < s41.length(); i++) {
        intArray41[i] = Character.digit(s41.charAt(i), 10);
      }
      int[] intArray42 = new int[s42.length()];
      for (int i = 0; i < s42.length(); i++) {
        intArray42[i] = Character.digit(s42.charAt(i), 10);
      }
      int[] intArray43 = new int[s43.length()];
      for (int i = 0; i < s43.length(); i++) {
        intArray43[i] = Character.digit(s43.charAt(i), 10);
      }
      int[] intArray44 = new int[s44.length()];
      for (int i = 0; i < s44.length(); i++) {
        intArray44[i] = Character.digit(s44.charAt(i), 10);
      }
      int[] intArray45 = new int[s45.length()];
      for (int i = 0; i < s45.length(); i++) {
        intArray45[i] = Character.digit(s45.charAt(i), 10);
      }
      int[] intArray46 = new int[s46.length()];
      for (int i = 0; i < s46.length(); i++) {
        intArray46[i] = Character.digit(s46.charAt(i), 10);
      }
      int[] intArray47 = new int[s47.length()];
      for (int i = 0; i < s47.length(); i++) {
        intArray47[i] = Character.digit(s47.charAt(i), 10);
      }
      int[] intArray48 = new int[s48.length()];
      for (int i = 0; i < s48.length(); i++) {
        intArray48[i] = Character.digit(s48.charAt(i), 10);
      }
      int[] intArray49 = new int[s49.length()];
      for (int i = 0; i < s49.length(); i++) {
        intArray49[i] = Character.digit(s49.charAt(i), 10);
      }
      int[] intArray50 = new int[s50.length()];
      for (int i = 0; i < s50.length(); i++) {
        intArray50[i] = Character.digit(s50.charAt(i), 10);
      }
      int[] intArray51 = new int[s51.length()];
      for (int i = 0; i < s51.length(); i++) {
        intArray51[i] = Character.digit(s51.charAt(i), 10);
      }
      int[] intArray52 = new int[s52.length()];
      for (int i = 0; i < s52.length(); i++) {
        intArray52[i] = Character.digit(s52.charAt(i), 10);
      }
      int[] intArray53 = new int[s53.length()];
      for (int i = 0; i < s53.length(); i++) {
        intArray53[i] = Character.digit(s53.charAt(i), 10);
      }
      int[] intArray54 = new int[s54.length()];
      for (int i = 0; i < s54.length(); i++) {
        intArray54[i] = Character.digit(s54.charAt(i), 10);
      }
      int[] intArray55 = new int[s55.length()];
      for (int i = 0; i < s55.length(); i++) {
        intArray55[i] = Character.digit(s55.charAt(i), 10);
      }
      int[] intArray56 = new int[s56.length()];
      for (int i = 0; i < s56.length(); i++) {
        intArray56[i] = Character.digit(s56.charAt(i), 10);
      }
      int[] intArray57 = new int[s57.length()];
      for (int i = 0; i < s57.length(); i++) {
        intArray57[i] = Character.digit(s57.charAt(i), 10);
      }
      int[] intArray58 = new int[s58.length()];
      for (int i = 0; i < s58.length(); i++) {
        intArray58[i] = Character.digit(s58.charAt(i), 10);
      }
      int[] intArray59 = new int[s59.length()];
      for (int i = 0; i < s59.length(); i++) {
        intArray59[i] = Character.digit(s59.charAt(i), 10);
      }
      int[] intArray60 = new int[s60.length()];
      for (int i = 0; i < s60.length(); i++) {
        intArray60[i] = Character.digit(s60.charAt(i), 10);
      }
      int[] intArray61 = new int[s61.length()];
      for (int i = 0; i < s61.length(); i++) {
        intArray61[i] = Character.digit(s61.charAt(i), 10);
      }
      int[] intArray62 = new int[s62.length()];
      for (int i = 0; i < s62.length(); i++) {
        intArray62[i] = Character.digit(s62.charAt(i), 10);
      }
      int[] intArray63 = new int[s63.length()];
      for (int i = 0; i < s63.length(); i++) {
        intArray63[i] = Character.digit(s63.charAt(i), 10);
      }
      int[] intArray64 = new int[s64.length()];
      for (int i = 0; i < s64.length(); i++) {
        intArray64[i] = Character.digit(s64.charAt(i), 10);
      }
      returnConvertArray(s2, a2, intArray2);
      returnConvertArray(s2, b2, intArray2);
      returnConvertArray(s3, a3, intArray3);
      returnConvertArray(s3, b3, intArray3);
      returnConvertArray(s4, a4, intArray4);
      returnConvertArray(s4, b4, intArray4);
      returnConvertArray(s5, a5, intArray5);
      returnConvertArray(s5, b5, intArray5);
      returnConvertArray(s6, a6, intArray6);
      returnConvertArray(s6, b6, intArray6);
      returnConvertArray(s7, a7, intArray7);
      returnConvertArray(s7, b7, intArray7);
      returnConvertArray(s8, a8, intArray8);
      returnConvertArray(s8, b8, intArray8);
      returnConvertArray(s9, a9, intArray9);
      returnConvertArray(s9, b9, intArray9);
      returnConvertArray(s10, a10, intArray10);
      returnConvertArray(s10, b10, intArray10);
      returnConvertArray(s11, a11, intArray11);
      returnConvertArray(s11, b11, intArray11);
      returnConvertArray(s12, a12, intArray12);
      returnConvertArray(s12, b12, intArray12);
      returnConvertArray(s13, a13, intArray13);
      returnConvertArray(s13, b13, intArray13);
      returnConvertArray(s14, a14, intArray14);
      returnConvertArray(s14, b14, intArray14);
      returnConvertArray(s15, a15, intArray15);
      returnConvertArray(s15, b15, intArray15);
      returnConvertArray(s16, a16, intArray16);
      returnConvertArray(s16, b16, intArray16);
      returnConvertArray(s17, a17, intArray17);
      returnConvertArray(s17, b17, intArray17);
      returnConvertArray(s18, a18, intArray18);
      returnConvertArray(s18, b18, intArray18);
      returnConvertArray(s19, a19, intArray19);
      returnConvertArray(s19, b19, intArray19);
      returnConvertArray(s20, a20, intArray20);
      returnConvertArray(s20, b20, intArray20);
      returnConvertArray(s21, a21, intArray21);
      returnConvertArray(s21, b21, intArray21);
      returnConvertArray(s22, a22, intArray32);
      returnConvertArray(s22, b22, intArray32);
      returnConvertArray(s23, a23, intArray33);
      returnConvertArray(s23, b23, intArray33);
      returnConvertArray(s24, a24, intArray34);
      returnConvertArray(s24, b24, intArray34);
      returnConvertArray(s25, a25, intArray35);
      returnConvertArray(s25, b25, intArray35);
      returnConvertArray(s26, a26, intArray36);
      returnConvertArray(s26, b26, intArray36);
      returnConvertArray(s27, a27, intArray37);
      returnConvertArray(s27, b27, intArray37);
      returnConvertArray(s28, a28, intArray38);
      returnConvertArray(s28, b28, intArray38);
      returnConvertArray(s29, a29, intArray39);
      returnConvertArray(s29, b29, intArray39);
      returnConvertArray(s30, a30, intArray30);
      returnConvertArray(s30, b30, intArray30);
      returnConvertArray(s31, a31, intArray31);
      returnConvertArray(s31, b31, intArray31);
      returnConvertArray(s32, a32, intArray32);
      returnConvertArray(s32, b32, intArray32);
      returnConvertArray(s33, a33, intArray33);
      returnConvertArray(s33, b33, intArray33);
      returnConvertArray(s34, a34, intArray34);
      returnConvertArray(s34, b34, intArray34);
      returnConvertArray(s35, a35, intArray35);
      returnConvertArray(s35, b35, intArray35);
      returnConvertArray(s36, a36, intArray36);
      returnConvertArray(s36, b36, intArray36);
      returnConvertArray(s37, a37, intArray37);
      returnConvertArray(s37, b37, intArray37);
      returnConvertArray(s38, a38, intArray38);
      returnConvertArray(s38, b38, intArray38);
      returnConvertArray(s39, a39, intArray39);
      returnConvertArray(s39, b39, intArray39);
      returnConvertArray(s30, a40, intArray40);
      returnConvertArray(s30, b40, intArray40);
      returnConvertArray(s41, a41, intArray41);
      returnConvertArray(s41, b41, intArray41);
      returnConvertArray(s42, a42, intArray42);
      returnConvertArray(s42, b42, intArray42);
      returnConvertArray(s43, a43, intArray43);
      returnConvertArray(s43, a43, intArray43);
      returnConvertArray(s44, a44, intArray44);
      returnConvertArray(s44, b44, intArray44);
      returnConvertArray(s45, a45, intArray45);
      returnConvertArray(s45, b45, intArray45);
      returnConvertArray(s46, a46, intArray46);
      returnConvertArray(s46, b46, intArray46);
      returnConvertArray(s47, a47, intArray47);
      returnConvertArray(s47, b47, intArray47);
      returnConvertArray(s48, a48, intArray48);
      returnConvertArray(s48, b48, intArray48);
      returnConvertArray(s49, a49, intArray49);
      returnConvertArray(s49, b49, intArray49);
      returnConvertArray(s50, a50, intArray50);
      returnConvertArray(s50, b50, intArray50);
      returnConvertArray(s51, a51, intArray51);
      returnConvertArray(s51, b51, intArray51);
      returnConvertArray(s52, a52, intArray52);
      returnConvertArray(s52, b52, intArray52);
      returnConvertArray(s53, a53, intArray53);
      returnConvertArray(s53, a53, intArray53);
      returnConvertArray(s54, a54, intArray54);
      returnConvertArray(s54, b54, intArray54);
      returnConvertArray(s55, a55, intArray55);
      returnConvertArray(s55, b55, intArray55);
      returnConvertArray(s56, a56, intArray56);
      returnConvertArray(s56, b56, intArray56);
      returnConvertArray(s57, a57, intArray57);
      returnConvertArray(s57, b57, intArray57);
      returnConvertArray(s58, a58, intArray58);
      returnConvertArray(s58, b58, intArray58);
      returnConvertArray(s59, a59, intArray59);
      returnConvertArray(s59, b59, intArray59);
      returnConvertArray(s60, a60, intArray60);
      returnConvertArray(s60, b60, intArray60);
      returnConvertArray(s61, a61, intArray61);
      returnConvertArray(s61, b61, intArray61);
      returnConvertArray(s62, a62, intArray62);
      returnConvertArray(s62, b62, intArray62);
      returnConvertArray(s63, a63, intArray63);
      returnConvertArray(s63, a63, intArray63);
      returnConvertArray(s64, a64, intArray64);
      returnConvertArray(s64, b64, intArray64);
      //System.out.println("done using method");
      intArray17 = MessageSchedule.returnMessageSchecdule(intArray2, a2, b2, intArray15, a15, b15, intArray1, intArray9);
      returnConvertArray(s17, b17, intArray17);
      returnConvertArray(s17, a17, intArray17);
//      System.out.print("w16=");
//      printArray(intArray17);
//      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
//      printArray(a16);
      intArray18 = MessageSchedule.returnMessageSchecdule(intArray3, a3, b3, intArray16, a16, b16, intArray2, intArray10);
      returnConvertArray(s18, b18, intArray18);
      returnConvertArray(s18, a18, intArray18);
//      System.out.print("w17=");
//      printArray(intArray18);
//      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
      intArray19 = MessageSchedule.returnMessageSchecdule(intArray4, a4, b4, intArray17, a17, b17, intArray3, intArray11);
      returnConvertArray(s19, b19, intArray19);
      returnConvertArray(s19, a19, intArray19);
//      System.out.print("w18=");
//      printArray(intArray19);
//      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
      intArray20 = MessageSchedule.returnMessageSchecdule(intArray5, a5, b5, intArray18, a18, b18, intArray4, intArray12);
      returnConvertArray(s20, a20, intArray20);
      returnConvertArray(s20, b20, intArray20);
//      System.out.print("w19=");
//      printArray(intArray20);
//      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
      intArray21 = MessageSchedule.returnMessageSchecdule(intArray6, a6, b6, intArray19, a19, b19, intArray5, intArray13);
      returnConvertArray(s21, a21, intArray21);
      returnConvertArray(s21, b21, intArray21);
//      System.out.print("w20=");
//      printArray(intArray21);
//      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
      intArray22 = MessageSchedule.returnMessageSchecdule(intArray7, a7, b7, intArray20, a20, b20, intArray6, intArray14);
      returnConvertArray(s22, a22, intArray22);
      returnConvertArray(s22, b22, intArray22);
//      System.out.print("w21=");
//      printArray(intArray22);
//      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
      intArray23 = MessageSchedule.returnMessageSchecdule(intArray8, a8, b8, intArray21, a21, b21, intArray7, intArray16);
      returnConvertArray(s23, a23, intArray23);
      returnConvertArray(s23, b23, intArray23);
//      System.out.print("w22=");
//      printArray(intArray23);
//      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");

      intArray24 = MessageSchedule.returnMessageSchecdule(intArray9, a9, b9, intArray22, a22, b22, intArray8, intArray17);
      returnConvertArray(s24, a24, intArray24);
      returnConvertArray(s24, b24, intArray24);
//      System.out.print("w23=");
//      printArray(intArray24);
//      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");

      intArray25 = MessageSchedule.returnMessageSchecdule(intArray10, a10, b10, intArray23, a23, b23, intArray9, intArray18);
      returnConvertArray(s25, a25, intArray25);
      returnConvertArray(s25, b25, intArray25);
//      System.out.print("w24=");
//      printArray(intArray25);
//      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
      intArray26 = MessageSchedule.returnMessageSchecdule(intArray11, a11, b11, intArray24, a24, b24, intArray10, intArray19);
      returnConvertArray(s26, a26, intArray26);
      returnConvertArray(s26, b26, intArray26);
//      System.out.print("w25=");
//      printArray(intArray26);
//      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
      intArray27 = MessageSchedule.returnMessageSchecdule(intArray12, a12, b12, intArray25, a25, b25, intArray11, intArray20);
      returnConvertArray(s27, a27, intArray27);
      returnConvertArray(s27, b27, intArray27);
//      System.out.print("w26=");
//      printArray(intArray27);
//      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
      intArray28 = MessageSchedule.returnMessageSchecdule(intArray13, a13, b13, intArray26, a26, b26, intArray12, intArray21);
      returnConvertArray(s28, a28, intArray28);
      returnConvertArray(s28, b28, intArray28);
//      System.out.print("w27=");
//      printArray(intArray28);
//      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
      intArray29 = MessageSchedule.returnMessageSchecdule(intArray14, a14, b14, intArray27, a27, b27, intArray13, intArray22);
      returnConvertArray(s29, a29, intArray29);
      returnConvertArray(s29, b29, intArray29);
//      System.out.print("w28=");
//      printArray(intArray29);
//      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
      intArray30 = MessageSchedule.returnMessageSchecdule(intArray15, a15, b15, intArray28, a28, b28, intArray14, intArray23);
      returnConvertArray(s30, a30, intArray30);
      returnConvertArray(s30, b30, intArray30);
//      System.out.print("w29=");
//      printArray(intArray30);
//      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
      intArray31 = MessageSchedule.returnMessageSchecdule(intArray16, a16, b16, intArray29, a29, b29, intArray15, intArray24);
      returnConvertArray(s31, a31, intArray31);
      returnConvertArray(s31, b31, intArray31);
      // System.out.print("w30=");
      // printArray(intArray31);
      intArray32 = MessageSchedule.returnMessageSchecdule(intArray17, a17, b17, intArray30, a30, b30, intArray16, intArray25);
      returnConvertArray(s32, a32, intArray32);
      returnConvertArray(s32, b32, intArray32);
//      System.out.print("w31=");
//      printArray(intArray32);
//      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
      intArray33 = MessageSchedule.returnMessageSchecdule(intArray18, a18, b18, intArray31, a31, b31, intArray17, intArray26);
      returnConvertArray(s33, a33, intArray33);
      returnConvertArray(s33, b33, intArray33);
//      System.out.print("w32=");
//      printArray(intArray33);
//      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
      intArray34 = MessageSchedule.returnMessageSchecdule(intArray19, a19, b19, intArray32, a32, b32, intArray18, intArray27);
      returnConvertArray(s34, a34, intArray34);
      returnConvertArray(s34, b34, intArray34);
//      System.out.print("w33=");
//      printArray(intArray34);
//      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
      intArray35 = MessageSchedule.returnMessageSchecdule(intArray20, a20, b20, intArray33, a33, b33, intArray19, intArray28);
      returnConvertArray(s35, a35, intArray35);
      returnConvertArray(s35, b35, intArray35);
//      System.out.print("w34=");
//      printArray(intArray35);
//      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
      intArray36 = MessageSchedule.returnMessageSchecdule(intArray21, a21, b21, intArray34, a34, b34, intArray20, intArray29);
      returnConvertArray(s36, a36, intArray36);
      returnConvertArray(s36, b36, intArray36);
//      System.out.print("w35=");
//      printArray(intArray36);
//      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
      intArray37 = MessageSchedule.returnMessageSchecdule(intArray22, a22, b22, intArray35, a35, b35, intArray21, intArray30);
      returnConvertArray(s37, a37, intArray37);
      returnConvertArray(s37, b37, intArray37);
//      System.out.print("w36=");
//      printArray(intArray37);
//      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
      intArray38 = MessageSchedule.returnMessageSchecdule(intArray23, a23, b23, intArray36, a36, b36, intArray22, intArray31);
      returnConvertArray(s38, a38, intArray38);
      returnConvertArray(s38, b38, intArray38);
//      System.out.print("w37=");
//      printArray(intArray38);
//      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
      intArray39 = MessageSchedule.returnMessageSchecdule(intArray24, a24, b24, intArray37, a37, b37, intArray23, intArray32);
      returnConvertArray(s39, a39, intArray39);
      returnConvertArray(s39, b39, intArray39);
//      System.out.print("w38=");
//      printArray(intArray39);
      intArray40 = MessageSchedule.returnMessageSchecdule(intArray25, a25, b25, intArray38, a38, b38, intArray24, intArray33);
      returnConvertArray(s40, a40, intArray40);
      returnConvertArray(s40, b40, intArray40);
//      System.out.print("w39=");
//      printArray(intArray40);
//      System.out.println("-----------------------------------------------------------4-----------------------------------------------------------------------------------");
      intArray41 = MessageSchedule.returnMessageSchecdule(intArray26, a26, b26, intArray39, a39, b39, intArray25, intArray34);
      returnConvertArray(s41, a41, intArray41);
      returnConvertArray(s41, b41, intArray41);
      // System.out.print("w40=");
      intArray42 = MessageSchedule.returnMessageSchecdule(intArray27, a27, b27, intArray40, a40, b40, intArray26, intArray35);
      returnConvertArray(s42, a42, intArray42);
      returnConvertArray(s42, b42, intArray42);
//      System.out.print("w41=");
//      printArray(intArray42);
//      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
      intArray43 = MessageSchedule.returnMessageSchecdule(intArray28, a28, b28, intArray41, a41, b41, intArray27, intArray36);
      returnConvertArray(s43, a43, intArray43);
      returnConvertArray(s43, b43, intArray43);
//      printArray(intArray43);
//      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
      intArray44 = MessageSchedule.returnMessageSchecdule(intArray29, a29, b29, intArray42, a42, b42, intArray28, intArray37);
      returnConvertArray(s44, a44, intArray44);
      returnConvertArray(s44, b44, intArray44);
//      System.out.print("w43=");
//      printArray(intArray44);
//      System.out.println("--4--------------------------------------------------------------------------------------------------------------------------------------------");
      intArray45 = MessageSchedule.returnMessageSchecdule(intArray30, a30, b30, intArray43, a43, b43, intArray29, intArray38);
      returnConvertArray(s45, a45, intArray45);
      returnConvertArray(s45, b45, intArray45);
//      System.out.print("w44=");
//      printArray(intArray45);
//      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
      intArray46 = MessageSchedule.returnMessageSchecdule(intArray31, a31, b31, intArray44, a44, b44, intArray30, intArray39);
      returnConvertArray(s46, a46, intArray46);
      returnConvertArray(s46, b46, intArray46);
//      System.out.print("w45=");
//      printArray(intArray46);
//      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
      intArray47 = MessageSchedule.returnMessageSchecdule(intArray32, a32, b32, intArray45, a45, b45, intArray31, intArray40);
      returnConvertArray(s47, a47, intArray47);
      returnConvertArray(s47, b47, intArray47);
//      System.out.print("w46=");
//      printArray(intArray47);
//      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
      intArray48 = MessageSchedule.returnMessageSchecdule(intArray33, a33, b33, intArray46, a46, b46, intArray32, intArray41);
      returnConvertArray(s48, a48, intArray48);
      returnConvertArray(s48, b48, intArray48);
//      System.out.print("w47=");
//      printArray(intArray48);
//      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
      intArray49 = MessageSchedule.returnMessageSchecdule(intArray34, a34, b34, intArray47, a47, b47, intArray33, intArray42);
      returnConvertArray(s49, a49, intArray49);
      returnConvertArray(s49, b49, intArray49);
//      System.out.print("w48=");
//      printArray(intArray49);
      intArray50 = MessageSchedule.returnMessageSchecdule(intArray35, a35, b35, intArray48, a48, b48, intArray34, intArray43);
      returnConvertArray(s50, a50, intArray50);
      returnConvertArray(s50, b50, intArray50);
//      System.out.print("w49=");
//      printArray(intArray50);
//      System.out.println("-----------------------------------------------------------4-----------------------------------------------------------------------------------");
      intArray51 = MessageSchedule.returnMessageSchecdule(intArray36, a36, b36, intArray49, a49, b49, intArray35, intArray44);
      returnConvertArray(s51, a51, intArray51);
      returnConvertArray(s51, b51, intArray51);
//      System.out.print("w50=");
//      printArray(intArray51);
      intArray52 = MessageSchedule.returnMessageSchecdule(intArray37, a37, b37, intArray50, a50, b50, intArray36, intArray45);
      returnConvertArray(s52, a52, intArray52);
      returnConvertArray(s52, b52, intArray52);
//      System.out.print("w51=");
//      printArray(intArray52);
//      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
      intArray53 = MessageSchedule.returnMessageSchecdule(intArray38, a38, b38, intArray51, a51, b51, intArray37, intArray46);
      returnConvertArray(s53, a53, intArray53);
      returnConvertArray(s53, b53, intArray53);
//      printArray(intArray53);
//      System.out.println("----------------------------------4------------------------------------------------------------------------------------------------------------");
      intArray54 = MessageSchedule.returnMessageSchecdule(intArray39, a39, b39, intArray52, a52, b52, intArray38, intArray47);
      returnConvertArray(s54, a54, intArray54);
      returnConvertArray(s54, b54, intArray54);
//      System.out.print("w53=");
//      printArray(intArray54);
//      System.out.println("--4--------------------------------------------------------------------------------------------------------------------------------------------");
      intArray55 = MessageSchedule.returnMessageSchecdule(intArray40, a40, b40, intArray53, a53, b53, intArray39, intArray48);
      returnConvertArray(s55, a55, intArray55);
      returnConvertArray(s55, b55, intArray55);
//      System.out.print("w54=");
//      printArray(intArray55);
//      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
      intArray56 = MessageSchedule.returnMessageSchecdule(intArray41, a41, b41, intArray54, a54, b54, intArray40, intArray49);
      returnConvertArray(s56, a56, intArray56);
      returnConvertArray(s56, b56, intArray56);
//      System.out.print("w55=");
//      printArray(intArray46);
//      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
      intArray57 = MessageSchedule.returnMessageSchecdule(intArray42, a42, b42, intArray55, a55, b55, intArray41, intArray50);
      returnConvertArray(s57, a57, intArray57);
      returnConvertArray(s57, b57, intArray57);
//      System.out.print("w56=");
//      printArray(intArray57);
//      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
      intArray58 = MessageSchedule.returnMessageSchecdule(intArray43, a43, b43, intArray56, a56, b56, intArray42, intArray51);
      returnConvertArray(s58, a58, intArray58);
      returnConvertArray(s58, b58, intArray58);
//      System.out.print("w57=");
//      printArray(intArray58);
//      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
      intArray59 = MessageSchedule.returnMessageSchecdule(intArray44, a44, b44, intArray57, a57, b57, intArray43, intArray52);
      returnConvertArray(s59, a59, intArray59);
      returnConvertArray(s59, b59, intArray59);
//      System.out.print("w58=");
//      printArray(intArray59);
      intArray60 = MessageSchedule.returnMessageSchecdule(intArray45, a45, b45, intArray58, a58, b58, intArray44, intArray53);
      returnConvertArray(s60, a60, intArray60);
      returnConvertArray(s60, b60, intArray60);
//      System.out.print("w59=");
//      printArray(intArray60);
//      System.out.println("-----------------------------------------------------------4-----------------------------------------------------------------------------------");
      intArray61 = MessageSchedule.returnMessageSchecdule(intArray46, a46, b46, intArray59, a59, b59, intArray45, intArray54);
      returnConvertArray(s61, a61, intArray61);
      returnConvertArray(s61, b61, intArray61);
//      System.out.print("w60=");
//      printArray(intArray61);
      intArray62 = MessageSchedule.returnMessageSchecdule(intArray47, a47, b47, intArray60, a60, b60, intArray46, intArray55);
      returnConvertArray(s62, a62, intArray62);
      returnConvertArray(s62, b62, intArray62);
//      System.out.print("w61=");
//      printArray(intArray62);
//      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
      intArray63 = MessageSchedule.returnMessageSchecdule(intArray48, a48, b48, intArray61, a61, b61, intArray47, intArray56);
      returnConvertArray(s63, a63, intArray63);
      returnConvertArray(s63, b63, intArray63);
//      printArray(intArray63);
//      System.out.println("----------------------------------4------------------------------------------------------------------------------------------------------------");
      intArray64 = MessageSchedule.returnMessageSchecdule(intArray49, a49, b49, intArray62, a62, b62, intArray48, intArray57);
      returnConvertArray(s64, a64, intArray64);
      returnConvertArray(s64, b64, intArray64);
//      System.out.print("w63=");
//      printArray(intArray64);
//      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
//      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
//      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
//      System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
//      System.out.print("w16=");printArray(intArray17);
//      System.out.print("w17=");printArray(intArray18);
//      System.out.print("w18=");printArray(intArray19);
//      System.out.print("w19=");printArray(intArray20);
//      System.out.print("w20=");printArray(intArray21);
//      System.out.print("w21=");printArray(intArray22);
//      System.out.print("w22=");printArray(intArray23);
//      System.out.print("w23=");printArray(intArray24);
//      System.out.print("w24=");printArray(intArray25);
//      System.out.print("w25=");printArray(intArray26);
//      System.out.print("w26=");printArray(intArray27);
//      System.out.print("w27=");printArray(intArray28);
//      System.out.print("w28=");printArray(intArray29);
//      System.out.print("w29=");printArray(intArray30);
//      System.out.print("w30=");printArray(intArray31);
//      System.out.print("w31=");printArray(intArray32);
//      System.out.print("w32=");printArray(intArray33);
//      System.out.print("w33=");printArray(intArray34);
//      System.out.print("w34=");printArray(intArray35);
//      System.out.print("w35=");printArray(intArray36);
//      System.out.print("w36=");printArray(intArray37);
//      System.out.print("w37=");printArray(intArray38);
//      System.out.print("w38=");printArray(intArray39);
//      System.out.print("w39=");printArray(intArray40);
//      System.out.print("w40=");printArray(intArray41);
//      System.out.print("w41=");printArray(intArray42);
//      System.out.print("w42=");printArray(intArray43);
//      System.out.print("w43=");printArray(intArray44);
//      System.out.print("w44=");printArray(intArray45);
//      System.out.print("w45=");printArray(intArray46);
//      System.out.print("w46=");printArray(intArray47);
//      System.out.print("w47=");printArray(intArray48);
//      System.out.print("w48=");printArray(intArray49);
//      System.out.print("w49=");printArray(intArray50);
//      System.out.print("w50=");printArray(intArray51);
//      System.out.print("w51=");printArray(intArray52);
//      System.out.print("w52=");printArray(intArray53);
//      System.out.print("w53=");printArray(intArray54);
//      System.out.print("w54=");printArray(intArray55);
//      System.out.print("w55=");printArray(intArray56);
//      System.out.print("w56=");printArray(intArray57);
//      System.out.print("w57=");printArray(intArray58);
//      System.out.print("w58=");printArray(intArray59);
//      System.out.print("w59=");printArray(intArray60);
//      System.out.print("w60=");printArray(intArray61);
//      System.out.print("w61=");printArray(intArray62);
//      System.out.print("w62=");printArray(intArray63);
//      System.out.print("w63=");printArray(intArray64);
      Compression.CompressionAlgo(intArray1,intArray2,intArray3,intArray4, intArray5, intArray6, intArray7, intArray8, intArray9,intArray10, intArray11, intArray12, intArray13, intArray14, intArray15, intArray16, intArray17, intArray18, intArray19, intArray20, intArray21, intArray22, intArray23, intArray24, intArray25, intArray26, intArray27, intArray28, intArray29, intArray30, intArray31, intArray32, intArray33, intArray34, intArray35, intArray36, intArray37, intArray38, intArray39, intArray40, intArray41, intArray42, intArray43, intArray44, intArray45, intArray46, intArray47, intArray48, intArray49, intArray50, intArray51, intArray52, intArray53, intArray54, intArray55, intArray56, intArray57, intArray58, intArray59, intArray60, intArray61, intArray62, intArray63, intArray64);
      //      System.out.println("postion 1");
//      printArray(intArray3);
//        System.out.println();
//        String AfterAddingAll512Bits=String.valueOf(binary.toString().replace(" ","").length());
//        System.out.println(AfterAddingAll512Bits);
////        messageList.add(binary.toString());
//    }}
    }


  /**
   * This is used to pad the 0'
   * * @param r is the length (parse)
   * @return the number to pad 0
   */
  public static int Remaning64bits(int r){
        int m=64-r;
        return m;
    }

  /**
   ** @param arr1 : is the array to be rotated
   * @param n1  : is the number of times array should be rotated
   * @return : This method returns the rotated array
   */
  public static int[] returnRotate(int[] arr1, int n1){
        int [] arr =arr1;
        //n determine the number of times an array should be rotated.
        int n = n1;
        //Displays original array
        //  System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            //    System.out.print(arr[i] + " ");
        }
        //Rotate the given array by n times toward right
        for(int i = 0; i < n; i++){
            int j, last;
            //Stores the last element of array
            last = arr[arr.length-1];

            for(j = arr.length-1; j > 0; j--){
                //Shift element of array by one
                arr[j] = arr[j-1];
            }
            //Last element of array will be added to the start of array.
            arr[0] = last;
        }
        //System.out.println();
        // Displays resulting array after rotation
        //     System.out.println("Array after right rotation: ");
        for(int i = 0; i< arr.length; i++){
            return new int[]{arr[i]};
        }
        return new int[0];}

  /**
   * This method is used to copy one array into other
   * @param s is the length of the array
   * @param Array :Is the array from to copy
   * @param Array2 : It is the array to copy
   * @return : 2nd copied array from 1st
   */
  public static int[] returnConvertArray(String s,int[] Array,int[] Array2) {
    for (int i = 0; i <s.length(); i++) {
      Array[i] = Array2[i];
    }
    return new int[Array.length];
  }

  /**
   * this method is used to print the array
   * @param array : The array to be printed
   */
  public static void printArray(int[]array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i]);
    }
    System.out.println();
  }
}


