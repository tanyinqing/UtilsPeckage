package com.example.utilspeckage;



import java.util.List;

import com.example.utilspeckage.entity.District;
import com.example.utilspeckage.listener.DataListener;
import com.example.utilspeckage.web.BaseWeb;
import com.example.utilspeckage.web.OrderWeb;
import com.lidroid.xutils.http.RequestParams;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

//123
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		OrderWeb mOrderWeb=new OrderWeb(this);
		mOrderWeb.goToPay(new DataListener<List<District>>(){
			@Override
			public void onSuccess(List<District> data) {
				for(int i=1;i<data.size();i++){
					Log.d("tanyinqing", data.toString());
					Log.d("tanyinqing", "*************************************");
					Log.d("tanyinqing", "*************************************");
					Log.d("tanyinqing", "*************************************");
				}
				
			}
		});
		
	}	
	

}
