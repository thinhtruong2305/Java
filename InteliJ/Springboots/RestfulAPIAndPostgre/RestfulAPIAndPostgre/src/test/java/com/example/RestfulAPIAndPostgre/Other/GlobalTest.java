package com.example.RestfulAPIAndPostgre.Other;

import com.example.RestfulAPIAndPostgre.Common.Util.Global;
import com.example.RestfulAPIAndPostgre.Common.Util.MyString;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class GlobalTest {
    private static final String CAPITALIZE_STRING = "dark blue, xanh tối";
    private static final String SLUG_STRING = "Trương  Văn Tiến Thịnh/Thịnh 1";
    @Test
    public void generateSlugTest(){
        String slug = MyString.generateSlug(SLUG_STRING);
        System.out.println(slug);
    }
    @Test
    public void capitalizeEachWord(){
        String capitalize = MyString.capitalizeEachWord(CAPITALIZE_STRING);
        System.out.println(capitalize);
    }
}
