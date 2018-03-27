public class books {
    private String title, author, publisher, isbn;
    private int price;
    public books (String title1, String author1, String publisher1, String isbn1, int price1){
        this.setTitle(title1);
        this.setAuthor(author1);
        this.setPublisher(publisher1);
        this.setISBN(isbn1);
        this.setPrice(price1);
    }
    public void setTitle(String title1) {
        this.title = title1;
    }
    public String getTitle() {
        return title;
    }

    public void setAuthor(String author1) {
        this.author = author1;
    }
    public String getAuthor() {
        return author;
    }

    public void setPublisher(String publisher1) {
        this.publisher = publisher1;
    }
    public String getPublisher() {
        return publisher;
    }

    public void setISBN(String isbn1) {
        if (isbn1.length() == 13){
            this.isbn = isbn1;
        } else {
          this.isbn="Error";
        }
    }
    public String getISBN() {
        return isbn;
    }

    public void setPrice(int price1) {
        if (price1 >= 0){this.price = price1;}
        else {this.price=200;}
    }
    public int getPrice() {
        return price;
    }
    public void showInfo(){
        System.out.println("書名:"+getTitle()+"\t作者:"+getAuthor()+"\t出版社:"+getPublisher()+"\tISBN:"+getISBN()+"\t$:"+getPrice());
    }
}
