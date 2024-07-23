
import java.util.Arrays;

/*
 * 
   /$$$$$$                                                  
  /$$__  $$                                                 
 | $$  \ $$  /$$$$$$   /$$$$$$  /$$$$$$  /$$   /$$  /$$$$$$$
 | $$$$$$$$ /$$__  $$ /$$__  $$|____  $$| $$  | $$ /$$_____/
 | $$__  $$| $$  \__/| $$  \__/ /$$$$$$$| $$  | $$|  $$$$$$ 
 | $$  | $$| $$      | $$      /$$__  $$| $$  | $$ \____  $$
 | $$  | $$| $$      | $$     |  $$$$$$$|  $$$$$$$ /$$$$$$$/
 |__/  |__/|__/      |__/      \_______/ \____  $$|_______/ 
                                         /$$  | $$|          
                                        | $$$$$$$$/          
                                         \_______/ 
*/
/*
 * 
 
 - EXPLANATIONS:
 - An array is a data structure that stores a collection of elements of the same data type in a contiguous block of memory. 
 It provides a way to store and access a group of related values using a single variable name.
 
 - Each element in an array is identified by an index, which represents its position in the array. 
 The index starts at 0 for the first element, and increases by 1 for each subsequent element. 
 This means that if an array has n elements, the indices range from 0 to n-1.
 
 - Arrays can be used to store and manipulate different types of data, such as numbers, characters, strings, and objects. 
 They are commonly used in programming for a variety of tasks, such as sorting, searching, and processing large amounts of data.
 
 - MOST COMMONLY USED BUILT-IN FUNCTIONS:
 
 - array.append(x) - This function is used to add an element x to the end of the array.
 - array.extend(iterable) - This function is used to add the elements of an iterable (such as a list or tuple) to the end of the array.
 - array.insert(i, x) - This function is used to insert an element x at a specific index i in the array.
 - array.remove(x) - This function is used to remove the first occurrence of element x from the array.
 - array.pop(i) - This function is used to remove and return the element at a specific index i in the array. If no index is specified, the last element of the array is removed and returned.
 - array.index(x) - This function is used to find the first occurrence of element x in the array and return its index.
 - array.count(x) - This function is used to count the number of occurrences of element x in the array.
 - array.sort() - This function is used to sort the elements of the array in ascending order.
 - array.reverse() - This function is used to reverse the order of the elements in the array.
 - len(array) - This function is used to return the number of elements in the array.
 
 - TIME AND SPACE COMPLEXITY:
 
 - array.append(x) - Time complexity: O(1), Space complexity: O(1)
 - array.extend(iterable) - Time complexity: O(k), where k is the length of the iterable being added, Space complexity: O(k)
 - array.insert(i, x) - Time complexity: O(n), where n is the number of elements in the array, Space complexity: O(1)
 - array.remove(x) - Time complexity: O(n), where n is the number of elements in the array, Space complexity: O(1)
 - array.pop(i) - Time complexity: O(n), where n is the number of elements in the array, Space complexity: O(1)
 - array.index(x) - Time complexity: O(n), where n is the number of elements in the array, Space complexity: O(1)
    - array.count(x) - Time complexity: O(n), where n is the number of elements in the array, Space complexity: O(1)
    - array.sort() - Time complexity: O(n log n), where n is the number of elements in the array, Space complexity: O(1)
    - array.reverse() - Time complexity: O(n), where n is the number of elements in the array, Space complexity: O(1)
    - len(array) - Time complexity: O(1), Space complexity: O(1)

*/

public class Array{
    public static void main(String[] args) {
        
        // One Dimensional Array
        int[] array1D = {10,22,13,24,1};

        // Two Dimensional Array
        int[][] array2D = {{1, 20, 32, 4},
                           {5, 6, 70, 81},
                           {9, 10, 7, 12},
                           {3, 14, 5, 16}};

        // Two Dimensional (n x n) Array
        int[][] arraynD = {{1,2,3},{4,5,6},{7,8,9}};

        // initialize new array
        int[] newArray = new int[3]; //length = 3 {0,1,2} indexing


        //Print all the elements of an 1D Array using for each loop
        for(int i:array1D){
            System.out.println(i);
        }
        
        System.out.println();
        
        //Print all the elements of an 2D Array using for each loop
        for(int[] i:array2D){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //Array before sorting
        System.out.println(Arrays.toString(array1D));
        //To sort an array
        Arrays.sort(array1D);
        //Array after sorting
        System.out.println(Arrays.toString(array1D));

    }
} 
