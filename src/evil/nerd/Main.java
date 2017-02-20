package evil.nerd;

public class Main {

    public static void main(String[] args) {
        String[] food = {"one","two","three","four","five"};
        for (String s : food)
            System.out.println(s);

        System.out.println();

        for (String s : food){
            if(s.startsWith("t"))
            System.out.println(s + " starts with 't'");
        }

        System.out.println();

        for (String s : food){
            if(s.endsWith("e"))
                System.out.println(s + " ends with 'e'");
        }

    }
}
