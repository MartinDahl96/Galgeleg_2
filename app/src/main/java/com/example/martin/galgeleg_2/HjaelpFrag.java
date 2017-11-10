package com.example.martin.galgeleg_2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HjaelpFrag extends Fragment {

    ImageView hjaelp_IV;
    TextView hjaelpTekst_TV;


    public HjaelpFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rod = inflater.inflate(R.layout.fragment_hjaelp, container, false);

        hjaelp_IV = (ImageView) rod.findViewById(R.id.hjaelp_IV);
        hjaelpTekst_TV = (TextView) rod.findViewById(R.id.hjaelpTekst_TV);



        return rod;
    }

}
