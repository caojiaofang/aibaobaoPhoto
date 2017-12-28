package com.lizhi.aibaobao.common.pageutil;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * 分页工具类 Title: Page.java Description: Company: ylink
 * 
 * @author lizhi
 * @date 2017年11月29日下午12:36:30
 */
public class Page<T> implements Serializable {

	private static final long serialVersionUID = -3496690347694101564L;
	
	private int pageSize = 2;  
    private long totalCount;  
    private int totalPage;  
    private int page = 1; 
    private int start;
    private String sortFields;  
    private String order;  
    private Object parameter;  
    private List<T> result;  
      
    public int getStart() {
    	start = (getPage()-1)*getPageSize();
    	if (start<0) {
			start = 0;
		}
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public Page() {}  
      
    public Page(int pageSize)  
    {  
      if (pageSize < 1) {  
        this.pageSize = pageSize;  
      } else {  
        this.pageSize = pageSize;  
      }  
      this.page = 1;  
    }  
      
    public int getPageSize()  
    {  
      return this.pageSize;  
    }  
      
    public int getTotalPage()  
    {  
      return this.totalPage;  
    }  
      
    public long getTotalCount()  
    {  
      return this.totalCount;  
    }  
      
    public void setTotalCount(long totalCount)  
    {  
      this.totalCount = totalCount;  
      this.totalPage = ((int)(this.totalCount / this.pageSize + (this.totalCount % this.pageSize == 0L ? 0 : 1)));  
    }  
      
    public int getPage()  
    {  
      return this.page <= 0 ? 1 : this.page;  
    }  
      
    public void setPage(int page)  
    {  
      if (page < 1)  
      {  
        this.page = 1;  
        return;  
      }  
      this.page = page;  
    }  
      
    public String getOrder()  
    {  
      return this.order;  
    }  
      
    public void setOrder(String order)  
    {  
      this.order = order;  
    }  
      
    public Object getParameter()  
    {  
      return this.parameter;  
    }  
      
    public void setParameter(Object parameter)  
    {  
      this.parameter = parameter;  
    }  
      
    public List<T> getResult()  
    {  
      return this.result;  
    }  
      
    public void setResult(List<T> result)  
    {  
      this.result = result;  
    }  
      
    public String getSortFields()  
    {  
      return this.sortFields;  
    }  
      
    public void setSortFields(String sortFields)  
    {  
      this.sortFields = sortFields;  
    }  
      
    public void setPageSize(int pageSize)  
    {  
      this.pageSize = pageSize;  
    }

	@Override
	public String toString() {
		return "Page [pageSize=" + pageSize + ", totalCount=" + totalCount + ", totalPage=" + totalPage + ", page="
				+ page + ", start=" + start + ", sortFields=" + sortFields + ", order=" + order + ", parameter="
				+ parameter + ", result=" + result + "]";
	}
  }  