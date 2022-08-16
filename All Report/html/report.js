$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/Login.feature");
formatter.feature({
  "name": "",
  "description": "  To Validate the Login Functionality of the Face Book Application",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Have To Open Google Chrome and Open face book page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefnitionFile.userHaveToOpenGoogleChromeAndOpenFaceBookPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "    To Validate Login By Using Valid User Name and Valid Password",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "User provide Valid User name and Valid Password",
  "rows": [
    {
      "cells": [
        "vijayan92jkm@gmail.com",
        "Gsavijayan23@",
        "prdisdasd@gmail.com",
        "asfg3"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefnitionFile.userProvideValidUserNameAndValidPassword(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefnitionFile.userClickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Should Be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefnitionFile.userShouldBeLoggedIn()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Have To Open Google Chrome and Open face book page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefnitionFile.userHaveToOpenGoogleChromeAndOpenFaceBookPage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "    To Validate Login Functionality by giving invalid User Name and invalid Password",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.step({
  "name": "User Provide invalid User name and invalid password",
  "rows": [
    {
      "cells": [
        "priyafab",
        "akpriya714@gmail.com",
        "dharshuu"
      ]
    },
    {
      "cells": [
        "gokieee",
        "gokulsurya@gmail.com",
        "dhdwe34"
      ]
    },
    {
      "cells": [
        "surya",
        "suryanarayanan263@gmsil.com",
        "hsdhdg"
      ]
    },
    {
      "cells": [
        "venkat",
        "venkat.dwdh@gmail.com",
        "dfhef46"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefnitionFile.userProvideInvalidUserNameAndInvalidPassword(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefnitionFile.userClickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Should be Navigate to invalid credentials page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefnitionFile.userShouldBeNavigateToInvalidCredentialsPage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/FeatureFiles/forgotpassword.feature");
formatter.feature({
  "name": "",
  "description": "  To validate the forgotten password functionality of the facebook application",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@forgot"
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "    To validate the forgotten pass by clicking forgotten password lable",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@forgot"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User have to open google chrome and launch facebook page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefnitionFile.userHaveToOpenGoogleChromeAndLaunchFacebookPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have click forgotten password Lable",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefnitionFile.userHaveClickForgottenPasswordLable()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[text()\u003d\u0027Forgotten password\u0027]\"}\n  (Session info: chrome\u003d104.0.5112.81)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LENOVO\u0027, ip: \u0027192.168.233.40\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_333\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 104.0.5112.81, chrome: {chromedriverVersion: 104.0.5112.79 (3cf3e8c8a07d..., userDataDir: C:\\Users\\ELCOT\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:50162}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: a36cd684d2503a3a12a8203ffd607c4b\n*** Element info: {Using\u003dxpath, value\u003d//a[text()\u003d\u0027Forgotten password\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat org.baseclass.BaseClass.buttonClick(BaseClass.java:61)\r\n\tat org.stepdefinition.StepDefnitionFile.userHaveClickForgottenPasswordLable(StepDefnitionFile.java:73)\r\n\tat ✽.User have click forgotten password Lable(file:src/test/resources/FeatureFiles/forgotpassword.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User have click email text box",
  "rows": [
    {
      "cells": [
        "Vijayan92jkm@gmail.com"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefnitionFile.userHaveClickEmailTextBox(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User have to click search button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefnitionFile.userHaveToClickSearchButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should be navigate to reset password page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefnitionFile.userShouldBeNavigateToResetPasswordPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});