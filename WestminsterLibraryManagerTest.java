/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package librarycentre_package;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class WestminsterLibraryManagerTest {
    private WestminsterLibraryManager system;
    
    public WestminsterLibraryManagerTest() {
    }
    
    @BeforeEach
    public void setUp() {
        system = new WestminsterLibraryManager(3);
    }
    
    @AfterEach
    public void tearDown() {
    }

   
    /**
     * Test of addItemToList method, of class WestminsterLibraryManager.
     */
    @Test
    public void testAddItemToList(){
        Book book = new Book("Harry Potter","12");
        book.setAuthor("Dineth");
        book.setPublicationYear(2000);
        
        system.addItemToList(book);
        
        assertEquals(book,system.itemList.get(0));
        
        DVD dvd = new DVD("Spiderman","34");
        dvd.setDirector("Dineth");
        dvd.setGenre("Action");
        
        system.addItemToList(dvd);
        
        assertEquals(dvd,system.itemList.get(1));
    }    
}
