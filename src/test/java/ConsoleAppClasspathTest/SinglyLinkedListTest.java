package ConsoleAppClasspathTest;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;


@DisplayName(" Singly linked list test ")
public class SinglyLinkedListTest {
    private final SinglyLinkedList ACTUAL = new SinglyLinkedList();

    @Test
    @DisplayName(" viewMainMenuTest ")
    void exceptViewMainMenuTest() {
        Exception exception = assertThrows(NumberFormatException.class, () -> ACTUAL.putFirst(Integer.parseInt("QWE")));
        String expectedMessage = "For input string";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    @DisplayName(" viewInsertMenuTest ")
    void exceptViewInsertMenuTest() {
        Exception exception = assertThrows(NumberFormatException.class, () -> ACTUAL.putFirst(Integer.parseInt("QWE")));
        String expectedMessage = "For input string";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    @DisplayName(" viewDeleteMenuTest ")
    void exceptViewDeleteMenuTest() {
        Exception exception = assertThrows(NumberFormatException.class, () -> ACTUAL.putFirst(Integer.parseInt("QWE")));
        String expectedMessage = "For input string";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    @DisplayName(" putFirstTest ")
    void putFirstTest() {
        ACTUAL.putFirst(2);
        ACTUAL.putFirst(1);
        assertEquals(1, ACTUAL.head.data);
        assertEquals(2, ACTUAL.head.next.data);

        Exception exception = assertThrows(NumberFormatException.class, () -> ACTUAL.putFirst(Integer.parseInt("QWE")));
        String expectedMessage = "For input string";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    @DisplayName(" putLastTest ")
    void putLastTest() {
        ACTUAL.putFirst(1);
        ACTUAL.putLast(2);
        assertEquals(2, ACTUAL.head.next.data);
        assertNull(ACTUAL.head.next.next);

        Exception exception = assertThrows(NumberFormatException.class, () -> ACTUAL.putFirst(Integer.parseInt("QWE")));
        String expectedMessage = "For input string";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    @DisplayName(" putAtPosTest ")
    void putAtPosTest() {
        ACTUAL.putFirst(1);
        ACTUAL.putAtPos(2,1);
        ACTUAL.putLast(3);
        assertEquals(2, ACTUAL.head.next.data);
        assertEquals(3, ACTUAL.head.next.next.data);

        Exception exception = assertThrows(NumberFormatException.class, () -> ACTUAL.putFirst(Integer.parseInt("QWE")));
        String expectedMessage = "For input string";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    @DisplayName(" putAfterTest ")
    void putAfterTest() {
        ACTUAL.putFirst(1);
        ACTUAL.putAfter(2, 1);
        ACTUAL.putLast(3);

        assertEquals(2, ACTUAL.head.next.data);
        assertEquals(3, ACTUAL.head.next.next.data);

        Exception exception = assertThrows(NumberFormatException.class, () -> ACTUAL.putFirst(Integer.parseInt("QWE")));
        String expectedMessage = "For input string";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    @DisplayName(" putAfter with times ")
    void putAfterWithTimes() {
        ACTUAL.putFirst(1);
        ACTUAL.putFirst(1);
        ACTUAL.putAfter(2, 1, 2);
        ACTUAL.putLast(3);

        assertEquals(2, ACTUAL.head.next.next.data);
        assertEquals(3, ACTUAL.head.next.next.next.data);

        Exception exception = assertThrows(NumberFormatException.class, () -> ACTUAL.putFirst(Integer.parseInt("QWE")));
        String expectedMessage = "For input string";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    @DisplayName(" delFirstTest ")
    void delFirstTest() {
        ACTUAL.putFirst(1);
        ACTUAL.putLast(2);
        ACTUAL.putLast(3);
        ACTUAL.delFirst();

        assertEquals(2, ACTUAL.head.data);
        assertEquals(3, ACTUAL.head.next.data);

        Exception exception = assertThrows(NumberFormatException.class, () -> ACTUAL.putFirst(Integer.parseInt("QWE")));
        String expectedMessage = "For input string";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    @DisplayName(" delLastTest ")
    void delLastTest() {
        ACTUAL.putFirst(1);
        ACTUAL.putLast(2);
        ACTUAL.putLast(3);
        ACTUAL.delLast();

        //assertEquals(2, ACTUAL.head.next.data);
        assertNull(ACTUAL.head.next.next);

        Exception exception = assertThrows(NumberFormatException.class, () -> ACTUAL.putFirst(Integer.parseInt("QWE")));
        String expectedMessage = "For input string";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    @DisplayName(" delAtPosTest ")
    void delAtPosTest() {
        ACTUAL.putFirst(1);
        ACTUAL.putLast(2);
        ACTUAL.putLast(3);
        ACTUAL.putLast(4);
        ACTUAL.delAtPos(2);

        assertEquals(3, ACTUAL.head.next.data);
        assertEquals(4, ACTUAL.head.next.next.data);

        Exception exception = assertThrows(NumberFormatException.class, () -> ACTUAL.putFirst(Integer.parseInt("QWE")));
        String expectedMessage = "For input string";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    @DisplayName(" delAfter ")
    void delAfterTest() {
        ACTUAL.putFirst(1);
        ACTUAL.putLast(2);
        ACTUAL.putLast(3);
        ACTUAL.putLast(4);
        ACTUAL.delAfter(2);

        assertEquals(2, ACTUAL.head.next.data);
        assertEquals(4, ACTUAL.head.next.next.data);

        Exception exception = assertThrows(NumberFormatException.class, () -> ACTUAL.putFirst(Integer.parseInt("QWE")));
        String expectedMessage = "For input string";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    @DisplayName(" delAfter with times ")
    void delAfterWithTimes() {
        ACTUAL.putFirst(1);
        ACTUAL.putLast(2);
        ACTUAL.putLast(2);
        ACTUAL.putLast(3);
        ACTUAL.putLast(4);
        ACTUAL.putLast(5);
        ACTUAL.delAfter(2,2);

        assertEquals(4, ACTUAL.head.next.next.next.data);
        assertEquals(5, ACTUAL.head.next.next.next.next.data);
    }

    @Test
    @DisplayName(" delByKeyTest ")
    void delByKeyTest() {
        ACTUAL.putFirst(1);
        ACTUAL.putLast(2);
        ACTUAL.putLast(3);
        ACTUAL.putLast(4);
        ACTUAL.putLast(5);
        ACTUAL.delByKey(3);

        assertEquals(4, ACTUAL.head.next.next.data);
        assertEquals(5, ACTUAL.head.next.next.next.data);
    }

    @Test
    @DisplayName(" delByKey with times ")
    void delByKeyWithTimes() {
        ACTUAL.putFirst(1);
        ACTUAL.putLast(2);
        ACTUAL.putLast(2);
        ACTUAL.putLast(3);
        ACTUAL.putLast(4);

        ACTUAL.delByKey(2,2);

        assertEquals(3, ACTUAL.head.next.next.data);
        assertEquals(4, ACTUAL.head.next.next.next.data);
    }
}
