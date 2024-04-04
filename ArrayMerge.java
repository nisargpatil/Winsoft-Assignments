//Merge Arrays
//ArrayMerge.java

import java.util.Arrays;
public class ArrayMerge {
    public static void mergedArrays(int[]P, int[]Q) {
        int m=P.length;
        int n=Q.length;
        int index=m-1;
        for (int i=m-1;i>=0;i--) {
            if (P[i]!=0) {
                P[index--]=P[i];
            }
        }
        int i=index+1, j=0, k=0;
        while (i<m && j<n) {
            if (P[i]<Q[j]) {
                P[k++]=P[i++];
            } 
            else {
                P[k++] = Q[j++];
            }   }
        while (j<n) 
        {
            P[k++]=Q[j++];
        }
    }
    public static void main(String[] args){
        int[] P={0,2,0,3,0,5,6,0,0};
        int[] Q={1,8,9,10,15};
        mergedArrays(P,Q);
        System.out.println("Merged array: " + Arrays.toString(P));
    }
}