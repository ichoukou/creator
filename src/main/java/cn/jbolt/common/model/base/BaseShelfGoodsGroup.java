package cn.jbolt.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseShelfGoodsGroup<M extends BaseShelfGoodsGroup<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public M setName(java.lang.String name) {
		set("name", name);
		return (M)this;
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}

	public M setIcon(java.lang.String icon) {
		set("icon", icon);
		return (M)this;
	}
	
	public java.lang.String getIcon() {
		return getStr("icon");
	}

	public M setImgurl(java.lang.String imgurl) {
		set("imgurl", imgurl);
		return (M)this;
	}
	
	public java.lang.String getImgurl() {
		return getStr("imgurl");
	}

	public M setSubTitle(java.lang.String subTitle) {
		set("subTitle", subTitle);
		return (M)this;
	}
	
	public java.lang.String getSubTitle() {
		return getStr("subTitle");
	}

	public M setSortRank(java.lang.Integer sortRank) {
		set("sortRank", sortRank);
		return (M)this;
	}
	
	public java.lang.Integer getSortRank() {
		return getInt("sortRank");
	}

	public M setShelfId(java.lang.Integer shelfId) {
		set("shelfId", shelfId);
		return (M)this;
	}
	
	public java.lang.Integer getShelfId() {
		return getInt("shelfId");
	}

	public M setShelfElementId(java.lang.Integer shelfElementId) {
		set("shelfElementId", shelfElementId);
		return (M)this;
	}
	
	public java.lang.Integer getShelfElementId() {
		return getInt("shelfElementId");
	}

}
