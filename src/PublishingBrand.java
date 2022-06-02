public class PublishingBrand extends Book implements IPublishingArtifact {
    int publishingBrandID;
    String publishingBrandName;
    Book[] books;

    PublishingBrand() {}
    public PublishingBrand (int newPublishingBrandID, String newPublishingBrandName) {
        this.publishingBrandID = newPublishingBrandID;
        this.publishingBrandName = newPublishingBrandName;
    }

    public String Publish() {
        return null;
    }

    public int getPublishingBrandID() {
        return publishingBrandID;
    }

    public void setPublishingBrandID(int publishingBrandID) {
        this.publishingBrandID = publishingBrandID;
    }

    public String getPublishingBrandName() {
        return publishingBrandName;
    }

    public void setPublishingBrandName(String publishingBrandName) {
        this.publishingBrandName = publishingBrandName;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}
