$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("openWeatherMap.feature");
formatter.feature({
  "line": 1,
  "name": "Coverage of a couple of smoke tests on Open Weather Map",
  "description": "",
  "id": "coverage-of-a-couple-of-smoke-tests-on-open-weather-map",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Invalid City Weather Scenario",
  "description": "Verify weather should not be found if user searches with an invalid city name",
  "id": "coverage-of-a-couple-of-smoke-tests-on-open-weather-map;invalid-city-weather-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "User launches OpenWeatherMap website in desired \"\u003cBrowser\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User provides an invalid city input",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User clicks on search button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "No Weather should be found",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "coverage-of-a-couple-of-smoke-tests-on-open-weather-map;invalid-city-weather-scenario;",
  "rows": [
    {
      "cells": [
        "Browser"
      ],
      "line": 13,
      "id": "coverage-of-a-couple-of-smoke-tests-on-open-weather-map;invalid-city-weather-scenario;;1"
    },
    {
      "cells": [
        "Chrome"
      ],
      "line": 14,
      "id": "coverage-of-a-couple-of-smoke-tests-on-open-weather-map;invalid-city-weather-scenario;;2"
    },
    {
      "cells": [
        "Firefox"
      ],
      "line": 15,
      "id": "coverage-of-a-couple-of-smoke-tests-on-open-weather-map;invalid-city-weather-scenario;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7853500,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Invalid City Weather Scenario",
  "description": "Verify weather should not be found if user searches with an invalid city name",
  "id": "coverage-of-a-couple-of-smoke-tests-on-open-weather-map;invalid-city-weather-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "User launches OpenWeatherMap website in desired \"Chrome\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User provides an invalid city input",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User clicks on search button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "No Weather should be found",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Chrome",
      "offset": 49
    }
  ],
  "location": "homeSteps.user_launches_OpenWeatherMap_website_in_desired(String)"
});
formatter.result({
  "duration": 9936796534,
  "status": "passed"
});
formatter.match({
  "location": "homeSteps.user_provides_an_invalid_city_input()"
});
formatter.result({
  "duration": 7279453185,
  "status": "passed"
});
formatter.match({
  "location": "homeSteps.user_clicks_on_search_button()"
});
formatter.result({
  "duration": 13638736727,
  "status": "passed"
});
formatter.match({
  "location": "citySearchResultSteps.no_Weather_should_be_found()"
});
formatter.result({
  "duration": 547029693,
  "status": "passed"
});
formatter.after({
  "duration": 1117514641,
  "status": "passed"
});
formatter.before({
  "duration": 225848,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Invalid City Weather Scenario",
  "description": "Verify weather should not be found if user searches with an invalid city name",
  "id": "coverage-of-a-couple-of-smoke-tests-on-open-weather-map;invalid-city-weather-scenario;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "User launches OpenWeatherMap website in desired \"Firefox\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User provides an invalid city input",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User clicks on search button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "No Weather should be found",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Firefox",
      "offset": 49
    }
  ],
  "location": "homeSteps.user_launches_OpenWeatherMap_website_in_desired(String)"
});
formatter.result({
  "duration": 9366323532,
  "status": "passed"
});
formatter.match({
  "location": "homeSteps.user_provides_an_invalid_city_input()"
});
formatter.result({
  "duration": 6895988485,
  "status": "passed"
});
formatter.match({
  "location": "homeSteps.user_clicks_on_search_button()"
});
formatter.result({
  "duration": 6682109323,
  "status": "passed"
});
formatter.match({
  "location": "citySearchResultSteps.no_Weather_should_be_found()"
});
formatter.result({
  "duration": 201192959,
  "status": "passed"
});
formatter.after({
  "duration": 518672898,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 18,
  "name": "Valid City Weather Scenario",
  "description": "Verify weather details should be displayed if user searches with a valid city name",
  "id": "coverage-of-a-couple-of-smoke-tests-on-open-weather-map;valid-city-weather-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 21,
  "name": "User launches OpenWeatherMap website in desired \"\u003cBrowser\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "User provides a valid city input",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User clicks on search button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Proper city details should be found",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Weather details should be updated",
  "keyword": "And "
});
formatter.examples({
  "line": 27,
  "name": "",
  "description": "",
  "id": "coverage-of-a-couple-of-smoke-tests-on-open-weather-map;valid-city-weather-scenario;",
  "rows": [
    {
      "cells": [
        "Browser"
      ],
      "line": 28,
      "id": "coverage-of-a-couple-of-smoke-tests-on-open-weather-map;valid-city-weather-scenario;;1"
    },
    {
      "cells": [
        "Chrome"
      ],
      "line": 29,
      "id": "coverage-of-a-couple-of-smoke-tests-on-open-weather-map;valid-city-weather-scenario;;2"
    },
    {
      "cells": [
        "Firefox"
      ],
      "line": 30,
      "id": "coverage-of-a-couple-of-smoke-tests-on-open-weather-map;valid-city-weather-scenario;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 192853,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Valid City Weather Scenario",
  "description": "Verify weather details should be displayed if user searches with a valid city name",
  "id": "coverage-of-a-couple-of-smoke-tests-on-open-weather-map;valid-city-weather-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 21,
  "name": "User launches OpenWeatherMap website in desired \"Chrome\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "User provides a valid city input",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User clicks on search button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Proper city details should be found",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Weather details should be updated",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Chrome",
      "offset": 49
    }
  ],
  "location": "homeSteps.user_launches_OpenWeatherMap_website_in_desired(String)"
});
formatter.result({
  "duration": 17106441235,
  "status": "passed"
});
formatter.match({
  "location": "homeSteps.user_provides_a_valid_city_input()"
});
formatter.result({
  "duration": 7225187520,
  "status": "passed"
});
formatter.match({
  "location": "homeSteps.user_clicks_on_search_button()"
});
formatter.result({
  "duration": 44506312667,
  "error_message": "junit.framework.AssertionFailedError\r\n\tat junit.framework.Assert.fail(Assert.java:55)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:22)\r\n\tat junit.framework.Assert.assertTrue(Assert.java:31)\r\n\tat com.qa.StepDefinitions.homeSteps.user_clicks_on_search_button(homeSteps.java:128)\r\n\tat ✽.And User clicks on search button(openWeatherMap.feature:23)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "citySearchResultSteps.proper_weather_details_should_be_found()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "cityTempDetailsSteps.weather_details_should_be_updated()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 34427400,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d72.0.3626.121)\n  (Driver info: chromedriver\u003d2.43.600210 (68dcf5eebde37173d4027fa8635e332711d2874a),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 22 milliseconds\nBuild info: version: \u00273.3.0\u0027, revision: \u0027b526bd5b41\u0027, time: \u00272017-03-07 19:26:04 +0000\u0027\nSystem info: host: \u0027MINTBLR015XNB6\u0027, ip: \u0027192.168.250.107\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_152\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:52451}, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.43.600210 (68dcf5eebde37173d4027fa8635e332711d2874a), userDataDir\u003dC:\\Users\\ChakrSag\\AppData\\Local\\Temp\\scoped_dir4560_13273}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d72.0.3626.121, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 75ea5d78217fc5e48537170d9954c8e3\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:216)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:168)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:638)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:661)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteWebDriverOptions.deleteAllCookies(RemoteWebDriver.java:743)\r\n\tat com.qa.StepDefinitions.homeSteps.tearDown(homeSteps.java:146)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.model.CucumberScenarioOutline.run(CucumberScenarioOutline.java:46)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:124)\r\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:580)\r\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:716)\r\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:988)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:125)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:109)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:648)\r\n\tat org.testng.TestRunner.run(TestRunner.java:505)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:455)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:450)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:415)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:364)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:84)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1208)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1137)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1049)\r\n\tat org.testng.TestNG.run(TestNG.java:1017)\r\n\tat org.apache.maven.surefire.testng.TestNGExecutor.run(TestNGExecutor.java:77)\r\n\tat org.apache.maven.surefire.testng.TestNGDirectoryTestSuite.execute(TestNGDirectoryTestSuite.java:110)\r\n\tat org.apache.maven.surefire.testng.TestNGProvider.invoke(TestNGProvider.java:106)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.apache.maven.surefire.util.ReflectionUtils.invokeMethodWithArray(ReflectionUtils.java:189)\r\n\tat org.apache.maven.surefire.booter.ProviderFactory$ProviderProxy.invoke(ProviderFactory.java:165)\r\n\tat org.apache.maven.surefire.booter.ProviderFactory.invokeProvider(ProviderFactory.java:85)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:115)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:75)\r\n",
  "status": "failed"
});
formatter.before({
  "duration": 142222,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "Valid City Weather Scenario",
  "description": "Verify weather details should be displayed if user searches with a valid city name",
  "id": "coverage-of-a-couple-of-smoke-tests-on-open-weather-map;valid-city-weather-scenario;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 21,
  "name": "User launches OpenWeatherMap website in desired \"Firefox\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "User provides a valid city input",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User clicks on search button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Proper city details should be found",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Weather details should be updated",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Firefox",
      "offset": 49
    }
  ],
  "location": "homeSteps.user_launches_OpenWeatherMap_website_in_desired(String)"
});
formatter.result({
  "duration": 8851161243,
  "status": "passed"
});
formatter.match({
  "location": "homeSteps.user_provides_a_valid_city_input()"
});
formatter.result({
  "duration": 6722165871,
  "status": "passed"
});
formatter.match({
  "location": "homeSteps.user_clicks_on_search_button()"
});
formatter.result({
  "duration": 56606378942,
  "status": "passed"
});
formatter.match({
  "location": "citySearchResultSteps.proper_weather_details_should_be_found()"
});
formatter.result({
  "duration": 1770380,
  "status": "passed"
});
formatter.match({
  "location": "cityTempDetailsSteps.weather_details_should_be_updated()"
});
formatter.result({
  "duration": 1252123,
  "status": "passed"
});
formatter.after({
  "duration": 498311256,
  "status": "passed"
});
});