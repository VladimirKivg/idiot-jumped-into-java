import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Ded>list =new ArrayList();
        int x = 0;
        int z = 0;
        String ss = "Ġ";
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
int[]in={1,3};//продолжить эту тему
      //  String as= 22,5;
        System.out.println(ss.indexOf(288));

    }
}
