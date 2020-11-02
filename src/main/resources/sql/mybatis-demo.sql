-- 本地数据库名称为 nova
CREATE TABLE `tb_user` (
  `t_id` int(11) NOT NULL AUTO_INCREMENT,
  `ttt_name` varchar(45) NOT NULL DEFAULT '',
  `ttt_age` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`t_id`)
) ENGINE = InnoDB  DEFAULT CHARSET = utf8 COMMENT = '用户表'


