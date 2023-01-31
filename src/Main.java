public class Main {
    public static void main(String[] args) {

        Book theGreatGatsby = new Book("Великий Гэтсби", "Фрэнсис Скотт Фицджеральд" , 1925);
        System.out.println("Book1.name = " + theGreatGatsby.getName());
        System.out.println("Book1.yearPublication = " + theGreatGatsby.getYearPublication());

        Author francisScottFitzgerald = new Author("Фрэнсис Скотт" , "Фицджеральд" );
        System.out.println("Autor1.name = " + francisScottFitzgerald.getNameAuthor());
        System.out.println("Autor1.surname = " + francisScottFitzgerald.getSurnameAuthor());
        System.out.println();

        Book annaKarenina = new Book("Анна Каренина", "Лев Николаевич Толстой" , 1877);
        System.out.println("Book2.name = " + annaKarenina.getName());
        System.out.println("Book2.yearPublication = " + annaKarenina.getYearPublication());
        annaKarenina.setYearPublication(1878);
        System.out.println("Book2.yearPublication = " + annaKarenina.getYearPublication());


        Author levTolstoy = new Author("Лев" , "Толстой" );
        System.out.println("Autor2.name = " + levTolstoy.getNameAuthor());
        System.out.println("Autor2.surname = " + levTolstoy.getSurnameAuthor());

    }

}
