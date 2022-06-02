public class Language extends Book {
    int languageID;
    String code;
    String languageName;

    Language() {}
    public Language(int newLanguageID, String newCode, String newLanguageName) {
        this.languageID = newLanguageID;
        this.code = newCode;
        this.languageName = newLanguageName;
    }

    @Override
    public int getLanguageID() {
        return languageID;
    }

    public void setLanguageID(int languageID) {
        this.languageID = languageID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLanguageName() {
        return languageName;
    }
}
