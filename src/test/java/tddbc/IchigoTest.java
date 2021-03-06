package tddbc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class IchigoTest {


    @Nested
    class 品種とサイズを与えていちごを作成する{
        @Test
        public void 品種を文字列で与えてあまおうであればいちごクラスに保存() throws Exception {
            // Setup
            Ichigo sut = new Ichigo();
            // Exercise
            sut.setHinsyu("あまおう");
            String actual = sut.getHinsyu();
            // Verify
            assertEquals("あまおう", actual);
        }

        @Test
        public void 品種を文字列で与えてとちおとめであればいちごクラスに保存() throws Exception {
            // Setup
            Ichigo sut = new Ichigo();
            // Exercise
            sut.setHinsyu("とちおとめ");
            String actual = sut.getHinsyu();
            // Verify
            assertEquals("とちおとめ", actual);
        }

        @Test
        public void 品種を文字列で与えてもういっこであればいちごクラスに保存() throws Exception {
        	// Setup
        	Ichigo sut = new Ichigo();
        	// Exercise
        	sut.setHinsyu("もういっこ");
        	String actual = sut.getHinsyu();
        	// Verify
        	assertEquals("もういっこ", actual);
        }

        @Test
        public void 品種を文字列で与えてあまおう_とちおとめ_もういっこではない場合例外を返す() {
        	// Setup
        	Ichigo sut = new Ichigo();
        	// Verify
        	assertThrows(Exception.class, () -> sut.setHinsyu("ひんしゅ"));
        }

        @Test
        public void サイズを文字列で与えてSであればいちごクラスに保存() throws Exception {
        	// Setup
        	Ichigo sut = new Ichigo();
        	// Exercise
        	sut.setSize("S");
        	String actual = sut.getSize();
        	// Verify
        	assertEquals("S", actual);
        }

        @Test
        public void サイズを文字列で与えてS_M_L_LLでない場合例外を返す() {
            // Setup
            Ichigo sut = new Ichigo();
            // Verify
            assertThrows(Exception.class, () -> sut.setSize("XL"));
        }

    }

    @Nested
    class いちごの文字列表現を取得する {

        @Test
        @DisplayName("品種が登録されている場合、登録された品種を {品種}: {サイズ}　の文字列で取得できる")
        public void 品種が登録されている場合_登録された品種を品種サイズの文字列で取得できる() throws Exception {
        	// Setup
        	Ichigo sut = new Ichigo();
        	// Exercise
        	sut.setHinsyu("あまおう");
        	sut.setSize("M");
        	String actual = sut.getIchigoInfoToString();
        	// Verify
        	assertEquals("あまおう: M", actual);
        }

        @Test
        @DisplayName("サイズのみ登録されている場合、 不明: {サイズ}　を文字列で取得できる")
        public void サイズのみ登録されている場合不明_サイズを文字列で取得できる() throws Exception {
            // Setup
            Ichigo sut = new Ichigo();
            // Exercise
            sut.setSize("M");
            String actual = sut.getIchigoInfoToString();
            // Verify
            assertEquals("不明: M", actual);
        }

    }

}
