package pl.kszafran.sda.algo.exercises.sorting;

public class SelectionSort implements IntSortingAlgorithm {

    @Override
    public void sort(int[] array) {
        for(int i = 0; i< array.length ; i++){
            int index =i;
            for (int j=i+1; j<array.length; j++){
                if (array[j] < array[i]){
                 index = j;
                }
                swap(array[i], index);
            }
        }
    }
    void swap(int x,int y)
    {
          int z=x;
        x=y;
          y=z;

    }
}
