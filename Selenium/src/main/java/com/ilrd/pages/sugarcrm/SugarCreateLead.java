package com.ilrd.pages.sugarcrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by student on 22/12/15.
 */
public class SugarCreateLead extends SugarLeadForm{


    public SugarCreateLead(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

        //TODO sync with page check this is actually create lead page
    }



}
