package ru.geekbraines;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayAppTest {

    private ArrayApp a1;


    @BeforeEach
    void init() { a1 = new ArrayApp(); }

    @Test
    void testMethod1() {
        Logger LOGGER = LogManager.getLogger("test1");
        assertArrayEquals(new int[] {0,3,7}, a1.method1( new int[]{1,2,3,4,0,3,7} ));
        assertThrows(RuntimeException.class, () -> {a1.method1(new int[]{0,3,0,1,5,6}); } );
        assertArrayEquals(new int[0], a1.method1( new int[]{1,2,3,4,0,3,4} ));
        assertArrayEquals(new int[] {2,3,6,0,3,8} , a1.method1( new int[]{4,2,3,6,0,3,8} ));
        LOGGER.info("Тест метода 1 пройден");
    }

    @Test
    void testMethod2() {
        Logger LOGGER = LogManager.getLogger("test2");
        assertTrue(a1.method2(new int[]{1,4,4,1,4,1,1,4}));
        assertFalse(a1.method2(new int[]{0,4,4,7,4,8,0,3}));
        assertFalse(a1.method2(new int[]{0,1,1,7,1,8,0,3}));
        assertFalse(a1.method2(new int[]{1,4,4,1,4,1,1,3}));
        LOGGER.info("Тест метода 2 пройден");
    }
}