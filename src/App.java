

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
     
       if (istSortiert(a) && istSortiert(b)) {//prüft ob Arrays aufsteigend sortiert sind
        while (i<n1 && j <n2)
        {
            /*
            prüft ob das aktuelle Elemnt von das erste Array kleiner ist als das aktulle Element von
            des zweiten Element das zweite Array.
            Wenn ja, zuerst speichern und das Arrays index um eins inkrementieren.
            Ansonsten mache dasselbe mit dem zwieten Array 
        
            */
            if (a[i] < b[j])
                arr3[k++] = a[i++];
            else
                arr3[k++] = b[j++];
        }
     
        // Restliche Elemente des ersten Array in Merge Array speichern
        while (i < n1)
            arr3[k++] = a[i++];
     
        // Restliche Elemente des zweiten Array in Merge Array speichern
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
