package com.csmz.mycommon.listview;

import android.content.Context;
import android.widget.TextView;

import com.csmz.mycommon.R;

import java.util.List;

/**
 * @author zlb
 * @date 2019/12/9
 * @function
 */
public class MainAdapter extends CommonAdapter<String> {

    public MainAdapter(Context mContext, List<String> mList, int layoutId) {
        super(mContext, mList, layoutId);
    }

    @Override
    protected void convert(CommonViewHolder viewHolder, String data, int position) {
        TextView titleTv= viewHolder.getView(R.id.tvText);
        titleTv.setText(data);
    }

}
