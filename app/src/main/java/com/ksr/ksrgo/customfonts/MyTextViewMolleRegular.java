package com.ksr.ksrgo.customfonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
/**
 * Grocery App
 * https://github.com/quintuslabs/GroceryStore
 * Created on 18-Feb-2019.
 * Created by : Santosh Kumar Dash:- http://santoshdash.epizy.com
 */

public class MyTextViewMolleRegular extends TextView {

    public MyTextViewMolleRegular(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public MyTextViewMolleRegular(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyTextViewMolleRegular(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/Molle-Regular.ttf");
            setTypeface(tf);
        }
    }

}