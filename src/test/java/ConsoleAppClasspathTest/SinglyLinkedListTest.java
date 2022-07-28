package ConsoleAppClasspathTest;

import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeAll;

import ConsoleAppClasspathTest.Node;
import ConsoleAppClasspathTest.SinglyLinkedList;

import java.util.InputMismatchException;

public class SinglyLinkedListTest {
    private final SinglyLinkedList sList = new SinglyLinkedList();

    @BeforeAll
    static void initAll() {}

    @Test
    @DisplayName("Singly linked list putFirst test")
    void putFirstTest() {
        //Exception exceptionPutFirst = assertDoesNotThrow();
        //assertThrows(InputMismatchException.class, () -> {throw new InputMismatchException();});
        final InputMismatchException thrown = assertThrows(InputMismatchException.class, () -> { sList.putFirst("QWE"); } );
        assertEquals(" Please enter value valid!!! ", thrown.getMessage());
    }
}
