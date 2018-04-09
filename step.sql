INSERT INTO DACP_DATASTASH_UNIT_STEP (ID, UNIT_ID, UNIT_CODE, STEP_IDX, STEP_LABEL, STEP_INST, STEP_TYPE, NEXT_STEP_IDX, PRE_STEP_IDX, IGNORE_ERR_IDX, PARENT_STEP_IDX, STEP_CFG_VAL, REQUIRED_PROPS) VALUES ('494f83df79e3b06e','0d9a8d5d8beaddfc','测试测试','1','表到达','tableArrival','sched','2','-1','','','{"schedType":"sql","dsName":"LocalMySQL","stateExpr":"${sourcexmlid}","stepLabel":"表到达"}','["dsName","stateExpr"]');
INSERT INTO DACP_DATASTASH_UNIT_STEP (ID, UNIT_ID, UNIT_CODE, STEP_IDX, STEP_LABEL, STEP_INST, STEP_TYPE, NEXT_STEP_IDX, PRE_STEP_IDX, IGNORE_ERR_IDX, PARENT_STEP_IDX, STEP_CFG_VAL, REQUIRED_PROPS) VALUES ('7f7bbd133c331eb8','0d9a8d5d8beaddfc','测试测试','2','hive导出到Hdfs','sql','dp','3','1','','','{"dsName":"LocalMySQL","sql":"select * from table_test where 1=1","stepLabel":"hive导出到Hdfs"}','["dsName","sql"]');
INSERT INTO DACP_DATASTASH_UNIT_STEP (ID, UNIT_ID, UNIT_CODE, STEP_IDX, STEP_LABEL, STEP_INST, STEP_TYPE, NEXT_STEP_IDX, PRE_STEP_IDX, IGNORE_ERR_IDX, PARENT_STEP_IDX, STEP_CFG_VAL, REQUIRED_PROPS) VALUES ('ef021950114bbf9c','0d9a8d5d8beaddfc','测试测试','3','分片','shard','shard','-1','2','','','{"shardCnt":1,"strg":"hdfs","contents":[{"dsName":"hdfsconfig","content":"/TODB2_PATH/table_test","filter":null}],"stepLabel":"分片"}','["shardCnt","strg","contents"]');
INSERT INTO DACP_DATASTASH_UNIT_STEP (ID, UNIT_ID, UNIT_CODE, STEP_IDX, STEP_LABEL, STEP_INST, STEP_TYPE, NEXT_STEP_IDX, PRE_STEP_IDX, IGNORE_ERR_IDX, PARENT_STEP_IDX, STEP_CFG_VAL, REQUIRED_PROPS) VALUES ('cdbc6bc3e07eeb96','0d9a8d5d8beaddfc','测试测试','4','HDFS抽取','hdfsreader','datax','5','-1','','3','{"isRelyPre":"0","dsName":"hdfsconfig","path":"/TODB2_PATH/table_test","fileType":"CSV","encoding":"UTF-8","compress":null,"isEditColumn":"0","column":["*"],"nullFormat":"N","fieldDelimiter":"u0001","csvReaderConfig":"{"useTextQualifier":false}','["isRelyPre","dsName","path","fileType","encoding","compress","isEditColumn","column","nullFormat","fieldDelimiter","csvReaderConfig"]');
INSERT INTO DACP_DATASTASH_UNIT_STEP (ID, UNIT_ID, UNIT_CODE, STEP_IDX, STEP_LABEL, STEP_INST, STEP_TYPE, NEXT_STEP_IDX, PRE_STEP_IDX, IGNORE_ERR_IDX, PARENT_STEP_IDX, STEP_CFG_VAL, REQUIRED_PROPS) VALUES ('10f0491e0287dc74','0d9a8d5d8beaddfc','测试测试','5','ORACLE加载','oraclewriter','datax','-1','4','','3','{"dsName":"LocalMySQL","table":"table_123","column":null,"preSql":"delete from table_123 where 1=1","postSql":null,"batchSize":"1024","session":null,"stepLabel":"ORACLE加载"}','["dsName","table","column","preSql","postSql"]');
INSERT INTO DACP_DATASTASH_UNIT_STEP (ID, UNIT_ID, UNIT_CODE, STEP_IDX, STEP_LABEL, STEP_INST, STEP_TYPE, NEXT_STEP_IDX, PRE_STEP_IDX, IGNORE_ERR_IDX, PARENT_STEP_IDX, STEP_CFG_VAL, REQUIRED_PROPS) VALUES ('4c2c50c371d0338e','e87b506b94b6a7c6','地方撒','1','表到达','tableArrival','sched','2','-1','','','{"schedType":"sql","dsName":"LocalMySQL","stateExpr":"${sourcexmlid}","stepLabel":"表到达"}','["dsName","stateExpr"]');
INSERT INTO DACP_DATASTASH_UNIT_STEP (ID, UNIT_ID, UNIT_CODE, STEP_IDX, STEP_LABEL, STEP_INST, STEP_TYPE, NEXT_STEP_IDX, PRE_STEP_IDX, IGNORE_ERR_IDX, PARENT_STEP_IDX, STEP_CFG_VAL, REQUIRED_PROPS) VALUES ('4333eae5586076a1','e87b506b94b6a7c6','地方撒','2','hive导出到Hdfs','sql','dp','3','1','','','{"dsName":"LocalMySQL","sql":"select * from table_test where 1=1","stepLabel":"hive导出到Hdfs"}','["dsName","sql"]');
INSERT INTO DACP_DATASTASH_UNIT_STEP (ID, UNIT_ID, UNIT_CODE, STEP_IDX, STEP_LABEL, STEP_INST, STEP_TYPE, NEXT_STEP_IDX, PRE_STEP_IDX, IGNORE_ERR_IDX, PARENT_STEP_IDX, STEP_CFG_VAL, REQUIRED_PROPS) VALUES ('9f674b9dfc4b6a4d','e87b506b94b6a7c6','地方撒','3','分片','shard','shard','-1','2','','','{"shardCnt":1,"strg":"hdfs","contents":[{"dsName":"hdfsconfig","content":"/TODB2_PATH/table_test","filter":null}],"stepLabel":"分片"}','["shardCnt","strg","contents"]');
INSERT INTO DACP_DATASTASH_UNIT_STEP (ID, UNIT_ID, UNIT_CODE, STEP_IDX, STEP_LABEL, STEP_INST, STEP_TYPE, NEXT_STEP_IDX, PRE_STEP_IDX, IGNORE_ERR_IDX, PARENT_STEP_IDX, STEP_CFG_VAL, REQUIRED_PROPS) VALUES ('4d6619a6fd43e9e9','e87b506b94b6a7c6','地方撒','4','HDFS抽取','hdfsreader','datax','5','-1','','3','{"isRelyPre":"0","dsName":"hdfsconfig","path":"/TODB2_PATH/table_test","fileType":"CSV","encoding":"UTF-8","compress":null,"isEditColumn":"0","column":["*"],"nullFormat":"N","fieldDelimiter":"u0001","csvReaderConfig":"{"useTextQualifier":false}','["isRelyPre","dsName","path","fileType","encoding","compress","isEditColumn","column","nullFormat","fieldDelimiter","csvReaderConfig"]');
INSERT INTO DACP_DATASTASH_UNIT_STEP (ID, UNIT_ID, UNIT_CODE, STEP_IDX, STEP_LABEL, STEP_INST, STEP_TYPE, NEXT_STEP_IDX, PRE_STEP_IDX, IGNORE_ERR_IDX, PARENT_STEP_IDX, STEP_CFG_VAL, REQUIRED_PROPS) VALUES ('8092002f6da007e7','e87b506b94b6a7c6','地方撒','5','ORACLE加载','oraclewriter','datax','-1','4','','3','{"dsName":"111","table":"","column":null,"preSql":"select * from meta;","postSql":null,"batchSize":"1024","session":null,"stepLabel":"ORACLE加载"}','["dsName","table","column","preSql","postSql"]');