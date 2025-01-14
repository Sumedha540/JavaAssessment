package workshop4;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;

public class LibraryServiceTest {

    private static LibraryService libraryService;

    @BeforeClass
    public static void setupBeforeClass() {
        System.out.println("Initializing LibraryService Tests...");
    }

    @AfterClass
    public static void teardownAfterClass() {
        System.out.println("LibraryService Tests Completed.");
    }

    @Before
    public void setup() {
        libraryService = new LibraryService();
    }

    @After
    public void cleanup() {
        libraryService = null;
    }

    @Test
    public void testAddBook() {
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        libraryService.addBook(book);

        List<Book> books = libraryService.getBooks();
        assertEquals(1, books.size());
        assertEquals("The Great Gatsby", books.get(0).getTitle());
    }

    @Test
    public void testSearchBookByTitle() {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("1984", "George Orwell");
        libraryService.addBook(book1);
        libraryService.addBook(book2);

        List<Book> searchResults = libraryService.searchByTitle("1984");
        assertEquals(1, searchResults.size());
        assertEquals("1984", searchResults.get(0).getTitle());
    }

    @Test
    public void testSearchBookByTitleNoMatch() {
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        libraryService.addBook(book);

        List<Book> searchResults = libraryService.searchByTitle("Moby Dick");
        assertTrue(searchResults.isEmpty());
    }
}