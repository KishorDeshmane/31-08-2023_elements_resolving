package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.ElementUtil;

public class Administrator_dashboard_page_objects {
	private WebDriver driver;
	
	/*
	 * 
	 * Pop Up and others Elements
	 * 
	 */
	
	@FindBy(xpath = "//*[@class='Toastify__close-button Toastify__close-button--light']")
	private WebElement toastfy_close_button;
	
	@FindBy(xpath = "//*[@alt='logo1']")
	private WebElement main_logo;
	
	@FindBy(xpath="//*[@id='mainSidebarToggle']/span")
	private WebElement hamburger_button;
	
	/*
	 * 
	 * Notification Pop Up
	 * 
	 */

	@FindBy(xpath = "//*[@class='main-header-notification dropdown']/a/i[1]")
	private WebElement notification_dropdown_button;

	@FindBy(xpath = "//*[@class='main-notification-list']")
	private List <WebElement> notification_list;
	
	@FindBy(xpath= "(//*[@class='main-notification-text'])[1]")
	private WebElement you_have_dot_unread_notifications;
	
	@FindBy(xpath="(//*[@class='main-notification-text'])[1]/a/span")
	private WebElement view_all_link_top;
	
	@FindBy(xpath= "//*[text()='View All Notifications']")
	private WebElement view_all_notifications_link;
	
	/*
	 * 
	 * Profile Pop up
	 * 
	 */
	
	@FindBy(xpath = "//*[@class='main-profile-menu dropdown']")
	private WebElement profile_dropdown_button;
	
	@FindBy(xpath = "//div/h6[@class='main-notification-title']")
	private WebElement profile_dropdown_user_name;

	@FindBy(xpath = "//*[@class='main-notification-text']")
	private WebElement profile_dropdown_user_role;

	@FindBy(xpath = "//*[@class='main-notification-text small']/span[2]")
	private WebElement profile_dropdown_user_last_log_in_time;

	@FindBy(xpath = "//*[text()=' My Profile']")
	private WebElement profile_dropdown_item_my_profile;

	@FindBy(xpath = "//*[text()=' Change Password']")
	private WebElement profile_dropdown_item_change_password;

	@FindBy(xpath = "//*[text()=' Sign Out']")
	private WebElement profile_dropdown_item_sign_out;
	
	@FindBy(xpath = "//*[@class='sidemenu-label']")
	private List<WebElement> side_menu_navigational_tabs;
	
	@FindBy(xpath = "(//*[@class='sidemenu-label'])[1]")
	private WebElement navigational_tab_dashbaord;
	
	/*
	 * 
	 * LookUps tab
	 * 
	 */
	
	@FindBy(xpath="(//*[@class='sidemenu-label'])[2]")
	private WebElement navigational_tab_lookups;
	
	@FindBy(xpath="//*[text()='Service Category']")
	private WebElement navigational_tab_lookups_service_category;
	
	@FindBy(xpath="//*[text()='Service Areas']")
	private WebElement navigational_tab_lookups_service_areas;
	
	@FindBy(xpath="//*[text()='Services']")
	private WebElement navigational_tab_lookups_services;
	
	/*
	 * 
	 * Users Tab
	 * 
	 */
	
	@FindBy(xpath = "(//*[@class='sidemenu-label'])[3]")
	private WebElement navigational_tab_users;
	
	@FindBy(xpath = "//*[text()='All Users']")
	private WebElement navigational_tab_users_all_users;
	
	@FindBy(xpath = "//*[text()='Partners']")
	private WebElement navigational_tab_users_partners;
	
	@FindBy(xpath = "//*[text()='Customers']")
	private WebElement navigational_tab_users_customers;
	
	/*
	 * 
	 * Card Body
	 * 
	 */
	
	@FindBy(xpath = "//*[@class='card-body p-4']")
	private WebElement card_box_below_the_naviagtional_tabs;

	@FindBy(xpath = "//*[@class='font-weight-bold text-white ']")
	private WebElement name_of_user_in_the_card_box;

	@FindBy(xpath = "//*[@class='tx-white-7 mb-1']")
	private WebElement projects_details_in_the_card_box;

	@FindBy(xpath = "//*[@class='text-warning']")
	private WebElement projects_percentages_in_the_card_box;
	
	@FindBy(xpath = "//*[@alt='user-img']")
	private WebElement image_in_the_card_box;
	
	/*
	 * 
	 * Footer
	 * 
	 */

