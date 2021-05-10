import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ded> list = new ArrayList();
        int x = 0;
        int z = 0;
        Ded ded = new Ded();
        String ss = "Ġ";
        while (x <= 1200000) {
            x++;
            char a = (char) x;
            System.out.print(a + " ");
            String s = String.valueOf(a);
            if (s.equals(ss)) {
                System.out.println(x + " = " + a);
                ded.setI(x);
                ded.setName(s);
                list.add(ded);
            }
        }
        System.out.println(list.size() + "__________________________________________");
        for (Ded ded1 : list) {

            System.out.println(ded1.getI() + " = " + ded1.getName());// для меня пока загадка , почему выводиться только паследние цыфры
        }

        System.out.println(ss.codePointAt(0) + "____________");//виводить позицыю в юныкоды схоже що є два однаковіх занака і юнікоді
        int[] in = {1, 3};//продолжить эту тему
        //  String as= 22,5;
        System.out.println(ss.indexOf(288));
        System.out.println("___________________________________________");
        Time time = new Time();
        time.timeExperiment();
        System.out.println("____________________________________________");

        StringBuilder sb = new StringBuilder("sss");
        sb.append("SSS").insert(1, "vov").insert(3, "ttt");
        System.out.println(sb);

    }
}



