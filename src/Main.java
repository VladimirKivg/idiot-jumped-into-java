public class Main {
    public static void main(String[] args) {
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
                z = x;
            }
        }

        System.out.println();
        System.out.println(z + " = " + ss);

    }
}
