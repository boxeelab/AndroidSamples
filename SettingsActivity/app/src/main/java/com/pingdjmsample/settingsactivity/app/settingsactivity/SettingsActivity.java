package com.pingdjmsample.settingsactivity.app.settingsactivity;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by dhruba on 1/30/16.
 */
public class SettingsActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // next stage I explore the fragment based preference
        addPreferencesFromResource(R.xml.pref_main);
    }
}