	@FindBy(xpath = "//*[@id='back-to-top']/i")
	private WebElement back_to_top_arrow;

	@FindBy(xpath = "//*[@class='main-footer text-center']/div/div/div/span")
	private WebElement copyrights_details;
	
	@FindBy(xpath = "//a[text()='Shield']")
	private WebElement copyrights_details_shield_link;
	
	@FindBy(xpath = "//*[text()='Iffort']")
	private WebElement copyrights_details_iffort_link;

	/*
	 * 
	 * 
	 * 
	 * 
	 * Constructor
	 * 
	 * 
	 * 
	 */
	
	public Administrator_dashboard_page_objects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * 
	 * 
	 * 
	 * Methods
	 * 
	 * 
	 * 
	 */
	
	public boolean administrator_dashboard_main_logo_is_displayed() {
		return main_logo.isDisplayed();
	}
	
	public boolean administrator_dashboard_main_logo_is_clickable() {
		return main_logo.isEnabled();
	}
	
	public boolean administrator_dashboard_hamburger_butotn_is_displayed(){
		return hamburger_button.isDisplayed();
	}

	public boolean administrator_dashboard_hamburger_butotn_is_clickable(){
		return hamburger_button.isEnabled();
	}
	
	public void administrator_dashboard_main_logo_is_clicked() {
		main_logo.click();
	}
	
	public boolean administrator_dashboard_notification_dropdown_button_is_displayed() {
		return notification_dropdown_button.isDisplayed();
	}
	
	public boolean administrator_dashboard_notification_dropdown_button_is_clickable(){
		return notification_dropdown_button.isEnabled();
	}
	
