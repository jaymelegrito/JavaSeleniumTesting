package jj.alert;

import org.testng.Assert;
import org.testng.annotations.Test;

import jj.base.BaseTests;

public class FileUploadTest extends BaseTests{

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickUpload();
        uploadPage.uploadFile("C:\\Users\\Jay\\HelloTestNG\\simpleTest\\resources\\uploadFile.txt");
        Assert.assertEquals(uploadPage.getUploadedFileName(), "uploadFile.txt", "File name incorrect");
    }
    
}
