package com.example.martin.galgeleg_2;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
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

        SharedPreferences SP = PreferenceManager.getDefaultSharedPreferences(getActivity());

        final String [] test = {SP.getString("ord", "tom"), "Test 2", "Test 3", "Test 4", "Test 5", "Test 6", "Test 7"};
        final String[] subtest = {"1", "2", "3", "4", "5", "6", "7"};

        //ArrayAdapter adapter = new ArrayAdapter(this.getActivity(), android.R.layout.simple_list_item_2, android.R.id.text1, test);

       titel_TV = (TextView) rod.findViewById(R.id.titel_TV);
       titel_TV.setText("HIGHSCORE: ");

       Highscore_LV = (ListView) rod.findViewById(R.id.highscore_LV);

        BaseAdapter adapter = new BaseAdapter() {
            @Override
            public int getCount() {
                return test.length;
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
                ordet.setText(test[i]);

                TextView forsøg = (TextView) view.findViewById(R.id.forsøg_TV);
                forsøg.setText(subtest[i]);

                return view;
            }
        };



        Highscore_LV.setAdapter(adapter);

        return rod;
    }

}