	public void administrator_dashboard_first_notification_dropdown_button_is_clicked(){
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, toastfy_close_button);
		toastfy_close_button.click();
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, notification_dropdown_button);
//		notification_dropdown_button.click();
	}
	
	public void administrator_dashboard_notification_dropdown_button_is_clicked(){
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, notification_dropdown_button);
		notification_dropdown_button.click();
	}

	public boolean administrator_dashboard_profile_dropdown_button_is_displayed() {
		return profile_dropdown_button.isDisplayed();
	}
	
	public boolean administrator_dashboard_profile_dropdown_button_is_clickable() {
		return profile_dropdown_button.isEnabled();
	}

	public boolean administrator_dashboard_navigational_tabs_is_displayed() {
		for (int i = 0; i < side_menu_navigational_tabs.size(); i++) {
		WebElement cat = side_menu_navigational_tabs.get(i);
		System.out.println(cat.isDisplayed());
		//System.out.println(cat.isEnabled());
		 try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
		return true;
	}
	
	public boolean administrator_dashboard_navigational_tabs_is_clickable() {
		for (WebElement element : side_menu_navigational_tabs) {
			System.out.println(element.getText());
		    System.out.println(element.isEnabled());
		    try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		    return true;
	}

	public boolean administrator_dashboard_navigational_tabs_is_mouse_hover(){
		for (WebElement element : side_menu_navigational_tabs) {
		    ElementUtil.eu.mouseHover(driver, element);
		    try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		    return true;
	}
	
	public boolean administrator_dashboard_card_box_below_the_naviagtional_tabs_is_displayed() {
		return card_box_below_the_naviagtional_tabs.isDisplayed();
	}

	public boolean administrator_dashboard_name_of_user_in_the_card_box_is_displayed() {
		name_of_user_in_the_card_box.getText();
		return name_of_user_in_the_card_box.isDisplayed();
	}

	public boolean administrator_dashboard_projects_details_in_the_card_box_is_displayed() {
		return projects_details_in_the_card_box.isDisplayed();
	}

	public boolean administrator_dashboard_projects_percentages_in_the_card_box_is_displayed() {
		return projects_percentages_in_the_card_box.isDisplayed();
	}

	public boolean administrator_dashboard_back_to_top_arrow_is_displayed() {
		ElementUtil.eu.scroll_down_body_click(5, driver);
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, back_to_top_arrow);
		return back_to_top_arrow.isDisplayed();
	}
	
	public boolean administrator_dashboard_back_to_top_arrow_is_clickable() {
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, back_to_top_arrow);
		return back_to_top_arrow.isDisplayed();
	}

	public boolean administrator_dashboard_copyrights_details_is_displayed() {
		copyrights_details.getText();
		return copyrights_details.isDisplayed();
	}
	
	public boolean administrator_dashboard_copyrights_details_shield_link_is_clickable(){
		return copyrights_details_shield_link.isEnabled();
	}
	
	public void administrator_dashboard_copyrights_details_shield_link_is_click(){
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, copyrights_details_shield_link);
		//super_admin_logger_copyrights_details_shield_link.click();
		ElementUtil.eu.clickByJS(driver, copyrights_details_shield_link);	
	}
	
	public boolean administrator_dashboard_copyrights_details_iffort_link_is_clickable(){
		return copyrights_details_iffort_link.isEnabled();
	}
	
	public void administrator_dashboard_copyrights_details_iffort_link_is_click(){
		copyrights_details_iffort_link.click();
	}

	public String new_window_url_page_is(){
		return ElementUtil.eu.get_window_handels_pages(driver);
	}
	
	
	public boolean administrator_dashboard_image_in_the_card_box_is_displayed() {
		ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, image_in_the_card_box);
		return image_in_the_card_box.isDisplayed();
	}
	
	/**
	 * 
	 * Notification
	 * 
	 * 
	 */
	
	public boolean administrator_dashboard_view_all_notification_text_is_displayed() {
		return view_all_notifications_link.isDisplayed();
	}
	
	public boolean administrator_dashboard_notification_list_is_clickable() {
		 for (WebElement element : notification_list) {
	            element.isEnabled();
	            System.out.println(element.getText());
	        }
		 return true;
	}
	
	public boolean administrator_dashboard_notification_text_you_have_dot_unread_notifications_is_displayed() {
		return you_have_dot_unread_notifications.isDisplayed();
	}
	
	public boolean administrator_dashboard_view_all_notifications_link_top_is_displayed(){
		return view_all_link_top.isDisplayed();
	}
	
	public void administrator_dashboard_view_all_notifications_link_top_is_clicked(){
		view_all_link_top.click();
	}
	
	public boolean administrator_dashboard_get_the_view_all_notifications_link_is_clickable(){
		return view_all_notifications_link.isEnabled();
	}
	
	/**
	 * 
	 * 
	 * Profile metods
	 * 
	 * 
	 * 
	 */
	
	public void administrator_dashboard_first_profile_dropdown_button_is_clicked(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, toastfy_close_button);
		toastfy_close_button.click();
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, profile_dropdown_button);
		profile_dropdown_button.click();
	}
	
	public void administrator_dashboard_first_profile_dropdown_button_with_changed_status_is_clicked(){
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, driver.findElement(By.xpath("//*[text()='User status updated successfully.']")));
		driver.findElement(By.xpath("//*[text()='User status updated successfully.']")).click();
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, profile_dropdown_button);
		profile_dropdown_button.click();
	}
	
	public void administrator_dashboard_other_time_profile_dropdown_button_is_clicked(){
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, profile_dropdown_button);
		profile_dropdown_button.click();
	}
	
	public boolean administrator_dashboard_profile_dropdown_user_name_is_displayed(){
		return profile_dropdown_user_name.isDisplayed();	
	}
	
	public boolean administrator_dashboard_profile_dropdown_user_role_is_displayed(){
		return profile_dropdown_user_role.isDisplayed();
	}
	
	public boolean administrator_dashboard_profile_dropdown_user_last_log_in_time_is_displayed() {
		return profile_dropdown_user_last_log_in_time.isDisplayed();
	}
	
	public boolean administrator_dashboard_profile_dropdown_item_my_profile_is_displayed(){
		return profile_dropdown_item_my_profile.isDisplayed();
	}
	
	public void administrator_dashboard_profile_dropdown_my_profile_is_clicked(){
		profile_dropdown_item_my_profile.click();
	}
	
	public boolean administrator_dashboard_profile_dropdown_item_my_profile_is_clickable(){
		return profile_dropdown_item_my_profile.isEnabled();
	}
	
	public boolean administrator_dashboard_profile_dropdown_item_change_password_is_displayed() {
		return profile_dropdown_item_change_password.isDisplayed();
	}
	
	public boolean administrator_dashboard_profile_dropdown_item_change_password_is_clickable(){
		return profile_dropdown_item_change_password.isEnabled();
	}
	
	public boolean administrator_dashboard_profile_dropdown_item_sign_out_is_displayed() {
		return profile_dropdown_item_sign_out.isDisplayed();
	}
	
	public boolean administrator_dashboard_profile_dropdown_item_sign_out_is_clickable(){
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, profile_dropdown_item_sign_out);
		return profile_dropdown_item_sign_out.isEnabled();
	}
	
	public void administrator_dashboard_profile_dropdown_item_sign_out_is_clicked(){
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, profile_dropdown_item_sign_out);
		profile_dropdown_item_sign_out.click();
	}
	
	/**
	 * 
	 * 
	 * Middle page
	 * 
	 * 
	 * **/
	
