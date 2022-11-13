package zad10;

public class ArrayBox<T extends Comparable>{

    private Object[] arr;

    private int ile;

    public ArrayBox(int a){

        this.arr = new Object[a];
        this.ile=0;

    }

    boolean add(T e) {
        boolean k = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==e)
                k=false;
        }

        if (k){
            if (ile==arr.length){
                arr=powieksz(arr);
            }
            arr[ile++]=e;
        }
        return k;
    }

    Object[] powieksz(Object[] arr){

        Object[] tmp = new Object[arr.length+1];

        for (int i = 0; i < arr.length; i++) {
            tmp[i]=arr[i];
        }


        return tmp;
    }

    boolean addAll(T[] array) {

        int x = ile;

        for (int i = 0; i < array.length; i++) {
            add(array[i]);
        }

        return ile > x;
    }

    boolean delete(T e){

        int k=-1;


        for (int i = 0; i < arr.length; i++) {

            if (arr[i]==e)
                k=i;

        }

        if (k>=0){
            arr[k]=null;
            ile--;
            for (int i = k; i < arr.length-1; i++) {
                arr[k]=arr[k+1];
            }


        }

        return  k>=0;
    }

    boolean swap(int x, int y){

        boolean j = false;

        if (!(x > arr.length || y > arr.length || x <0 || y < 0)) {
            Object tmp = arr[x];
            arr[x]=arr[y];
            arr[y]=tmp;
            j=true;
        }

        return j;
    }

    T min(){
        T min = (T)arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min.compareTo((T)arr[i]) > 0)
                min = (T)arr[i];
        }
        return min;
    }

    T max(){
        T max = (T)arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max.compareTo((T)arr[i]) < 0)
                max = (T)arr[i];
        }
        return max;
    }

    int search(T k){
        int p = -1;

        for (int i = 0; i < arr.length; i++) {
            if (k == arr[i])
                p=i;
        }

        return p;
    }

    void print(){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

}
