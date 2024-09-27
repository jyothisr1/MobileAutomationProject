package com.automation.Steps;

import com.automation.Pages.ChatPage;
import com.automation.Utils.ReportManager;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ChatSteps {
    ChatPage chatPage = new ChatPage();

    @Then("verify user is on chatting page")
    public void verifyUserIsOnChattingPage() {
        Assert.assertTrue(chatPage.verifyOnChatPage().isDisplayed());
        ReportManager.attachScreenShot();
    }
}
