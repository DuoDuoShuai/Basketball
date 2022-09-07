package com.app.vo;


import java.io.Serializable;

/**
 * @author 徐晓瑞
 * @date 2022/8/29 17:14
 * @describe:
 */
public class WxJsonResult implements Serializable {
	private static final long serialVersionUID = -5766977494287555486L;
	/** 状态码 */
	private int state = 200;
	/** 状态码对应的信息 */
	private String message = "ok";
	/** 正常数据 */
	private Object data;

	/**
	 *
	 * @param message
	 */
	public WxJsonResult(String message) {
		this.message = message;
	}

	/**
	 *
	 * @param data
	 */
	public WxJsonResult(Object data) {
		this.data = data;
	}

	/**
	 *
	 * @param state
	 * @param message
	 */
	public WxJsonResult(int state, String message){
		this.state=state;
		this.message=message;
	}

	/**
	 *
	 * @param e
	 */
	public WxJsonResult(Throwable e) {
		this.state = 500;
		this.message = e.getMessage();
	}
	/**
	 * 返回成功
	 * @param
	 * @return
	 */
	public static WxJsonResult success() {
		return new WxJsonResult();
	}
	/**
	 * 返回成功
	 * @param data
	 * @return
	 */
	public static WxJsonResult success(Object data) {
		return new WxJsonResult(data);
	}
	/**
	 * 返回失败
	 * @param msg
	 * @return
	 */
	public static WxJsonResult error(String msg) {
		return new WxJsonResult(msg);
	}
	/**
	 * 返回失败
	 * @param msg
	 * @return
	 */
	public static WxJsonResult error(Integer code, String msg) {
		return new WxJsonResult(code,msg);
	}
	/**
	 * 返回失败
	 * @param
	 * @return
	 */
	public static WxJsonResult error(Throwable e) {
		return new WxJsonResult(500,e.getLocalizedMessage());
	}

	/**
	 *
	 */
	public WxJsonResult() {
		super();
	}

	/**
	 *
	 */
	public int getState() {
		return state;
	}

	/**
	 *
	 */
	public void setState(int state) {
		this.state = state;
	}

	/**
	 *
	 */
	public String getMessage() {
		return message;
	}

	/**
	 *
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 *
	 */
	public Object getData() {
		return data;
	}

	/**
	 *
	 */
	public void setData(Object data) {
		this.data = data;
	}
	
	

}
