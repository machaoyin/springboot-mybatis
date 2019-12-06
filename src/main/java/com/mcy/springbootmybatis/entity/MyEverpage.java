package com.mcy.springbootmybatis.entity;

import java.io.Serializable;

/**
 * 分页类
 * @author Administrator
 *
 */
public class MyEverpage {
	private int limit;
	private int offset;

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}
	
}
