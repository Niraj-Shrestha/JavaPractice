package DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayListVsVector {
    static int StartTime;
    static int EndTime;
    public static void main(String[] args) throws InterruptedException {
        int n = 1000000;

        ArrayList(n);
        Vector(n);
        ArrayListWithThreads(n);
        VectorWithThreads(n);
    }

    static void ArrayList(int n){
        List<Integer> list = new ArrayList();
        StartTime = (int) System.currentTimeMillis();
        for(int i=0; i<n;i++){
            list.add(i);
        }
        EndTime = (int) System.currentTimeMillis();
        System.out.println(EndTime-StartTime + " ms");
    }

    static void Vector(int n){
        List<Integer> vector = new Vector<>();
        StartTime = (int) System.currentTimeMillis();
        for(int i=0;i<n;i++){
            vector.add(i);
        }
        EndTime = (int) System.currentTimeMillis();
        System.out.println(EndTime-StartTime + " ms");
    }

    static void ArrayListWithThreads(int n) throws InterruptedException {
        List<Integer> list = new ArrayList();
        StartTime = (int) System.currentTimeMillis();
        Thread t1 = new Thread(() -> {
            for(int i=0; i<n;i++){
                list.add(i);
            }
        });
        t1.start();
        Thread t2 = new Thread(() -> {
            for(int i=0; i<n;i++){
                list.add(i);
            }
        });
        t2.start();
        t1.join();
        t2.join();
        EndTime = (int) System.currentTimeMillis();
        System.out.println(EndTime-StartTime + " ms " + list.size());
    }

    static void VectorWithThreads(int n) throws InterruptedException {
        List<Integer> vector = new Vector<>();
        StartTime = (int) System.currentTimeMillis();
        Thread t1 = new Thread(() -> {
            for(int i=0; i<n;i++){
                vector.add(i);
            }
        });
        t1.start();
        Thread t2 = new Thread(() -> {
            for(int i=0; i<n;i++){
                vector.add(i);
            }
        });
        t2.start();
        t1.join();
        t2.join();
        EndTime = (int) System.currentTimeMillis();
        System.out.println(EndTime-StartTime + " ms and " + vector.size());
    }
}
