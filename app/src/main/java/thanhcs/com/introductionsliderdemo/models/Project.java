package thanhcs.com.introductionsliderdemo.models;

import java.util.List;

/**
 * Created by thanhcs94 on 19/07/16.
 */
public class Project {

    private String title;
    private int image;
    private List<Tag> tagList;
    private List<String> platformList;
    private String clientName;
    private String delegateName;
    private String delegateDesignation;
    private String delegateImg;
    private String comment;
    private String countryName;
    private String referenceUrl;
    private int isLiked;
    private int isExpanded;

    public Project() {

    }

    public String getTitle() {
        return title;
    }

    public int getImage() {
        return image;
    }

    public List<Tag> getTagList() {
        return tagList;
    }

    public int getIsLiked() {
        return isLiked;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setTagList(List<Tag> tagList) {
        this.tagList = tagList;
    }

    public void setIsLiked(int isLiked) {
        this.isLiked = isLiked;
    }

    public List<String> getPlatformList() {
        return platformList;
    }

    public void setPlatformList(List<String> platformList) {
        this.platformList = platformList;
    }

    public String getPlatforms() {
        String platforms = "";
        for (int i = 0; i < platformList.size(); i++) {
            platforms += platformList.get(i);
            if (i != platformList.size() - 1) {
                platforms += ", ";
            }
        }
        return platforms;
    }

    public String getClientName() {
        return clientName;
    }

    public String getDelegateName() {
        return delegateName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setDelegateName(String delegateName) {
        this.delegateName = delegateName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getIsExpanded() {
        return isExpanded;
    }

    public void setIsExpanded(int isExpanded) {
        this.isExpanded = isExpanded;
    }

    public String getDelegateDesignation() {
        return delegateDesignation;
    }

    public void setDelegateDesignation(String delegateDesignation) {
        this.delegateDesignation = delegateDesignation;
    }

    public String getReferenceUrl() {
        return referenceUrl;
    }

    public void setReferenceUrl(String referenceUrl) {
        this.referenceUrl = referenceUrl;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDelegateImg() {
        return delegateImg;
    }

    public void setDelegateImg(String delegateImg) {
        this.delegateImg = delegateImg;
    }
}
