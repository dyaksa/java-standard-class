public class StringClasses {
    public static void main(String[] args) {
        String name = "Dyaksa Jauharuddin Nour";

        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println(name.indexOf("Jauharuddin"));

        String[] values = name.split(" ");
        for (String value : values) {
            System.out.println(value);
        }

        char[] chars = name.toCharArray();
        for (char aChar : chars) {
            System.out.println(aChar);
        }

        System.out.println(name.startsWith("Dyaksa"));
        System.out.println(name.endsWith("Nour"));
    }
}
