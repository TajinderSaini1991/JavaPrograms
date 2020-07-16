package Assignments;

import java.util.ArrayList;

public class Browser {

	String browserName;
	String vendorName;
	float currentVersion;
	ArrayList<String> plugins;

	public Browser(String browserName) {
		this.browserName = browserName;
	}

	public Browser(String browserName, String vendorName) {
		this.browserName = browserName;
		this.vendorName = vendorName;
	}

	public Browser(String browserName, String vendorName, float currentVersion) {
		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
	}

	public Browser(String browserName, String vendorName, float currentVersion, ArrayList<String> plugins) {
		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
		this.plugins = plugins;
	}

	public String getBrowserName() {
		return browserName;
	}

	public String getVendorName() {
		return vendorName;

	}

	public float getcurrentVersion() {
		return currentVersion;
	}

	public ArrayList<String> getPlugins() {
		return plugins;
	}

	public static void main(String[] args) {

		Browser a = new Browser("Chrome");
		System.out.println(a.getBrowserName());

		Browser b = new Browser("Firefox", "Mozilla");
		System.out.println(b.getBrowserName() + " " + b.getVendorName());

		Browser c = new Browser("Safari", "Apple", 13.0f);
		System.out.println(c.getBrowserName() + " " + c.getVendorName() + " " + c.getcurrentVersion());

		ArrayList<String> plugins = new ArrayList<>();
		plugins.add("Xpath Finder");
		plugins.add(" Ad Block");
		plugins.add("Firebug");

		Browser d = new Browser("Chrome", "Google", 81.0f, plugins);

		System.out.println(
				d.getBrowserName() + " " + d.getVendorName() + " " + d.getcurrentVersion() + " " + d.getPlugins());

	}

}
