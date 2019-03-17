package com.tw.codesmell.extract;

import org.apache.log4j.Logger;

import java.util.List;

public class DeliveryBlockReference implements TaskRunner {

  private DeliveryBlockRepository deliveryBlockRepository;
  private RedisTemplate redisTemplate;
  private Logger logger;

  @Override
  public void run() {
    logger.info("Reference data loading start.");
    try {
      List<DeliveryBlock> deliveryBlocks = deliveryBlockRepository.findAll();
      deliveryBlocks.forEach(deliveryBlock -> redisTemplate.save(deliveryBlock.getCode(), deliveryBlock.getDescription()));
    } catch (Exception e) {
      logger.error("Reference data loading failed for", e);
    }
    logger.info("Reference data loading successfully.");
  }

}
