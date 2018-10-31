package com.ydkj.jetpackdemo.ui.main;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private String userId;
    private LiveData<User> user;

    public void init(String userId) {
        this.userId = userId;
    }
    public LiveData<User> getUser() {
        return user;
    }

    public void setUser(LiveData<User> user) {
        this.user = user;
    }
}
