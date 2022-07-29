package ConsoleAppClasspathTest;

import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeAll;

import ConsoleAppClasspathTest.Node;
import ConsoleAppClasspathTest.SinglyLinkedList;
import org.junit.jupiter.api.function.Executable;

import java.util.InputMismatchException;



@DisplayName(" Singly linked list test ")
public class SinglyLinkedListTest {
    private final SinglyLinkedList ACTUAL = new SinglyLinkedList();

    @Test
    @DisplayName(" putFirstTest input data ")
    void putFirstTest() {
        final Node EXPECTED = new Node(1);
        ACTUAL.putFirst(1);
        assertEquals(EXPECTED.data, ACTUAL.head.data);
    }

    @Test
    @DisplayName(" putLastTest input data ")
    void putLastTest() {
        final Node EXPECTED = new Node(1);
    }
}
