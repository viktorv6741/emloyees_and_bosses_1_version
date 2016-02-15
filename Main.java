package e_and_b;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Empl[] additionalBosses = new Empl[2];
        additionalBosses[0] = new Empl("Boss_1");
        additionalBosses[1] = new Empl("Boss_2");

        String bosses = Arrays.toString(additionalBosses);

        //System.out.println(bosses);

        Empl boss = new Empl("Boss");
        Empl emp3 = new Empl("Emp_3", boss, bosses);
        Empl emp2 = new Empl("Emp_2", emp3, bosses);
        Empl emp1 = new Empl("Emp_1", emp2, bosses);

        Empl[] emplArray = new Empl[5];

        getEmp(emplArray, 0, emp1);

        System.out.println(Arrays.toString(emplArray));

    }

    public static void getEmp(Empl[] array, int currentPos, Empl empl) {
        array[currentPos] = empl;
        if (empl.getBoss() != null) getEmp(array, ++currentPos, empl.getBoss());
    }
}
