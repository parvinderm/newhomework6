package homework6;

public class Replace_2 {

    public static void main(String[] args) {

        String name = "I@ love@ java";


        name=name.replaceAll("[@]","");
        name=name.replaceAll("I","We");
        System.out.println(name);
    }
}
