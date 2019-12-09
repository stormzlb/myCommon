package com.csmz.mycommon.listview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * @author zlb
 * @date 2019/12/9
 * @function
 */
public abstract class CommonAdapter<T> extends BaseAdapter {

    public Context mContext;
    public List<T> mList;
    public int mLayoutId;

    public CommonAdapter(Context mContext, List<T> mList, int layoutId) {
        this.mContext = mContext;
        this.mList = mList;
        this.mLayoutId = layoutId;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int i) {
        return mList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        CommonViewHolder viewHolder = CommonViewHolder.get(mContext, convertView, mLayoutId, viewGroup);
        convert(viewHolder, mList.get(position), position);
        return viewHolder.getConvertView();
    }


    /**
     * 这个就是留给具体Adapter实现的方法
     *
     * @param viewHolder
     * @param data
     * @param position
     */
    protected abstract void convert(CommonViewHolder viewHolder, T data, int position);
}
