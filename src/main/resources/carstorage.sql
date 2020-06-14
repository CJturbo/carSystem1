-- ----------------------------
-- Table structure for `carmessage`
-- ----------------------------
DROP TABLE IF EXISTS carsys.`carstorage`;
CREATE TABLE carsys.`carstorage` (
  `id` int(100) NOT NULL,
  `carAmount` int(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of carmessage
-- ----------------------------
INSERT INTO carsys.`carstorage` VALUES ('2', 100);
INSERT INTO carsys.`carstorage` VALUES ('3', 100);
INSERT INTO carsys.`carstorage` VALUES ('7', 100);
INSERT INTO carsys.`carstorage` VALUES ('11', 10);
