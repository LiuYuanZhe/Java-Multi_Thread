package com.sdust.ssm.test;

/**
 * Created by LiuYuanZhe on 18/3/11.
 */
public class SortTest {
    public static void swap(int a[],int i,int j){
        int temp = 0;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void bubboSort(int a[]){
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length-1;j++){
                if (a[j]>a[j+1]){
                    swap(a,j+1,j);
                }
            }
        }
    }
    public static void QuickSort(int a[],int start,int end){
        if (start<end){
            int pv = a[start];
            int i = start+1,j=end;
            while (i <= j){
                while (i<=j&&a[i]<pv){
                    i++;
                }
                while (i<=j&&a[j]>pv){
                    j--;
                }
                if (i<=j){
                    swap(a,i,j);
                }
            }
            swap(a,start,j);
            QuickSort(a,start,j-1);
            QuickSort(a,j+1,end);
        }
    }
    public static void main(String[] args) {
//        int a[] = {49,38,65,97,76,13,27,49};
        int a[] = {8,7,6,5,4,3,2,1};
        QuickSort(a,0,a.length-1);
//        bubboSort(a);
//        qs(a,0,a.length-1);
        for (int i=0;i<a.length;i++){
            System.out.print("   "+a[i]);
        }
    }

    public static void qs(int a[],int L,int R){
        int pivot = a[L];
        int i = L+1,j = R;
        if (L<R){
            while (i<j){
                while (i<j&&pivot>a[i]){
                    i++;
                }
                while (i<j&&pivot<a[j]){
                    j--;
                }
                if (i<=j){
                    swap(a,i,j);
                    i++;j--;
                }
            }
            swap(a,j,L);
            qs(a,L,j-1);
            qs(a,j+1,R);
        }

    }
}
