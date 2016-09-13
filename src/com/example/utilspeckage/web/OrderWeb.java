package com.example.utilspeckage.web;

import java.lang.reflect.Type;
import java.util.List;

import com.example.utilspeckage.entity.District;
import com.example.utilspeckage.impl.IOrderWeb;
import com.example.utilspeckage.listener.DataListener;
import com.google.gson.reflect.TypeToken;
import com.lidroid.xutils.http.RequestParams;

import android.content.Context;
import android.provider.ContactsContract.RawContacts.Data;
import android.util.Log;

/*
 * 测试能否联网的测试语句
 * OrderWeb mOrderWeb=new OrderWeb(this);
mOrderWeb.goToPay(new DataListener<List<District>>(){
	@Override
	public void onSuccess(List<District> data) {
		for(int i=1;i<data.size();i++){
			Log.d("tanyinqing", data.toString());
			
		}
		
	}
});*/
public class OrderWeb extends BaseWeb implements IOrderWeb{
	
	private static String OrderUrl = BaseUrl + "/order/";
	
	//创建订单
	private static String CreateOrderUrl = OrderUrl + "createOrder.do";
	
	private Context context;
	public OrderWeb(Context context) {
		super(context);
		this.context=context;
	}
	

	/**
	* 去拿自付宝的加密数据
	* @param
	* @param
	*/
	public void goToPay(final DataListener<List<District>> listener){
		RequestParams params=new RequestParams();
		post("http://211.149.169.221:8080/umijoyappsvr/common/findDistrict.do", params, new IRequestListener() {
			@Override
			public void onSuccess(String json) {
				Type type=new TypeToken<List<District>>(){}.getType();
				parse(json,type,listener);
			}

			@Override
			public void onFailed() {
				listener.onFailed();
			}
		});
	}


	@Override
	public void createOrder(String goodsIds, String userId, String addressId,
			String payMethodId, String remark, String discountCode,
			DataListener dataListener) {
		// TODO Auto-generated method stub
		
	}


}
