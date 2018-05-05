package pl.kszafran.sda.algo.exercises.sorting;


public class Quicksort {
    int podzial(int arr[], int left, int right) {
        int i = left;
        int j = right;
        int pivot = arr[0];
        int point = pivot + 1;
        while (arr[i] < pivot) {
            swap(arr[i], point);
            point = point + 1;
            while (pivot < arr[j]) {
                j++;
            }

        }
        while (pivot < arr[j]) {
            j++;
        }


        public void swap (int i, int point){
            int temp = i;
            i = point;
            point = temp;
        }
    }
}

