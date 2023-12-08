package org.example;

import static org.junit.jupiter.api.Assertions.*;

import java.util.EmptyStackException;
import java.util.Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class StackTest {
    public Stack<String> stack;
    
    @BeforeEach
    public void setup() {
    	stack = new Stack<>();
    }

    @Nested
    public class EmptyStackTest{ 
	    @Test
	    public void isEmpty() {
	        assertTrue(stack.isEmpty());
	    }
	
	    @Test
	    public void throwsExceptionWhenPopped() {
	        assertThrows(EmptyStackException.class, () -> stack.pop());
	    }
    }

   
    @Nested
    public class AfterPushing{
    	public String anElement = "要素1";
    	
    	@BeforeEach
    	public void setupPush() {
    		stack.push(anElement);
    	}
    	
	    @Test
	    public void isNotEmpty() {
	        assertFalse(stack.isEmpty());
	    }
	
	    @Test
	    public void returnElementWhenPopped() {
	        assertEquals(anElement, stack.pop());
	    }
    }

}
