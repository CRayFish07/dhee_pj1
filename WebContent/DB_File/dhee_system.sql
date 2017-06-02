/*
Navicat MySQL Data Transfer

Source Server         : Mysql
Source Server Version : 50717
Source Host           : 127.0.0.1:3306
Source Database       : dhee_system

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-06-01 18:10:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for school_message
-- ----------------------------
DROP TABLE IF EXISTS `school_message`;
CREATE TABLE `school_message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `school_name` varchar(255) DEFAULT NULL,
  `school_level` varchar(255) DEFAULT NULL,
  `collage_name` varchar(255) DEFAULT NULL,
  `professional` varchar(255) DEFAULT NULL,
  `contact_service` varchar(255) DEFAULT NULL,
  `tel` varchar(255) DEFAULT NULL,
  `student_number` varchar(11) DEFAULT NULL,
  `school_location` varchar(255) DEFAULT NULL,
  `school_profile` varchar(255) DEFAULT NULL,
  `school_web` varchar(255) DEFAULT NULL,
  `school_address` varchar(255) DEFAULT NULL,
  `cooperate` varchar(255) DEFAULT NULL,
  `cooperate_company` varchar(255) DEFAULT NULL,
  `student_dynamic` varchar(255) DEFAULT NULL,
  `leaveschooltime` varchar(255) DEFAULT '',
  `ps` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of school_message
-- ----------------------------
INSERT INTO `school_message` VALUES ('1', '我只是看看', '2级', '应用技术学院', '机械制造及其自动化', '没有', '12345678', '123123', '鞍山', '一般般吧', 'www.baidu.com', '特别远别去了', '没有', '没有', '没有动态', '随时', '没有备注');
INSERT INTO `school_message` VALUES ('4', '辽宁科技大学', '3', '3', '机械制造及其自动化', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3');
INSERT INTO `school_message` VALUES ('5', '777', '3333', '3', '3', '3', '3', '3', 'anshan ', '3', '3', '3', '3', '3', '3', '3', '3');
INSERT INTO `school_message` VALUES ('6', '666', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3');
INSERT INTO `school_message` VALUES ('7', '123', '3', '3', '3', '3', '3', '3', '剖有', '3', '3', '3', '3', '3', '3', '3', '3');
INSERT INTO `school_message` VALUES ('8', '2', '3', '3', '3', '3', '3', '3', '7', '3', '3', '3', '3', '3', '3', '3', '3');
INSERT INTO `school_message` VALUES ('9', '2', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3');
INSERT INTO `school_message` VALUES ('10', '2', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3');
INSERT INTO `school_message` VALUES ('11', '2', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3');
INSERT INTO `school_message` VALUES ('12', '2', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3');
INSERT INTO `school_message` VALUES ('13', '2', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3');
INSERT INTO `school_message` VALUES ('15', '2', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3');
INSERT INTO `school_message` VALUES ('16', '2', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3');
INSERT INTO `school_message` VALUES ('17', '2', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3');
INSERT INTO `school_message` VALUES ('18', '2', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3');
INSERT INTO `school_message` VALUES ('19', '2', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3');
INSERT INTO `school_message` VALUES ('20', '2', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3');
INSERT INTO `school_message` VALUES ('21', '2', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sname` varchar(20) NOT NULL,
  `spassword` varchar(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `Sname` (`sname`)
) ENGINE=InnoDB AUTO_INCREMENT=109 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('3', '常旭东', 'admin');
INSERT INTO `student` VALUES ('4', '王振滔', '000000');
INSERT INTO `student` VALUES ('5', '张三0', '000000');
INSERT INTO `student` VALUES ('6', '张三1', '000000');
INSERT INTO `student` VALUES ('7', '张三2', '000000');
INSERT INTO `student` VALUES ('8', '张三3', '000000');
INSERT INTO `student` VALUES ('9', '张三4', '000000');
INSERT INTO `student` VALUES ('10', '张三5', '000000');
INSERT INTO `student` VALUES ('11', '张三6', '000000');
INSERT INTO `student` VALUES ('12', '张三7', '000000');
INSERT INTO `student` VALUES ('13', '张三8', '000000');
INSERT INTO `student` VALUES ('14', '张三9', '000000');
INSERT INTO `student` VALUES ('15', '张三10', '000000');
INSERT INTO `student` VALUES ('16', '张三11', '000000');
INSERT INTO `student` VALUES ('17', '张三12', '000000');
INSERT INTO `student` VALUES ('18', '张三13', '000000');
INSERT INTO `student` VALUES ('19', '张三14', '000000');
INSERT INTO `student` VALUES ('20', '张三15', '000000');
INSERT INTO `student` VALUES ('21', '张三16', '000000');
INSERT INTO `student` VALUES ('22', '张三17', '000000');
INSERT INTO `student` VALUES ('23', '张三18', '000000');
INSERT INTO `student` VALUES ('24', '张三19', '000000');
INSERT INTO `student` VALUES ('25', '张三20', '000000');
INSERT INTO `student` VALUES ('26', '张三21', '000000');
INSERT INTO `student` VALUES ('27', '张三22', '000000');
INSERT INTO `student` VALUES ('28', '张三23', '000000');
INSERT INTO `student` VALUES ('29', '张三24', '000000');
INSERT INTO `student` VALUES ('30', '张三25', '000000');
INSERT INTO `student` VALUES ('31', '张三26', '000000');
INSERT INTO `student` VALUES ('32', '张三27', '000000');
INSERT INTO `student` VALUES ('33', '张三28', '000000');
INSERT INTO `student` VALUES ('34', '张三29', '000000');
INSERT INTO `student` VALUES ('35', '张三30', '000000');
INSERT INTO `student` VALUES ('36', '张三31', '000000');
INSERT INTO `student` VALUES ('37', '张三32', '000000');
INSERT INTO `student` VALUES ('38', '张三33', '000000');
INSERT INTO `student` VALUES ('39', '张三34', '000000');
INSERT INTO `student` VALUES ('40', '张三35', '000000');
INSERT INTO `student` VALUES ('41', '张三36', '000000');
INSERT INTO `student` VALUES ('42', '张三37', '000000');
INSERT INTO `student` VALUES ('43', '张三38', '000000');
INSERT INTO `student` VALUES ('44', '张三39', '000000');
INSERT INTO `student` VALUES ('45', '张三40', '000000');
INSERT INTO `student` VALUES ('46', '张三41', '000000');
INSERT INTO `student` VALUES ('47', '张三42', '000000');
INSERT INTO `student` VALUES ('48', '张三43', '000000');
INSERT INTO `student` VALUES ('49', '张三44', '000000');
INSERT INTO `student` VALUES ('50', '张三45', '000000');
INSERT INTO `student` VALUES ('51', '张三46', '000000');
INSERT INTO `student` VALUES ('52', '张三47', '000000');
INSERT INTO `student` VALUES ('53', '张三48', '000000');
INSERT INTO `student` VALUES ('54', '张三49', '000000');
INSERT INTO `student` VALUES ('55', '赵四0', '000000');
INSERT INTO `student` VALUES ('56', '赵四1', '000000');
INSERT INTO `student` VALUES ('57', '赵四2', '000000');
INSERT INTO `student` VALUES ('58', '赵四3', '000000');
INSERT INTO `student` VALUES ('59', '赵四4', '000000');
INSERT INTO `student` VALUES ('60', '赵四5', '000000');
INSERT INTO `student` VALUES ('61', '赵四6', '000000');
INSERT INTO `student` VALUES ('62', '赵四7', '000000');
INSERT INTO `student` VALUES ('63', '赵四8', '000000');
INSERT INTO `student` VALUES ('64', '赵四9', '000000');
INSERT INTO `student` VALUES ('65', '赵四10', '000000');
INSERT INTO `student` VALUES ('66', '赵四11', '000000');
INSERT INTO `student` VALUES ('67', '赵四12', '000000');
INSERT INTO `student` VALUES ('68', '赵四13', '000000');
INSERT INTO `student` VALUES ('69', '赵四14', '000000');
INSERT INTO `student` VALUES ('70', '赵四15', '000000');
INSERT INTO `student` VALUES ('71', '赵四16', '000000');
INSERT INTO `student` VALUES ('72', '赵四17', '000000');
INSERT INTO `student` VALUES ('73', '赵四18', '000000');
INSERT INTO `student` VALUES ('74', '赵四19', '000000');
INSERT INTO `student` VALUES ('75', '赵四20', '000000');
INSERT INTO `student` VALUES ('76', '赵四21', '000000');
INSERT INTO `student` VALUES ('77', '赵四22', '000000');
INSERT INTO `student` VALUES ('78', '赵四23', '000000');
INSERT INTO `student` VALUES ('79', '赵四24', '000000');
INSERT INTO `student` VALUES ('80', '赵四25', '000000');
INSERT INTO `student` VALUES ('81', '赵四26', '000000');
INSERT INTO `student` VALUES ('82', '赵四27', '000000');
INSERT INTO `student` VALUES ('83', '赵四28', '000000');
INSERT INTO `student` VALUES ('84', '赵四29', '000000');
INSERT INTO `student` VALUES ('85', '赵四30', '000000');
INSERT INTO `student` VALUES ('86', '赵四31', '000000');
INSERT INTO `student` VALUES ('87', '赵四32', '000000');
INSERT INTO `student` VALUES ('88', '赵四33', '000000');
INSERT INTO `student` VALUES ('89', '赵四34', '000000');
INSERT INTO `student` VALUES ('90', '赵四35', '000000');
INSERT INTO `student` VALUES ('91', '赵四36', '000000');
INSERT INTO `student` VALUES ('92', '赵四37', '000000');
INSERT INTO `student` VALUES ('93', '赵四38', '000000');
INSERT INTO `student` VALUES ('94', '赵四39', '000000');
INSERT INTO `student` VALUES ('95', '赵四40', '000000');
INSERT INTO `student` VALUES ('96', '赵四41', '000000');
INSERT INTO `student` VALUES ('97', '赵四42', '000000');
INSERT INTO `student` VALUES ('98', '赵四43', '000000');
INSERT INTO `student` VALUES ('99', '赵四44', '000000');
INSERT INTO `student` VALUES ('100', '赵四45', '000000');
INSERT INTO `student` VALUES ('101', '赵四46', '000000');
INSERT INTO `student` VALUES ('102', '赵四47', '000000');
INSERT INTO `student` VALUES ('103', '赵四48', '000000');
INSERT INTO `student` VALUES ('104', '赵四49', '000000');
INSERT INTO `student` VALUES ('105', 'gg', '123456');
INSERT INTO `student` VALUES ('106', '1', '111111');
INSERT INTO `student` VALUES ('107', 'qwe', 'asd');
INSERT INTO `student` VALUES ('108', '旭东常', 'qwer');

-- ----------------------------
-- Table structure for student_info
-- ----------------------------
DROP TABLE IF EXISTS `student_info`;
CREATE TABLE `student_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `classes` varchar(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `employment_status` varchar(20) DEFAULT NULL,
  `sex` varchar(8) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `graduation_time` date DEFAULT NULL,
  `category` varchar(10) DEFAULT NULL,
  `college` varchar(20) DEFAULT NULL,
  `major` varchar(20) DEFAULT NULL,
  `education_bg` varchar(10) DEFAULT NULL,
  `fg_language` varchar(10) DEFAULT NULL,
  `level` varchar(10) DEFAULT NULL,
  `level2` varchar(10) DEFAULT NULL,
  `fg2_language` varchar(10) DEFAULT NULL,
  `score` double(10,0) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `home_telephone` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=109 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student_info
-- ----------------------------
INSERT INTO `student_info` VALUES ('3', 'java69', '321', '未就业', 'F', '2017-03-22', '2017-03-22', '成人', '辽宁科技大学', '软件工程', '专升本', '英语', 'B级', '八级', '日语', '345', '15041914007', '辽宁省辽阳市', '123@123.com', '56465785435');
INSERT INTO `student_info` VALUES ('4', 'java70', '王振滔', '未就业', 'FF', '2017-03-15', '2017-03-22', '网络', '北京医学院', '医学', '大专', '俄语', '八级', '九级', '英语', '345', '15041914007', '北京市', '123@123.com', '44444444444');
INSERT INTO `student_info` VALUES ('5', 'java69', '张三0', '未就业', 'F', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('6', 'java69', '张三1', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('7', 'java69', '张三2', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('8', 'java69', '张三3', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('9', 'java69', '张三4', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('10', 'java69', '张三5', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('11', 'java69', '张三6', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('12', 'java69', '张三7', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('13', 'java69', '张三8', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('14', 'java69', '张三9', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('15', 'java69', '张三10', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('16', 'java69', '张三11', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('17', 'java69', '张三12', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('18', 'java69', '张三13', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('19', 'java69', '张三14', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('20', 'java69', '张三15', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('21', 'java69', '张三16', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('22', 'java69', '张三17', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('23', 'java69', '张三18', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('24', 'java69', '张三19', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('25', 'java69', '张三20', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('26', 'java69', '张三21', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('27', 'java69', '张三22', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('28', 'java69', '张三23', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('29', 'java69', '张三24', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('30', 'java69', '张三25', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('31', 'java69', '张三26', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('32', 'java69', '张三27', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('33', 'java69', '张三28', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('34', 'java69', '张三29', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('35', 'java69', '张三30', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('36', 'java69', '张三31', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('37', 'java69', '张三32', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('38', 'java69', '张三33', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('39', 'java69', '张三34', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('40', 'java69', '张三35', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('41', 'java69', '张三36', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('42', 'java69', '张三37', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('43', 'java69', '张三38', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('44', 'java69', '张三39', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('45', 'java69', '张三40', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('46', 'java69', '张三41', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('47', 'java69', '张三42', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('48', 'java69', '张三43', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('49', 'java69', '张三44', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('50', 'java69', '张三45', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('51', 'java69', '张三46', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('52', 'java69', '张三47', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('53', 'java69', '张三48', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('54', 'java69', '张三49', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('55', 'java70', '赵四0', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('56', 'java70', '赵四1', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('57', 'java70', '赵四2', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('58', 'java70', '赵四3', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('59', 'java70', '赵四4', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('60', 'java70', '赵四5', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('61', 'java70', '赵四6', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('62', 'java70', '赵四7', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('63', 'java70', '赵四8', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('64', 'java70', '赵四9', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('65', 'java70', '赵四10', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('66', 'java70', '赵四11', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('67', 'java70', '赵四12', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('68', 'java70', '赵四13', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('69', 'java70', '赵四14', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('70', 'java70', '赵四15', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('71', 'java70', '赵四16', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('72', 'java70', '赵四17', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('73', 'java70', '赵四18', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('74', 'java70', '赵四19', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('75', 'java70', '赵四20', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('76', 'java70', '赵四21', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('77', 'java70', '赵四22', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('78', 'java70', '赵四23', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('79', 'java70', '赵四24', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('80', 'java70', '赵四25', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('81', 'java70', '赵四26', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('82', 'java70', '赵四27', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('83', 'java70', '赵四28', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('84', 'java70', '赵四29', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('85', 'java70', '赵四30', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('86', 'java70', '赵四31', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('87', 'java70', '赵四32', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('88', 'java70', '赵四33', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('89', 'java70', '赵四34', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('90', 'java70', '赵四35', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('91', 'java70', '赵四36', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('92', 'java70', '赵四37', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('93', 'java70', '赵四38', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('94', 'java70', '赵四39', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('95', 'java70', '赵四40', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('96', 'java70', '赵四41', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('97', 'java70', '赵四42', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('98', 'java70', '赵四43', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('99', 'java70', '赵四44', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('100', 'java70', '赵四45', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('101', 'java70', '赵四46', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('102', 'java70', '赵四47', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('103', 'java70', '赵四48', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('104', 'java70', '赵四49', '未就业', 'FF', '2017-03-14', '2017-03-14', '统招', '科技大学', '软件工程', '专升本', '英语', '五级', '九级', '日语', '333', '15041914007', '辽宁省辽阳市', '123@123.com', '33333333333');
INSERT INTO `student_info` VALUES ('105', 'java68', 'gg', '未就业', 'TT', '1994-03-17', '2017-03-16', '统招', '辽宁科技大学', '机械制造及自动化', '本科', '英语', 'A', '四级相当', '日语', '435', '15541271234', '不屑', '1234567@qq.com', '12345678');
INSERT INTO `student_info` VALUES ('106', 'null', '1', 'null', 'null', '0000-00-00', '0000-00-00', 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null', '0', 'null', 'null', 'null', 'null');
INSERT INTO `student_info` VALUES ('107', 'java69', 'qwe', '未就业', 'TT', '2017-03-15', '2017-03-22', '自考', '科技大学', '软件工程', '本科', '英语', '四级', '五级', '日语', '234', '15041914007', '辽宁省', '123@123.com', '88888888888');
INSERT INTO `student_info` VALUES ('108', 'java90', '旭东常', '未就业', 'TT', '2017-03-22', '2017-03-23', '统招', '科技大学', '软件工程', '本科', '英语', '八级', '九级', '日益', '123', '15041914007', '我去饿', '123@123.com', '11111111111');

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `tname` varchar(20) NOT NULL,
  `tpassword` varchar(20) NOT NULL,
  PRIMARY KEY (`tname`),
  UNIQUE KEY `Tname` (`tname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('admin', 'admin123');

-- ----------------------------
-- Table structure for teacher_eva
-- ----------------------------
DROP TABLE IF EXISTS `teacher_eva`;
CREATE TABLE `teacher_eva` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `classes` varchar(20) DEFAULT NULL,
  `teacher` varchar(20) DEFAULT NULL,
  `course` varchar(20) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  `student` varchar(20) DEFAULT NULL,
  `per_quality` longtext,
  `teach_attitude` longtext,
  `teach_level` longtext,
  `per_quality_actual` longtext,
  `teach_attitude_actual` longtext,
  `teach_level_actual` longtext,
  `idea_1` longtext,
  `idea_2` longtext,
  `idea_3` longtext,
  `logistics_1` longtext,
  `logistics_2` longtext,
  `logistics_3` longtext,
  `logistics_4` longtext,
  `score` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher_eva
-- ----------------------------
INSERT INTO `teacher_eva` VALUES ('1', 'java69', '陶润城', 'java', '2017-03-08 10:05:24', '佟浩', '2#src#2#src#2', '2#src#2#src#2#src#2#src#2#src#2#src#2#src#2', '2#src#2#src#2#src#2#src#2#src#2', '无#src#无#src#无', '无#src#无#src#无#src#无#src#无#src#无#src#无#src#无', '无#src#无#src#无#src#无#src#无#src#无', '无', '无', '无', '无', '无', '无', '无', '34');
INSERT INTO `teacher_eva` VALUES ('2', 'java69', '陶润城', 'java', '2017-03-08 10:05:33', '佟浩', '4#src#2#src#2', '2#src#2#src#2#src#2#src#2#src#2#src#2#src#2', '2#src#2#src#2#src#2#src#2#src#2', '无#src#无#src#无', '无#src#无#src#无#src#无#src#无#src#无#src#无#src#无', '无#src#无#src#无#src#无#src#无#src#无', '无', '无', '无', '无', '无', '无', '无', '36');
INSERT INTO `teacher_eva` VALUES ('3', 'java69', '陶润城', 'java', '2017-03-08 10:05:40', '佟浩', '4#src#4#src#2', '2#src#2#src#2#src#2#src#2#src#2#src#2#src#2', '2#src#2#src#2#src#2#src#2#src#2', '无#src#无#src#无', '无#src#无#src#无#src#无#src#无#src#无#src#无#src#无', '无#src#无#src#无#src#无#src#无#src#无', '无', '无', '无', '无', '无', '无', '无', '38');
INSERT INTO `teacher_eva` VALUES ('4', 'java69', '陶润城', 'java', '2017-03-08 10:05:48', '佟浩', '4#src#4#src#4', '2#src#2#src#2#src#2#src#2#src#2#src#2#src#2', '2#src#2#src#2#src#2#src#2#src#2', '无#src#无#src#无', '无#src#无#src#无#src#无#src#无#src#无#src#无#src#无', '无#src#无#src#无#src#无#src#无#src#无', '无', '无', '无', '无', '无', '无', '无', '40');
INSERT INTO `teacher_eva` VALUES ('5', 'java69', '陶润城', 'java', '2017-03-08 10:05:59', '佟浩', '4#src#4#src#4', '5#src#2#src#2#src#2#src#2#src#2#src#2#src#2', '2#src#2#src#2#src#2#src#2#src#2', '无#src#无#src#无', '无#src#无#src#无#src#无#src#无#src#无#src#无#src#无', '无#src#无#src#无#src#无#src#无#src#无', '无', '无', '无', '无', '无', '无', '无', '43');
INSERT INTO `teacher_eva` VALUES ('8', 'java69', '陶润城', 'java', '2017-03-08 10:06:22', '佟浩', '4#src#4#src#4', '5#src#5#src#5#src#5#src#2#src#2#src#2#src#2', '2#src#2#src#2#src#2#src#2#src#2', '无#src#无#src#无', '无#src#无#src#无#src#无#src#无#src#无#src#无#src#无', '无#src#无#src#无#src#无#src#无#src#无', '无', '无', '无', '无', '无', '无', '无', '52');
INSERT INTO `teacher_eva` VALUES ('9', 'java69', '陶润城', 'java', '2017-03-08 10:06:32', '佟浩', '4#src#4#src#4', '5#src#5#src#5#src#5#src#5#src#2#src#2#src#2', '2#src#2#src#2#src#2#src#2#src#2', '无#src#无#src#无', '无#src#无#src#无#src#无#src#无#src#无#src#无#src#无', '无#src#无#src#无#src#无#src#无#src#无', '无', '无', '无', '无', '无', '无', '无', '55');
INSERT INTO `teacher_eva` VALUES ('10', 'java69', '陶润城', 'java', '2017-03-08 10:06:39', '佟浩', '4#src#4#src#4', '5#src#5#src#5#src#5#src#5#src#5#src#2#src#2', '2#src#2#src#2#src#2#src#2#src#2', '无#src#无#src#无', '无#src#无#src#无#src#无#src#无#src#无#src#无#src#无', '无#src#无#src#无#src#无#src#无#src#无', '无', '无', '无', '无', '无', '无', '无', '58');
INSERT INTO `teacher_eva` VALUES ('11', 'java69', '陶润城', 'java', '2017-03-08 10:06:52', '佟浩', '4#src#4#src#4', '5#src#5#src#5#src#5#src#5#src#5#src#5#src#5', '8#src#2#src#2#src#2#src#2#src#2', '无#src#无#src#无', '无#src#无#src#无#src#无#src#无#src#无#src#无#src#无', '无#src#无#src#无#src#无#src#无#src#无', '无', '无', '无', '无', '无', '无', '无', '70');
INSERT INTO `teacher_eva` VALUES ('12', 'java69', '陶润城', 'java', '2017-03-08 10:07:01', '佟浩', '4#src#4#src#4', '5#src#5#src#5#src#5#src#5#src#5#src#5#src#5', '8#src#8#src#8#src#2#src#2#src#2', '无#src#无#src#无', '无#src#无#src#无#src#无#src#无#src#无#src#无#src#无', '无#src#无#src#无#src#无#src#无#src#无', '无', '无', '无', '无', '无', '无', '无', '82');
INSERT INTO `teacher_eva` VALUES ('13', 'java69', '陶润城', 'java', '2017-03-08 10:07:09', '佟浩', '4#src#4#src#4', '5#src#5#src#5#src#5#src#5#src#5#src#5#src#5', '8#src#8#src#8#src#8#src#8#src#8', '无#src#无#src#无', '无#src#无#src#无#src#无#src#无#src#无#src#无#src#无', '无#src#无#src#无#src#无#src#无#src#无', '无', '无', '无', '无', '无', '无', '无', '100');
