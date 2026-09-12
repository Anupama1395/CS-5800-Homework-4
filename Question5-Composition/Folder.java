import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Folder {
    private String name;
    private Folder parentFolder;
    private final List<File> files;
    private final List<Folder> subfolders;

    public Folder(String name) {
        this(name, null);
    }

    private Folder(String name, Folder parentFolder) {
        setName(name);
        this.parentFolder = parentFolder;
        files = new ArrayList<>();
        subfolders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Folder name cannot be blank.");
        }
        this.name = name.trim();
    }

    public Folder getParentFolder() {
        return parentFolder;
    }

    public List<File> getFiles() {
        return Collections.unmodifiableList(files);
    }

    public List<Folder> getSubfolders() {
        return Collections.unmodifiableList(subfolders);
    }

    public File createFile(String fileName) {
        File file = new File(fileName, this);
        files.add(file);
        return file;
    }

    public Folder createSubfolder(String folderName) {
        Folder folder = new Folder(folderName, this);
        subfolders.add(folder);
        return folder;
    }

    public boolean deleteSubfolder(String folderName) {
        Iterator<Folder> iterator = subfolders.iterator();

        while (iterator.hasNext()) {
            Folder folder = iterator.next();

            if (folder.getName().equals(folderName)) {
                folder.deleteAllContents();
                folder.parentFolder = null;
                iterator.remove();
                return true;
            }

            if (folder.deleteSubfolder(folderName)) {
                return true;
            }
        }

        return false;
    }

    private void deleteAllContents() {
        for (Folder folder : subfolders) {
            folder.deleteAllContents();
            folder.parentFolder = null;
        }
        subfolders.clear();
        files.clear();
    }

    public void print() {
        print("");
    }

    private void print(String indentation) {
        System.out.println(indentation + "[Folder] " + name);
        String childIndentation = indentation + "    ";

        for (Folder folder : subfolders) {
            folder.print(childIndentation);
        }

        for (File file : files) {
            file.print(childIndentation);
        }
    }
}
