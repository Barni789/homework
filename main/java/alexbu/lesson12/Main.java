package alexbu.lesson12;

import java.util.Arrays;

public class Main {
    static final int size = 10000000;
    static final int half = size / 2;
    public static void main(String[] args) {

        timeOneArray(newArray());
        timeTwoArray(newArray());

    }
    private static float[] newArray () {
        float[] arr = new float[size];
        Arrays.fill(arr, 1);
        return arr;
    }


    private static void timeOneArray(float[] arr) {
        //System.out.println(Arrays.toString(arr));
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println("Время заполнения первого массива : " + (System.currentTimeMillis() - a));
    }


    private static void timeTwoArray(float[] arr) {
        float[] arrOne = new float[half];
        float[] arrTwo = new float[half];
        long b = System.currentTimeMillis();
        System.arraycopy(arr, 0, arrOne, 0, half);
        System.arraycopy(arr, half, arrTwo, 0, half);
      //  System.out.println(Arrays.toString(arrOne));
      //  System.out.println(Arrays.toString(arrTwo));
        Thread timeOne = new Thread(() -> {
            for (int i = 0; i < arrOne.length; i++) {
                arrOne[i] = (float)(arrOne[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });
        timeOne.start();

        Thread timeTwo = new Thread(() -> {
            for (int i = 0; i < arrTwo.length; i++) {
                arrTwo[i] = (float) (arrTwo[i] * Math.sin(0.2f + (i+half) / 5) * Math.cos(0.2f + (i+half) / 5) * Math.cos(0.4f + (i+half) / 2));
            }
        });
        timeTwo.start();

        try {
            timeOne.join();
            timeTwo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(arrOne, 0, arr, 0, half);
        System.arraycopy(arrTwo, 0, arr, half, half);
        //System.out.println(Arrays.toString(arr));
        System.out.println("Время заполнения второго массива : " + (System.currentTimeMillis() - b));
    }
}