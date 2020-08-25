package models;

import java.util.Date;

public class Details{
    private String type;
    private String description;
    private Date posted;
    private Date completed;
    private NewBalance new_balance;
    private Value value;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getPosted() {
        return posted;
    }

    public void setPosted(Date posted) {
        this.posted = posted;
    }

    public Date getCompleted() {
        return completed;
    }

    public void setCompleted(Date completed) {
        this.completed = completed;
    }

    public NewBalance getNew_balance() {
        return new_balance;
    }

    public void setNew_balance(NewBalance new_balance) {
        this.new_balance = new_balance;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

}