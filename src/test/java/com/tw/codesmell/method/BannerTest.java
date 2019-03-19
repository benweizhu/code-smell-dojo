package com.tw.codesmell.method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BannerTest {
  @Test
  void should_return_rendering_when_render_given_platform_mac_browser_is_ie_and_resize_is_3() {
    Banner banner = new Banner("mac", "ie", 1);
    assertEquals("Rendering", banner.renderBanner());
  }
}