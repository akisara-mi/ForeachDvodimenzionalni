public class Main {
    public static void main(String[] args) {


        int[][] array1 = {{1, 2, 3}, {4, 5, 6}};

        for (int[] outerArray : array1) {

            for (int innerArray : outerArray)

                System.out.print(innerArray + " ");
            System.out.println();
        }


    }


}
