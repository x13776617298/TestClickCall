package com.android.contacts.test;

import com.android.contacts.activities.DialtactsActivity;
import com.android.contacts.dialpad.DigitsEditText;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.test.ActivityInstrumentationTestCase2;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import com.android.contacts.R;

@SuppressLint("NewApi")
public class TestActivity extends
		ActivityInstrumentationTestCase2<DialtactsActivity> {

	private static final String TAG = "TestActivity";
	private DialtactsActivity dialtactsActivity = null;
	private EditText editText = null;
	private ImageButton callButton = null;

	public TestActivity() {
		super(DialtactsActivity.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		Logger.d(TAG, "setUp");
//		Intent intent = new Intent("android.intent.action.DIAL");
//		setActivityIntent(intent);

/*		Intent intent=new Intent(Intent.ACTION_CALL,Uri.parse("tel:"+"13621048982"));
		setActivityIntent(intent);*/
		dialtactsActivity = getActivity();
		View fragmentView = LayoutInflater.from(dialtactsActivity).inflate(
				R.layout.dialpad_fragment, null, false);
//		editText = (EditText) fragmentView.findViewById(R.id.digits);
//		Logger.d(TAG, "x11111111111111111111111111111" + editText);
//		editText.setText("13552742517");
		callButton = (ImageButton) fragmentView
				.findViewById(R.id.dialButton);
		Logger.d(TAG, "888888888888888888888888888888888888" + callButton);
	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
		Logger.d(TAG, "tearDown");
		// dialtactsActivity.finish();
	}

	public void testCallActivity() {
		Logger.d(TAG, "testCallActivity");
		getInstrumentation().runOnMainSync(new PerformClick(callButton));
	}

	private class PerformClick implements Runnable {

		private ImageButton callButton = null;

		public PerformClick(ImageButton callButton) {
			this.callButton = callButton;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			callButton.performClick();
			Logger.d(TAG, "999999999999999999999999999999999999999999");
		}

	}
}
