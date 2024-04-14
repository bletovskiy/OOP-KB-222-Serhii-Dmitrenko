public class Task10 {
    public static void main(String[] args) {
        int[] array = {5,3,2,7,9,1};
        int maxValue = max(array);
        System.out.println(maxValue);
    }
    public static int max(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }   
        }
        return max;
    }
}
