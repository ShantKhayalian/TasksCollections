package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student(12L));
        arrayList.add(new Student(13L));
        arrayList.add(new Student(14L));
        arrayList.add(new Student(15L));

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i).getId());
        }

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
