

public class HeapSort {

    // Heapify function (MaxHeapify)
    public static void maxHeapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;   // left child
        int right = 2 * i + 2;  // right child

        // check left child
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // check right child
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // if largest is not root
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // recursively heapify the affected subtree
            maxHeapify(arr, n, largest);
        }
    }

    // Heap Sort function
    public static void heapSort(int[] arr, int n) {

        // Step 1: Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            maxHeapify(arr, n, i);
        }

        // Step 2: Extract elements one by one
        for (int i = n - 1; i > 0; i--) {

            // swap root (largest) with last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // heapify reduced heap
            maxHeapify(arr, i, 0);
        }
    }

    // Main method
    public static void main(String[] args) {
        int[] arr = {30, 17, 20, 1, 5, 10, 15};
        int n = arr.length;

        heapSort(arr, n);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}