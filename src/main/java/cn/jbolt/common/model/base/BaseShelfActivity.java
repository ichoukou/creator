package cn.jbolt.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseShelfActivity<M extends BaseShelfActivity<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public M setImage(java.lang.String image) {
		set("image", image);
		return (M)this;
	}
	
	public java.lang.String getImage() {
		return getStr("image");
	}

	public M setUrl(java.lang.String url) {
		set("url", url);
		return (M)this;
	}
	
	public java.lang.String getUrl() {
		return getStr("url");
	}

	public M setOpenType(java.lang.Integer openType) {
		set("openType", openType);
		return (M)this;
	}
	
	public java.lang.Integer getOpenType() {
		return getInt("openType");
	}

	public M setShelfElementId(java.lang.Integer shelfElementId) {
		set("shelfElementId", shelfElementId);
		return (M)this;
	}
	
	public java.lang.Integer getShelfElementId() {
		return getInt("shelfElementId");
	}

	public M setShelfId(java.lang.Integer shelfId) {
		set("shelfId", shelfId);
		return (M)this;
	}
	
	public java.lang.Integer getShelfId() {
		return getInt("shelfId");
	}

}
