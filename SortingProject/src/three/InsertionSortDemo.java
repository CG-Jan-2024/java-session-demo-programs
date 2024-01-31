package three;

public class InsertionSortDemo {

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 }; 
        // 1.
        // 20,35,-15,7,55,1,-22   --- newElement = 35
        
        // 2.
        // 20,35,35,7,55,1,-22    --- newElement =-15
        // 20,20,35,7,55,1,-22
        // -15,20,35,7,55,1,-22
        
        //3.
        // -15,20,35,7,55,1,-22   ----- newElement = 7 
        // -15,20,35,35,55,1,-22
        // -15,20,20,35,55,1,-22
        // -15,7,20,35,55,1,-22
        
        //4.
        // -15,7,20,35,55,1,-22 ------ newElement = 55
        
        
        //5.
        // -15,7,20,35,55,1,-22 --- newElement = 1
        // -15,7,20,35,55,55,-22
        // -15,7,20,35,35,55,-22
        // -15,7,20,20,35,55,-22
        // -15,7,7,20,35,55,-22
        // -15,1,7,20,35,55,-22
        
        //6.
        // -15,1,7,20,35,55,-22 --- newElement = -22
        // -22,-15,1,7,20,35,55
        
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length;firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];
            int i;

            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }   
}

