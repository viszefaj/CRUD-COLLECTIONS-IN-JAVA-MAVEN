package i.after;

public class main {
        public static void main(String[] args) {

            Book book=new Book();
            book.setAuthor("Elvis");
            book.setPages(150);
            book.setLibraryId("26261");

            System.out.println(book.getAuthor());
            System.out.println(book.getPages());
            System.out.printf(book.getLibraryId());
        }
}
