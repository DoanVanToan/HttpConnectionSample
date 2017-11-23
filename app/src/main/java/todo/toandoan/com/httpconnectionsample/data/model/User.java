package todo.toandoan.com.httpconnectionsample.data.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import org.json.JSONObject;

public class User extends BaseObservable {
    @Bindable
    private String login;
    @Bindable
    private int id;
    private String avatarUrl;
    @Bindable
    private String gravatarId;
    @Bindable
    private String url;
    @Bindable
    private String htmlUrl;
    @Bindable
    private String followersUrl;
    @Bindable
    private String followingUrl;
    @Bindable
    private String gistsUrl;
    @Bindable
    private String starredUrl;
    @Bindable
    private String subscriptionsUrl;
    @Bindable
    private String organizationsUrl;
    @Bindable
    private String reposUrl;
    @Bindable
    private String eventsUrl;
    @Bindable
    private String receivedEventsUrl;
    @Bindable
    private String type;
    @Bindable
    private Boolean siteAdmin;
    @Bindable
    private String name;
    @Bindable
    private String company;
    @Bindable
    private String blog;
    @Bindable
    private String location;
    @Bindable
    private String email;
    @Bindable
    private String hireable;
    @Bindable
    private String bio;
    @Bindable
    private int publicRepos;
    @Bindable
    private int publicGists;
    @Bindable
    private int followers;
    @Bindable
    private int following;
    @Bindable
    private String createdAt;
    @Bindable
    private String updatedAt;

    public User() {
    }

    public User(JSONObject jsonObject) {
        login = jsonObject.optString("login");
        id = jsonObject.optInt("id");
        avatarUrl = jsonObject.optString("avatar_url");
        gravatarId = jsonObject.optString("gravatar_id");
        url = jsonObject.optString("url");
        htmlUrl = jsonObject.optString("html_url");
        followersUrl = jsonObject.optString("followers_url");
        followingUrl = jsonObject.optString("followingUrl");
        gistsUrl = jsonObject.optString("gists_url");
        starredUrl = jsonObject.optString("starred_url");
        subscriptionsUrl = jsonObject.optString("subscriptions_url");
        createdAt = jsonObject.optString("created_at");
        updatedAt = jsonObject.optString("updated_at");
        organizationsUrl = jsonObject.optString("organizations_url");
        reposUrl = jsonObject.optString("repos_url");
        eventsUrl = jsonObject.optString("events_url");
        receivedEventsUrl = jsonObject.optString("received_events_url");
        type = jsonObject.optString("type");
        siteAdmin = jsonObject.optBoolean("site_admin");
        name = jsonObject.optString("name");
        company = jsonObject.optString("company");
        blog = jsonObject.optString("blog");
        location = jsonObject.optString("location");
        email = jsonObject.optString("email");
        hireable = jsonObject.optString("hireable");
        bio = jsonObject.optString("bio");
        publicRepos = jsonObject.optInt("public_repos");
        publicGists = jsonObject.optInt("public_gists");
        followers = jsonObject.optInt("followers");
        following = jsonObject.optInt("following");
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getGravatarId() {
        return gravatarId;
    }

    public void setGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getFollowersUrl() {
        return followersUrl;
    }

    public void setFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
    }

    public String getFollowingUrl() {
        return followingUrl;
    }

    public void setFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
    }

    public String getGistsUrl() {
        return gistsUrl;
    }

    public void setGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
    }

    public String getStarredUrl() {
        return starredUrl;
    }

    public void setStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
    }

    public String getSubscriptionsUrl() {
        return subscriptionsUrl;
    }

    public void setSubscriptionsUrl(String subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
    }

    public String getOrganizationsUrl() {
        return organizationsUrl;
    }

    public void setOrganizationsUrl(String organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
    }

    public String getReposUrl() {
        return reposUrl;
    }

    public void setReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public String getReceivedEventsUrl() {
        return receivedEventsUrl;
    }

    public void setReceivedEventsUrl(String receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getSiteAdmin() {
        return siteAdmin;
    }

    public void setSiteAdmin(Boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHireable() {
        return hireable;
    }

    public void setHireable(String hireable) {
        this.hireable = hireable;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getPublicRepos() {
        return publicRepos;
    }

    public void setPublicRepos(int publicRepos) {
        this.publicRepos = publicRepos;
    }

    public int getPublicGists() {
        return publicGists;
    }

    public void setPublicGists(int publicGists) {
        this.publicGists = publicGists;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
