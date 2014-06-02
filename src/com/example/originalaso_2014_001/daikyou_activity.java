package com.example.originalaso_2014_001;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class daikyou_activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自動生成されたメソッド・スタブ
		super.onCreate(savedInstanceState);
		setContentView(R.layout.daikyou_activity);

		Intent intent = getIntent();
		String name = intent.getStringExtra( "name" );

		TextView tv1 = (TextView)findViewById(R.id.text);
		tv1.setText( name + "さんの今日の運命は・・・");

	}
}
