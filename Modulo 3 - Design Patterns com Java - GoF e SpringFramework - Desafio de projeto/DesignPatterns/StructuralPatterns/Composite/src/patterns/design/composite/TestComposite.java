package patterns.design.composite;

public class TestComposite {
    public static void main() {
        System.out.println(test());
    }

    public static String test() {

        //The idea of Composite is to trait single objects or group of objects in the same way

        File fileA = new File("WarAndPeace.pdf");
        File fileB = new File("annotations.txt");
        File fileC = new File("HelloWorldJava.java");

        Folder mainFolder = new Folder("Main-Folder");
        Folder folderA = new Folder("JavaStudy");

        folderA.add(fileC);
        mainFolder.add(folderA);
        mainFolder.add(fileA);
        mainFolder.add(fileB);


        mainFolder.show();
        /*
        if () {
            return "OK";
        } else {
            return "FAILED!";
        }*/
        return ("test");
    }
}
