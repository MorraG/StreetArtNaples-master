package com.example.citel2018.streetartnaples;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;


public class Materdei extends Fragment /*implements View.OnClickListener*/ {

    /*// I don't know why is mandatory this override - trying button maps failed
    @Override
    public void onClick(View v){}*/

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        getActivity().setTitle(getString(R.string.materdeiFragTitle));


    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.content_main, container, false);

        //creation of array list of Street Art Operas
        ArrayList<Opera> opere = new ArrayList<Opera>();

        opere.add(new Opera(R.drawable.mt_image1, R.string.mt_opera1_author, R.string.mt_opera1_name, R.string.mt_opera1_address, R.string.mt_opera1_desc, R.string.mt_opera1_location));
        opere.add(new Opera(R.drawable.mt_image2, R.string.mt_opera2_author, R.string.mt_opera2_name, R.string.mt_opera2_address, R.string.mt_opera2_desc, R.string.mt_opera2_location));
        opere.add(new Opera(R.drawable.mt_image3, R.string.mt_opera3_author, R.string.mt_opera3_name, R.string.mt_opera3_address, R.string.mt_opera3_desc, R.string.mt_opera3_location));
        opere.add(new Opera(R.drawable.mt_image4, R.string.mt_opera4_author, R.string.mt_opera4_name, R.string.mt_opera4_address, R.string.mt_opera4_desc, R.string.mt_opera4_location));
        opere.add(new Opera(R.drawable.mt_image5, R.string.mt_opera5_author, R.string.mt_opera5_name, R.string.mt_opera5_address, R.string.mt_opera5_desc, R.string.mt_opera5_location));
        opere.add(new Opera(R.drawable.mt_image6, R.string.mt_opera6_author, R.string.mt_opera6_name, R.string.mt_opera6_address, R.string.mt_opera6_desc, R.string.mt_opera6_location));
        opere.add(new Opera(R.drawable.mt_image7, R.string.mt_opera7_author, R.string.mt_opera7_name, R.string.mt_opera7_address, R.string.mt_opera7_desc, R.string.mt_opera7_location));
        opere.add(new Opera(R.drawable.mt_image8, R.string.mt_opera8_author, R.string.mt_opera8_name, R.string.mt_opera8_address, R.string.mt_opera8_desc, R.string.mt_opera8_location));

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
