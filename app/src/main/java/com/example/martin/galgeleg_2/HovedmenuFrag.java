package com.example.martin.galgeleg_2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HovedmenuFrag extends Fragment implements View.OnClickListener {

    TextView velkomst_TV;
    Button startSpil_BTN, hjaelp_BTN;

    public HovedmenuFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rod = inflater.inflate(R.layout.fragment_hovedmenu, container, false);

        velkomst_TV = (TextView) rod.findViewById(R.id.velkomst_TV);
        velkomst_TV.setText("Velkommen til Galgeleg 2.0!");

        startSpil_BTN = (Button) rod.findViewById(R.id.startSpil_BTN);
        startSpil_BTN.setText("Start spillet");
        startSpil_BTN.setOnClickListener(this);

        hjaelp_BTN = (Button) rod.findViewById(R.id.hjaelp_BTN);
        hjaelp_BTN.setText("Hjælp");
        hjaelp_BTN.setOnClickListener(this);

        return rod;
    }

    @Override
    public void onClick(View v) {

        if (v == startSpil_BTN) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.fragment_FL, new StartSpilFragment())
                    .addToBackStack(null)
                    .commit();

        }

        if (v == hjaelp_BTN) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.fragment_FL, new HjaelpFrag())
                    .addToBackStack(null)
                    .commit();
        }
    }
}
