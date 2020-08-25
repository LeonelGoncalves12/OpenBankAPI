package models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Metadata {
    private Object public_alias;
    private Object private_alias;
    private Object more_info;
    @JsonProperty("URL")
    private Object uRL;
    private Object image_URL;
    private Object open_corporates_URL;
    private Object corporate_location;
    private Object physical_location;
    private Object narrative;
    private List<Object> comments;
    private List<Object> tags;
    private List<Object> images;
    private Object where;

    public Object getPublic_alias() {
        return public_alias;
    }

    public void setPublic_alias(Object public_alias) {
        this.public_alias = public_alias;
    }

    public Object getPrivate_alias() {
        return private_alias;
    }

    public void setPrivate_alias(Object private_alias) {
        this.private_alias = private_alias;
    }

    public Object getMore_info() {
        return more_info;
    }

    public void setMore_info(Object more_info) {
        this.more_info = more_info;
    }

    public Object getuRL() {
        return uRL;
    }

    public void setuRL(Object uRL) {
        this.uRL = uRL;
    }

    public Object getImage_URL() {
        return image_URL;
    }

    public void setImage_URL(Object image_URL) {
        this.image_URL = image_URL;
    }

    public Object getOpen_corporates_URL() {
        return open_corporates_URL;
    }

    public void setOpen_corporates_URL(Object open_corporates_URL) {
        this.open_corporates_URL = open_corporates_URL;
    }

    public Object getCorporate_location() {
        return corporate_location;
    }

    public void setCorporate_location(Object corporate_location) {
        this.corporate_location = corporate_location;
    }

    public Object getPhysical_location() {
        return physical_location;
    }

    public void setPhysical_location(Object physical_location) {
        this.physical_location = physical_location;
    }

    public Object getNarrative() {
        return narrative;
    }

    public void setNarrative(Object narrative) {
        this.narrative = narrative;
    }

    public List<Object> getComments() {
        return comments;
    }

    public void setComments(List<Object> comments) {
        this.comments = comments;
    }

    public List<Object> getTags() {
        return tags;
    }

    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    public List<Object> getImages() {
        return images;
    }

    public void setImages(List<Object> images) {
        this.images = images;
    }

    public Object getWhere() {
        return where;
    }

    public void setWhere(Object where) {
        this.where = where;
    }
}
