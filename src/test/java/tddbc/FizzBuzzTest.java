package tddbc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("FizzBuzzクラスのテスト")
class FizzBuzzTest {

	private FizzBuzz fizzBuzz;

	@BeforeEach
	void 前準備() {
		// 準備
		fizzBuzz = new FizzBuzz();
	}

	@Nested
	class convertメソッドは数値を渡すと文字列を返す {

		@Nested
		class 数値3の倍数を渡すとFizzを返す {
			@Test
			void _3を渡すと文字列Fizzを返す() {
				assertEquals("Fizz", fizzBuzz.convert(3));
			}
		}

		@Nested
		class 数値5の倍数を渡すとBuzzを返す {
			@Test
			void _5を渡すと文字列Buzzを返す() {
				assertEquals("Buzz", fizzBuzz.convert(5));
			}
		}

		@Nested
		class 数値3かつ5の倍数を渡すとFizzBuzzを返す {
			@Test
			void _15を渡すと文字列FizzBuzzを返す() {
				assertEquals("FizzBuzz", fizzBuzz.convert(15));
			}
		}

		@Nested
		class その他の数値を渡すとそのまま文字列を返す {
			@Test
			void _1を渡すと文字列1を返す() {
				assertEquals("1", fizzBuzz.convert(1));
			}
		}
	}
}
