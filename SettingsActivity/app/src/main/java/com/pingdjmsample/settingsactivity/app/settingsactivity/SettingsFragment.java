package com.pingdjmsample.settingsactivity.app.settingsactivity;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.support.v4.app.Fragment;
import android.view.View;

/**
 * Created by dhruba on 1/30/16.
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class SettingsFragment extends PreferenceFragment {

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        addPreferencesFromResource(R.xml.pref_main);
        super.onViewCreated(view, savedInstanceState);
    }
}
