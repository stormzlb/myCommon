package com.csmz.mycommon.listview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zlb
 * @date 2019/12/9
 * @function
 */
public class CommonViewHolder {

    public Map<Integer, View> map;
    public View mConvertView;

    public CommonViewHolder(Context context, int layoutId, ViewGroup parent) {
        map = new HashMap<>();
        mConvertView = View.inflate(context, layoutId, null);
        mConvertView.setTag(this);
    }

    public static CommonViewHolder get(Context context, View convertView, int layoutId, ViewGroup parent) {
        if (convertView == null) {
            return new CommonViewHolder(context, layoutId, parent);
        } else {
            return (CommonViewHolder) convertView.getTag();
        }

    }

    public <T extends View> T getView(int viewId) {
        View view = map.get(viewId);
        if (view == null) {
            view = mConvertView.findViewById(viewId);
            map.put(viewId,view);
        }
        return (T) view;
    }

    public View getConvertView() {
        return mConvertView;
    }

}
