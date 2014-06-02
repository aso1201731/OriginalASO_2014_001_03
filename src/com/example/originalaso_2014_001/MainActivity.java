package com.example.originalaso_2014_001;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		//Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ
		switch(v.getId()) {
			case R.id.button:
				EditText etv1 = (EditText)findViewById(R.id.text);
				String inputMsg = etv1.getText().toString();

				Random rnd = new Random();
				int ran = rnd.nextInt(4);

				Intent intent = null;
				switch(ran) {
					case 0: //大吉へ遷移
						intent = new Intent(MainActivity.this, daikiti_activity.class);
						break;

					case 1://中吉へ遷移
						intent = new Intent(MainActivity.this, tyukiti_activity.class);
						break;

					case 2://凶へ遷移
						intent = new Intent(MainActivity.this, kyou_activity.class);
						break;

					case 3://大凶へ遷移
						intent = new Intent(MainActivity.this, daikyou_activity.class);
						break;


				}
				intent.putExtra("name", inputMsg);
				startActivity(intent);
				break;
		}

	}

	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();
		Button button = (Button)findViewById(R.id.button);
		button.setOnClickListener(this);
	}





}
