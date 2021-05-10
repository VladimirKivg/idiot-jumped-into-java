public class Ded {
    private int i;
    private String name;

    public Ded(int i, String name) {
        this.i = i;
        this.name = name;
    }

    public Ded() {
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ded{" +
                "i=" + i +
                ", name='" + name + '\'' +
                '}';
    }
}
