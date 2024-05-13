package javapractice;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PriorityQueueTest{
    private static PriorityQueue<Integer> test;

    @BeforeAll
    public static void setup(){
        test = new PriorityQueue<Integer>();
    }

    @Test
    void test_add_happy(){
        test.add(12);
        assertEquals(test.size(), 1);
    }

    @Test
    void TestCase2(){
    }

    @Test
    void TestCase3(){
    }
}