package org.gears.domain;

public class PageMaker {
	
	private int start, end, total, current, size;
	private boolean prev, next;
	
	public PageMaker(Criteria cri, int total) {
		this.start = start;
		this.end = end;
		this.total = total;
		this.current = cri.getPage();
		this.size = cri.getSize();
		calc();
	}
	
	public void calc(){
		
		int TempEnd = (int) (Math.ceil((current/10.0))*10);
		
		start = TempEnd - 9;
		
		end = (int) (TempEnd*size>total?Math.ceil(total/(double)size):TempEnd);
		
		prev = start==1? false:true;
		next = end*size<total? true:false;
		
	}
	
	
	
	public int getStart() {
		
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getCurrent() {
		return current;
	}
	public void setCurrent(int current) {
		this.current = current;
	}
	public boolean isPrev() {
		return prev;
	}
	public void setPrev(boolean prev) {
		this.prev = prev;
	}
	public boolean isNext() {
		return next;
	}
	public void setNext(boolean next) {
		this.next = next;
	}
	@Override
	public String toString() {
		return "PageMaker [start=" + start + ", end=" + end + ", total=" + total + ", current=" + current + ", prev="
				+ prev + ", next=" + next + "]";
	}
	
	
	
	
	
	
	
	
}
