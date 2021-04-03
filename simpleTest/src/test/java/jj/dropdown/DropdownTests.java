package jj.dropdown;

import org.testng.Assert;
import org.testng.annotations.Test;

import jj.base.BaseTests;
import jj.pages.DropDownPage;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectedOption(){
        var DropDownPage = homePage.clickDropdown();

        String option = "Option 1";
        DropDownPage.selectFromDropdown(option);
        var selectedOptions = DropDownPage.getSelectedOptions();
        Assert.assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        Assert.assertTrue(selectedOptions.contains(option), "Option not selected.");

    }
    
}
