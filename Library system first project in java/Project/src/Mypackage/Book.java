package Mypackage;

import java.util.Scanner;

public class Book extends ItemLibrary implements IItemOpration{
	
	private static int  noBook;
	 Book(){
		 noBook++;
		 setName("not specified");
		 setAuthor("not spcify");
		 setVaidBorw(true);
		 setVaildBuy(true);
		 setId(0000000);
		 setNoCopies(1);
		 setItemKind(LibraryItemType.Book);
		 setFreePeirod("20");
		 setItemPrice("130");
	 }
	 
 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static int getNoBook() {
		return noBook;
	}
	public static void setNoBook(int noBook) {
		Book.noBook = noBook;
	}
	 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public  void showItem() {
		
		System.out.println(" =================================================================================================================================================================================================================================================================================================================");

			
			System.out.println(
					
					            " || the name of book is : "+getName()+"\t**\t"+
			                	"    the id of book is : "+getId()+"\t** "+
			                	"    the author of book is : "+getAuthor()+"\t**\t"+
			                	"    the  borw state of book is : "+isVaidBorw()+"\t**\t"+
			                	"    the  buy state of book is : "+isVaildBuy()+"\t**\t"+
			                	"    the  Kind    of book is : "+getItemKind()+"\t**\t"+
			                	"    the noCopy of book is : "+getNoCopies()+"\t ||\t"
			               	);
			
		
		System.out.println(" =============================================================================================================================================================================================================================================================================================================================");

	
		
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public   void calcTax(long days) 

	{
		
		System.out.println(" the tagx for book is "+ (double)(Math.max( days-20, 0))*.25);

	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////end///////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	
}