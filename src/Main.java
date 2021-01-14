import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer>list =new ArrayList();
        int x = 0;
        int z = 0;
        String ss = "!";
        while (x <= 120000) {
            x++;
            char a = (char) x;
            System.out.print(a + " ");
            String s = String.valueOf(a);
            if (s.equals(ss)) {
                System.out.println(x+" = "+a);
                list.add(x);
            }
        }
        System.out.println();
for (int i:list){

        System.out.println(i + " = " + ss);}
        System.out.println(ss.codePointAt(0));// схоже що є два однаковіх занака і юнікоді

    }
}
