
public class QuickSort {




        // Swap function
        static void swap(int[] arr, int x, int y){
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }

        // Partition function
        static int partition(int[] arr, int st, int end){
            int pivot = arr[st];
            int cnt = 0;

            // Count elements <= pivot
            for(int i = st + 1; i <= end; i++){
                if(arr[i] <= pivot){
                    cnt++;
                }
            }

            // Place pivot at correct position
            int pivotIdx = st + cnt;
            swap(arr, st, pivotIdx);

            int i = st, j = end;

            // Arrange elements around pivot
            while(i < pivotIdx && j > pivotIdx){

                while(i < pivotIdx && arr[i] <= pivot){
                    i++;
                }

                while(j > pivotIdx && arr[j] > pivot){
                    j--;
                }

                if(i < pivotIdx && j > pivotIdx){
                    swap(arr, i, j);
                    i++;
                    j--;
                }
            }

            return pivotIdx;
        }

        // QuickSort function
        static void quickSort(int[] arr, int st, int end){
            if(st >= end) return;

            int pi = partition(arr, st, end);

            quickSort(arr, st, pi - 1);
            quickSort(arr, pi + 1, end);
        }

        // Main method
        public static void main(String[] args){
            int[] arr = {6, 3, 9, 5, 2, 8};

            quickSort(arr, 0, arr.length - 1);

            // Print sorted array
            System.out.println("Sorted Array:");
            for(int num : arr){
                System.out.print(num + " ");
            }
        }
    }

