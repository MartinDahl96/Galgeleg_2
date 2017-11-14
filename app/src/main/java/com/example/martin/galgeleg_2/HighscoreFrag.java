package com.example.martin.galgeleg_2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;



/**
 * A simple {@link Fragment} subclass.
 */
public class HighscoreFrag extends Fragment {

    TextView titel_TV;
    ListView Highscore_LV;
    Galgelogik galgelogik = new Galgelogik();
    ArrayList<String> ord = galgelogik.getWordSample();

    public HighscoreFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rod = inflater.inflate(R.layout.fragment_highscore, container, false);



       titel_TV = (TextView) rod.findViewById(R.id.titel_TV);
       titel_TV.setText("HIGHSCORE: ");

       Highscore_LV = (ListView) rod.findViewById(R.id.highscore_LV);

        BaseAdapter adapter = new BaseAdapter() {
            @Override
            public int getCount() {
                return galgelogik.wordSample.size();
            }

            @Override
            public Object getItem(int i) {
                return null;
            }

            @Override
            public long getItemId(int i) {
                return 0;
            }

            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {
                if (view == null) view = getLayoutInflater().inflate(R.layout.listlayout, null);

                TextView ordet = (TextView) view.findViewById(R.id.ordet_TV);
                ordet.setText(ord.get(i));

                TextView forsøg = (TextView) view.findViewById(R.id.forsøg_TV);
                forsøg.setText("Antal forsøg: " + 0);
                return view;
            }
        };

        Highscore_LV.setAdapter(adapter);

        return rod;
    }

}
