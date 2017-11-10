package com.example.martin.galgeleg_2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FinishgameFrag extends Fragment implements View.OnClickListener {


    TextView status, besked;
    ImageView statusPic;
    Button spilIgen;


    public FinishgameFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rod = inflater.inflate(R.layout.fragment_finishgame, container, false);

        status = (TextView) rod.findViewById(R.id.statusTekst_TV);
        status.setText("");




        return rod;
    }

    @Override
    public void onClick(View view) {

    }
}
