package cn.jbolt.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseBrand<M extends BaseBrand<M>> extends Model<M> implements IBean {

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

	public M setEnable(java.lang.Boolean enable) {
		set("enable", enable);
		return (M)this;
	}
	
	public java.lang.Boolean getEnable() {
		return get("enable");
	}

	public M setSortRank(java.lang.Integer sortRank) {
		set("sortRank", sortRank);
		return (M)this;
	}
	
	public java.lang.Integer getSortRank() {
		return getInt("sortRank");
	}

	public M setUrl(java.lang.String url) {
		set("url", url);
		return (M)this;
	}
	
	public java.lang.String getUrl() {
		return getStr("url");
	}

	public M setLogo(java.lang.String logo) {
		set("logo", logo);
		return (M)this;
	}
	
	public java.lang.String getLogo() {
		return getStr("logo");
	}

	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}
	
	public java.lang.String getRemark() {
		return getStr("remark");
	}

	public M setEnglishName(java.lang.String englishName) {
		set("englishName", englishName);
		return (M)this;
	}
	
	public java.lang.String getEnglishName() {
		return getStr("englishName");
	}

}
