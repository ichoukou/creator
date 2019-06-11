package cn.jbolt.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSku<M extends BaseSku<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public M setSkuKey(java.lang.String skuKey) {
		set("skuKey", skuKey);
		return (M)this;
	}
	
	public java.lang.String getSkuKey() {
		return getStr("skuKey");
	}

	public M setSkuName(java.lang.String skuName) {
		set("skuName", skuName);
		return (M)this;
	}
	
	public java.lang.String getSkuName() {
		return getStr("skuName");
	}

	public M setName(java.lang.String name) {
		set("name", name);
		return (M)this;
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}

	public M setGoodsId(java.lang.Integer goodsId) {
		set("goodsId", goodsId);
		return (M)this;
	}
	
	public java.lang.Integer getGoodsId() {
		return getInt("goodsId");
	}

	public M setTypeId(java.lang.Integer typeId) {
		set("typeId", typeId);
		return (M)this;
	}
	
	public java.lang.Integer getTypeId() {
		return getInt("typeId");
	}

	public M setPrice(java.math.BigDecimal price) {
		set("price", price);
		return (M)this;
	}
	
	public java.math.BigDecimal getPrice() {
		return get("price");
	}

	public M setOriginalPrice(java.math.BigDecimal originalPrice) {
		set("originalPrice", originalPrice);
		return (M)this;
	}
	
	public java.math.BigDecimal getOriginalPrice() {
		return get("originalPrice");
	}

	public M setStockCount(java.lang.String stockCount) {
		set("stockCount", stockCount);
		return (M)this;
	}
	
	public java.lang.String getStockCount() {
		return getStr("stockCount");
	}

	public M setSubTitle(java.lang.String subTitle) {
		set("subTitle", subTitle);
		return (M)this;
	}
	
	public java.lang.String getSubTitle() {
		return getStr("subTitle");
	}

	public M setOnSale(java.lang.Boolean onSale) {
		set("onSale", onSale);
		return (M)this;
	}
	
	public java.lang.Boolean getOnSale() {
		return get("onSale");
	}

	public M setSellout(java.lang.Boolean sellout) {
		set("sellout", sellout);
		return (M)this;
	}
	
	public java.lang.Boolean getSellout() {
		return get("sellout");
	}

	public M setRealSaleCount(java.lang.Integer realSaleCount) {
		set("realSaleCount", realSaleCount);
		return (M)this;
	}
	
	public java.lang.Integer getRealSaleCount() {
		return getInt("realSaleCount");
	}

	public M setShowSaleCount(java.lang.Integer showSaleCount) {
		set("showSaleCount", showSaleCount);
		return (M)this;
	}
	
	public java.lang.Integer getShowSaleCount() {
		return getInt("showSaleCount");
	}

	public M setMainImage(java.lang.String mainImage) {
		set("mainImage", mainImage);
		return (M)this;
	}
	
	public java.lang.String getMainImage() {
		return getStr("mainImage");
	}

	public M setExtraImages(java.lang.String extraImages) {
		set("extraImages", extraImages);
		return (M)this;
	}
	
	public java.lang.String getExtraImages() {
		return getStr("extraImages");
	}

	public M setIsHot(java.lang.Boolean isHot) {
		set("isHot", isHot);
		return (M)this;
	}
	
	public java.lang.Boolean getIsHot() {
		return get("isHot");
	}

	public M setIsRecommend(java.lang.Boolean isRecommend) {
		set("isRecommend", isRecommend);
		return (M)this;
	}
	
	public java.lang.Boolean getIsRecommend() {
		return get("isRecommend");
	}

	public M setNeedContent(java.lang.Boolean needContent) {
		set("needContent", needContent);
		return (M)this;
	}
	
	public java.lang.Boolean getNeedContent() {
		return get("needContent");
	}

	public M setContentType(java.lang.Integer contentType) {
		set("contentType", contentType);
		return (M)this;
	}
	
	public java.lang.Integer getContentType() {
		return getInt("contentType");
	}

	public M setUnderTime(java.util.Date underTime) {
		set("underTime", underTime);
		return (M)this;
	}
	
	public java.util.Date getUnderTime() {
		return get("underTime");
	}

	public M setOnSaleTime(java.util.Date onSaleTime) {
		set("onSaleTime", onSaleTime);
		return (M)this;
	}
	
	public java.util.Date getOnSaleTime() {
		return get("onSaleTime");
	}

	public M setCreateUserId(java.lang.Integer createUserId) {
		set("createUserId", createUserId);
		return (M)this;
	}
	
	public java.lang.Integer getCreateUserId() {
		return getInt("createUserId");
	}

	public M setCreateTime(java.util.Date createTime) {
		set("createTime", createTime);
		return (M)this;
	}
	
	public java.util.Date getCreateTime() {
		return get("createTime");
	}

	public M setUpdateTime(java.util.Date updateTime) {
		set("updateTime", updateTime);
		return (M)this;
	}
	
	public java.util.Date getUpdateTime() {
		return get("updateTime");
	}

	public M setUpdateUserId(java.lang.Integer updateUserId) {
		set("updateUserId", updateUserId);
		return (M)this;
	}
	
	public java.lang.Integer getUpdateUserId() {
		return getInt("updateUserId");
	}

}
