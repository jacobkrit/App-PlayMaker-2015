package com.mycompany.playmakerjacob1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by jacob on 7/4/2015.
 */
public class LegueOfLegends extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.legue_of_legends);
        TextView textView = (TextView) findViewById(R.id.myText);
        textView.setText("You are in LEGUE OF LEGENDS module");
    }
}
