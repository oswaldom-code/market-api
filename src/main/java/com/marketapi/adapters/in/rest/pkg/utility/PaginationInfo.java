package com.marketapi.adapters.in.rest.pkg.utility;

import java.util.Map;

import org.springframework.data.domain.PageRequest;

public class PaginationInfo {
	private int currentPage;
	private int pageSize;
	private Long totalItems;
	private int totalPages;
	private int nextPage;
	private int previousPage;
	private int firstPage;
	private int lastPage;

	public PaginationInfo() {
	}

	public PaginationInfo(Map<String, Object> params, Long totalItems) {
		this.currentPage = params.get("page") != null ? Integer.parseInt(params.get("page").toString()) : 1;
		this.pageSize = params.get("size") != null ? Integer.parseInt(params.get("size").toString()) : 10;
		this.totalItems = totalItems;
		this.totalPages = (int) Math.ceil(totalItems / (double) pageSize);
		this.firstPage = 1;
		this.lastPage = totalPages;
		this.nextPage = this.currentPage >= this.lastPage ? 0 : this.currentPage + 1;
		this.previousPage = ((currentPage == 1)) ? 0 : currentPage - 1;
	}

	public PageRequest pageRequest() {

		return PageRequest.of(this.currentPage - 1, this.pageSize);
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(Long totalItems) {
		this.totalItems = totalItems;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getNextPage() {
		return nextPage;
	}

	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}

	public int getPreviousPage() {
		return previousPage;
	}

	public void setPreviousPage(int previousPage) {
		this.previousPage = previousPage;
	}

	public int getFirstPage() {
		return firstPage;
	}

	public void setFirstPage(int firstPage) {
		this.firstPage = firstPage;
	}

	public int getLastPage() {
		return lastPage;
	}

	public void setLastPage(int lastPage) {
		this.lastPage = lastPage;
	}

	public String toString() {
		return "PaginationHelper [currentPage=" + currentPage + ", pageSize=" + pageSize + ", totalItems=" + totalItems
				+ ", totalPages=" + totalPages + ", nextPage=" + nextPage + ", previousPage=" + previousPage
				+ ", firstPage=" + firstPage + ", lastPage=" + lastPage + "]";
	}
}