package practiceExercise_Task;

abstract class abstractClassBook {
    String name;
    String author;
    String price;

    public abstractClassBook(String name, String author, String price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    abstract void getDetails();
}

class PrintMyBook extends abstractClassBook {
    public PrintMyBook(String name, String author, String price) {
        super(name, author, price);
    }

    @Override
    void getDetails() {
        System.out.println(name + ", " + author + ", " + price);
    }
}

class Main {
    public static void main(String[] args) {
        abstractClassBook myBook = new PrintMyBook("Harry Potter", "J.k. Rowling", "120");
        myBook.getDetails();
    }
}