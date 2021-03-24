package jj.dropdown;

import org.testng.Assert;
import org.testng.annotations.Test;

import jj.base.BaseTests;
import jj.pages.DropDownPage;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectedOption(){
        var dropDownPage = homePage.clickDropdown();

        String option = "Option 1";
        dropDownPage.selectFromDropdown(option);
        var selectedOptions = dropDownPage.getSelectedOptions();
        Assert.assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        Assert.assertTrue(selectedOptions.contains(option), "Option not selected.");

    }
    
}
