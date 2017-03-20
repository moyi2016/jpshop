package com.yi.jpshop.entity.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseUser<M extends BaseUser<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}

	public java.lang.Long getId() {
		return get("id");
	}

	public void setCode(java.lang.String code) {
		set("code", code);
	}

	public java.lang.String getCode() {
		return get("code");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}

	public java.lang.String getName() {
		return get("name");
	}

	public void setPass(java.lang.String pass) {
		set("pass", pass);
	}

	public java.lang.String getPass() {
		return get("pass");
	}

	public void setWeixin(java.lang.String weixin) {
		set("weixin", weixin);
	}

	public java.lang.String getWeixin() {
		return get("weixin");
	}

	public void setQq(java.lang.String qq) {
		set("qq", qq);
	}

	public java.lang.String getQq() {
		return get("qq");
	}

	public void setPhone(java.lang.String phone) {
		set("phone", phone);
	}

	public java.lang.String getPhone() {
		return get("phone");
	}

	public void setEmail(java.lang.String email) {
		set("email", email);
	}

	public java.lang.String getEmail() {
		return get("email");
	}

	public void setAdress(java.lang.String adress) {
		set("adress", adress);
	}

	public java.lang.String getAdress() {
		return get("adress");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setLevel(java.lang.String level) {
		set("level", level);
	}

	public java.lang.String getLevel() {
		return get("level");
	}

	public void setPhoto(java.lang.String photo) {
		set("photo", photo);
	}

	public java.lang.String getPhoto() {
		return get("photo");
	}

}
