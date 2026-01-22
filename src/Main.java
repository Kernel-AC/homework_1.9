import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println("Объявлено три массива.");
        int[] box = new int[]{1, 2, 3};
        float[] box2 = {1.57f, 7.654f, 9.986f};
        int[] box3 = new int[5];
        box3[0] = 1;
        box3[1] = 2;
        box3[2] = 3;
        box3[3] = 4;
        box3[4] = 5;
        System.out.println("Задание 2");
        for (int a = 0; a < box.length; a++) {
            if (a == box.length - 1) {
                System.out.print(box[a]);
                break;
            }
            System.out.print(box[a] + ", ");
        }
        System.out.println();
        for (int b = 0; b < box2.length; b++) {
            if (b == box2.length - 1) {
                System.out.print(box2[b]);
                break;
            }
            System.out.print(box2[b] + ", ");
        }
        System.out.println();
        for (int c = 0; c < box3.length; c++) {
            if (c == box3.length - 1) {
                System.out.print(box3[c]);
                break;
            }
            System.out.print(box3[c] + ", ");
        }
        System.out.println();
        System.out.println("Задание 3");
        for (int i = box.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(box[i]);
                break;
            }
            System.out.print(box[i] + ", ");
        }
        System.out.println();
        for (int r = box2.length - 1; r >= 0; r--) {
            if (r == 0) {
                System.out.print(box2[r]);
                break;
            }
            System.out.print(box2[r] + ", ");
        }
        System.out.println();
        for (int k = box3.length - 1; k >= 0; k--) {
            if (k == 0) {
                System.out.print(box3[k]);
                break;
            }
            System.out.print(box3[k] + ", ");
        }
        System.out.println();
        System.out.println("Задание 4");
        for (int f = 0; f < box.length; f++) {
            if (box[f]%2!=0){
                box[f]+=1;
            }
        }
        System.out.println(Arrays.toString(box));
    }
}