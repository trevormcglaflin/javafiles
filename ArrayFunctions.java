// Trevor McGlaflin 
// April 16, 2020
// CS 110
// Assignment 10: ArrayFunctions class

// import necessary classes
import java.util.Scanner;
import java.io.*;

/**
   ArrayFunctions class provides methods related to String
   Arrays. These include reading and writing to files, sorting
   alphatebically, and searching for values.
*/
public class ArrayFunctions
{
   /**
      readArray reads names from a file and adds them
      to an array based on the desired amount of names.
      If it runs out of names it stops adding them. It returns the
      number of names in the array. If an exception occurs
      it returns 0.
      @ param String filename the filename of the input file
      @ param String [] an empty array that will have names added to it
      @ return number of elements in array after reading
   */
   public static int readArray(String filename, String[] s)
   {
      int size;
      try
      {
        size = s.length;
      }
      catch (NullPointerException e)
      {
         return 0;
      }
        
      try
      {
         File file = new File(filename);
      
         Scanner input = new Scanner(file);
         int count = 0; 
         while (input.hasNext() && count < s.length)
         {
            s[count] = input.nextLine();
            count ++;
         }
         input.close();
         return count;
       }
       catch (FileNotFoundException e)
       {
         return 0;
       }
   }
   
   
   /**
      writeArray takes a string representing a filename
      and an array of Strings with names, and writes those
      names to the file with a preceding number list. If it 
      works it returns true, if not false.
      @ param String the name of the new file to be written to
      @ param String[] the list of names which are Strings
      @ return true or false if no exceptions occur
   */
   public static boolean writeArray(String filename, String[] names)
   {
      
      try
      {
         PrintWriter outFile = new PrintWriter(filename);
         int count = 1;
         for (String name : names)
         {
            outFile.println(count + ": " + name);
            count ++;
         }
         outFile.close();
         return true;
       }
       catch (NullPointerException e)
       {
         return false;
       }
       catch (IOException e)
       {
         return false;
       }
       
    }
    
    /**
      The selectionSort method performs a selection sort on an
      String array. The array is sorted in alphabestic order.
      @param String[] the array to sort.
      @param int number of elelements in the array
   */
   public static void selectionSort(String[] array, int n)
   {
      int startScan, index, minIndex;
      String minValue;

      for (startScan = 0; startScan < (n); startScan++)
      {
         minIndex = startScan;
         minValue = array[startScan];
         for(index = startScan + 1; index < n; index++)
         {
            if (array[index].compareTo(minValue) < 0)
            {
               minValue = array[index];
               minIndex = index;
            }
         }
         array[minIndex] = array[startScan];
         array[startScan] = minValue;
      }
   }
   
   /**
      binarySearch is a recursive version of the 
      traditional binarySearch method. It searches
      a String array for a particular value and returns
      the index of the value. If value is not found, it
      returns -1.
      @param String[] an array of sorted names
      @param int starting position of array to sort (0)
      @param int the length of the array
      @param String the name that you are searching for
      @return the index of the value you are searching
   */
   public static int binarySearch(String[] array, int first, int last, String value)
   {
       int middle;
       if (first > last)
         return -1;
       middle = (first + last) / 2;
       if (array[middle].equals(value))
         return middle;
       else if (array[middle].compareTo(value) < 0)
         return binarySearch(array,middle + 1,last,value);
       else 
         return binarySearch(array,first,middle-1,value);
    }
}

      
      