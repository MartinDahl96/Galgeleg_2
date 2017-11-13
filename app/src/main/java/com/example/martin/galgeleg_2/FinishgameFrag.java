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
    Button spilIgen, menu;
    Boolean vind, tab;
    String ord;


    public FinishgameFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rod = inflater.inflate(R.layout.fragment_finishgame, container, false);


        vind = getArguments().getBoolean("vind");
        tab = getArguments().getBoolean("tab");
        ord = getArguments().getString("ord");

        status = (TextView) rod.findViewById(R.id.status_TV);
        besked = (TextView) rod.findViewById(R.id.besked_TV);
        statusPic = (ImageView) rod.findViewById(R.id.statusPic_IV);

        if (tab) {
            status.setText("Du nåede ikke at gætte ordet. Du har desværre tabt og manden døde.");
            besked.setText("Det rigtige ord var: " + ord
                    + "\nVil du spille igen?");
            statusPic.setImageResource(R.drawable.rip);
        }

        if (vind) {
            status.setText("Tillykke! Du gættede ordet: " + ord + " og reddede manden!");
            besked.setText("Der er flere ord at gætte endnu, kan du gætte dem alle?"
                    + "\nVil du spille igen?");
            statusPic.setImageResource(R.drawable.win);
        }

        spilIgen = (Button) rod.findViewById(R.id.spilIgen_BTN);
        spilIgen.setText("Spil igen");
        spilIgen.setOnClickListener(this);

        menu = (Button) rod.findViewById(R.id.menu_BTN);
        menu.setText("Til menu");
        menu.setOnClickListener(this);

        return rod;
    }

    @Override
    public void onClick(View v) {
        if (v == spilIgen) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.fragment_FL, new StartSpilFragment())
                    .addToBackStack(null)
                    .commit();

        } else if (v == menu) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.fragment_FL, new HovedmenuFrag())
                    .addToBackStack((null))
                    .commit();

        }
    }
}
