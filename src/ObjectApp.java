import java.util.Objects;

public class ObjectApp {

    public static class Data {

        private String name;

        public Data() {

        }

        public Data(String name){
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null || getClass() != object.getClass()) return false;
            Data data = (Data) object;
            return Objects.equals(name, data.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return "Data{" +
                    "name='" + name + '\'' +
                    '}';
        }

    }
    public static void main(String[] args) {
        Data data1 = new Data("Dyaksa");
        Data data2 = new Data("");

        System.out.println(data1.equals(data2));
        execute(data1);
    }

    public static void execute(Data data) {
        System.out.println("toString() : " + data.toString());
        System.out.println("hashCode() : " + data.hashCode());
    }
}
