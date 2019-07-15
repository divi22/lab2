package lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
	String title,yearPublished,director,genre,artist,author;
	int identificationNumber,noOfCopies,runtime,year;
	Scanner sc=new Scanner(System.in);
	

	public static void main(String[] args) {
		List<Book> list1=new ArrayList<Book>();
		List<JournalPaper> list2=new ArrayList<JournalPaper>();
		List<Video> list3=new ArrayList<Video>();
		List<CD> list4=new ArrayList<CD>();
		
		Book bk=new Book();
		JournalPaper jp=new JournalPaper();
		Video v=new Video();
		CD cd=new CD();
		
		MainClass mc=new MainClass();
		Scanner sc1=new Scanner(System.in);
		do {
			System.out.println("Enter your options:");
			System.out.println("1)Add item 2) Display item 3)Exit");
			int opt=sc1.nextInt();
			switch(opt) {
			case 1:
				System.out.println("select 1)add book 2)add journal 3)Video detail 4) CD detail");
				int input=sc1.nextInt();
				
				if(input==1) {
					bk=mc.acceptBookDetail();
					list1.add(bk);
					System.out.println("Book added successfully");
				}else if(input==2) {
					jp=mc.acceptJournalDetail();
					list2.add(jp);
					System.out.println("Journal detail added successfully");
					}
				else if(input==3) {
					v=mc.acceptVideoDetail();
					list3.add(v);
					System.out.println("Video added successfully");
				
			}
				else if(input==4) {
					cd=mc.acceptCDDetail();
					list4.add(cd);
					System.out.println("CD added successfully");
		}
				else {
					System.out.println("......");
				}
				break;
			case 2:
				System.out.println("1)Book 2)Journal 3)Video 4)CD");
				int opt2=sc1.nextInt();
				if(opt2==1) {
					for(Book bk1:list1) {
						System.out.println(bk1.getIdentificationNumber()+""+bk1.getAuthor()+""+bk1.getTitle()+""+bk1.getNumberOfCopies());
						
					}
				}else if(opt2==2) {
					for(JournalPaper jp1:list2) {
						System.out.println(jp1.getIdentificationNumber()+""+jp1.getAuthor()+""+jp1.getTitle()+""+jp1.getNumberOfCopies()+""+jp1.getYearPublished());
					}	
					}else if(opt2==3) {
						for(Video v1:list3) {
							System.out.println(v1.getIdentificationNumber()+""+v1.getDirector()+""+v1.getTitle()+""+v1.getNumberOfCopies()+""+v1.getGenre()+""+v1.getRuntime()+""+v1.getYear());
							}
						
				}
					else if(opt2==4) {
						for(CD cd1:list4) {
							System.out.println(cd1.getIdentificationNumber()+""+cd1.getTitle()+""+cd1.getNumberOfCopies()+""+cd1.getGenre()+""+cd1.getRuntime()+""+cd1.getArtist());
							}
					}
					else {
						
				

			}
				break;
			case 3:
				System.exit(0);
				break;
				default:
					break;
					
		}
	}while(true);
}



	private CD acceptCDDetail() {
		CD c=new CD();
		System.out.println("Enter identification number:");
		identificationNumber=sc.nextInt();
		c.setIdentificationNumber(identificationNumber);
		System.out.println("Enter title:");
		title=sc.next();
		c.setTitle(title);
		System.out.println("Enter number of copies:");
		noOfCopies=sc.nextInt();
		c.setNumberOfCopies(noOfCopies);
		System.out.println("Enter genre type:");
		genre=sc.next();
		c.setGenre(genre);
		System.out.println("Enter runtime:");
		runtime=sc.nextInt();
		c.setRuntime(runtime);
		System.out.println("Enter artist:");
		artist=sc.next();
		c.setArtist(artist);
		
		
		
		return c;
	}


	private Video acceptVideoDetail() {
		Video v=new Video();
		System.out.println("Enter identification number:");
		identificationNumber=sc.nextInt();
		v.setIdentificationNumber(identificationNumber);
		System.out.println("Enter director:");
		director=sc.next();
		v.setDirector(director);
		System.out.println("Enter title:");
		title=sc.next();
		v.setTitle(title);
		System.out.println("Enter number of copies:");
		noOfCopies=sc.nextInt();
		v.setNumberOfCopies(noOfCopies);
		System.out.println("Enter genre type:");
		genre=sc.next();
		v.setGenre(genre);
		System.out.println("Enter runtime:");
		runtime=sc.nextInt();
		v.setRuntime(runtime);
		System.out.println("Enter year:");
		artist=sc.next();
		v.setYear(year);
		
		return v;
	}


	private JournalPaper acceptJournalDetail() {
		JournalPaper j=new JournalPaper();
		System.out.println("Enter identification number:");
		identificationNumber=sc.nextInt();
		j.setIdentificationNumber(identificationNumber);
		System.out.println("Enter author:");
		author=sc.next();
		j.setAuthor(author);
		System.out.println("Enter title:");
		title=sc.next();
		j.setTitle(title);
		System.out.println("Enter number of copies:");
		noOfCopies=sc.nextInt();
		j.setNumberOfCopies(noOfCopies);
		System.out.println("Enter year published:");
		yearPublished=sc.next();
		j.setYearPublished(yearPublished);
		
		return j;
	}


	private Book acceptBookDetail() {
		Book b=new Book();
		System.out.println("Enter identification number:");
		identificationNumber=sc.nextInt();
		b.setIdentificationNumber(identificationNumber);
		System.out.println("Enter author:");
		author=sc.next();
		b.setAuthor(author);
		System.out.println("Enter title:");
		title=sc.next();
		b.setTitle(title);
		System.out.println("Enter number of copies:");
		noOfCopies=sc.nextInt();
		b.setNumberOfCopies(noOfCopies);
		
		return b;
	}

}
