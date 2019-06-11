package cn.jbolt.common.config;

import cn.jbolt.common.util.DateUtil;

/**   
 * 上传控制 定义的目录
 * @ClassName:  UploadFolder   
 * @author: JFinal学院-小木 QQ：909854136 
 * @date:   2019年3月24日 上午12:00:48   
 *    
 * 注意：本内容仅限于JFinal学院 JBolt平台VIP成员内部传阅，请尊重开发者劳动成果，不要外泄出去用于其它商业目的
 */
public class UploadFolder {
	
	public static String todayFolder(){
		return DateUtil.getNowStr("yyyyMMdd");
	}
	public static final String MALL_GOODS_IMAGE="mall/goods";
	public static final String MALL_BRAND_IMAGE="mall/brand";
	public static final String WECHAT_MPINFO="wechat/mpinfo";

}
