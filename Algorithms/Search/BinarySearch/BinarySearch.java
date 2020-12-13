public class BinarySearch{
    public static String binarySearch(int[] data, int find){
        int middleIndex = 0;
        int startIndex = 0;
        int endIndex = data.length - 1;
        middleIndex = (endIndex + startIndex)/2;
        while (data[middleIndex] != find){
            if (middleIndex == 0){
                return("invalid");
            }
            else if(find < data[middleIndex]){
                endIndex = middleIndex - 1;
            }
            else if(find > data[middleIndex]){
                startIndex = middleIndex + 1;
            }
            middleIndex = (endIndex + startIndex)/2;
        }
        return Integer.toString(middleIndex+1);
    }

    public static void main(String[] args) {
        int[] list = {2,4,6,8,10,12,14,16,18,20};
        System.out.println("Position: " + binarySearch(list, 20));
    }
}