/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50549
Source Host           : 127.0.0.1:3306
Source Database       : spring_provider

Target Server Type    : MYSQL
Target Server Version : 50549
File Encoding         : 65001

Date: 2018-09-06 16:47:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for cy_user
-- ----------------------------
DROP TABLE IF EXISTS `cy_user`;
CREATE TABLE `cy_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户Id',
  `userName` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '账户名',
  `name` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '用户姓名',
  `balance` double DEFAULT NULL COMMENT '用户余额',
  `age` bigint(20) DEFAULT NULL COMMENT '用户年龄',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='用户表';

-- ----------------------------
-- Records of cy_user
-- ----------------------------
INSERT INTO `cy_user` VALUES ('1', 'acount1', '张三', '180.5', '20');
INSERT INTO `cy_user` VALUES ('2', 'acount2', '李四', '520.15', '40');
INSERT INTO `cy_user` VALUES ('3', 'acount3', '王五', '248.14', '35');
