package Mypackage;

public class Booklet extends ItemLibrary implements IItemOpration{

	private static int  noBooklet;

	Booklet(){
		noBooklet++;
		 setName("not specified");
		 setAuthor("not spcify");
		 setVaidBorw(true);
		 setVaildBuy(true);
		 setId(0000000);
		 setNoCopies(1);
		 setItemKind(LibraryItemType.Booklet);
		 setFreePeirod("12");
		 setItemPrice("121");
	 }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static int getNoBooklet() {
		return noBooklet;
	}

	public static void setNoBooklet(int noBooklet) {
		Booklet.noBooklet = noBooklet;
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public  void showItem() {
		

	System.out.println(" ===================================================================================================================================================================================================================================================================================================================");

		
		System.out.println(
				
				            " || the name of booklet is : "+getName()+"\t**\t"+
		                	"    the id of booklet is : "+getId()+"\t** "+
		                	"    the author of booklet is : "+getAuthor()+"\t**\t"+
		                	"    the  borw state of booklet is : "+isVaidBorw()+"\t**\t"+
		                	"    the  buy state of booklet is : "+isVaildBuy()+"\t**\t"+
		                	"    the  Kind    of booklet is : "+getItemKind()+"\t**\t"+
		                	"    the noCopy of booklet is : "+getNoCopies()+"\t ||\t"
		               	);
		
	
	System.out.println(" ======================================================================================================================================================================================================================================================================================================================");
		
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public   void calcTax(long days) 

{
	
	System.out.println(" the tagx for book is "+(double)(Math.max((days-12),0))*.50);

}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////end ///////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
