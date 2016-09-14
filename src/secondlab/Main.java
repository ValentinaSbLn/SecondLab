package secondlab;

/**
 * Created by Valentina on 13.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Person Harry = new Person(true, "Harry");
        Person Mary = new Person(false, "Mary");
        Person Anna = new Person(false, "Anna");
        Person David = new Person(true, "David");

       if (Harry.marry(Mary))
           System.out.println("Harry и Mary поженились");
       else
           System.out.println("Не поженились"); //TODO: who?

        if (David.marry(Anna))
            System.out.println("David и Anna поженились");
        else
            System.out.println("Не поженились");

        if (David.marry(Mary))
            System.out.println("David и Mary поженились");
        else
            System.out.println("Не поженились");

        if (Harry.marry(Anna))
            System.out.println("Harry и Anna поженились");
        else
            System.out.println("Не поженились");

        if (Mary.marry(Anna))
            System.out.println("Mary и Anna поженились");
        else
            System.out.println("Не поженились");

        if (David.marry(Harry))
            System.out.println("Mary и Anna поженились");
        else
            System.out.println("Не поженились");

//    //TODO: adequate checks are needed.
//    //TODO: like this:
//    Person manIgor = new Person(true,"Igor");
//        if(manIgor.marry(null)){
//                System.out.println("ERROR: manIgor.marry(null)");
//                }

    }
}
