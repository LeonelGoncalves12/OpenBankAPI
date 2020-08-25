package models;

public class Transaction{
    private String id;
    private ThisAccount this_account;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ThisAccount getThis_account() {
        return this_account;
    }

    public void setThis_account(ThisAccount this_account) {
        this.this_account = this_account;
    }

    public OtherAccount getOther_account() {
        return other_account;
    }

    public void setOther_account(OtherAccount other_account) {
        this.other_account = other_account;
    }

    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public OtherAccount other_account;
    public Details details;
    public Metadata metadata;
}