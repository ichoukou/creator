package cn.jbolt.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseJboltFile<M extends BaseJboltFile<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public M setLocalPath(java.lang.String localPath) {
		set("localPath", localPath);
		return (M)this;
	}
	
	public java.lang.String getLocalPath() {
		return getStr("localPath");
	}

	public M setLocalUrl(java.lang.String localUrl) {
		set("localUrl", localUrl);
		return (M)this;
	}
	
	public java.lang.String getLocalUrl() {
		return getStr("localUrl");
	}

	public M setCdnUrl(java.lang.String cdnUrl) {
		set("cdnUrl", cdnUrl);
		return (M)this;
	}
	
	public java.lang.String getCdnUrl() {
		return getStr("cdnUrl");
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

	public M setFileName(java.lang.String fileName) {
		set("fileName", fileName);
		return (M)this;
	}
	
	public java.lang.String getFileName() {
		return getStr("fileName");
	}

	public M setFileType(java.lang.Integer fileType) {
		set("fileType", fileType);
		return (M)this;
	}
	
	public java.lang.Integer getFileType() {
		return getInt("fileType");
	}

	public M setFileSize(java.lang.Long fileSize) {
		set("fileSize", fileSize);
		return (M)this;
	}
	
	public java.lang.Long getFileSize() {
		return getLong("fileSize");
	}

	public M setFileSuffix(java.lang.String fileSuffix) {
		set("fileSuffix", fileSuffix);
		return (M)this;
	}
	
	public java.lang.String getFileSuffix() {
		return getStr("fileSuffix");
	}

}
