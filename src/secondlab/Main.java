package secondlab;

/**
 * Created by Valentina on 13.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Person manHarry = new Person(true, "Harry");
        Person womanMary = new Person(false, "Mary");
        Person womanAnna = new Person(false, "Anna");
        Person manDavid = new Person(true, "David");

        if (manHarry.marry(null)) {
            System.out.println("TRUE: manHarry.marry(null)");
        }else System.out.println("ERROR: manHarry.marry(null)");

        if (manHarry.marry(manDavid)) {
            System.out.println("TRUE: manHarry.marry(manDavid)");
        }else System.out.println("ERROR: manHarry.marry(manDavid)");

        if (manHarry.marry(womanMary)) {
            System.out.println("TRUE: manHarry.marry(womanMary)");
        } else System.out.println("ERROR: manHarry.marry(womanMary)");

        if (manHarry.marry(womanMary)) {
            System.out.println("TRUE: manHarry.marry(womanMary)");
        } else System.out.println("ERROR: manHarry.marry(womanMary)");

        if (manHarry.marry(womanAnna)) {
            System.out.println("TRUE: manHarry.marry(womanAnna)");
        } else System.out.println("ERROR: manHarry.marry(womanAnna)");

//    //TODO: adequate checks are needed.
//    //TODO: like this:
//    Person manIgor = new Person(true,"Igor");
//        if(manIgor.marry(null)){
//                System.out.println("ERROR: manIgor.marry(null)");
//                }

    }
}
