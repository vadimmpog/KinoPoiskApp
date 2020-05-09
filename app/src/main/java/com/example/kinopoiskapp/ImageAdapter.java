package com.example.kinopoiskapp;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;


public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c){
        mContext = c;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    @Override
    public Object getItem(int position) {
        return mThumbIds[position];
    }//получить картинку возможно не понадобится

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) { // position позиция постера
        ImageView imageView;
        if(convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(378, 540));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        }else {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mThumbIds[position]);// загрузить по ссылке из запроса
        return imageView;
    }

    public	Integer[] mThumbIds = {R.drawable.qwe,R.drawable.qwe1,R.drawable.qwe2, R.drawable.imageborder,R.drawable.imageborder,R.drawable.imageborder}; // наверное массив id фильмов
}
