class Main {
    // Function to implement search operation
    static int findElement(int arr[], int n, int key) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                return i; // Return the index if the key is found
            }
        }
        // If the key is not found
        return -1;
    }
}

public class DSA_Lab {
    // Driver's Code
    public static void main(String[] args) { 
        int arr[] = {12, 34, 10, 6, 40};
        int n = arr.length; 
        int key = 40;
        int position = Main.findElement(arr, n, key); // Calling the method from Main class

        if (position == -1) {
            System.out.println("Element not found"); 
        } else {
            System.out.println("Element Found at Position: " + (position + 1)); 
        }
    }
}
