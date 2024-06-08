public class Main {
    public static void main(String[] args) {

        Author alexander = new Author("Alexander", "Pushkin");
        Author lev = new Author("Lev", "Tolstoy");
        Book captainsDaughter = new Book("Captains Daughter ", alexander, 1836);
        Book warAndPeace = new Book("War and Peace ", lev, 1863);

        System.out.println(captainsDaughter.getAuthor().getFirstName() + " " + captainsDaughter.getAuthor().getLastName() + " " + captainsDaughter.getTitle() +  captainsDaughter.getPublisherYear());
        System.out.println(warAndPeace.getAuthor().getFirstName() + " " + warAndPeace.getAuthor().getLastName() + " " + warAndPeace.getTitle() + warAndPeace.getPublisherYear());
    }

}