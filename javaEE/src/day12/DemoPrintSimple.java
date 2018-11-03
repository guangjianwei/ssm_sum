package day12;

public class DemoPrintSimple {
    public static void main(String[] args) {

//        printUp(
//                (s)->{
//                    printUpperTo printUpperTo = new printUpperTo();
//                    printUpperTo.printUpperTo(s);
//                }
//        );
        printUpperTo printUppe = new printUpperTo();
        printUp(printUppe::printUpperTo);
    }

    private static void printUp(printUpper printUpper) {
        printUpper.changeUpper("Hellow,World!");
    }
}
