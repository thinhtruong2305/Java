package com.example.RestfulAPIAndPostgre.Repository;

import com.example.RestfulAPIAndPostgre.Common.Util.DateTimeZone;
import com.example.RestfulAPIAndPostgre.Database.Entity.License;
import com.example.RestfulAPIAndPostgre.Database.Entity.User;
import com.example.RestfulAPIAndPostgre.Database.Repository.LicenseRepository;
import com.example.RestfulAPIAndPostgre.Database.Repository.UserRepository;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Optional;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LicenseRepositoryTest {
    private static License LICENSE = new License();
    //Create
    private static final String LICENSE_NAME_CREATE = "AVanNguyen";
    private static final OffsetDateTime CREATE_AT = DateTimeZone.getDateTimeNowByZone("Asia/Ho_Chi_Minh").toOffsetDateTime();
    private static final String CREATE_BY = "admin2";
    //Find
    private static final long USER_ID = 5;
    private static final long LICENSE_ID = 13;
    //Update
    private static final String LICENSE_NAME_UPDATE = "WVanNguyen";
    private static final OffsetDateTime UPDATE_AT = DateTimeZone.getDateTimeNowByZone("Asia/Ho_Chi_Minh").toOffsetDateTime();
    private static final String UPDATE_BY = "admin2";
    @Autowired
    UserRepository userRepository;
    @Autowired
    LicenseRepository licenseRepository;

    @Test
    @Rollback(value = false)
    public void stage_1_saveLicense(){
        Optional<User> userOptional = userRepository.findById(USER_ID);
        if(userOptional.isPresent()){
            License license = new License();
            license.setLicenseName(LICENSE_NAME_CREATE);
            license.setCreateAt(CREATE_AT);
            license.setCreateBy(CREATE_BY);
            license.setUser(userOptional.get());
            License licenseSave = licenseRepository.save(license);
            LICENSE = licenseSave;
            Assertions.assertNotNull(licenseSave);
        }
        System.out.println(LICENSE.toString());
    }

    @Test
    @Rollback(value = false)
    public void stage_2_getLicenseById(){
        Optional<License> licenseOptional = licenseRepository.findById(LICENSE.getLicenseId());
        if(licenseOptional.isPresent())
            System.out.println(licenseOptional.get());
        Assertions.assertNotNull(licenseOptional.get());
    }

    @Test
    @Rollback(value = false)
    public void stage_3_getLicenseByUserId(){
        Optional<License> licenseOptional = licenseRepository.findByUser_UserId(USER_ID);
        if(licenseOptional.isPresent())
            System.out.println(licenseOptional.get());
        Assertions.assertNotNull(licenseOptional.get());
    }

    @Test
    @Rollback(value = false)
    public void stage_4_getLicenseByName(){
        Optional<License> licenseOptional = licenseRepository.findByLicenseName(LICENSE.getLicenseName());
        if(licenseOptional.isPresent())
            System.out.println(licenseOptional.get());
        Assertions.assertNotNull(licenseOptional.get());
    }

    @Test
    @Rollback(value = false)
    public void stage_5_getAllLicense(){
        List<License> licenses = licenseRepository.findAll();
        licenses.forEach(license -> {
            System.out.println(license.toString());
        });
        Assert.notEmpty(licenses);
    }

    @Test
    @Rollback(value = false)
    public void stage_6_updateLicenseByLicenseId(){
        Optional<License> licenseOptional = licenseRepository.findById(LICENSE.getLicenseId());
        if(licenseOptional.isPresent()){
            licenseOptional.get().setLicenseName(LICENSE_NAME_UPDATE);
            licenseOptional.get().setUpdateAt(UPDATE_AT);
            licenseOptional.get().setUpdateBy(UPDATE_BY);
            licenseRepository.save(licenseOptional.get());
        }
        Optional<License> licenseUpdate = licenseRepository.findByLicenseName(LICENSE_NAME_UPDATE);
        if(licenseUpdate.isPresent())
            System.out.println(licenseUpdate.get());
        Assertions.assertEquals(licenseUpdate.get().getLicenseName(), LICENSE_NAME_UPDATE);
    }

    @Test
    @Rollback(value = false)
    public void stage_7_deleteLicenseById(){
        boolean isExistBeforeDelete = licenseRepository.findById(LICENSE_ID).isPresent();
        licenseRepository.deleteById(LICENSE_ID);
        boolean notExistAfterDelete = licenseRepository.findById(LICENSE_ID).isPresent();
        Assertions.assertTrue(isExistBeforeDelete);
        Assertions.assertFalse(notExistAfterDelete);
    }
}
