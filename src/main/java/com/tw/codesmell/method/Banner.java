package com.tw.codesmell.method;

public class Banner {

  private String platform;
  private String browser;
  private int resize;

  public Banner(String platform, String browser, int resize) {
    this.platform = platform;
    this.browser = browser;
    this.resize = resize;
  }

  String renderBanner() {
    if (platform.toUpperCase().contains("MAC")
        && browser.toUpperCase().contains("IE")
        && wasInitialized() && resize > 0 ) {
      return "Rendering";
    }
    return "";
  }

  private boolean wasInitialized() {
    return true;
  }
}
