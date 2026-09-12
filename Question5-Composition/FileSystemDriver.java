public class FileSystemDriver {
    public static void main(String[] args) {
        Folder phpDemo1 = new Folder("php_demo1");
        Folder sourceFiles = phpDemo1.createSubfolder("Source Files");

        sourceFiles.createSubfolder(".phalcon");

        Folder app = sourceFiles.createSubfolder("app");
        app.createSubfolder("config");
        app.createSubfolder("controllers");
        app.createSubfolder("library");
        app.createSubfolder("migrations");
        app.createSubfolder("models");
        app.createSubfolder("views");

        sourceFiles.createSubfolder("cache");
        sourceFiles.createSubfolder("public");
        sourceFiles.createFile(".htaccess");
        sourceFiles.createFile(".htrouter.php");
        sourceFiles.createFile("index.html");

        phpDemo1.createSubfolder("Include Path");
        phpDemo1.createSubfolder("Remote Files");

        System.out.println("ORIGINAL FILE STRUCTURE");
        System.out.println("=======================");
        phpDemo1.print();

        phpDemo1.deleteSubfolder("app");
        System.out.println("\nAFTER DELETING APP");
        System.out.println("==================");
        phpDemo1.print();

        phpDemo1.deleteSubfolder("public");
        System.out.println("\nAFTER DELETING PUBLIC");
        System.out.println("=====================");
        phpDemo1.print();
    }
}
