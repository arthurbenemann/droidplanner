package org.droidplanner.android.checklist.row;

import org.droidplanner.R;
import org.droidplanner.android.checklist.CheckListItem;

import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class BaseViewHolder {
	protected LinearLayout layoutView;
	protected CheckBox checkBox;
	
	public BaseViewHolder(ViewGroup viewGroup, CheckListItem checkListItem) {
		this.layoutView = (LinearLayout) viewGroup
				.findViewById(R.id.lst_layout);
		this.checkBox = (CheckBox) viewGroup.findViewById(R.id.lst_check);
		setupViewItems(viewGroup, checkListItem);
	}

	protected void setupViewItems(ViewGroup viewGroup, CheckListItem checkListItem){
		
	}
}