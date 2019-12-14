package Collections.ArrayList;

import java.util.ArrayList;

public class ArrayListConvertArrayListTo {
    public static void main(String[] args) {
        /*ArrayList declaration and initialization*/
        ArrayList<String> arrlist = new ArrayList<String>();
        arrlist.add("String1");
        arrlist.add("String2");
        arrlist.add("String3");
        arrlist.add("String4");

        /*ArrayList to Array Conversion */
        String array[] = new String[arrlist.size()];
        for (
                int j = 0; j < arrlist.size(); j++) {
            array[j] = arrlist.get(j);
        }

        /*Displaying Array elements*/
        for (
                String k : array) {
            System.out.println(k);
        }

        /*ArrayList declaration and initialization*/
        ArrayList<String> friendsnames = new ArrayList<String>();
        friendsnames.add("Ankur");
        friendsnames.add("Ajeet");
        friendsnames.add("Harsh");
        friendsnames.add("John");

        /*ArrayList to Array Conversion */
        String frnames[] = friendsnames.toArray(new String[friendsnames.size()]);

        /*Displaying Array elements*/
        for ( String k : frnames) {
            System.out.println(k);
        }
    }
}
