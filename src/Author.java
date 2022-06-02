public class Author extends Book{
    int authorID;
    String firstName;
    String lastName;


    Author() {}
    public Author(int newAuthorID, String newFirstName, String newLastName) {
        this.authorID = newAuthorID;
        this.firstName = newFirstName;
        this.lastName = newLastName;
    }

    public int getAuthorID() {
        return authorID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
