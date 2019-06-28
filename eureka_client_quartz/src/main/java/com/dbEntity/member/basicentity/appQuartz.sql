CREATE TABLE `app_quartz` (
  `quartzI_d` int(11) NOT NULL AUTO_INCREMENT,
  `job_Name` varchar(255) DEFAULT NULL,
  `job_Group` varchar(255) DEFAULT NULL,
  `start_Time` varchar(255) DEFAULT NULL,
  `cron_Expression` varchar(255) NOT NULL,
  `invoke_Param` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`quartzI_d`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8