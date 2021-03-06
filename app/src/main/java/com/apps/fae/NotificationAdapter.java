package com.apps.fae;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by androids on 2016/10/21.
 */
public class NotificationAdapter extends BaseAdapter {

    private LayoutInflater mLayInf;

    private List<Notification_Item> Notification_List;

    public NotificationAdapter(Context context, List<Notification_Item> Notification_List) {
        mLayInf = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        this.Notification_List = Notification_List;
    }

    @Override
    public int getCount() {
        return Notification_List.size();
    }

    @Override
    public Object getItem(int position) {
        return Notification_List.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

            View v = mLayInf.inflate(com.apps.fae.R.layout.notification_item1, parent, false);
            TextView txt_Notification_Title = (TextView) v.findViewById(com.apps.fae.R.id.txt_Notification_Title);
            TextView txt_Notification_Content = (TextView) v.findViewById(com.apps.fae.R.id.txt_Notification_Content);
            TextView txt_Notification_Date = (TextView) v.findViewById(com.apps.fae.R.id.txt_Notification_Date);
            TextView txt_Notification_Desc = (TextView) v.findViewById(com.apps.fae.R.id.txt_Notification_Desc);

//        GetServiceData.GetUserPhoto(Notification_List.get(position).GetAuthor_WorkID(),Img_Notification_Author);

            txt_Notification_Title.setText(Notification_List.get(position).GetModel_Title());
            txt_Notification_Content.setText(Notification_List.get(position).GetType_Title());
            txt_Notification_Date.setText(Notification_List.get(position).GetDate());
            txt_Notification_Desc.setText(Notification_List.get(position).GetVersion());



            return v;


    }
}
