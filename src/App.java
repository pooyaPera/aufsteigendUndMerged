

public class App {
    public static void main(String[] args) throws Exception {
        int [] a = {1,3,2};
        int [] b = {2,4,6,8,10,12};
       
        int n1 = a.length;
     
        
        int n2 = b.length;
     
        int[] arr3 = new int[n1+n2];
         
        mergeArrays(a, b, n1, n2, arr3);
     


    }
    public static void mergeArrays(int[] a, int[] b, int n1,
                                int n2, int[] arr3)
    {
        int i = 0, j = 0, k = 0;
     
       if (istSortiert(a) && istSortiert(b)) {
        while (i<n1 && j <n2)
        {
            // Check if current element of first
            // array is smaller than current element
            // of second array. If yes, store first
            // array element and increment first array
            // index. Otherwise do same with second array
            if (a[i] < b[j])
                arr3[k++] = a[i++];
            else
                arr3[k++] = b[j++];
        }
     
        // Store remaining elements of first array
        while (i < n1)
            arr3[k++] = a[i++];
     
        // Store remaining elements of second array
        while (j < n2)
            arr3[k++] = b[j++];

        
            System.out.println("Array after merging");
            for (int l=0; l < n1+n2; l++)
                System.out.print(arr3[l] + " ");
    
    
    }else{
        System.out.println("Array ist nicht Sortiert");
    }
}

    public static boolean istSortiert(int[] a)//prüft ob ein Array aufsteigend sortiert ist
    {
        for (int i = 0; i < a.length - 1; i++)
        {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
 
        return true;
    }

    
}    
