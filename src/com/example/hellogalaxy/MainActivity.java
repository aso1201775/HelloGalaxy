package com.example.hellogalaxy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {
@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
protected void onResume() {
	// TODO 自動生成されたメソッド・スタブ
	super.onResume();
	// ボタンをIDで探してボタン変数をつくる
	Button btnOK = (Button)findViewById(R.id.btnOK);
	// ボタン変数にリスナーを登録する
	btnOK.setOnClickListener(this);
}

	@Override
public void onClick(View v) {
	// TODO 自動生成されたメソッド・スタブ
		switch(v.getId()){
		case R.id.btnOK: //btnOKが押されたら
			// エディットテキストから入力内容を取り出す
			EditText etv = (EditText)findViewById(R.id.edtFirst);
				String inputMsg = etv.getText().toString();
			EditText etv2 = (EditText)findViewById(R.id.edtFamily);
					String inputMsg2 = etv2.getText().toString();

			TextView tv = (TextView)findViewById(R.id.txvMsg);
			Intent intent = new Intent(MainActivity.this, MsgActivity.class);
			startActivity(intent);
		}
}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
