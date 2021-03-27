package com.example.dunyasesi.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.dunyasesi.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class NewUploadFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";


    public static NewUploadFragment newInstance(int index) {
        NewUploadFragment fragment = new NewUploadFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_new_upload, container, false);
        final TextView textView = root.findViewById(R.id.section_label);
        textView.setText("New Upload Fragment");
        return root;
    }
}