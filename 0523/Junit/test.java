package sample;

import static org.junit.Assert.*;

//is()�Ƃ��Ďg����悤�Astatid��import
import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class test {

    //�e�X�g�p�ɍ쐬�������\�b�h�ɂ́u@Test�v������
    @Test
    public void test() {
        main actual = new main();
        assertThat(actual.getTitle(),is("aaa"));
    }

}
