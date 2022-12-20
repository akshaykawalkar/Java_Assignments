import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Array_Practice {
    public static void main(String[] args) {
        System.out.println("Start");
        Array_Practice array = new Array_Practice();
        System.out.println("Question 1......");
        array.question1();
        System.out.println("Question 2......");
        array.question2();
        System.out.println("Question 3......");
        array.question3();
        System.out.println("Question 4......");
        array.question4();
        System.out.println("Question 5......");
        array.question5();
        System.out.println("Question 6......");
        array.question6();
        System.out.println("Stop");
    }

    void question1() {
        int[] array1 = new int[5];
        for (int array_value1 : array1) {
            System.out.println(array_value1);
        }
    }

    void question2() {
        int[] array2 = {9111, 20, 23, 44, 65, 86, 897, 998, 889};
        Arrays.sort(array2);
        //ascending
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        //descending
        Integer[] array3 = {23, -9, 78, 102, 4, 0, -1, 11, 6, 110, 205};
        Arrays.sort(array3, Collections.reverseOrder());
        System.out.println(Arrays.toString(array3));
    }

    void question3() {
        String[] names = {"Ak", "Rk", "PK", "NK"};
        String[] names1 = names.clone();
        System.out.println(names1[0]);
    }

    void question4() {
        String[] names = {"Ak", "Rk", "PK", "NK", "Ak", "Rk", "PK"};
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++)
                if (names[i].equals(names[j]))
                {
                    System.out.println(names[i]);
                }
        }
    }
    void question5()
    {
        int[][][] a={{{1,2,3},{2,2},{3,3,3,3},{4,4,4,4,4,4}},{{1,2,3},{2,2},{3,3,3,3},{4,4,4,4,4,4}}};

        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++)
            {
                for (int k=0;k<a[i][j].length;k++)
                {
                    System.out.print(a[i][j][k]+ " ");}
                System.out.println();
            }
            System.out.println();
        }
    }
    void question6()
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter array index");
        int indexId= scanner.nextInt();
        int[] marks={22,33,44,55,66,77,88};
        System.out.println(marks[indexId]);

    }
}