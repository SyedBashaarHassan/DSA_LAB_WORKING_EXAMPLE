/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubblesort;

/**
 *
 * @author dsu-39
 */
public class Bubblesort {
     void bubbleSort(int arr[])
    {
        int n = arr.length;
      
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                  
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    
    public static void main(String[] args) {
        
        Bubblesort bs = new Bubblesort();
        int a[] = { 12, 9, 11, 10, 5 };
      
        bs.bubbleSort(a);
      
          int n = a.length;
      
        for (int i = 0; i < n; ++i)
            System.out.print(a[i] + " ");
        System.out.println();
    
       
    }
    
}
