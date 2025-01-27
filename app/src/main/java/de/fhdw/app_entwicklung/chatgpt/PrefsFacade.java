package de.fhdw.app_entwicklung.chatgpt;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.preference.PreferenceManager;

public class PrefsFacade {

    private final Context context;

    public PrefsFacade(@NonNull Context context) {
        this.context = context;
    }

    public String getApiToken() {
        return PreferenceManager.getDefaultSharedPreferences(context).getString("api_token", "");
    }

    public String getUsername(){
        return PreferenceManager.getDefaultSharedPreferences(context).getString("username", "");
    }

    public String getGptName(){
        return PreferenceManager.getDefaultSharedPreferences(context).getString("gpt_name", "");
    }

}