//	public boolean administrator_dashboard_users_button_is_clicked(){
//		try {
//			Thread.sleep(150);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		ElementUtil.eu.mouseHover(driver, navigational_tab_users);
//		navigational_tab_users.click();
//		return true;
//	}
	
	public void administrator_dashboard_mouser_users_all_users_is_clicked(){
		try {
			navigational_tab_users_all_users.click();
		} catch (StaleElementReferenceException e) {
			e.printStackTrace();
		}
	}
	
	public void administrator_dashboard_mouser_users_partners_users_is_clicked(){
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, navigational_tab_users_partners);
//		ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, navigational_tab_users_partners);
		navigational_tab_users_partners.click();
	}
	
	public void administrator_dashboard_mouser_users_customers_users_is_clicked(){
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, navigational_tab_users_customers);
//		ElementUtil.eu.wait_for_element_to_be_displayed(driver, 10, navigational_tab_users_customers);
		navigational_tab_users_customers.click();
	}
	
	public boolean administrator_dashboard_list_on_users_is_displayed(){
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, navigational_tab_users);
		ElementUtil.eu.mouseHover(driver, navigational_tab_users);
		return true;
	}
	
	public boolean administrator_dashboard_mouse_hover_on_users_all_users_button() {
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, navigational_tab_users_all_users);
		ElementUtil.eu.mouseHover(driver, navigational_tab_users_all_users);
		return true;
	}
	
	
	public void administrator_dashboard_mouser_hover_on_lookups_button(){
		ElementUtil.eu.mouseHover(driver, navigational_tab_lookups);
	}
	
	public void administrator_dashboard_lookups_button_is_clicked(){
		try {
			navigational_tab_lookups.click();
		} catch (StaleElementReferenceException e) {
			e.printStackTrace();
		}
	}
	
	public void administrator_dashboard_users_button_is_clicked(){
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, navigational_tab_users );
		navigational_tab_users.click();
	}
	
	public boolean administrator_dashboard_mouse_hover_on_lookups_category_button(){
		ElementUtil.eu.mouseHover(driver, navigational_tab_lookups_service_category);
		return true;
	}
	
	public boolean administrator_dashboard_mouse_hover_on_lookups_service_areas_button(){
		ElementUtil.eu.mouseHover(driver, navigational_tab_lookups_service_areas);
		return true;
	}
	
	public boolean administrator_dashboard_mouse_hover_on_lookups_services_button(){
//		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, navigational_tab_lookups_services);
		ElementUtil.eu.mouseHover(driver, navigational_tab_lookups_services);
		return true;
	}
	
	public boolean administrator_dashboard_mouse_hover_on_users_partners_button(){
		try {
			ElementUtil.eu.mouseHover(driver, navigational_tab_users_partners);
			} catch (StaleElementReferenceException e) {
			  System.out.println("The element is no longer attached to the DOM.");
			}
		return true;
	}
	
	public boolean administrator_dashboard_mouse_hover_on_users_customers_button(){
		try {
			ElementUtil.eu.mouseHover(driver, navigational_tab_users_customers);
			} catch (StaleElementReferenceException e) {
			  System.out.println("The element is no longer attached to the DOM.");
			}
		return true;
	}
	
	public boolean administrator_dashboard_dashboard_button_is_clickable(){
		return navigational_tab_dashbaord.isEnabled();
	}
	
	public boolean administrator_dashboard_users_is_clickable(){
		return navigational_tab_users.isEnabled();
	}
	

	
	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 * **/
	
	public void administrator_dashboard_profile_dropdown_change_password_is_clicked(){
		ElementUtil.eu.wait_for_element_to_be_clickable(driver, 10, profile_dropdown_item_change_password);
		profile_dropdown_item_change_password.click();
	}
	
	public void administrator_dashboard_mouser_masters_service_category_is_clicked() {
		try {
			navigational_tab_lookups_service_category.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void administrator_dashboard_mouser_masters_service_areas_is_clicked() {
		navigational_tab_lookups_service_areas.click();
	}

	
}
