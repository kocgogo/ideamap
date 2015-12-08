package com.mycom.d3.util;

public class PageSet {
	public PageSet(int currPage, int dbCount){
		this.currPage = currPage;
		this.dbCount = dbCount;
	}
	
	private int currPage = 1; 	//���� ������
	private int dbCount = 0; 	//��ü ��(ROW) �� ��
	private int pageSize = 5;	//�� �������� ���� ��
	private int grpSize = 5;	//�׷� ������
	
	public int getPageSize(){
		return pageSize;
	}
	
	public void setPageSize(int pageSize){
		this.pageSize = pageSize;
	}
	
	public int getDbCount(){
		return dbCount;
	}
	
	public void setDbCount(int dbCount){
		this.dbCount = dbCount;
	}
	
	
	/*���� ������ ��ȣ�� ���� */
	public int getCurrPage(){
		int CurrentPage = 1;
		if(this.currPage > 0){
			return currPage;
		}else{
			return CurrentPage;
		}
	}
	
	
	/*���� ������ ��ȣ�� ����*/
	public void setCurrPage(int currPage){
		this.currPage = currPage;
	}
	
	/*�������� ���� ����*/
	public int getTotalPage(){
		int pages = getDbCount() / pageSize;
		if (getDbCount() % pageSize >0){
			pages++;
		}
		return pages;
	}
	
	/*���� �Խù��� ���۹�ȣ�� ����*/
	public int getStartRowIndex(){
		return grpSize*(getCurrPage()-1);
	}
	
	/*���� �Խù��� ����ȣ�� ����*/
	public int getEndRowIndex(){
		return grpSize*getCurrPage()+1;
	}
	
	/*���� ������ ��ȣ�� ���� */
	public int getIndexOfStartPage(){
		return ((getCurrPage()-1)/pageSize)*pageSize+1;
	}
	
	/*������ ������ ��ȣ�� ���� */
	public int getIndexOfEndPage(){
		return ((( getIndexOfStartPage()-1 ) + pageSize) / pageSize) * pageSize;
	}
	
	/*������ ���� */
	public String getPageList(){
		StringBuffer pageBuffer = new StringBuffer();
		int startOfPage = getIndexOfStartPage(); //����������
		int endOfPage = getIndexOfEndPage();	//������������
		if (getTotalPage() <= endOfPage){
			endOfPage = getTotalPage();
		}
		pageBuffer.append("<ul class='pageClass'>");
		
		
		//ù������ �̵�
		if(endOfPage < 2){
			pageBuffer.append("[firstPage]");
		}else{
			pageBuffer.append("<a href=javascript:gotoPage('1'); class='gotoPage'>[first page] </a>");
		}
		
		
		//������ ��ȣ����
		int movoToPage = startOfPage;
		if(endOfPage > 0){
			while (movoToPage <= endOfPage){
				if (movoToPage == getCurrPage()){
					pageBuffer.append("<strong>[ ");
					pageBuffer.append(getCurrPage());
					pageBuffer.append(" ]</strong>");
				}else{
					pageBuffer.append(" [ <a href=javascript:gotoPage('"+movoToPage+"'); class='gotoPage'>");
					pageBuffer.append(movoToPage);
					pageBuffer.append(" ] </a>");
				}
				movoToPage++;
			}
		}else{
			pageBuffer.append("<strong>[ "+getCurrPage()+" ]</strong>");
		}
		
		//������ ������
		if(endOfPage < 2){
			pageBuffer.append(" [lastPage]");
		}else{
			pageBuffer.append("<a href=javascript:gotoPage('"+getTotalPage()+"'); class='gotoPage'> [last page]</a>");
		}
		pageBuffer.append("</ul>");
		return pageBuffer.toString();
	}

}




















