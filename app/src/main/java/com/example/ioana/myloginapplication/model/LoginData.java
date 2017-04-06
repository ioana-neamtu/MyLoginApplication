package com.example.ioana.myloginapplication.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginData {

    @SerializedName("current_user_url")
    @Expose
    public String currentUserUrl;
    @SerializedName("current_user_authorizations_html_url")
    @Expose
    public String currentUserAuthorizationsHtmlUrl;
    @SerializedName("authorizations_url")
    @Expose
    public String authorizationsUrl;
    @SerializedName("code_search_url")
    @Expose
    public String codeSearchUrl;
    @SerializedName("commit_search_url")
    @Expose
    public String commitSearchUrl;
    @SerializedName("emails_url")
    @Expose
    public String emailsUrl;
    @SerializedName("emojis_url")
    @Expose
    public String emojisUrl;
    @SerializedName("events_url")
    @Expose
    public String eventsUrl;
    @SerializedName("feeds_url")
    @Expose
    public String feedsUrl;
    @SerializedName("followers_url")
    @Expose
    public String followersUrl;
    @SerializedName("following_url")
    @Expose
    public String followingUrl;
    @SerializedName("gists_url")
    @Expose
    public String gistsUrl;
    @SerializedName("hub_url")
    @Expose
    public String hubUrl;
    @SerializedName("issue_search_url")
    @Expose
    public String issueSearchUrl;
    @SerializedName("issues_url")
    @Expose
    public String issuesUrl;
    @SerializedName("keys_url")
    @Expose
    public String keysUrl;
    @SerializedName("notifications_url")
    @Expose
    public String notificationsUrl;
    @SerializedName("organization_repositories_url")
    @Expose
    public String organizationRepositoriesUrl;
    @SerializedName("organization_url")
    @Expose
    public String organizationUrl;
    @SerializedName("public_gists_url")
    @Expose
    public String publicGistsUrl;
    @SerializedName("rate_limit_url")
    @Expose
    public String rateLimitUrl;
    @SerializedName("repository_url")
    @Expose
    public String repositoryUrl;
    @SerializedName("repository_search_url")
    @Expose
    public String repositorySearchUrl;
    @SerializedName("current_user_repositories_url")
    @Expose
    public String currentUserRepositoriesUrl;
    @SerializedName("starred_url")
    @Expose
    public String starredUrl;
    @SerializedName("starred_gists_url")
    @Expose
    public String starredGistsUrl;
    @SerializedName("team_url")
    @Expose
    public String teamUrl;
    @SerializedName("user_url")
    @Expose
    public String userUrl;
    @SerializedName("user_organizations_url")
    @Expose
    public String userOrganizationsUrl;
    @SerializedName("user_repositories_url")
    @Expose
    public String userRepositoriesUrl;
    @SerializedName("user_search_url")
    @Expose
    public String userSearchUrl;

}