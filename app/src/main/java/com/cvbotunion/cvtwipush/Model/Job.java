package com.cvbotunion.cvtwipush.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class Job implements Parcelable {
    public String jobName;
    private int priority;  //权限级别
    public RTGroup group;

    public Job(String jobName, int priority, RTGroup group) {
        this.jobName = jobName;
        this.priority = priority;
        this.group = group;
    }

    protected Job(Parcel in) {
        jobName = in.readString();
        priority = in.readInt();
        group = in.readParcelable(RTGroup.class.getClassLoader());
    }

    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj instanceof Job) {
            Job anotherJob = (Job)obj;
            return jobName.equals(anotherJob.jobName) && priority==anotherJob.priority && group.equals(anotherJob.group);
        }
        return false;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public static final Creator<Job> CREATOR = new Creator<Job>() {
        @Override
        public Job createFromParcel(Parcel in) {
            return new Job(in);
        }

        @Override
        public Job[] newArray(int size) {
            return new Job[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(jobName);
        dest.writeInt(priority);
        dest.writeParcelable(group, flags);
    }
}
