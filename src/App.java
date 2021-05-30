/*
Änderungen:
1- MegreArray Methode ist jetet eine separate Methode
2- Merge verfahren ist zu der Bemerkung angepasst

Grüße

Pouya Yasavand
*/

public class App {
    public static void main(String[] args) throws Exception {
        
        int [] x = {1,3,5};
        int [] y = {2,4,6,8,10,12};

     
        mergeArrays(x,y);
    
    }
    
    
    
    
    public static void mergeArrays(int[] a, int[] b)

    {

        int n1 = a.length;
        int n2 = b.length;
        int [] merge = new int [n1+n2];
        int i = 0, j = 0, k = 0;
     
       if (istSortiert(a) && istSortiert(b)) {//prüft ob Arrays aufsteigend sortiert sind.
        while (i<n1 && j <n2)
        {
            /*
            prüft ob das aktuelle Elemnt von das erste Array kleiner ist als das aktulle Element von
            des zweiten Element das zweite Array.
            Wenn ja, zuerst speichern und das Arrays index um eins inkrementieren.
            Ansonsten mache dasselbe mit dem zwieten Array 
        
            */
            if (a[i] < b[j])
                merge[k++] = a[i++];
            else
                merge[k++] = b[j++];
        }
     
        // Restliche Elemente des ersten Array in Merge Array speichern
        while (i < n1)
            merge[k++] = a[i++];
     
        // Restliche Elemente des zweiten Array in Merge Array speichern
        while (j < n2)
            merge[k++] = b[j++];

        
            System.out.println("Array nach dem Zusammenfügen");// gibt das merge Array aus 
            for (int l=0; l < n1+n2; l++)
                System.out.print(merge[l] + " ");
    
    
    }else{
        System.out.println("Array ist nicht Sortiert");//falls die Arrays nicht sortiert sind
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
