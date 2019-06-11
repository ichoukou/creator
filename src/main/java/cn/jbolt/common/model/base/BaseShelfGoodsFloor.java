package cn.jbolt.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseShelfGoodsFloor<M extends BaseShelfGoodsFloor<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public M setGroupId(java.lang.Integer groupId) {
		set("groupId", groupId);
		return (M)this;
	}
	
	public java.lang.Integer getGroupId() {
		return getInt("groupId");
	}

	public M setTitle(java.lang.String title) {
		set("title", title);
		return (M)this;
	}
	
	public java.lang.String getTitle() {
		return getStr("title");
	}

	public M setUrl(java.lang.String url) {
		set("url", url);
		return (M)this;
	}
	
	public java.lang.String getUrl() {
		return getStr("url");
	}

	public M setGoodsCount(java.lang.Integer goodsCount) {
		set("goodsCount", goodsCount);
		return (M)this;
	}
	
	public java.lang.Integer getGoodsCount() {
		return getInt("goodsCount");
	}

	public M setColumnCount(java.lang.Integer columnCount) {
		set("columnCount", columnCount);
		return (M)this;
	}
	
	public java.lang.Integer getColumnCount() {
		return getInt("columnCount");
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