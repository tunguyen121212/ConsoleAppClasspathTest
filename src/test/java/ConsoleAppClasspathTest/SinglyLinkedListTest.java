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
    @DisplayName(" Input Exception Test")
    void exceptionInputTest() {
        Exception exception = assertThrows(NumberFormatException.class, () -> ACTUAL.putFirst(Integer.parseInt("QWE")));
        String expectedMessage = "For input string";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    @DisplayName(" viewMainMenuTest ")
    void exceptViewMainMenuTest() {
        exceptionInputTest();
    }

    @Test
    @DisplayName(" viewInsertMenuTest ")
    void exceptViewInsertMenuTest() {
        exceptionInputTest();
    }

    @Test
    @DisplayName(" viewDeleteMenuTest ")
    void exceptViewDeleteMenuTest() {
        exceptionInputTest();
    }

    @Test
    @DisplayName(" putFirstTest ")
    void putFirstTest() {
        exceptionInputTest();

        ACTUAL.putFirst(2);
        ACTUAL.putFirst(1);

        assertEquals(1, ACTUAL.head.data);
        assertEquals(2, ACTUAL.head.next.data);
    }

    @Test
    @DisplayName(" putLastTest ")
    void putLastTest() {
        exceptionInputTest();

        ACTUAL.putFirst(1);
        ACTUAL.putLast(2);

        assertEquals(2, ACTUAL.head.next.data);
        assertNull(ACTUAL.head.next.next);
    }

    @Test
    @DisplayName(" putAtPosTest ")
    void putAtPosTest() {
        exceptionInputTest();

        ACTUAL.putFirst(1);
        ACTUAL.putAtPos(2,1);
        ACTUAL.putLast(3);

        assertEquals(2, ACTUAL.head.next.data);
        assertEquals(3, ACTUAL.head.next.next.data);
    }

    @Test
    @DisplayName(" putAfterTest ")
    void putAfterTest() {
        exceptionInputTest();

        ACTUAL.putFirst(1);
        ACTUAL.putAfter(2, 1);
        ACTUAL.putLast(3);

        assertEquals(2, ACTUAL.head.next.data);
        assertEquals(3, ACTUAL.head.next.next.data);
    }

    @Test
    @DisplayName(" putAfter with times ")
    void putAfterWithTimes() {
        exceptionInputTest();

        ACTUAL.putFirst(1);
        ACTUAL.putFirst(1);
        ACTUAL.putAfter(2, 1, 2);
        ACTUAL.putLast(3);

        assertEquals(2, ACTUAL.head.next.next.data);
        assertEquals(3, ACTUAL.head.next.next.next.data);
    }

    @Test
    @DisplayName(" delFirstTest ")
    void delFirstTest() {
        exceptionInputTest();

        ACTUAL.putFirst(1);
        ACTUAL.putLast(2);
        ACTUAL.putLast(3);
        ACTUAL.delFirst();

        assertEquals(2, ACTUAL.head.data);
        assertEquals(3, ACTUAL.head.next.data);
    }

    @Test
    @DisplayName(" delLastTest ")
    void delLastTest() {
        exceptionInputTest();

        ACTUAL.putFirst(1);
        ACTUAL.putLast(2);
        ACTUAL.putLast(3);
        ACTUAL.delLast();

        assertNull(ACTUAL.head.next.next);
    }

    @Test
    @DisplayName(" delAtPosTest ")
    void delAtPosTest() {
        exceptionInputTest();

        ACTUAL.putFirst(1);
        ACTUAL.putLast(2);
        ACTUAL.putLast(3);
        ACTUAL.putLast(4);
        ACTUAL.delAtPos(2);

        assertEquals(3, ACTUAL.head.next.data);
        assertEquals(4, ACTUAL.head.next.next.data);
    }

    @Test
    @DisplayName(" delAfter ")
    void delAfterTest() {
        exceptionInputTest();

        ACTUAL.putFirst(1);
        ACTUAL.putLast(2);
        ACTUAL.putLast(3);
        ACTUAL.putLast(4);
        ACTUAL.delAfter(2);

        assertEquals(2, ACTUAL.head.next.data);
        assertEquals(4, ACTUAL.head.next.next.data);
    }

    @Test
    @DisplayName(" delAfter with times ")
    void delAfterWithTimes() {
        exceptionInputTest();

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
        exceptionInputTest();

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
        exceptionInputTest();

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
