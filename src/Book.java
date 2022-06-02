public class Book implements IPublishingArtifact {
    int bookID;
    String publishName;
    String subtitle; // optional
    String ISBN;
    int pageCount;
    String keywords;
    int languageID;
    int createdOn;
    String[] authors;

    Book() {}
    public Book(int newBookID, String newPublishName, String newISBN, int newPageCount,
                String newKeywords, int newLanguageID, int newCreatedOn) {
        // trebuie parsat la int newLanguageID
        this.bookID = newBookID;
        this.publishName = newPublishName;
        this.ISBN = newISBN;
        this.pageCount = newPageCount;
        this.keywords = newKeywords;
        this.languageID = newLanguageID;
        this.createdOn = newCreatedOn;
    }

    public String Publish() {
        return null;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getPublishName() {
        return publishName;
    }

    public void setPublishName(String publishName) {
        this.publishName = publishName;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public int getLanguageID() {
        return languageID;
    }

    public void setLanguageID(int languageID) {
        this.languageID = languageID;
    }

    public int getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(int createdOn) {
        this.createdOn = createdOn;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }
}
