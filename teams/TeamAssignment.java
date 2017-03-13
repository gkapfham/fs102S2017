import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class TeamAssignment
{
    static final Map<Integer, String> STUDENTS = new HashMap<Integer, String>() {{
        put(1, "Alcantara");
        put(2, "Andrews");
        put(3, "Burrows");
        put(4, "Campanella");
        put(5, "Cerda Mejia");
        put(6, "Compton");
        put(7, "Cook");
        put(8, "Geer");
        put(9, "Hornberger");
        put(10, "Lachat");
        put(11, "Liu");
        put(12, "Luoma");
        put(13, "Mendez");
        put(14, "Murphy");
        put(15, "Myers");
        put(16, "Nadel");
        put(17, "Redman");
        put(18, "Spitalny");
        put(19, "Van Slyke");
        put(20, "Zoll");
    }};

    public static void main(String[] args) {

        ArrayList<Integer> students = new ArrayList<Integer>();

        // populate the arraylist with the integers
        for(int i = 1; i <= 20; i++) {
            Integer I = new Integer(i);
            students.add(I);
        }

        // pick the ordering for the talks today
        ArrayList<Integer> studentsTodaysOrdering = (ArrayList<Integer>)students.clone();
        Collections.shuffle(studentsTodaysOrdering);
        System.out.println("Today's random ordering of the students: "); // + studentsTodaysOrdering);
        System.out.println();

        for(Integer studentToday : studentsTodaysOrdering) {

            System.out.println(STUDENTS.get(studentToday));

        }

    }

}
