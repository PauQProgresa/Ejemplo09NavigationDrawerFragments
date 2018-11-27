package com.example.alumno.ejemplo09_navigationdrawerfragments.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alumno.ejemplo09_navigationdrawerfragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ToolsFragment extends Fragment {
    EditText EtCorreo, EtContrasenya;
    Button btnConfirmar;

    public ToolsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_tools, container, false);
        EtContrasenya = rootView.findViewById(R.id.EtContrasenya);
        EtCorreo = rootView.findViewById(R.id.EtCorreo);
        btnConfirmar = rootView.findViewById(R.id.btnConfirmar);

        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(EtContrasenya.getText().toString().isEmpty() || EtCorreo.getText().toString().isEmpty()){
                    Toast.makeText(, "Tienes que rellenar los campos", Toast.LENGTH_SHORT).show();
                }
                else{
                    if (EtContrasenya.getText().toString().equals("progresa") && EtCorreo.getText().toString().equals("progresa@progresa.com")){

                    }
                    else{
                        Toast.makeText(, "El usuario y contraseña no es correcto", Toast.LENGTH_SHORT).show();
                    }
                }
            }

        });
        return rootView;
    }

}
