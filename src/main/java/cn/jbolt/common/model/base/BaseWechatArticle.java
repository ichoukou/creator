package cn.jbolt.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseWechatArticle<M extends BaseWechatArticle<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public M setTitle(java.lang.String title) {
		set("title", title);
		return (M)this;
	}
	
	public java.lang.String getTitle() {
		return getStr("title");
	}

	public M setContent(java.lang.String content) {
		set("content", content);
		return (M)this;
	}
	
	public java.lang.String getContent() {
		return getStr("content");
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

	public M setSubTitle(java.lang.String subTitle) {
		set("subTitle", subTitle);
		return (M)this;
	}
	
	public java.lang.String getSubTitle() {
		return getStr("subTitle");
	}

	public M setPoster(java.lang.String poster) {
		set("poster", poster);
		return (M)this;
	}
	
	public java.lang.String getPoster() {
		return getStr("poster");
	}

	public M setViewCount(java.lang.Integer viewCount) {
		set("viewCount", viewCount);
		return (M)this;
	}
	
	public java.lang.Integer getViewCount() {
		return getInt("viewCount");
	}

	public M setMediaId(java.lang.String mediaId) {
		set("mediaId", mediaId);
		return (M)this;
	}
	
	public java.lang.String getMediaId() {
		return getStr("mediaId");
	}

	public M setMpId(java.lang.Integer mpId) {
		set("mpId", mpId);
		return (M)this;
	}
	
	public java.lang.Integer getMpId() {
		return getInt("mpId");
	}

	public M setUrl(java.lang.String url) {
		set("url", url);
		return (M)this;
	}
	
	public java.lang.String getUrl() {
		return getStr("url");
	}

	public M setType(java.lang.Integer type) {
		set("type", type);
		return (M)this;
	}
	
	public java.lang.Integer getType() {
		return getInt("type");
	}

	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}
	
	public java.lang.String getRemark() {
		return getStr("remark");
	}

}
