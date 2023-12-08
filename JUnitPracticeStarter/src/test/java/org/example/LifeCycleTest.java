package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class LifeCycleTest {
	@BeforeAll
	public static void beforeAll() {
		System.out.println("@BeforeAll");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("@BeforeEach");
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("@afterEach");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("@afterAll");
	}

    @Test
    public void test1() {
        System.out.println("テスト1 実行");
    }

    @Test
    public void test2() {
        System.out.println("テスト2 実行");
    }

    @Test
    public void test3() {
        System.out.println("テスト3 実行");
    }

    @Nested
    public class Nest1 {
    	@BeforeEach
    	public void beforeEachNest1() {
    		System.out.println("[ Nest1 ] @BeforeEach");
    	}
    	
    	@AfterEach
    	public void afterEachNest1() {
    		System.out.println("[ Nest1 ] @afterEach");
    	}

        @Test
        public void test1() {
            System.out.println("[ Nest1 ] テスト1 実行");
        }

        @Test
        public void test2() {
            System.out.println("[ Nest1 ] テスト2 実行");
        }

    }
}
