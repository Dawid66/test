package pl.kszafran.sda.algo.homework;

import java.util.ArrayList;
import java.util.List;

public class streamList {
    public static void main(String[] args) {
        List<Long> list = new ArrayList<>();
        list.add(4L);
        list.add(6L);
        list.add(8L);
        list.add(5L);
        List<Long> list2 = new ArrayList<>();
        for (Long aLong : list) {
            long l = aLong * 2;
            list2.add(l);
        }
        for (Long aLong : list2) {
            System.out.println(aLong);
        }

    }

}
