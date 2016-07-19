package thanhcs.com.introductionsliderdemo.models;

/**
 * Created by thanhcs94 on 19/07/16.
 * .
 */
public class Tag {

    private String id;
    private String platform;
    private String url;
    
    public Tag() {
        
    }

    public Tag(String platform, String url) {
        this.platform = platform;
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
