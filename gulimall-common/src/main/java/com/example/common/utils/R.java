
package com.example.common.utils;



import lombok.Data;

import java.io.Serializable;
@Data
public class R<T> implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 成功标志
	 */
	private boolean success = true;

	/**
	 * 返回处理消息
	 */
	private String message = "操作成功！";

	/**
	 * 返回代码
	 */
	private Integer code = 0;

	/**
	 * 返回数据对象 data
	 */
	private T data;


	public R(){

	}

	public R<T> error(String message) {
		this.message = message;
		this.code = CommonConstant.SC_INTERNAL_SERVER_ERROR_500;
		this.success = false;
		return this;
	}

	public R(boolean success, String message, Integer code, T data) {
		this.success = success;
		this.message = message;
		this.code = code;
		this.data = data;
	}

	public static R<Object> ok() {
		R<Object> r = new R<Object>();
		r.setSuccess(true);
		r.setCode(CommonConstant.SC_OK_200);
		r.setMessage("成功");
		return r;
	}

	public static R<Object> ok(String msg) {
		R<Object> r = new R<Object>();
		r.setSuccess(true);
		r.setCode(CommonConstant.SC_OK_200);
		r.setMessage(msg);
		return r;
	}

	public static R<Object> ok(Object data) {
		R<Object> r = new R<Object>();
		r.setSuccess(true);
		r.setCode(CommonConstant.SC_OK_200);
		r.setData(data);
		return r;
	}

	public static R<Object> error(int code, String msg) {
		R<Object> r = new R<Object>();
		r.setCode(code);
		r.setMessage(msg);
		r.setSuccess(false);
		return r;
	}
	public static R<Object> error500( String msg) {
		R<Object> r = new R<Object>();
		r.setCode(CommonConstant.SC_INTERNAL_SERVER_ERROR_500);
		r.setMessage(msg);
		r.setSuccess(false);
		return r;
	}
}