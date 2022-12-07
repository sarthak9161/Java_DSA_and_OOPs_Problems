package sarthak;


class Library{
    String[] books;
    int no_of_books;

    Library(){
        this.books=new String[100];
        this.no_of_books=0;
    }

    void addBook(String name){
        this.books[no_of_books]=name;
        System.out.println(name+' '+"successfully added to the shelf");
        no_of_books++;
    }

    void issueBook(String name){
        for(int i=0;i<this.books.length;i++){
            String b=this.books[i];
            if(b==name){
                this.books[i]=null;
            }

        }
        System.out.println(name+' '+"Book successfully issued");
        return;
    }
    void returnBook(String name){
        this.books[no_of_books]=name;
        System.out.println(name+' '+"book is returned to the central library");
        no_of_books++;
    }
    void showBooks(){
        System.out.println("Available books in the library are:");
        for(String b: books){
            if(b==null){
                continue;
            }
            System.out.println("*"+b);
        }
    }
}
public class online_library_miniProject {
    public static void main(String[] args) {
        Library central_library=new Library();

        System.out.println("********************************Welcome to Central Library****************************");
        System.out.println("\n");
        central_library.addBook("Wings of Fire");
        central_library.addBook("Chhava");
        central_library.addBook("Subtle art of not giving a fuck");
        central_library.addBook("The magic of thinking big");
        central_library.addBook("Do epic shit !");
        central_library.showBooks();
        central_library.issueBook("Chhava");
        central_library.showBooks();
        central_library.returnBook("Chhava");
        central_library.showBooks();

    }
}
