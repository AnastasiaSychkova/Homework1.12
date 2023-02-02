public class Main {
    public static void main(String[] args) {

        Author francisScottFitzgerald = new Author("Фрэнсис Скотт", "Фицджеральд");
        Book theGreatGatsby = new Book("Великий Гэтсби", francisScottFitzgerald, 1937);
        System.out.println(theGreatGatsby);

        System.out.println();
        Author levTolstoy = new Author("Лев Николаевич", "Толстой");
        Book annaKarenina = new Book("Анна Каренина", levTolstoy, 1877);
        System.out.println(annaKarenina);

        System.out.println();
        System.out.println("Book1.equals(Book2)? " + theGreatGatsby.equals(annaKarenina));

        System.out.println();
        System.out.println("theGreatGatsby hashCod " + theGreatGatsby.hashCode());
        System.out.println("annaKarenina hashCod " + annaKarenina.hashCode());
    }

}
