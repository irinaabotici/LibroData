public class EditorialGroup extends Book implements IPublishingArtifact {
    int editorialGroupID;
    String editorialGroupName;
    Book[] books;

    EditorialGroup() {}
    public EditorialGroup(int newEditorialGroupID, String newEditorialGroupName) {
        this.editorialGroupID = newEditorialGroupID;
        this.editorialGroupName = newEditorialGroupName;
    }

    public String Publish() {
        return null;
    }

    public int getEditorialGroupID() {
        return editorialGroupID;
    }

    public void setEditorialGroupID(int editorialGroupID) {
        this.editorialGroupID = editorialGroupID;
    }

    public String getEditorialGroupName() {
        return editorialGroupName;
    }

    public void setEditorialGroupName(String editorialGroupName) {
        this.editorialGroupName = editorialGroupName;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}
