package snakecamel;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class SnakeCamelTest {

	
	@Test
	public void snakeToCamelcaseでキャメルケース文字列を取得する(){
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "AbcDef";
		String actual = snake.snakeToCamelcase("abc_def__");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void camelToSnakecaseでスネークケースの文字列を取得する(){
		SnakeCamelUtil snake2 = new SnakeCamelUtil();
		String expected =  "abc_def_gh";
		String actual = snake2.camelToSnakecase("AbcDefGh");
		assertThat(actual,is(expected));
	}

	@Test
	public void capitalizeの実行テスト(){
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "Xyz";
		String actual = snake.capitalize("xyz");
		assertThat(actual,is(expected));
	}
	
	@Test
	public void uncapitalizeの実行テスト(){
		SnakeCamelUtil snake = new SnakeCamelUtil();
		String expected = "xyz";
		String actual = snake.uncapitalize("Xyz");
		assertThat(actual,is(expected));
	}

}
