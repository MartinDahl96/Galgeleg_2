package com.example.martin.galgeleg_2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HighscoreFrag extends Fragment {

    TextView titel_TV;
    ListView Highscore_LV;

    public HighscoreFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rod = inflater.inflate(R.layout.fragment_highscore, container, false);

        String [] test = {"Test 1", "Test 2", "Test 3", "Test 4", "Test 5", "Test 6", "Test 7"};

        ArrayAdapter adapter = new ArrayAdapter(this.getActivity(), android.R.layout.simple_list_item_2, android.R.id.text1, test);

        titel_TV = (TextView) rod.findViewById(R.id.titel_TV);
        titel_TV.setText("HIGHSCORE: ");

        Highscore_LV = (ListView) rod.findViewById(R.id.highscore_LV);
        Highscore_LV.setAdapter(adapter);

        return rod;
    }

}
