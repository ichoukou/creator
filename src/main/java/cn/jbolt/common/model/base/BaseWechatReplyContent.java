package cn.jbolt.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseWechatReplyContent<M extends BaseWechatReplyContent<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public M setType(java.lang.Integer type) {
		set("type", type);
		return (M)this;
	}
	
	public java.lang.Integer getType() {
		return getInt("type");
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

	public M setPoster(java.lang.String poster) {
		set("poster", poster);
		return (M)this;
	}
	
	public java.lang.String getPoster() {
		return getStr("poster");
	}

	public M setUrl(java.lang.String url) {
		set("url", url);
		return (M)this;
	}
	
	public java.lang.String getUrl() {
		return getStr("url");
	}

	public M setAutoReplyId(java.lang.Integer autoReplyId) {
		set("autoReplyId", autoReplyId);
		return (M)this;
	}
	
	public java.lang.Integer getAutoReplyId() {
		return getInt("autoReplyId");
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

	public M setWechatArticleId(java.lang.Integer wechatArticleId) {
		set("wechatArticleId", wechatArticleId);
		return (M)this;
	}
	
	public java.lang.Integer getWechatArticleId() {
		return getInt("wechatArticleId");
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

}
