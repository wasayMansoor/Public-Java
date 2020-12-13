public class BinarySearch{
    public static String binarySearch(int[] data, int find) {
        return binarySearch(data, find, 0, data.length - 1);
    }
    public static String binarySearch(int[] data, int find, int startIndex, int endIndex) {
        if (endIndex < startIndex) {                                            
            return "Invalid";                                                  
        }

        int middleIndex = (startIndex + endIndex) / 2;                         

        if (find == data[middleIndex]) {                                  
            return Integer.toString(middleIndex+1);                                                        
        } else if (find < data[middleIndex]) {                               
            return binarySearch(data, find, startIndex, middleIndex - 1);        
        } else {
            return binarySearch(data, find, middleIndex + 1, endIndex);
        }
    }


    public static void main(String[] args) {
        int[] data = {2,4,6,8,10,12,14,16,18,20};
        System.out.println("Position: " + binarySearch(data, 20));
    }
}