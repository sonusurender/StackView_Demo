package com.android_stackview_demo;

import java.util.ArrayList;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.StackView;

public class MainActivity extends ActionBarActivity {
	private static StackView stackView;
	private static ArrayList<Stack_Items> list;
	
	//Integer array for images
	private static final Integer[] icons = { R.drawable.a, R.drawable.b,
			R.drawable.c, R.drawable.d };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		stackView = (StackView) findViewById(R.id.stackView1);
		list = new ArrayList<Stack_Items>();

		//Adding items to the list
		for (int i = 0; i < icons.length; i++) {
			list.add(new Stack_Items("Item " + i, icons[i]));
		}
		
		//Calling adapter and setting it over stackview
		Stack_Adapter adapter = new Stack_Adapter(MainActivity.this, list);
		stackView.setAdapter(adapter);
		adapter.notifyDataSetChanged();
	}

}
