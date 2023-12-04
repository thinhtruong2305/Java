package com.example.RestfulAPIAndPostgre.Entity;

import com.example.RestfulAPIAndPostgre.Database.Repository.LicenseRepository;
import com.example.RestfulAPIAndPostgre.Common.Util.DateTimeZone;
import com.example.RestfulAPIAndPostgre.Database.Entity.License;
import com.example.RestfulAPIAndPostgre.Database.Entity.User;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.time.LocalDate;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class LicenseTest {
    @Autowired
    LicenseRepository licenseRepository;

    @Test
    @Rollback(value = false)
    public void saveLicense_shouldSaveWithBuilderDefaultValueAndNullable() {
        User user = User.builder()
                .userName("Trương Văn Tiến Thịnh")
                //.birthDate(LocalDate.of(2001,5,23))
                .email("thinhuser@gmail.com")
                .password("Thinh@123")
                //.createAt(DateTimeZone.getDateTimeNowByZone("Asia/Ho_Chi_Minh").toLocalDateTime())
                .createBy("admin1")
                .build();
        License license = License.builder()
                .licenseName("Orgami")
                //.createAt(DateTimeZone.getDateTimeNowByZone("Asia/Ho_Chi_Minh").toLocalDateTime())
                .createBy("admin1")
                .keyword("Orgami")
                .user(user)
                .build();
        License licenseSave = licenseRepository.save(license);
        Assertions.assertNotNull(licenseSave);
    }

    @Test
    @Rollback(value = false)
    public void saveLicense_shouldSaveWithSetDefaultValueAndNullable() {
        User user = User.builder()
                .userName("Trương Văn Tiến Thịnh")
                //.birthDate(LocalDate.of(2001,5,23))
                .email("thinhuser@gmail.com")
                .password("Thinh@123")
                //.createAt(DateTimeZone.getDateTimeNowByZone("Asia/Ho_Chi_Minh").toLocalDateTime())
                .createBy("admin1")
                .build();
        License license = new License();
        license.setLicenseName("AVanNguyen");
        //license.setCreateAt(DateTimeZone.getDateTimeNowByZone("Asia/Ho_Chi_Minh").toLocalDateTime());
        license.setCreateBy("admin3");
        license.setUser(user);
        License licenseSave = licenseRepository.save(license);
        Assertions.assertNotNull(licenseSave);
    }

    @Test
    @Rollback(value = false)
    public void saveLicense_shouldSaveWithConstructorDefaultValueAndNullable() {
        User user = User.builder()
                .userName("Trương Văn Tiến Thịnh")
                //.birthDate(LocalDate.of(2001,5,23))
                .email("thinhuser@gmail.com")
                .password("Thinh@123")
                //.createAt(DateTimeZone.getDateTimeNowByZone("Asia/Ho_Chi_Minh").toLocalDateTime())
                .createBy("admin1")
                .build();
        License license = new License(
                //DateTimeZone.getDateTimeNowByZone("Asia/Ho_Chi_Minh").toLocalDateTime(),
                null,
                "admin5",
                null, null, null, null, null, null, 0,
                "BThiHuynh", null, user);
        License licenseSave = licenseRepository.save(license);
        Assertions.assertNotNull(licenseSave);
    }
}
