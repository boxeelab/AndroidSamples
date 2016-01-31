package com.pingdjmsample.settingsactivity.app.settingsactivity;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceActivity;

import java.util.List;


/**
 * Created by dhruba on 1/30/16.
 */
public class SettingsActivity extends PreferenceActivity {

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //getFragmentManager().beginTransaction().replace(android.R.id.content,new SettingsFragment()).commit();
        // next stage I explore the fragment based preference

    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    public void onBuildHeaders(List<Header> target) {
        super.onBuildHeaders(target);
        loadHeadersFromResource(R.xml.pref_header,target);
    }

    @Override
    protected boolean isValidFragment(String fragmentName) {
        return true;
    }
}
