package sample;

import static org.junit.Assert.*;

//is()として使えるよう、statidにimport
import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class test {

    //テスト用に作成したメソッドには「@Test」をつける
    @Test
    public void test() {
        main actual = new main();
        assertThat(actual.getTitle(),is("aaa"));
    }

}
