package com.cvbotunion.cvtwipush.DBModel;

import com.cvbotunion.cvtwipush.Model.TwitterUser;

import org.litepal.annotation.Column;
import org.litepal.crud.LitePalSupport;

/**
 * Model class of the database, which corresponds to class TwitterUser.
 */
public class DBTwitterUser extends LitePalSupport {
    @Column(unique = true, nullable = false)
    private long tuid;  // TwitterUser.id
    private String name;

    @Column(unique = true, nullable = false)
    private String screen_name;

    private String name_in_group;
    private String location;
    private int followers_count;
    private int friends_count;
    private int statuses_count;
    private String profile_image_url;

    public DBTwitterUser() {}

    public DBTwitterUser(TwitterUser user) {
        this.tuid = Long.parseLong(user.id);
        this.name = user.name;
        this.screen_name = user.screen_name;
        this.name_in_group = user.name_in_group;
        this.location = user.location;
        this.followers_count = user.followers_count;
        this.friends_count = user.friends_count;
        this.statuses_count = user.statuses_count;
        this.profile_image_url = user.profile_image_url;
    }

    public TwitterUser toTwitterUser() {
        return new TwitterUser(String.valueOf(tuid), name, screen_name, name_in_group, profile_image_url);
    }

    public long getTuid() {
        return tuid;
    }

    public String getName() {
        return name;
    }

    public String getScreen_name() {
        return screen_name;
    }

    public String getName_in_group() {
        return name_in_group;
    }

    public String getLocation() {
        return location;
    }

    public int getFollowers_count() {
        return followers_count;
    }

    public int getFriends_count() {
        return friends_count;
    }

    public int getStatuses_count() {
        return statuses_count;
    }

    public String getProfile_image_url() {
        return profile_image_url;
    }

    public void setTuid(long tuid) {
        this.tuid = tuid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScreen_name(String screen_name) {
        this.screen_name = screen_name;
    }

    public void setName_in_group(String name_in_group) {
        this.name_in_group = name_in_group;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setFollowers_count(int followers_count) {
        this.followers_count = followers_count;
    }

    public void setFriends_count(int friends_count) {
        this.friends_count = friends_count;
    }

    public void setStatuses_count(int statuses_count) {
        this.statuses_count = statuses_count;
    }

    public void setProfile_image_url(String profile_image_url) {
        this.profile_image_url = profile_image_url;
    }
}
