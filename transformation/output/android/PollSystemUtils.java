package com.example.fr.istic.m2miage.idm.pollsystemandroid;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableLayout.LayoutParams;
import android.widget.TextView;

public class PollSystemUtils {
	
	public static void addComponent(ScrollView parent, View child){
		parent.addView(child);
	}
	
	public static RadioGroup addRadioGroup(Context ctx, TableLayout parent, String ...options){
		RadioGroup rg = new RadioGroup(ctx);
		
		for(String o : options){
			RadioButton rb = new RadioButton(ctx);
			rb.setText(o);
			rg.addView(rb);
		}
		parent.addView(rg);
		return rg;
	}

	public static void addTextView(Context ctx, TableLayout parent, String text){
		TextView tv = new TextView(ctx);
		tv.setText(text);
		parent.addView(tv);
	}
	
	public static EditText addTextField(Context ctx, TableLayout parent){
		EditText et = new EditText(ctx);
		parent.addView(et);
		return et;
	}
	
	public static ImageView addImageView(Context ctx, TableLayout parent, int questionImage1){
		ImageView iv = new ImageView(ctx);
		iv.setImageResource(questionImage1);
		LayoutParams params = new LayoutParams();
		params.height =500;
		iv.setLayoutParams(params);
		parent.addView(iv);
		return iv;
	}

	public static CheckBox[] addCheckBox(Context ctx, TableLayout parent, String ...options) {
		int cnt = options.length;
		CheckBox[] cbx = new CheckBox[cnt];
		int i = 0;
		for(String o : options){
			cbx[i] = new CheckBox(ctx);
			cbx[i].setText(o);
			parent.addView(cbx[i]);
			i++;
		}
		return cbx;
	}

	public static Button addButton(Context ctx, TableLayout parent, String text) {
		Button btn = new Button(ctx);
		btn.setText(text);
		parent.addView(btn);
		return btn;
	}
}

