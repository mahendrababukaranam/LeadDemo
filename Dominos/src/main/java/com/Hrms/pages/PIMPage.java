package com.Hrms.pages;

import org.openqa.selenium.By;

import com.Hrms.utils.CommonUtils;

public class PIMPage{
	// Web locators

	private final static By by_pim = By.xpath("//li[@id='pim']");
	private final static By by_addEmp = By.xpath("//*[@id='pim']/ul/li[2]/a");
	private final static By by_firstName = By.xpath("//input[@id='txtEmpFirstName']");
	private final static By by_lastName = By.xpath("//input[@id='txtEmpLastName']");
	private final static By by_iframe = By.xpath("//iframe[@id='rightMenu']");
	private final static By by_save = By.xpath("//input[@id='btnEdit']");
	private final static By by_back = By.xpath("//input[@class='backbutton']");
	private final static By by_empName = By.xpath("//a[contains(text(),'Sai')]");
	private final static By by_dropdown = By.xpath("//select[@id='loc_code']");
	private final static By by_searchFor = By.xpath("//input[@id='loc_name']");
	private final static By by_searchButon = By.xpath("//input[@onclick='returnSearch();']");
	private final static By by_selectEmpList = By.xpath("//input[@name='chkLocID[]']");
	private final static By by_deleteEmp = By.xpath("//input[@value='Delete']");
	private final static By by_deleteMessage = By.xpath("//span[@class='failure']");
	private final static By by_deleteEmpVerify = By.xpath("//input[@value='0014']");
	private final static By by_clickEmpList = By.xpath("//a[@href='./CentralController.php?menu_no_top=hr&id=0016&capturemode=updatemode&reqcode=EMP&currentPage=1']");
	private final static By by_clickEditButton = By.xpath("//input[@id='btnEditPers']");
	private final static By by_clickSaveButton = By.xpath("//input[@value='Save']");
	private final static By by_savedEmpDataVerify = By.xpath("//a[contains(text(), 'Mahendra')]");
	private final static By by_clickOnEditPhotoBox = By.xpath("//img[@onclick='showPhotoHandler()']");
	private final static By by_clickOnUploadPhotoField = By.xpath("//input[@id='photofile']");
	private final static By by_clickOnUploadPhotoSaveButton = By.xpath("//input[@onclick='addPic();']");
	private final static By by_verifyAddedEmpPhoto = By.xpath("//img[@alt='Click to edit photo']");
	

	
	
	// Getter/Setter Helping functions
	public static void clickOnElement() throws Exception {
		CommonUtils.clickElement(getPim());
	}
	
	public static By getPim() throws Exception {
		return by_pim;
	}
	
	public static By getAddEmp() throws Exception {
		return by_addEmp;
	}
	
	public static By getFirstName() throws Exception {
		return by_firstName;
	}
	
	public static By getLastName() throws Exception {
		return by_lastName;
	}
	
	public static By getFrame() throws Exception {
		return by_iframe;
	}
	
	public static By getSave() throws Exception {
		return by_save;
	}
	
	public static By getBackButton() throws Exception {
		return by_back;
	}
	
	public static By getEmpName() throws Exception {
		return by_empName;
	}
	
	public static By getDropdown() throws Exception {
		return by_dropdown;
	}
	
	public static By getSearchFor() throws Exception {
		return by_searchFor;
	}
	
	public static By getSearchButton() throws Exception {
		return by_searchButon;
	}
	
	public static By getSelectEmpList() throws Exception {
		return by_selectEmpList;
	}
	
	public static By getDeleteEmp() throws Exception {
		return by_deleteEmp;
	}
	
	public static By getDeleteEmpMessage() throws Exception {
		return by_deleteMessage;
	}
	
	public static By getDeleteEmpVerify() throws Exception {
		return by_deleteEmpVerify;
	}
	
	public static By getEmpList() throws Exception {
		return by_clickEmpList;
	}
	
	public static By getEditButton() throws Exception {
		return by_clickEditButton;
	}
	
	public static By getClickSaveButton() throws Exception {
		return by_clickSaveButton;
	}

	public static By getSavedEmpDataVerify() throws Exception {
		return by_savedEmpDataVerify;
	}

	public static By getSearchEmpVerify() {
		// TODO Auto-generated method stub
		return by_selectEmpList;
	}
	
	public static By getClickOnEditPhotoBox() {
		// TODO Auto-generated method stub
		return by_clickOnEditPhotoBox;
	}
	
	public static By getClickOnUploadPhotoField() {
		// TODO Auto-generated method stub
		return by_clickOnUploadPhotoField;
	}

	public static By getClickOnUploadPhotoSaveButton() {
		// TODO Auto-generated method stub
		return by_clickOnUploadPhotoSaveButton;
	}
	
	public static By getAddedEmpPhotoVerify() {
		// TODO Auto-generated method stub
		return by_verifyAddedEmpPhoto;
	}
	
}
