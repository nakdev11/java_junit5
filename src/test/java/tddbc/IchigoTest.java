package tddbc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class IchigoTest {


    @Nested
    class 品種とサイズを与えていちごを作成する{
        @Test
        public void 品種を文字列で与えてあまおうであればいちごクラスに保存() {
            // Setup
            Ichigo sut = new Ichigo();
            // Exercise
            sut.setHinsyu("あまおう");
            String actual = sut.getHinsyu();
            // Verify
            assertEquals("あまおう", actual);
        }

        @Test
        public void 品種を文字列で与えてとちおとめであればいちごクラスに保存() {
            // Setup
            Ichigo sut = new Ichigo();
            // Exercise
            sut.setHinsyu("とちおとめ");
            String actual = sut.getHinsyu();
            // Verify
            assertEquals("とちおとめ", actual);
        }

        @Test
        public void 品種を文字列で与えてもういっこであればいちごクラスに保存() {
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
        	// Exercise
        	sut.setHinsyu("ひんしゅ");
        	String actual = sut.getHinsyu();
        	// Verify
        	assertThrows(Exception.class, () -> );
        }

    }

}
