class Main {
    static int insertEnd(int arr[], int n, int key, int capacity) {
        if (n >= capacity) {
            return n; // Return current size if capacity is reached
        }
        arr[n] = key; // Insert the key at the end
        return (n + 1); // Return new size
    }

    public static void main(String[] args) { 
        int[] arr = new int[20];
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;
        int n = 6; 
        int i, key = 26;
        int capacity = arr.length; // Define capacity

        System.out.println("Before Insertion:");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");  
        }
        
        n = insertEnd(arr, n, key, capacity);
        
        System.out.print("\nAfter Insertion: ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");  
        }
    }
}