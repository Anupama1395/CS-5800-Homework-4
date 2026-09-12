public class File {
    private String name;
    private Folder parentFolder;

    File(String name, Folder parentFolder) {
        setName(name);
        setParentFolder(parentFolder);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("File name cannot be blank.");
        }
        this.name = name.trim();
    }

    public Folder getParentFolder() {
        return parentFolder;
    }

    void setParentFolder(Folder parentFolder) {
        if (parentFolder == null) {
            throw new IllegalArgumentException("A file must belong to a folder.");
        }
        this.parentFolder = parentFolder;
    }

    public void print() {
        print("");
    }

    void print(String indentation) {
        System.out.println(indentation + "[File] " + name);
    }
}
