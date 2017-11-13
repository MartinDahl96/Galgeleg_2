package com.example.martin.galgeleg_2;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
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
public class StartSpilFragment extends Fragment implements View.OnClickListener{

    TextView skjultOrd, statusTekst, alleGæt;
    ImageView galge;
    Button q, w, e, r, t, y, u, i, o, p, å, a, s, d, f, g, h, j, k, l, æ, ø, z, x, c, v, b, n, m;
    Galgelogik galgelogik = new Galgelogik();
    Context context = getContext();



    public StartSpilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rod = inflater.inflate(R.layout.fragment_startspil, container, false);

        skjultOrd = (TextView) rod.findViewById(R.id.skjultOrd_TV);
        skjultOrd.setText(galgelogik.getVisibleWord());

        statusTekst = (TextView) rod.findViewById(R.id.statusTekst_TV);
        statusTekst.setText("");

        alleGæt = (TextView) rod.findViewById(R.id.alleGæt_TV);
        alleGæt.setText("");

        galge = (ImageView) rod.findViewById(R.id.galge_IV);

        q = (Button) rod.findViewById(R.id.q_BTN);
        q.setOnClickListener(this);

        w = (Button) rod.findViewById(R.id.w_BTN);
        w.setOnClickListener(this);

        e = (Button) rod.findViewById(R.id.e_BTN);
        e.setOnClickListener(this);

        r = (Button) rod.findViewById(R.id.r_BTN);
        r.setOnClickListener(this);

        t = (Button) rod.findViewById(R.id.t_BTN);
        t.setOnClickListener(this);

        y = (Button) rod.findViewById(R.id.y_BTN);
        y.setOnClickListener(this);

        u = (Button) rod.findViewById(R.id.u_BTN);
        u.setOnClickListener(this);

        i = (Button) rod.findViewById(R.id.i_BTN);
        i.setOnClickListener(this);

        o = (Button) rod.findViewById(R.id.o_BTN);
        o.setOnClickListener(this);

        p = (Button) rod.findViewById(R.id.p_BTN);
        p.setOnClickListener(this);

        å = (Button) rod.findViewById(R.id.å_BTN);
        å.setOnClickListener(this);

        a = (Button) rod.findViewById(R.id.a_BTN);
        a.setOnClickListener(this);

        s = (Button) rod.findViewById(R.id.s_BTN);
        s.setOnClickListener(this);

        d = (Button) rod.findViewById(R.id.d_BTN);
        d.setOnClickListener(this);

        f = (Button) rod.findViewById(R.id.f_BTN);
        f.setOnClickListener(this);

        g = (Button) rod.findViewById(R.id.g_BTN);
        g.setOnClickListener(this);

        h = (Button) rod.findViewById(R.id.h_BTN);
        h.setOnClickListener(this);

        j = (Button) rod.findViewById(R.id.j_BTN);
        j.setOnClickListener(this);

        k = (Button) rod.findViewById(R.id.k_BTN);
        k.setOnClickListener(this);

        l = (Button) rod.findViewById(R.id.l_BTN);
        l.setOnClickListener(this);

        æ = (Button) rod.findViewById(R.id.æ_BTN);
        æ.setOnClickListener(this);

        ø = (Button) rod.findViewById(R.id.ø_BTN);
        ø.setOnClickListener(this);

        z = (Button) rod.findViewById(R.id.z_BTN);
        z.setOnClickListener(this);

        x = (Button) rod.findViewById(R.id.x_BTN);
        x.setOnClickListener(this);

        c = (Button) rod.findViewById(R.id.c_BTN);
        c.setOnClickListener(this);

        v = (Button) rod.findViewById(R.id.v_BTN);
        v.setOnClickListener(this);

        b = (Button) rod.findViewById(R.id.b_BTN);
        b.setOnClickListener(this);

        n = (Button) rod.findViewById(R.id.n_BTN);
        n.setOnClickListener(this);

        m = (Button) rod.findViewById(R.id.m_BTN);
        m.setOnClickListener(this);





