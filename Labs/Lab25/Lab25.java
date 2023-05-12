// import javax.lang.model.util.ElementScanner14;

// public class Lab25 {
//     public static void main(String[] args) {
    
//         int [] list = new int[99999];
        
//         for (int i = 0; i< list.length; i++ ){
//             list[i] = i;
//         }
//         long startTime = System.nanoTime();
//         int n = linearSearch(list, 5000);
//         long endTime = System.nanoTime();
//         long executionTime = endTime - startTime;
//         System.out.println(" the execution time for linear search: " + executionTime * Math.pow(10, -6));

//         startTime = System.nanoTime();
//         n = binarySearch(list, 5000);
//         endTime = System.nanoTime();
//         executionTime = endTime - startTime;
//         System.out.println(" the execution time for binary search: " + executionTime * Math.pow(10, -6));


//     }

//     public static int linearSearch(int [] array, int key){
//         for (int i =0; i <array.length; i++){
//             if (key == array[i]);
//             return i;
//         }
//         return -1;
//     }

//     public static int binarySearch(int[] list, int key){
//         int low = 0;
//         int high = list.length-1;

//         while (low<=high){
//             int mid = (low + high) / 2;

//             if (key == list[mid]){
//                 return mid;
//             }

//             else if (key < list[mid]){
//                 high = mid -1;
//             }

//             else
//             low = mid +1;
//         }
//         return -1;
//     }
// }
