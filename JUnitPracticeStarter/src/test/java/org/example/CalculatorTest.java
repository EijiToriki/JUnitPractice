package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	@Test
	public void testTaxPrice() {
		// オブジェクトの生成
		Calculator calculator = new Calculator();
		// 期待値
		int expected = 110;
		// 実測値
		int actual = calculator.taxPrice(100);
		// 期待値と実測値の比較
		assertEquals(expected, actual);
	}
	
	@Test
	public void testTaxPriceException() {
		// オブジェクトの生成
		Calculator calculator = new Calculator();
		// 例外テスト
		assertThrows(IllegalArgumentException.class, () -> calculator.taxPrice(-110));
	}

}
