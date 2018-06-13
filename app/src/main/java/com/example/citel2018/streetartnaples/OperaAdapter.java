package com.example.citel2018.streetartnaples;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.ArrayAdapter;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class OperaAdapter extends ArrayAdapter<Opera> {

private ArrayList<Opera> dataSet;
Context mContext;


/**
 * Create a new OperaAdapter object
 * @param
 * @param opere*/

public OperaAdapter(Context context, ArrayList<Opera> opere){
    super(context,R.layout.list_item, (List<Opera>) opere);
}

    @Override
    public View getView(

            int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the Opera object located at this position in the list
        final Opera opera = getItem(position);

        //find the pointer icon
        ImageButton pinter = (ImageButton) listItemView.findViewById(R.id.pointer);

        //start navigation from the current location
        pinter.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                String uri = "http://maps.google.com/maps?daddr="+mContext.getString(opera.getLocation());
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));

                //start activity using the context.
                mContext.startActivity(intent);
            }
        });


        // Find the TextView in the list_item.xml layout with the ID autore_text_view.
        TextView autoreTextView = (TextView) listItemView.findViewById(R.id.autore_text_view);
        // Get the autore from the currentOpera object and set this text on
        // the autore TextView.
        autoreTextView.setText(opera.getStreetAuthorId());

        // Find the TextView in the list_item.xml layout with the ID titolo_text_view.
        TextView titoloTextView = (TextView) listItemView.findViewById(R.id.titolo_text_view);
        // Get the titolo from the currentOpera object and set this text on
        // the default TextView.
        titoloTextView.setText(opera.getStreetTitleId());

        // Find the TextView in the list_item.xml layout with the ID address_text_view.
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.default_address_text_view1);
        // Get the address from the currentOpera object and set this text on
        // the default TextView.
        addressTextView.setText(opera.getStreetAddressId());

        // Find the TextView in the list_item.xml layout with the ID description_text_view.
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.default_description_text_view2);
        // Get the description from the currentOpera object and set this text on
        // the default TextView.
        descriptionTextView.setText(opera.getStreetDescriptionId());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Get the image from the currentOpera object and set this text on
        // the default imageview.
        imageView.setImageResource(opera.getStreetImageResourceId());
        return listItemView;
    }}
