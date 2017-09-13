package com.yy.tourweb.web.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PagingResult<T>
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  private int currentPage;
  private int pageSize;
  private long totalSize;
  private List<T> resultList = new ArrayList();
  
  public int getCurrentPage()
  {
    return this.currentPage;
  }
  
  public void setCurrentPage(int currentPage)
  {
    this.currentPage = currentPage;
  }
  
  public long getTotalSize()
  {
    return this.totalSize;
  }
  
  public void setTotalSize(long totalSize)
  {
    this.totalSize = totalSize;
  }
  
  public int getPageSize()
  {
    return this.pageSize;
  }
  
  public void setPageSize(int pageSize)
  {
    this.pageSize = pageSize;
  }
  
  public List<T> getResultList()
  {
    return this.resultList;
  }
  
  public void setResultList(List<T> resultList)
  {
    this.resultList = resultList;
  }
}

