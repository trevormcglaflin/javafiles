public class InClassSortingAndSearching
{
   public static void main(String [] args)
   {
    int [] array1 = {4,7,15,22,35,52,65,70};
    
    System.out.println(binarySearch(array1, 7));
    System.out.println(binarySearch(array1, 65));
    System.out.println(binarySearch(array1, 3));
    System.out.println(binarySearch(array1, 68));
    
   int [] array2 = {26,55,94,18,78,30,46,56,25};
   displayArray(array2);
   selectionSort(array2);
   displayArray(array2);
   
   }
   /** The displayArray method, will display a full array
       @param arr the array of ints to display on one line
   */
   public static void displayArray( int [] arr)
   {
      for (int val : arr)
         System.out.print(val + " ");
      System.out.println();
   
   }

   /**
      The sequentialSearch method performs a linear search on an
      integer array. The array is searched for the number passed
      to value. If the number is found, its array subscript is
      returned. Otherwise, -1 is returned indicating the value was
      not found in the array.
      @param array The array to search.
      @param value The value to search for.
      @return the index of the value if found, -1 otherwise
   */

   public static int sequentialSearch(int[] array, int value)
   {
      int index;        // Loop control variable
      int element;      // Element the value is found at
      boolean found;    // Flag indicating search results
 
      // Element 0 is the starting point of the search.
      index = 0;
 
      // Store the default values element and found.
      element = -1;
      found = false;
 
      // Search the array.
      while (!found && index < array.length)
      {
         if (array[index] == value)
         {
            found = true;
            element = index;
         }
         index++;
      }
      return element;
   }
   /**
      The binarySearch method performs a binary search on an
      integer array. The array is searched for the number passed
      to value. If the number is found, its array subscript is
      returned. Otherwise, -1 is returned indicating the value was
      not found in the array.
      @param array The array to search.
      @param value The value to search for.
      @return the index of the value if found, -1 otherwise

   */

   public static int binarySearch(int[] array, int value)
   {
      int first;       // First array element
      int last;        // Last array element
      int middle;      // Midpoint of search
      int position;    // Position of search value
      boolean found;   // Flag

      // Set the inital values.
      first = 0;
      last = array.length - 1;
      position = -1;
      found = false;

      // Search for the value.
      while (!found && first <= last)
      {
         // Calculate midpoint
         middle = (first + last) / 2;
         
         // If value is found at midpoint...
         if (array[middle] == value)
         {
            found = true;
            position = middle;
         }
         // else if value is in lower half...
         else if (array[middle] > value)
            last = middle - 1;
         // else if value is in upper half....
         else
            first = middle + 1;
      }

      // Return the position of the item, or -1
      // if it was not found.
      System.out.print(first);
      return position;
   }
   /**
      The selectionSort method performs a selection sort on an
      int array. The array is sorted in ascending order.
      @param array The array to sort.
   */
   public static void selectionSort(int[] array)
   {
      int startScan, index, minIndex, minValue;

      for (startScan = 0; startScan < (array.length-1); startScan++)
      {
         minIndex = startScan;
         minValue = array[startScan];
         for(index = startScan + 1; index < array.length; index++)
         {
            if (array[index] < minValue)
            {
               minValue = array[index];
               minIndex = index;
            }
         }
         array[minIndex] = array[startScan];
         array[startScan] = minValue;
      }
   }

}
