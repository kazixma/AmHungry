
package com.example.bestiize.amhungry.activity;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.bestiize.amhungry.AmhungryApplication;
import com.example.bestiize.amhungry.models.Restaurant;
import com.example.bestiize.amhungry.view.NewsListItem;
import com.example.bestiize.amhungry.view.ResultListItem;

import java.util.List;

/**
 * Created by Bestiize on 9/17/2015.
 */
public class NewsListAdapter extends BaseAdapter {
    private AmhungryApplication amhungryApplication;
    private Context context;
    private List<Restaurant> restaurantList;

    public NewsListAdapter(Context context,List<Restaurant> restaurantList) {
        this.amhungryApplication=(AmhungryApplication)context;
        this.context = context;
        this.restaurantList = restaurantList;
        Log.d("NewsManager", "Adapter");



    }
    @Override
    public int getCount() {
        Log.d("NewsManager","Get Count");
        return restaurantList.size();
    }

    @Override
    public Object getItem(int position) {
        return restaurantList.get(position);
    }

    @Override
    public long getItemId(int position) {

        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        NewsListItem item = createListItem(convertView);
        item.fill(restaurantList.get(position),position);
        return item;
    }
    public  NewsListItem  createListItem(View convertView){

        if(convertView == null || !(convertView instanceof NewsListItem)){
            return new  NewsListItem (this.context);
        }

        return ( NewsListItem )convertView;

    }
}