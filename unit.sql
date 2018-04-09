INSERT INTO DACP_DATASTASH_UNIT (ID, UNIT_CODE, VERSION, LABEL, DESCR, UNIT_TYPE, WORKGROUP, BATCH_TYPE, BATCH_STEP, BATCH_OFFSET, BATCH_NO, UNIT_PRIORITY, RUN_CONSTRAINT, MEMBER_ID, CREATE_USER, CREATE_DT, LASTUPD, UNIT_EXT_CFG, GRAPH, STATE,UPDATE_DT , TMPL_CODE) VALUES ('0d9a8d5d8beaddfc','table_123','0','测试测试','测试测试','2','','day','1','-1','123123','0','','T00039-wangzongjie','zhangguangl',now(),now(),'','<mxGraphModel dx="900" dy="436" grid="1" gridSize="10" guides="1" tooltips="1" connect="1" arrows="1" fold="1" page="0" pageScale="1" pageWidth="1169" pageHeight="827" background="#ffffff">
	<root>
	<mxCell id="6322b5eb3ced1cf2"/>
	<mxCell id="e969fc995997d6ae" parent="6322b5eb3ced1cf2"/>
	<mxCell id="e190c3c6c9153938" style="edgeStyle=orthogonalEdgeStyle;rounded=1;html=1;exitX=1;exitY=0.5;entryX=0;entryY=0.5;jettySize=auto;orthogonalLoop=1;" parent="e969fc995997d6ae" source="f5bb4026a552122a" target="0b5d7f9ca676d2af" edge="1">
	<mxGeometry relative="1" as="geometry"/>
	</mxCell>
	<object label="表到达" id="f5bb4026a552122a" modelData="">
	<mxCell type="controlCmd" itemType="step" isDrag="1" isEdit="1" isRemove="1" name="tableArrival" style="image;html=1;fontColor=#475669;labelTextOverflow=ellipsis;labelWidth=36;labelOverflow=hidden;labelBackgroundColor=transparent;image=../../../dacp-view/datastash/workshop/unit_creator/images/step/tableArrival.png" parent="e969fc995997d6ae" vertex="1" modelData="">
	<mxGeometry x="110" y="100" width="46" height="46" modelData="{}" as="geometry"/>
	</mxCell></object>
	<mxCell id="b4f7ca10296ac64a" style="edgeStyle=orthogonalEdgeStyle;rounded=1;html=1;exitX=1;exitY=0.5;entryX=0;entryY=0.5;jettySize=auto;orthogonalLoop=1;" parent="e969fc995997d6ae" source="0b5d7f9ca676d2af" target="4af0016ce187b2ac" edge="1">
	<mxGeometry relative="1" as="geometry"/>
	</mxCell>
	<object label="hive导出到Hdfs" id="0b5d7f9ca676d2af" modelData="">
	<mxCell type="controlCmd" itemType="step" isDrag="1" isEdit="1" isRemove="1" name="sql" style="image;html=1;fontColor=#475669;labelTextOverflow=ellipsis;labelWidth=36;labelOverflow=hidden;labelBackgroundColor=transparent;image=../../../dacp-view/datastash/workshop/unit_creator/images/step/sql.png" parent="e969fc995997d6ae" vertex="1" modelData="">
	<mxGeometry x="240" y="100" width="46" height="46" as="geometry"/>
	</mxCell>
	</object>
	<object label="分片" id="4af0016ce187b2ac" modelData="">
	<mxCell type="controlCmd" itemType="container" isDrag="1" isEdit="1" isRemove="1" name="shard" style="swimlane;" parent="e969fc995997d6ae" vertex="1" modelData="">
	<mxGeometry x="400" y="23" width="250" height="200" modelData="{}" as="geometry"/>
	</mxCell>
	</object>
	<mxCell id="028ccb5e0786f6b6" style="edgeStyle=orthogonalEdgeStyle;rounded=1;html=1;exitX=1;exitY=0.5;entryX=0;entryY=0.5;jettySize=auto;orthogonalLoop=1;" parent="4af0016ce187b2ac" source="08a27091cdf4f158" target="ec5586201d5dbfe4" edge="1">
	<mxGeometry relative="1" as="geometry"/>
	</mxCell>
	<object label="HDFS抽取" id="08a27091cdf4f158" modelData="">
	<mxCell type="rowLevelExtract" itemType="step" isDrag="1" isEdit="1" isRemove="1" name="hdfsreader" style="image;html=1;fontColor=#475669;labelTextOverflow=ellipsis;labelWidth=36;labelOverflow=hidden;labelBackgroundColor=transparent;image=../../../dacp-view/datastash/workshop/unit_creator/images/step/hdfsreader.png" parent="4af0016ce187b2ac" vertex="1" modelData="">
	<mxGeometry x="50" y="60" width="46" height="46" modelData="{}" as="geometry"/>
	</mxCell>
	</object>
	<object label="ORACLE加载" id="ec5586201d5dbfe4" modelData="">
	<mxCell type="rowLevelLoad" itemType="step" isDrag="1" isEdit="1" isRemove="1" name="oraclewriter" style="image;html=1;fontColor=#475669;labelTextOverflow=ellipsis;labelWidth=36;labelOverflow=hidden;labelBackgroundColor=transparent;image=../../../dacp-view/datastash/workshop/unit_creator/images/step/oraclewriter.png" parent="4af0016ce187b2ac" vertex="1" modelData="">
	<mxGeometry x="180" y="60" width="46" height="46" modelData="{}" as="geometry"/>
	</mxCell>
	</object>
	</root>
	</mxGraphModel>','0',now(),'915132deb86d974f');
INSERT INTO DACP_DATASTASH_UNIT (ID, UNIT_CODE, VERSION, LABEL, DESCR, UNIT_TYPE, WORKGROUP, BATCH_TYPE, BATCH_STEP, BATCH_OFFSET, BATCH_NO, UNIT_PRIORITY, RUN_CONSTRAINT, MEMBER_ID, CREATE_USER, CREATE_DT, LASTUPD, UNIT_EXT_CFG, GRAPH, STATE,UPDATE_DT , TMPL_CODE) VALUES ('e87b506b94b6a7c6','','0','地方撒','地方撒','2','','hour','1','-1','20171123','0','','T00039-wangzongjie','zhangguangl',now(),now(),'','<mxGraphModel dx="900" dy="436" grid="1" gridSize="10" guides="1" tooltips="1" connect="1" arrows="1" fold="1" page="0" pageScale="1" pageWidth="1169" pageHeight="827" background="#ffffff">
	<root>
	<mxCell id="6322b5eb3ced1cf2"/>
	<mxCell id="e969fc995997d6ae" parent="6322b5eb3ced1cf2"/>
	<mxCell id="e190c3c6c9153938" style="edgeStyle=orthogonalEdgeStyle;rounded=1;html=1;exitX=1;exitY=0.5;entryX=0;entryY=0.5;jettySize=auto;orthogonalLoop=1;" parent="e969fc995997d6ae" source="0b2c17b10ba48852" target="c620da9e34784dfa" edge="1">
	<mxGeometry relative="1" as="geometry"/>
	</mxCell>
	<object label="表到达" id="0b2c17b10ba48852" modelData="">
	<mxCell type="controlCmd" itemType="step" isDrag="1" isEdit="1" isRemove="1" name="tableArrival" style="image;html=1;fontColor=#475669;labelTextOverflow=ellipsis;labelWidth=36;labelOverflow=hidden;labelBackgroundColor=transparent;image=../../../dacp-view/datastash/workshop/unit_creator/images/step/tableArrival.png" parent="e969fc995997d6ae" vertex="1" modelData="">
	<mxGeometry x="110" y="100" width="46" height="46" modelData="{}" as="geometry"/>
	</mxCell></object>
	<mxCell id="b4f7ca10296ac64a" style="edgeStyle=orthogonalEdgeStyle;rounded=1;html=1;exitX=1;exitY=0.5;entryX=0;entryY=0.5;jettySize=auto;orthogonalLoop=1;" parent="e969fc995997d6ae" source="c620da9e34784dfa" target="a6838b2fd1e1906a" edge="1">
	<mxGeometry relative="1" as="geometry"/>
	</mxCell>
	<object label="hive导出到Hdfs" id="c620da9e34784dfa" modelData="">
	<mxCell type="controlCmd" itemType="step" isDrag="1" isEdit="1" isRemove="1" name="sql" style="image;html=1;fontColor=#475669;labelTextOverflow=ellipsis;labelWidth=36;labelOverflow=hidden;labelBackgroundColor=transparent;image=../../../dacp-view/datastash/workshop/unit_creator/images/step/sql.png" parent="e969fc995997d6ae" vertex="1" modelData="">
	<mxGeometry x="240" y="100" width="46" height="46" as="geometry"/>
	</mxCell>
	</object>
	<object label="分片" id="a6838b2fd1e1906a" modelData="">
	<mxCell type="controlCmd" itemType="container" isDrag="1" isEdit="1" isRemove="1" name="shard" style="swimlane;" parent="e969fc995997d6ae" vertex="1" modelData="">
	<mxGeometry x="400" y="23" width="250" height="200" modelData="{}" as="geometry"/>
	</mxCell>
	</object>
	<mxCell id="028ccb5e0786f6b6" style="edgeStyle=orthogonalEdgeStyle;rounded=1;html=1;exitX=1;exitY=0.5;entryX=0;entryY=0.5;jettySize=auto;orthogonalLoop=1;" parent="a6838b2fd1e1906a" source="d746f92804a518af" target="187f1b099bf819a9" edge="1">
	<mxGeometry relative="1" as="geometry"/>
	</mxCell>
	<object label="HDFS抽取" id="d746f92804a518af" modelData="">
	<mxCell type="rowLevelExtract" itemType="step" isDrag="1" isEdit="1" isRemove="1" name="hdfsreader" style="image;html=1;fontColor=#475669;labelTextOverflow=ellipsis;labelWidth=36;labelOverflow=hidden;labelBackgroundColor=transparent;image=../../../dacp-view/datastash/workshop/unit_creator/images/step/hdfsreader.png" parent="a6838b2fd1e1906a" vertex="1" modelData="">
	<mxGeometry x="50" y="60" width="46" height="46" modelData="{}" as="geometry"/>
	</mxCell>
	</object>
	<object label="ORACLE加载" id="187f1b099bf819a9" modelData="">
	<mxCell type="rowLevelLoad" itemType="step" isDrag="1" isEdit="1" isRemove="1" name="oraclewriter" style="image;html=1;fontColor=#475669;labelTextOverflow=ellipsis;labelWidth=36;labelOverflow=hidden;labelBackgroundColor=transparent;image=../../../dacp-view/datastash/workshop/unit_creator/images/step/oraclewriter.png" parent="a6838b2fd1e1906a" vertex="1" modelData="">
	<mxGeometry x="180" y="60" width="46" height="46" modelData="{}" as="geometry"/>
	</mxCell>
	</object>
	</root>
	</mxGraphModel>','0',now(),'915132deb86d974f');
