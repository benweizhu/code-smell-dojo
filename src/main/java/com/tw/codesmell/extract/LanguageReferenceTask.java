package com.tw.codesmell.extract;

import org.apache.log4j.Logger;

import java.util.List;

public class LanguageReferenceTask implements TaskRunner {

  private LanguageRepository languageRepository;
  private RedisTemplate redisTemplate;
  private Logger logger;

  @Override
  public void run() {
    logger.info("Reference data loading start.");
    try {
      List<Language> languages = languageRepository.findAll();
      languages.forEach(language -> redisTemplate.save(language.getCode(), language.getDescription()));
    } catch (Exception e) {
      logger.error("Reference data loading failed for", e);
    }
    logger.info("Reference data loading successfully.");
  }

}
