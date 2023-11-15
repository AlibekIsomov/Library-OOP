
import java.util.Scanner;

public class Bookshelf {

    private Book[] books = new Book[200];
    private int bookQ = 0;
    int id = 1;
    private Scanner sc = new Scanner(System.in);
    public void start() {
        
        System.out.println("Welcome to the Library");
        while(true){
            System.out.println("Select an action:");
            System.out.println("1 - view the list");
            System.out.println("2 - add to list");
            System.out.println("3 - search list");
            System.out.println("0 - exit");
            System.out.print(">>> ");
            int amal = sc.nextInt();

            switch(amal){

                case 1: royxat(); break;
                case 2: qoshish(); break;
                case 3: qidiruv(); break;

                case 0: {
                    System.out.println("Thank you!");
                    return;
                }
            }



        }


    }



    public void royxat(){
        System.out.println("List of books:");

        System.out.println("__________________________");
        System.out.println("ID   |   Name     |     Author    |    Year  ");

        for(int i = 0; i<bookQ; i++){
            Book k = books[i];
            System.out.println(k.getId() + "  |  " + k.getName() +" | " + k.getAuthor()+  "  | " + k.getYear());
        }





        System.out.println("__________________________");

    }

    public void qoshish(){
        System.out.println("Add a new book:");
        Book k = new Book();


        System.out.print("Name: ");
        k.setName(sc.next());
        System.out.print("Author: ");
        k.setAuthor(sc.next());
        System.out.print("Year: ");
        k.setYear(sc.next());
        k.setId(id++);
        this.books[this.bookQ] = k;
        this.bookQ++;
    }

    private void qidiruv(){
        System.out.println("Search\nEnter the search keyword:");
        System.out.print(">>> ");
        String s = sc.next();
        s = s.toLowerCase();
        System.out.println("__________________________");
        System.out.println("Name     |     Author    |    Year  ");

  
     
        for(int i = 0; i<bookQ; i++){
            Book k = books[i];
            if(
              k.getName() != null &&  k.getName().toLowerCase().contains(s)
                || k.getAuthor() != null && k.getAuthor().toLowerCase().contains(s)
                || k.getYear() != null && k.getYear().equals(s)
                ){
                    System.out.println(k.getName() +" | " + k.getAuthor()+  "  | " + k.getYear());
                }

        }
        System.out.println("__________________________");
    }

    
    
}