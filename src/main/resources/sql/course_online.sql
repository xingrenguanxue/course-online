/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : course_online

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 25/05/2020 22:24:59
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tab_course
-- ----------------------------
DROP TABLE IF EXISTS `tab_course`;
CREATE TABLE `tab_course`  (
  `cid` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '课程编号',
  `cname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '课程名',
  `tid` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教师编号',
  `chour` int(3) NULL DEFAULT NULL COMMENT '学时',
  `cmark` float(2, 1) NULL DEFAULT NULL COMMENT '学分',
  `ccollege` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '所属学院',
  `cnum` int(11) NOT NULL COMMENT '学生容量',
  `ctimeplace` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '上课时间地点',
  PRIMARY KEY (`cid`) USING BTREE,
  INDEX `tab_course_ibfk_1`(`tid`) USING BTREE,
  CONSTRAINT `tab_course_ibfk_1` FOREIGN KEY (`tid`) REFERENCES `tab_teacher` (`tid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tab_course
-- ----------------------------
INSERT INTO `tab_course` VALUES ('10001', '计算机理论', '10001', 32, 4.0, '信息工程学院', 147, '周一[1-2]公教3-333');
INSERT INTO `tab_course` VALUES ('10002', 'c语言基础', '10001', 36, 3.5, '信息工程学院', 150, '周二全天乾5-430');
INSERT INTO `tab_course` VALUES ('10003', '数据结构', '10002', 40, 5.0, '信息工程学院', 151, '周三全天乾5-430');
INSERT INTO `tab_course` VALUES ('10004', '大学物理A', '10003', 32, 3.0, '物理工程学院', 151, '周四全天乾5-430');
INSERT INTO `tab_course` VALUES ('10005', '大学物理B', '10004', 32, 2.5, '物理工程学院', 151, '周五全天乾5-430');
INSERT INTO `tab_course` VALUES ('10006', '解剖基础', '10005', 24, 1.0, '医学院', 131, '周六全天乾5-430');
INSERT INTO `tab_course` VALUES ('10007', '微生物学', '10006', 36, 4.0, '医学院', 120, '周日全天乾5-430');
INSERT INTO `tab_course` VALUES ('10008', '理论力学', '10007', 32, 4.5, '土木工程学院', 140, '周日全天乾5-430');
INSERT INTO `tab_course` VALUES ('10009', '材料力学', '10008', 25, 4.0, '土木工程学院', 50, '周日全天乾5-430');
INSERT INTO `tab_course` VALUES ('10010', '马克思主义', '10011', 32, 3.0, '马克思学院', 150, '周日全天乾5-430');
INSERT INTO `tab_course` VALUES ('10011', '马克思主义发展史', '10012', 32, 2.5, '马克思学院', 130, '周日全天乾5-430');
INSERT INTO `tab_course` VALUES ('10012', '艺术概论', '10013', 36, 3.5, '人文学院', 150, '周日全天乾5-430');
INSERT INTO `tab_course` VALUES ('10013', '思想政治理论', '10014', 36, 3.5, '人文学院', 160, '周日全天乾5-430');
INSERT INTO `tab_course` VALUES ('10014', '材料化学', '10015', 25, 2.0, '材料与工程学院', 150, '周日全天乾5-430');
INSERT INTO `tab_course` VALUES ('10015', '材料物理', '10015', 36, 4.0, '材料与工程学院', 140, '周日全天乾5-430');
INSERT INTO `tab_course` VALUES ('10016', '量子统计力学', '10016', 32, 3.5, '材料与工程学院', 90, '周日全天乾5-430');
INSERT INTO `tab_course` VALUES ('10017', '大学英语B', '10010', 32, 3.0, '外国语学院', 150, '周日全天乾5-430');
INSERT INTO `tab_course` VALUES ('10018', '高等数学A', '10017', 36, 5.0, '数学与统计学院', 160, '周日全天乾5-430');
INSERT INTO `tab_course` VALUES ('10019', '线性代数', '10018', 36, 4.5, '数学与统计学院', 160, '周日全天乾5-430');
INSERT INTO `tab_course` VALUES ('10020', '数理统计', '10018', 32, 4.0, '数学与统计学院', 90, '周日全天乾5-430');

-- ----------------------------
-- Table structure for tab_selection
-- ----------------------------
DROP TABLE IF EXISTS `tab_selection`;
CREATE TABLE `tab_selection`  (
  `sid` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学号',
  `cid` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '课程编号',
  PRIMARY KEY (`sid`, `cid`) USING BTREE,
  INDEX `tab_selection_ibfk_2`(`cid`) USING BTREE,
  CONSTRAINT `tab_selection_ibfk_1` FOREIGN KEY (`sid`) REFERENCES `tab_student` (`sid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `tab_selection_ibfk_2` FOREIGN KEY (`cid`) REFERENCES `tab_course` (`cid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tab_selection
-- ----------------------------
INSERT INTO `tab_selection` VALUES ('181404060130', '10001');
INSERT INTO `tab_selection` VALUES ('181404060130', '10002');

-- ----------------------------
-- Table structure for tab_student
-- ----------------------------
DROP TABLE IF EXISTS `tab_student`;
CREATE TABLE `tab_student`  (
  `sid` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学号',
  `sname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '姓名',
  `spwd` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `sgender` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `sage` int(3) NULL DEFAULT NULL COMMENT '年龄',
  `sgrade` int(4) NULL DEFAULT NULL COMMENT '年级',
  `sclass` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '班级',
  `smajor` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '专业',
  `splace` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '籍贯',
  `sbirth` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '出生日期',
  `snation` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '民族',
  PRIMARY KEY (`sid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tab_student
-- ----------------------------
INSERT INTO `tab_student` VALUES ('123456', '小明', '123456', '男', 19, 2018, '计算机181', '计算机科学与技术', '地球', '2020-05-25', '汉');
INSERT INTO `tab_student` VALUES ('181404060101', '小陈', '181404060101', '男', 19, 2018, '计算机181', '计算机科学与技术', '新乡市', '2020-05-25', '汉');
INSERT INTO `tab_student` VALUES ('181404060109', '小李', '181404060109', '男', 19, 2018, '计算机181', '计算机科学与技术', '福州市', '2020-05-25', '汉');
INSERT INTO `tab_student` VALUES ('181404060127', '小王', '181404060127', '男', 19, 2018, '计算机181', '计算机科学与技术', '商丘市', '2020-05-25', '汉');
INSERT INTO `tab_student` VALUES ('181404060130', '小薛', '181404060130', '男', 19, 2018, '计算机181', '计算机科学与技术', '周口市', '2020-05-25', '汉');
INSERT INTO `tab_student` VALUES ('181404060132', '小尹', '181404060132', '男', 19, 2018, '计算机181', '计算机科学与技术', '开封市', '2020-05-25', '汉');
INSERT INTO `tab_student` VALUES ('181404060139', '小郑', '181404060139', '男', 19, 2018, '计算机181', '计算机科学与技术', '泉州市', '2020-05-25', '汉');

-- ----------------------------
-- Table structure for tab_teacher
-- ----------------------------
DROP TABLE IF EXISTS `tab_teacher`;
CREATE TABLE `tab_teacher`  (
  `tid` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教师编号',
  `tname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '教师姓名',
  `tgender` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '性别',
  `tage` int(11) NULL DEFAULT NULL COMMENT '年龄',
  `tcollege` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '学院',
  PRIMARY KEY (`tid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tab_teacher
-- ----------------------------
INSERT INTO `tab_teacher` VALUES ('10001', '赵泽强', '男', 28, '信息工程学院');
INSERT INTO `tab_teacher` VALUES ('10002', '钱玲雪', '女', 29, '信息工程学院');
INSERT INTO `tab_teacher` VALUES ('10003', '孙立坚', '男', 30, '物理工程学院');
INSERT INTO `tab_teacher` VALUES ('10004', '李慧颖', '女', 31, '物理工程学院');
INSERT INTO `tab_teacher` VALUES ('10005', '周武强', '男', 32, '医学院');
INSERT INTO `tab_teacher` VALUES ('10006', '吴倩华', '女', 33, '医学院');
INSERT INTO `tab_teacher` VALUES ('10007', '郑乹意', '男', 34, '土木工程学院');
INSERT INTO `tab_teacher` VALUES ('10008', '王琴玲', '女', 35, '土木工程学院');
INSERT INTO `tab_teacher` VALUES ('10009', '李正海', '男', 36, '外国语学院');
INSERT INTO `tab_teacher` VALUES ('10010', '张泽辉', '男', 28, '外国语学院');
INSERT INTO `tab_teacher` VALUES ('10011', '胡建华', '男', 37, '马克思学院');
INSERT INTO `tab_teacher` VALUES ('10012', '李敏强', '男', 29, '马克思学院');
INSERT INTO `tab_teacher` VALUES ('10013', '胡敏敏', '女', 37, '人文学院');
INSERT INTO `tab_teacher` VALUES ('10014', '胡玉', '女', 29, '人文学院');
INSERT INTO `tab_teacher` VALUES ('10015', '陈珍珍', '女', 34, '材料与工程学院');
INSERT INTO `tab_teacher` VALUES ('10016', '韩伟民', '男', 33, '材料与工程学院');
INSERT INTO `tab_teacher` VALUES ('10017', '尹娟璩', '女', 32, '数学与统计学院');
INSERT INTO `tab_teacher` VALUES ('10018', '薛则招', '男', 33, '数学与统计学院');

SET FOREIGN_KEY_CHECKS = 1;
