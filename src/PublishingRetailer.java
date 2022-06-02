public class PublishingRetailer {
    IPublishingArtifact publishingArtifacts;
    String[] countries;

    PublishingRetailer() {}
    public PublishingRetailer(IPublishingArtifact newPublishingArtifacts, String[] newCountries) {
        this.publishingArtifacts = newPublishingArtifacts;
        this.countries = newCountries;
    }

    public IPublishingArtifact getPublishingArtifacts() {
        return publishingArtifacts;
    }

    public void setPublishingArtifacts(IPublishingArtifact publishingArtifacts) {
        this.publishingArtifacts = publishingArtifacts;
    }

    public String[] getCountries() {
        return countries;
    }

    public void setCountries(String[] countries) {
        this.countries = countries;
    }
}
