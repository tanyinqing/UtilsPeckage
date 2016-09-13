package com.example.utilspeckage.impl;

import java.util.List;

import com.example.utilspeckage.listener.DataListener;



public interface IOrderWeb {
	
	/**
	 * 创建订单
	 * @param goodsIds 商品id（id多个商品用C相隔,id和购买数量用N隔开）
	 * @param userId 下订单用户id
	 * @param addressId 收件地址id
	 * @param payMethodId 付款方式id 现在只有货到付款，id=1
	 * @param remark 备注
	 * @param discountCode 优惠券号码
	 * @param dataListener
	 */
	public void createOrder(String goodsIds,String userId,String addressId,String payMethodId,String remark,String discountCode,final DataListener dataListener);

	
}
