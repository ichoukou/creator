package cn.jbolt.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseWechatMpinfo<M extends BaseWechatMpinfo<M>> extends Model<M> implements IBean {

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

	public M setLogo(java.lang.String logo) {
		set("logo", logo);
		return (M)this;
	}
	
	public java.lang.String getLogo() {
		return getStr("logo");
	}

	public M setCreateTime(java.util.Date createTime) {
		set("createTime", createTime);
		return (M)this;
	}
	
	public java.util.Date getCreateTime() {
		return get("createTime");
	}

	public M setUserId(java.lang.Integer userId) {
		set("userId", userId);
		return (M)this;
	}
	
	public java.lang.Integer getUserId() {
		return getInt("userId");
	}

	public M setEnable(java.lang.Boolean enable) {
		set("enable", enable);
		return (M)this;
	}
	
	public java.lang.Boolean getEnable() {
		return get("enable");
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

	public M setBrief(java.lang.String brief) {
		set("brief", brief);
		return (M)this;
	}
	
	public java.lang.String getBrief() {
		return getStr("brief");
	}

	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}
	
	public java.lang.String getRemark() {
		return getStr("remark");
	}

	public M setType(java.lang.Integer type) {
		set("type", type);
		return (M)this;
	}
	
	public java.lang.Integer getType() {
		return getInt("type");
	}

	public M setIsAuthenticated(java.lang.Boolean isAuthenticated) {
		set("isAuthenticated", isAuthenticated);
		return (M)this;
	}
	
	public java.lang.Boolean getIsAuthenticated() {
		return get("isAuthenticated");
	}

	public M setSubjectType(java.lang.Integer subjectType) {
		set("subjectType", subjectType);
		return (M)this;
	}
	
	public java.lang.Integer getSubjectType() {
		return getInt("subjectType");
	}

	public M setWechatId(java.lang.String wechatId) {
		set("wechatId", wechatId);
		return (M)this;
	}
	
	public java.lang.String getWechatId() {
		return getStr("wechatId");
	}

	public M setQrcode(java.lang.String qrcode) {
		set("qrcode", qrcode);
		return (M)this;
	}
	
	public java.lang.String getQrcode() {
		return getStr("qrcode");
	}

}