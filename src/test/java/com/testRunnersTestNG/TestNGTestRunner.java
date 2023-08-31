package com.testRunnersTestNG;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "src/test/resources/features",
//		features = "src/test/resources/A_features/B_Super_admin",
//		features = "src/test/resources/A_features/B_Administrator/C_Super_admin",
//		features = "src/test/resources/A_features/B_Administrator/D_Admin",
//		features = "src/test/resources/A_features/G_Partner",
		
		
		tags="@Super_admin_create_service_category_page",
		
//		tags="@Super_admin_my_profile_change_password_page or @Super_admin_profile_change_password_page",

		glue = {"stepDefinitions","com/applicationHooks"},
		monochrome=true,
		dryRun = false,
		plugin = {"pretty",
			"html:target/html_report/cucumber_reports.html",
			"junit:target/junit_report/junit_reports.xml",
			"json:target/json_report/json_reports.json",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
			}
		)
public class TestNGTestRunner extends AbstractTestNGCucumberTests {
	
}
