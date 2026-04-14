public class InsertionSort {

 static void insertionSort(int[] arr){
     int a=arr.length;
     for(int i=1 ;i<a; i++){
         int j=i;
         while(j>0 && arr[j]<arr[j-1])
         {
             int temp=arr[j];
             arr[j]=arr[j-1];
             arr[j-1]=temp;
             j--;
         }
     }
     for(int i =0 ; i<arr.length;i++){
         System.out.print(arr[i]+" ");
     }

 }

    public static void main(String[] args){
        int[] arr={1,4,28,43,5,3,8};
        insertionSort(arr);

    }
}
