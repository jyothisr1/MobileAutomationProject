package com.automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChatPage extends BasePage {
    @FindBy(xpath = "//android.webkit.WebView")
    WebElement chatWindow;

    public WebElement verifyOnChatPage() {
        return chatWindow;
    }
}
