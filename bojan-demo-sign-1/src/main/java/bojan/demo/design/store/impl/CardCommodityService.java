package bojan.demo.design.store.impl;

import java.util.Map;

import bojan.demo.design.store.ICommodity;
import bojan.demo.design.card.IQiYiCardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CardCommodityService implements ICommodity {
	private Logger logger = LoggerFactory.getLogger(CardCommodityService.class);

	// 模拟注入
	private IQiYiCardService iQiYiCardService = new IQiYiCardService();

	@Override
	public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
		String mobile = queryUserMobile(uId);
		iQiYiCardService.grantToken(mobile, bizId);
	}

	private String queryUserMobile(String uId) {
		return "15200101232";
	}
}
