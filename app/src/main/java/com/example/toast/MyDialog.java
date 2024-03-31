package com.example.toast;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class MyDialog extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog alertDialog = new AlertDialog.Builder(getActivity())
                .setTitle("Morfiuse's Choice")
                .setIcon(R.drawable.morpheus)
                .setMessage("Which pill do you choose?")
                .setPositiveButton("Red", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getActivity(), "Welcome to real world!", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("Blue", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getActivity(), "Go back to Matrix.", Toast.LENGTH_SHORT).show();
                    }
                })
                .create();
        return alertDialog;
    }
}
