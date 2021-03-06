package com.mac.taiyitong.adapter;

import java.util.List;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.mac.taiyitong.R;
import com.mac.taiyitong.entity.Device;

public class MainDeviceListAdapter extends BaseAdapter {

	private Context context;
	private List<Device> list;

	public MainDeviceListAdapter(Context context, List<Device> list) {
		super();
		this.context = context;
		this.list = list;
	}

	public MainDeviceListAdapter() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder holder = null;
		if (convertView == null) {
			LayoutInflater localinflater = (LayoutInflater) context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = localinflater.inflate(R.layout.simple_listview_item,
					null);
			holder = new ViewHolder();
			holder.textView = (TextView) convertView
					.findViewById(R.id.textView1);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
			resetViewHolder(holder);
		}

		holder.textView.setText(list.get(position).getName());
		if (position == selectItem) {
			convertView.setBackgroundResource(R.drawable.list_check_bg);
		} else {
			convertView.setBackgroundColor(Color.TRANSPARENT);
		}
		return convertView;
	}

	public void setSelectItem(int selectItem) {
		this.selectItem = selectItem;
	}

	private int selectItem = -1;

	class ViewHolder {
		TextView textView;
	}

	void resetViewHolder(ViewHolder viewHolder) {
		viewHolder.textView.setText(null);
	}
}