        return rod;
    }

    @Override
    public void onClick(View view) {

        switch(view.getId()) {
            case R.id.q_BTN:
                galgelogik.letterGuess("q");
                skjultOrd.setText(galgelogik.getVisibleWord());
                alleGæt.setText("Alle gæt: " + galgelogik.getUsedLetters());
                if (galgelogik.getCorrectLetter()) {
                    statusTekst.setText("Dette bogstav var korrekt: " + q.getText().toString());
                } else {
                    statusTekst.setText("Dette bogstav var IKKE korrekt: " + q.getText().toString());
                }
                q.setVisibility(View.INVISIBLE);
                break;

            case R.id.w_BTN:
                galgelogik.letterGuess("w");
                skjultOrd.setText(galgelogik.getVisibleWord());
                alleGæt.setText("Alle gæt: " + galgelogik.getUsedLetters());
                if (galgelogik.getCorrectLetter()) {
                    statusTekst.setText("Dette bogstav var korrekt: " + w.getText().toString());
                } else {
                    statusTekst.setText("Dette bogstav var IKKE korrekt: " + w.getText().toString());
                }
                w.setVisibility(View.INVISIBLE);
                break;

            case R.id.e_BTN:
                galgelogik.letterGuess("e");
                skjultOrd.setText(galgelogik.getVisibleWord());
                alleGæt.setText("Alle gæt: " + galgelogik.getUsedLetters());
                if (galgelogik.getCorrectLetter()) {
                    statusTekst.setText("Dette bogstav var korrekt: " + e.getText().toString());
                } else {
                    statusTekst.setText("Dette bogstav var IKKE korrekt: " + e.getText().toString());
                }
                e.setVisibility(View.INVISIBLE);
                break;

            case R.id.r_BTN:
                galgelogik.letterGuess("r");
                skjultOrd.setText(galgelogik.getVisibleWord());
                alleGæt.setText("Alle gæt: " + galgelogik.getUsedLetters());
                if (galgelogik.getCorrectLetter()) {
                    statusTekst.setText("Dette bogstav var korrekt: " + r.getText().toString());
                } else {
                    statusTekst.setText("Dette bogstav var IKKE korrekt: " + r.getText().toString());
                }
                r.setVisibility(View.INVISIBLE);
                break;

            case R.id.t_BTN:
                galgelogik.letterGuess("t");
                skjultOrd.setText(galgelogik.getVisibleWord());
                alleGæt.setText("Alle gæt: " + galgelogik.getUsedLetters());
                if (galgelogik.getCorrectLetter()) {
                    statusTekst.setText("Dette bogstav var korrekt: " + t.getText().toString());
                } else {
                    statusTekst.setText("Dette bogstav var IKKE korrekt: " + t.getText().toString());
                }
                t.setVisibility(View.INVISIBLE);
                break;

            case R.id.y_BTN:
                galgelogik.letterGuess("y");
                skjultOrd.setText(galgelogik.getVisibleWord());
                alleGæt.setText("Alle gæt: " + galgelogik.getUsedLetters());
                if (galgelogik.getCorrectLetter()) {
                    statusTekst.setText("Dette bogstav var korrekt: " + y.getText().toString());
                } else {
                    statusTekst.setText("Dette bogstav var IKKE korrekt: " + y.getText().toString());
                }
                y.setVisibility(View.INVISIBLE);
                break;

            case R.id.u_BTN:
                galgelogik.letterGuess("u");
                skjultOrd.setText(galgelogik.getVisibleWord());
                alleGæt.setText("Alle gæt: " + galgelogik.getUsedLetters());
                if (galgelogik.getCorrectLetter()) {
                    statusTekst.setText("Dette bogstav var korrekt: " + u.getText().toString());
                } else {
                    statusTekst.setText("Dette bogstav var IKKE korrekt: " + u.getText().toString());
                }
                u.setVisibility(View.INVISIBLE);
                break;

            case R.id.i_BTN:
                galgelogik.letterGuess("i");
                skjultOrd.setText(galgelogik.getVisibleWord());
                alleGæt.setText("Alle gæt: " + galgelogik.getUsedLetters());
                if (galgelogik.getCorrectLetter()) {
                    statusTekst.setText("Dette bogstav var korrekt: " + i.getText().toString());
                } else {
                    statusTekst.setText("Dette bogstav var IKKE korrekt: " + i.getText().toString());
                }
                i.setVisibility(View.INVISIBLE);
                break;

            case R.id.o_BTN:
                galgelogik.letterGuess("o");
                skjultOrd.setText(galgelogik.getVisibleWord());
                alleGæt.setText("Alle gæt: " + galgelogik.getUsedLetters());
                if (galgelogik.getCorrectLetter()) {
                    statusTekst.setText("Dette bogstav var korrekt: " + o.getText().toString());
                } else {
                    statusTekst.setText("Dette bogstav var IKKE korrekt: " + o.getText().toString());
                }
                o.setVisibility(View.INVISIBLE);
                break;

            case R.id.p_BTN:
                galgelogik.letterGuess("p");
                skjultOrd.setText(galgelogik.getVisibleWord());
                alleGæt.setText("Alle gæt: " + galgelogik.getUsedLetters());
                if (galgelogik.getCorrectLetter()) {
                    statusTekst.setText("Dette bogstav var korrekt: " + p.getText().toString());
                } else {
                    statusTekst.setText("Dette bogstav var IKKE korrekt: " + p.getText().toString());
                }
                p.setVisibility(View.INVISIBLE);
                break;

            case R.id.å_BTN:
                galgelogik.letterGuess("å");
                skjultOrd.setText(galgelogik.getVisibleWord());
                alleGæt.setText("Alle gæt: " + galgelogik.getUsedLetters());
                if (galgelogik.getCorrectLetter()) {
                    statusTekst.setText("Dette bogstav var korrekt: " + å.getText().toString());
                } else {
                    statusTekst.setText("Dette bogstav var IKKE korrekt: " + å.getText().toString());
                }
                å.setVisibility(View.INVISIBLE);
                break;

            case R.id.a_BTN:
                galgelogik.letterGuess("a");
                skjultOrd.setText(galgelogik.getVisibleWord());
                alleGæt.setText("Alle gæt: " + galgelogik.getUsedLetters());
                if (galgelogik.getCorrectLetter()) {
                    statusTekst.setText("Dette bogstav var korrekt: " + a.getText().toString());
                } else {
                    statusTekst.setText("Dette bogstav var IKKE korrekt: " + a.getText().toString());
                }
                a.setVisibility(View.INVISIBLE);
                break;

            case R.id.s_BTN:
                galgelogik.letterGuess("s");
                skjultOrd.setText(galgelogik.getVisibleWord());
                alleGæt.setText("Alle gæt: " + galgelogik.getUsedLetters());
                if (galgelogik.getCorrectLetter()) {
                    statusTekst.setText("Dette bogstav var korrekt: " + s.getText().toString());
                } else {
                    statusTekst.setText("Dette bogstav var IKKE korrekt: " + s.getText().toString());
                }
                s.setVisibility(View.INVISIBLE);
                break;

            case R.id.d_BTN:
                galgelogik.letterGuess("d");
                skjultOrd.setText(galgelogik.getVisibleWord());
                alleGæt.setText("Alle gæt: " + galgelogik.getUsedLetters());
                if (galgelogik.getCorrectLetter()) {
                    statusTekst.setText("Dette bogstav var korrekt: " + d.getText().toString());
                } else {
                    statusTekst.setText("Dette bogstav var IKKE korrekt: " + d.getText().toString());
                }
                d.setVisibility(View.INVISIBLE);
                break;

            case R.id.f_BTN:
                galgelogik.letterGuess("f");
                skjultOrd.setText(galgelogik.getVisibleWord());
                alleGæt.setText("Alle gæt: " + galgelogik.getUsedLetters());
                if (galgelogik.getCorrectLetter()) {
                    statusTekst.setText("Dette bogstav var korrekt: " + f.getText().toString());
                } else {
                    statusTekst.setText("Dette bogstav var IKKE korrekt: " + f.getText().toString());
                }
                f.setVisibility(View.INVISIBLE);
                break;

            case R.id.g_BTN:
                galgelogik.letterGuess("g");
                skjultOrd.setText(galgelogik.getVisibleWord());
                alleGæt.setText("Alle gæt: " + galgelogik.getUsedLetters());
                if (galgelogik.getCorrectLetter()) {
                    statusTekst.setText("Dette bogstav var korrekt: " + g.getText().toString());
                } else {
                    statusTekst.setText("Dette bogstav var IKKE korrekt: " + g.getText().toString());
                }
                g.setVisibility(View.INVISIBLE);
                break;

            case R.id.h_BTN:
                galgelogik.letterGuess("h");
                skjultOrd.setText(galgelogik.getVisibleWord());
                alleGæt.setText("Alle gæt: " + galgelogik.getUsedLetters());
                if (galgelogik.getCorrectLetter()) {
                    statusTekst.setText("Dette bogstav var korrekt: " + h.getText().toString());
                } else {
                    statusTekst.setText("Dette bogstav var IKKE korrekt: " + h.getText().toString());
                }
                h.setVisibility(View.INVISIBLE);
                break;

            case R.id.j_BTN:
                galgelogik.letterGuess("j");
                skjultOrd.setText(galgelogik.getVisibleWord());
                alleGæt.setText("Alle gæt: " + galgelogik.getUsedLetters());
                if (galgelogik.getCorrectLetter()) {
                    statusTekst.setText("Dette bogstav var korrekt: " + j.getText().toString());
                } else {
                    statusTekst.setText("Dette bogstav var IKKE korrekt: " + j.getText().toString());
                }
                j.setVisibility(View.INVISIBLE);
                break;

            case R.id.k_BTN:
                galgelogik.letterGuess("k");
                skjultOrd.setText(galgelogik.getVisibleWord());
                alleGæt.setText("Alle gæt: " + galgelogik.getUsedLetters());
                if (galgelogik.getCorrectLetter()) {
                    statusTekst.setText("Dette bogstav var korrekt: " + k.getText().toString());
                } else {
                    statusTekst.setText("Dette bogstav var IKKE korrekt: " + k.getText().toString());
                }
                k.setVisibility(View.INVISIBLE);
                break;

            case R.id.l_BTN:
                galgelogik.letterGuess("l");
                skjultOrd.setText(galgelogik.getVisibleWord());
                alleGæt.setText("Alle gæt: " + galgelogik.getUsedLetters());
                if (galgelogik.getCorrectLetter()) {
                    statusTekst.setText("Dette bogstav var korrekt: " + l.getText().toString());
                } else {
                    statusTekst.setText("Dette bogstav var IKKE korrekt: " + l.getText().toString());
                }
                l.setVisibility(View.INVISIBLE);
                break;

            case R.id.æ_BTN:
                galgelogik.letterGuess("æ");
                skjultOrd.setText(galgelogik.getVisibleWord());
                alleGæt.setText("Alle gæt: " + galgelogik.getUsedLetters());
                if (galgelogik.getCorrectLetter()) {
                    statusTekst.setText("Dette bogstav var korrekt: " + æ.getText().toString());
                } else {
                    statusTekst.setText("Dette bogstav var IKKE korrekt: " + æ.getText().toString());
                }
                æ.setVisibility(View.INVISIBLE);
                break;

            case R.id.ø_BTN:
                galgelogik.letterGuess("ø");
                skjultOrd.setText(galgelogik.getVisibleWord());
                alleGæt.setText("Alle gæt: " + galgelogik.getUsedLetters());
                if (galgelogik.getCorrectLetter()) {
                    statusTekst.setText("Dette bogstav var korrekt: " + ø.getText().toString());
                } else {
                    statusTekst.setText("Dette bogstav var IKKE korrekt: " + ø.getText().toString());
                }
                ø.setVisibility(View.INVISIBLE);
                break;

            case R.id.z_BTN:
                galgelogik.letterGuess("z");
                skjultOrd.setText(galgelogik.getVisibleWord());
                alleGæt.setText("Alle gæt: " + galgelogik.getUsedLetters());
                if (galgelogik.getCorrectLetter()) {
                    statusTekst.setText("Dette bogstav var korrekt: " + z.getText().toString());
                } else {
                    statusTekst.setText("Dette bogstav var IKKE korrekt: " + z.getText().toString());
                }
                z.setVisibility(View.INVISIBLE);
                break;

            case R.id.x_BTN:
                galgelogik.letterGuess("x");
                skjultOrd.setText(galgelogik.getVisibleWord());
                alleGæt.setText("Alle gæt: " + galgelogik.getUsedLetters());
                if (galgelogik.getCorrectLetter()) {
                    statusTekst.setText("Dette bogstav var korrekt: " + x.getText().toString());
                } else {
                    statusTekst.setText("Dette bogstav var IKKE korrekt: " + x.getText().toString());
                }
                x.setVisibility(View.INVISIBLE);
                break;

            case R.id.c_BTN:
                galgelogik.letterGuess("c");
                skjultOrd.setText(galgelogik.getVisibleWord());
                alleGæt.setText("Alle gæt: " + galgelogik.getUsedLetters());
                if (galgelogik.getCorrectLetter()) {
                    statusTekst.setText("Dette bogstav var korrekt: " + c.getText().toString());
                } else {
                    statusTekst.setText("Dette bogstav var IKKE korrekt: " + c.getText().toString());
                }
                c.setVisibility(View.INVISIBLE);
                break;

            case R.id.v_BTN:
                galgelogik.letterGuess("v");
                skjultOrd.setText(galgelogik.getVisibleWord());
                alleGæt.setText("Alle gæt: " + galgelogik.getUsedLetters());
                if (galgelogik.getCorrectLetter()) {
                    statusTekst.setText("Dette bogstav var korrekt: " + v.getText().toString());
                } else {
                    statusTekst.setText("Dette bogstav var IKKE korrekt: " + v.getText().toString());
                }
                v.setVisibility(View.INVISIBLE);
                break;

            case R.id.b_BTN:
                galgelogik.letterGuess("b");
                skjultOrd.setText(galgelogik.getVisibleWord());
                alleGæt.setText("Alle gæt: " + galgelogik.getUsedLetters());
                if (galgelogik.getCorrectLetter()) {
                    statusTekst.setText("Dette bogstav var korrekt: " + b.getText().toString());
                } else {
                    statusTekst.setText("Dette bogstav var IKKE korrekt: " + b.getText().toString());
                }
                b.setVisibility(View.INVISIBLE);
                break;

            case R.id.n_BTN:
                galgelogik.letterGuess("n");
                skjultOrd.setText(galgelogik.getVisibleWord());
                alleGæt.setText("Alle gæt: " + galgelogik.getUsedLetters());
                if (galgelogik.getCorrectLetter()) {
                    statusTekst.setText("Dette bogstav var korrekt: " + n.getText().toString());
                } else {
                    statusTekst.setText("Dette bogstav var IKKE korrekt: " + n.getText().toString());
                }
                n.setVisibility(View.INVISIBLE);
                break;

            case R.id.m_BTN:
                galgelogik.letterGuess("m");
                skjultOrd.setText(galgelogik.getVisibleWord());
                alleGæt.setText("Alle gæt: " + galgelogik.getUsedLetters());
                if (galgelogik.getCorrectLetter()) {
                    statusTekst.setText("Dette bogstav var korrekt: " + m.getText().toString());
                } else {
                    statusTekst.setText("Dette bogstav var IKKE korrekt: " + m.getText().toString());
                }
                m.setVisibility(View.INVISIBLE);
                break;

        }

        switch(galgelogik.getNrOfWrongLetters()) {
            case 1: galge.setImageResource(R.drawable.forkert1);
                break;
            case 2: galge.setImageResource(R.drawable.forkert2);
                break;
            case 3: galge.setImageResource(R.drawable.forkert3);
                break;
            case 4: galge.setImageResource(R.drawable.forkert4);
                break;
            case 5: galge.setImageResource(R.drawable.forkert5);
                break;
            case 6: galge.setImageResource(R.drawable.forkert6);
                break;
            case 7:
                    galgelogik.setLoss();
                break;

        }
        if (galgelogik.getLossStatus()) {

            FinishgameFrag fragment = new FinishgameFrag();
            Bundle values = new Bundle();
            values.putBoolean("tab", galgelogik.getLossStatus());
            values.putString("ord", galgelogik.getChosenWord());
            fragment.setArguments(values);

            getFragmentManager().beginTransaction()
                    .replace(R.id.fragment_FL, fragment)
                    .addToBackStack(null)
                    .commit();
        }

        System.out.println(galgelogik.getChosenWord());

        if (galgelogik.getWinStatus()) {

            FinishgameFrag fragment = new FinishgameFrag();
            Bundle values = new Bundle();
            values.putBoolean("vind", galgelogik.getWinStatus());
            values.putString("ord", galgelogik.getChosenWord());
            fragment.setArguments(values);

            SharedPreferences SP = PreferenceManager.getDefaultSharedPreferences(getActivity());

            SP.edit().putString("ord", galgelogik.getChosenWord()).apply();
            SP.edit().putInt("score", galgelogik.getNrOfWrongLetters()).apply();

            System.out.println(SP.getInt("score", 0) + SP.getString("ord", " tom"));

            getFragmentManager().beginTransaction()
                    .replace(R.id.fragment_FL, fragment)
                    .addToBackStack(null)
                    .commit();
        }

    }



}
