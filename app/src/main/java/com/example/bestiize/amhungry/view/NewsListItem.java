package com.example.bestiize.amhungry.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.bestiize.amhungry.R;
import com.example.bestiize.amhungry.models.News;
import com.example.bestiize.amhungry.models.Restaurant;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Transformation;

/**
 * Created by Bestiize on 9/17/2015.
 */
public class NewsListItem extends RelativeLayout {
    private Context context;
    private ImageView imageView;
    private TextView textView;

    public NewsListItem(Context context) {
        super(context);
        this.context = context;
        initView();

    }

    public void initView() {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.view_list_news, this, true);

        imageView = (ImageView) view.findViewById(R.id.imageNews);
        textView = (TextView) view.findViewById(R.id.textView);

    }

    public void fill(Restaurant newsData, int position) {
        position = position+1;
        Picasso.with(this.context).load(newsData.getPic()).into(imageView);
        textView.setText("Name: " + newsData.getName()
                        + "\nPrice: " + newsData.getPrice()



        );
        // imageView.setImageResource(R.mipmap.ic_launcher);

    }


}

