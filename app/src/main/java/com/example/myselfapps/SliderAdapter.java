package com.example.myselfapps;
//Nama : Rizky Muslimin
//NIM : 10118002
//Kelas : IF-1
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

import com.apps.myselfapps.R;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){

        this.context = context;
    }

    //Arrays
    public int[] slide_images = {
            R.drawable.user,
            R.drawable.contacts,
            R.drawable.owl_icon
    };

    public String[] slide_headings = {
            "MySelfApps",
            "CHAT",
            "JANGAN LUPA BERISTIRAHAT"
    };

    public String[] slide_descs = {
            "MySelfApps adalah aplikasi yang berisikan biodata pembuat aplikasi ini",
            "Meengobrol dengan saya agar bisa mengenal saya lebih jauh",
            "Jangan seperti saya tidak tidur bikin tugas"
    };

    @Override
    public int getCount() {
        return slide_headings.length;

    }

    @Override
    public boolean isViewFromObject(View view, Object o) {

        return view == (ConstraintLayout) o;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.slide_image);
        TextView slideHeading = (TextView) view.findViewById(R.id.slide_headings);
        TextView slideDescription = (TextView) view.findViewById(R.id.slide_desc);

        slideImageView.setImageResource(slide_images[position]);
        slideHeading.setText(slide_headings[position]);
        slideDescription.setText(slide_descs[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ConstraintLayout)object);
    }
}
