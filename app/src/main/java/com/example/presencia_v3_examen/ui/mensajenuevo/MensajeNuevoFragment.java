package com.example.presencia_v3_examen.ui.mensajenuevo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.presencia_v3_examen.R;

public class MensajeNuevoFragment extends Fragment {

    private MensajeNuevoViewModel viewModel;

    public View OnCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        viewModel = ViewModelProviders.of(this).get(MensajeNuevoViewModel.class);

        View root = inflater.inflate(R.layout.fragment_mensaje_nuevo, container, false);

        return root;
    }
}
