public class SelectionSort {
   static void selectionSort(int[] arr){
       int n=arr.length;
       for(int i=0; i<n-1 ; i++){
           int sh=i;
           for(int j=i+1;j<n;j++){
               if(arr[j]<arr[sh]){
                   sh=j;
               }
           }

  int temp=arr[i];
           arr[i]=arr[sh];
           arr[sh]=temp;
       }
   }

    public static void main(String[] args){
        int [] arr={7,4,5,1,2};
        selectionSort(arr);
        for(int i=0 ; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
