package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class generateReports {
	
public static void report(String jsonPath) {
File f = new File(System.getProperty("user.dir")+"\\All Report\\jvm");
Configuration c = new Configuration(f, "Facebook Application");
c.addClassifications("platform", "windows");
c.addClassifications("JDK", "1.8");
List<String> li = new ArrayList<String>();
li.add(jsonPath);
ReportBuilder r = new ReportBuilder(li, c);
r.generateReports();


}
}
