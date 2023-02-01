public class Book {
     private String name;
     private Author getNameAuthor;
     private int yearPublication;
    public Book(String name, Author getNameAuthor ,  int yearPublication ) {
        this.name = name;
        this.getNameAuthor = getNameAuthor;
        this.yearPublication = yearPublication;
    }
    public String getName() {
        return this.name;
    }
    public  Author getNameAuthor() { return  this.getNameAuthor; }
    public int getYearPublication() {
        return this.yearPublication;
    }
    public String toString() {
        return "Название " + this.name  + getNameAuthor +  " год публикации " + this.yearPublication ;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;

        if (getNameAuthor() != book.getNameAuthor()) {
            return false;
        }
        return name.equals(book.name);
    }
        @Override
        public int hashCode() {
            return java.util.Objects.hash(name);
        }

}

