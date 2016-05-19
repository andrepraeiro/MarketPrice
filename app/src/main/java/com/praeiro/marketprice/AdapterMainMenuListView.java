package com.praeiro.marketprice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 26586 on 19/05/2016.
 */
public class AdapterMainMenuListView extends BaseAdapter{
    private LayoutInflater mInflater;
    private List<MainMenuItemListView> itens;

    public AdapterMainMenuListView(Context context, List<MainMenuItemListView> itens){
        this.itens = itens;
        this.mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return itens.size();
    }

    @Override
    public Object getItem(int position) {
        return itens.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ItemMenu itemHolder;
        if (convertView == null){
            convertView = mInflater.inflate(R.layout.main_menu_item_list, null);
            itemHolder = new ItemMenu();
            itemHolder.textTitle = (TextView) convertView.findViewById(R.id.text);
            itemHolder.imgIcon = (ImageView) convertView.findViewById(R.id.imageview);
            convertView.setTag(itemHolder);
        }
        else {
            itemHolder = (ItemMenu) convertView.getTag();
        }
        MainMenuItemListView item = itens.get(position);
        itemHolder.textTitle.setText(item.getTexto());
        itemHolder.imgIcon.setImageResource(item.getIconeRid());

        return convertView;
    }

    private class ItemMenu {
        ImageView imgIcon;
        TextView textTitle;
    }
}
