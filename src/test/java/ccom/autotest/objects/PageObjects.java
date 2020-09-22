package ccom.autotest.objects;

import com.autotest.annotations.LazyAutowired;
import com.autotest.pages.ForgotYourPasswordPage;
import com.autotest.pages.HomePage;
import com.autotest.pages.LoginPage;

public class PageObjects extends UtilObjects{
	@LazyAutowired
	protected ForgotYourPasswordPage forgotYourPasswordPage;
	
	@LazyAutowired
	protected LoginPage loginPage;
	
	@LazyAutowired
	protected HomePage homePage;
}
