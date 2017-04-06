package com.example.ioana.myloginapplication.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by ioana on 04.04.2017.
 */

public class Repository {

    String mName;
    String mOwner;
    String mDescription;
    Boolean mIsPrivate;
    String mDefaultBranch;
    List<String> mTopics;
    int mWatchersCount;
    Date mCreatedAt;
    Date mUpdatedAt;


    static final List<Repository> sMockRepository;

    static {
        sMockRepository = new ArrayList<>();

        for(int i = 0; i < 100; i++) {
            sMockRepository.add(new Repository("Repo " + i, "Octocat", "Some repo", false, "master",
                    new ArrayList<String>() {{
                        add("android");
                        add("chestie");
                    }}, i, new Date(), new Date()));
        }
    }


    public Repository(String mName, String mOwner, String mDescription, Boolean mIsPrivate,
                      String mDefaultBranch, List<String> mTopics, int mWatchersCount, Date mCreatedAt, Date mUpdatedAt) {
        this.mName = mName;
        this.mOwner = mOwner;
        this.mDescription = mDescription;
        this.mIsPrivate = mIsPrivate;
        this.mDefaultBranch = mDefaultBranch;
        this.mTopics = mTopics;
        this.mWatchersCount = mWatchersCount;
        this.mCreatedAt = mCreatedAt;
        this.mUpdatedAt = mUpdatedAt;
    }

    public String getmName() {
        return mName;
    }

    public String getmOwner() {
        return mOwner;
    }

    public String getmDescription() {
        return mDescription;
    }

    public Boolean getmIsPrivate() {
        return mIsPrivate;
    }

    public String getmDefaultBranch() {
        return mDefaultBranch;
    }

    public List<String> getmTopics() {
        return mTopics;
    }

    public int getmWatchersCount() {
        return mWatchersCount;
    }

    public Date getmCreatedAt() {
        return mCreatedAt;
    }

    public Date getmUpdatedAt() {
        return mUpdatedAt;
    }

    public static List<Repository> getsMockRepository() {
        return sMockRepository;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmOwner(String mOwner) {
        this.mOwner = mOwner;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public void setmIsPrivate(Boolean mIsPrivate) {
        this.mIsPrivate = mIsPrivate;
    }

    public void setmDefaultBranch(String mDefaultBranch) {
        this.mDefaultBranch = mDefaultBranch;
    }

    public void setmTopics(List<String> mTopics) {
        this.mTopics = mTopics;
    }

    public void setmWatchersCount(int mWatchersCount) {
        this.mWatchersCount = mWatchersCount;
    }

    public void setmCreatedAt(Date mCreatedAt) {
        this.mCreatedAt = mCreatedAt;
    }

    public void setmUpdatedAt(Date mUpdatedAt) {
        this.mUpdatedAt = mUpdatedAt;
    }
}
