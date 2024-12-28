import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
//        int[] newArray = new int[5];
//        int[] newArray = new int[] {5,4,3,2,1};

//        for(int i = 0; i < newArray.length; i++) {
//            System.out.print(newArray[i] + " ");
//        }

//        System.out.println();
//
//        for(int element : newArray) {
//            System.out.print(element + " ");
//        }
//
//        System.out.println();
//        System.out.println(Arrays.toString(newArray));

        String[] sArray = { "Able", "Jane", "Abc", "Abcd", "Aaa"};
        Arrays.sort(sArray);
        System.out.print(Arrays.toString(sArray));
    }
}
