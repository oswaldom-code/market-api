package com.marketapi.adapters.in.rest.dto;

import com.marketapi.adapters.in.rest.pkg.utility.PaginationInfo;

public class PaginationResponse {
	private PaginationInfo paginationInfo;
	private Object[] values;

	public PaginationResponse() {
	}

	public PaginationResponse(PaginationInfo paginationInfo, Object[] values) {
		this.paginationInfo = paginationInfo;
		this.values = values;
	}

	public PaginationInfo getPaginationInfo() {
		return paginationInfo;
	}

	public void setPaginationInfo(PaginationInfo paginationInfo) {
		this.paginationInfo = paginationInfo;
	}

	public Object[] getValues() {
		return values;
	}

	public void setValues(Object[] values) {
		this.values = values;
	}
}
