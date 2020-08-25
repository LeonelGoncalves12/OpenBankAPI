package models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ThisAccount{

    private String id;
    private List<Holder> holders;
    private String number;
    private String kind;
    @JsonProperty("IBAN")
    private Object iBAN;
    private Object swift_bic;
    private Bank bank;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Holder> getHolders() {
        return holders;
    }

    public void setHolders(List<Holder> holders) {
        this.holders = holders;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Object getiBAN() {
        return iBAN;
    }

    public void setiBAN(Object iBAN) {
        this.iBAN = iBAN;
    }

    public Object getSwift_bic() {
        return swift_bic;
    }

    public void setSwift_bic(Object swift_bic) {
        this.swift_bic = swift_bic;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}