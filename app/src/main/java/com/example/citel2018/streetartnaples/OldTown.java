package com.example.citel2018.streetartnaples;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class OldTown extends Fragment {

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        getActivity().setTitle("Old Town");

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.content_main, container, false);

        //creation of array list of Street Art Operas
        ArrayList<Opera> opere = new ArrayList<Opera>();

        opere.add(new Opera(R.drawable.ot_image1,R.string.mt_opera1_author,R.string.mt_opera1_name, R.string.mt_opera1_address,R.string.mt_opera1_desc));
        opere.add(new Opera(R.drawable.ot_image2,R.string.mt_opera2_author,R.string.mt_opera2_name, R.string.mt_opera2_address,R.string.mt_opera2_desc));
        opere.add(new Opera(R.drawable.ot_image3,R.string.mt_opera3_author,R.string.mt_opera3_name, R.string.mt_opera3_address,R.string.mt_opera3_desc));
        opere.add(new Opera(R.drawable.ot_image4,R.string.mt_opera4_author,R.string.mt_opera4_name, R.string.mt_opera4_address,R.string.mt_opera4_desc));
        opere.add(new Opera(R.drawable.ot_image5,R.string.mt_opera5_author,R.string.mt_opera5_name, R.string.mt_opera5_address,R.string.mt_opera5_desc));
        opere.add(new Opera(R.drawable.ot_image6,R.string.mt_opera6_author,R.string.mt_opera6_name, R.string.mt_opera6_address,R.string.mt_opera6_desc));
        opere.add(new Opera(R.drawable.ot_image7,R.string.mt_opera7_author,R.string.mt_opera7_name, R.string.mt_opera7_address,R.string.mt_opera7_desc));

        //creation of a custom adapter named  OPERA ADAPTER with this context (oldTown) and object OPERE
        //adapter knows how to create list items for each item in the list.
        OperaAdapter adapter = new OperaAdapter(getActivity(), opere);

        // Find the ListView object
        // There should be a ListView with the view ID called list, which is declared in the
        // content_main.xml layout file.
        ListView listView = view.findViewById(R.id.list);

        listView.setAdapter(adapter);


        return view;


    }


}
