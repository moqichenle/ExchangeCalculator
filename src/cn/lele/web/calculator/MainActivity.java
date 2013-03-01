package cn.lele.web.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);//tell activity to use the layout
		Button calculateButton = (Button) findViewById(R.id.calculatebutton);//find view by id all the time~~~~~first,after getting layout
		calculateButton.setOnClickListener(this.calculateButtonListener);
	}

	private OnClickListener calculateButtonListener = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			EditText getUserInput = (EditText) findViewById(R.id.userinput);
			String inputValue = getUserInput.getText().toString();
			if (!inputValue.equals("")) {
				double parsedDouble = Double.parseDouble(inputValue);
				parsedDouble = parsedDouble * 8;
				TextView resultView = (TextView) findViewById(R.id.showresult);
				resultView.setText(parsedDouble+"￥");
			}
		}
	};
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
