import java.util.Arrays;

public class Main {
    public static void QuickSort(int[] myArr, int Lo, int Hi){
        if (myArr.length == 0) return;
        if (Lo>= Hi) return;

        int pivot = Lo + (Hi - Lo)/2;
        int wall =  myArr[pivot];
        int  i = Lo;
        int j = Hi;

        while (i<=j){
            while(myArr[i]<wall) {
                i++;
            };
            while(myArr[j]>wall){
                j--;
            };

            if (i<=j) {
               int temp =myArr[i];
               myArr[i] = myArr[j];
               myArr[j] = temp;
               i++;
               j--;
            };
        };

        if (Lo < j) QuickSort( myArr,Lo,j);

        if (Hi >i ) QuickSort(myArr,i,Hi);
    };



    public static void main(String[] args) {
       int[] myArray = {5,9,4,7,3,6,1,8,2};
       System.out.println(Arrays.toString( myArray));
       QuickSort(myArray,0,myArray.length-1);
       System.out.println(Arrays.toString( myArray));
    }
}
