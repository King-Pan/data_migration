package com.asiainfo.model;


import java.util.Map;

public class DisInfo {
	
	
	private String dis_id;
	private String dis_code;
	private String dis_name;
	private String source_dbname;
	private String source_tablename;
	private String call_cycle_type;
	private String call_time;
	private String source_xmlid;
	private String export_sql;
	private String target_type;
	private String target_dbname;
	private String target_tablename;
	private String target_tablecycle;
	private String target_tableidx_col;
	private String target_tableidx_name;
	private String target_xmlid;
	private String load_type;
	private String operate_sql;
	private String template_table;
	private String partition_key;
	private String table_space;
	private String schema_name;
	private String host_name;
	private String target_dir;
	private String file_delimiter;
	private String delimiter_size;
	private String dis_type;
	private String af_action;
	private String cfg_remark;
	private String cur_creater;
	private String team_code;
	private String is_active;
	private String redo_times;
	private String date_col;
	private String map_num;
	private String over_time;
	private String offsetend;
	private String ftp_host;
	private String exp_file_name;
	private String ftp_file_path;
	private String dis_level;
	private String is_temp;

	
	
	
	public DisInfo(Map<String,String> map) {
		super();
		this.dis_id=map.get("dis_id");
		this.dis_code=map.get("dis_code");
		this.dis_name=map.get("dis_name");
		this.source_dbname=map.get("source_dbname");
		this.source_tablename=map.get("source_tablename");
		this.call_cycle_type=map.get("call_cycle_type");
		this.call_time=map.get("call_time");
		this.source_xmlid=map.get("source_xmlid");
		this.export_sql=map.get("export_sql");
		this.target_type=map.get("target_type");
		this.target_dbname=map.get("target_dbname");
		this.target_tablename=map.get("target_tablename");
		this.target_tablecycle=map.get("target_tablecycle");
		this.target_tableidx_col=map.get("target_tableidx_col");
		this.target_tableidx_name=map.get("target_tableidx_name");
		this.target_xmlid=map.get("target_xmlid");
		this.load_type=map.get("load_type");
		this.operate_sql=map.get("operate_sql");
		this.template_table=map.get("template_table");
		this.partition_key=map.get("partition_key");
		this.table_space=map.get("table_space");
		this.schema_name=map.get("schema_name");
		this.host_name=map.get("host_name");
		this.target_dir=map.get("target_dir");
		this.file_delimiter=map.get("file_delimiter");
		this.delimiter_size=map.get("delimiter_size");
		this.dis_type=map.get("dis_type");
		this.af_action=map.get("af_action");
		this.cfg_remark=map.get("cfg_remark");
		this.cur_creater=map.get("cur_creater");
		this.team_code=map.get("team_code");
		this.is_active=map.get("is_active");
		this.redo_times=map.get("redo_times");
		this.date_col=map.get("date_col");
		this.map_num=map.get("map_num");
		this.over_time=map.get("over_time");
		this.offsetend=map.get("offsetend");
		this.ftp_host=map.get("ftp_host");
		this.exp_file_name=map.get("exp_file_name");
		this.ftp_file_path=map.get("ftp_file_path");
		this.dis_level=map.get("dis_level");
		this.is_temp=map.get("is_temp");
		
	}
	
	public String getDis_id() {
		return dis_id;
	}

	public void setDis_id(String dis_id) {
		this.dis_id = dis_id;
	}

	public String getDis_code() {
		return dis_code;
	}

	public void setDis_code(String dis_code) {
		this.dis_code = dis_code;
	}

	public String getDis_name() {
		return dis_name;
	}

	public void setDis_name(String dis_name) {
		this.dis_name = dis_name;
	}

	public String getSource_dbname() {
		return source_dbname;
	}

	public void setSource_dbname(String source_dbname) {
		this.source_dbname = source_dbname;
	}

	public String getSource_tablename() {
		return source_tablename;
	}

	public void setSource_tablename(String source_tablename) {
		this.source_tablename = source_tablename;
	}

	public String getCall_cycle_type() {
		return call_cycle_type;
	}

	public void setCall_cycle_type(String call_cycle_type) {
		this.call_cycle_type = call_cycle_type;
	}

	public String getCall_time() {
		return call_time;
	}

	public void setCall_time(String call_time) {
		this.call_time = call_time;
	}

	public String getSource_xmlid() {
		return source_xmlid;
	}

	public void setSource_xmlid(String source_xmlid) {
		this.source_xmlid = source_xmlid;
	}

	public String getExport_sql() {
		return export_sql;
	}

	public void setExport_sql(String export_sql) {
		this.export_sql = export_sql;
	}

	public String getTarget_type() {
		return target_type;
	}

	public void setTarget_type(String target_type) {
		this.target_type = target_type;
	}

	public String getTarget_dbname() {
		return target_dbname;
	}

	public void setTarget_dbname(String target_dbname) {
		this.target_dbname = target_dbname;
	}

	public String getTarget_tablename() {
		return target_tablename;
	}

	public void setTarget_tablename(String target_tablename) {
		this.target_tablename = target_tablename;
	}

	public String getTarget_tablecycle() {
		return target_tablecycle;
	}

	public void setTarget_tablecycle(String target_tablecycle) {
		this.target_tablecycle = target_tablecycle;
	}

	public String getTarget_tableidx_col() {
		return target_tableidx_col;
	}

	public void setTarget_tableidx_col(String target_tableidx_col) {
		this.target_tableidx_col = target_tableidx_col;
	}

	public String getTarget_tableidx_name() {
		return target_tableidx_name;
	}

	public void setTarget_tableidx_name(String target_tableidx_name) {
		this.target_tableidx_name = target_tableidx_name;
	}

	public String getTarget_xmlid() {
		return target_xmlid;
	}

	public void setTarget_xmlid(String target_xmlid) {
		this.target_xmlid = target_xmlid;
	}

	public String getLoad_type() {
		return load_type;
	}

	public void setLoad_type(String load_type) {
		this.load_type = load_type;
	}

	public String getOperate_sql() {
		return operate_sql;
	}

	public void setOperate_sql(String operate_sql) {
		this.operate_sql = operate_sql;
	}

	public String getTemplate_table() {
		return template_table;
	}

	public void setTemplate_table(String template_table) {
		this.template_table = template_table;
	}

	public String getPartition_key() {
		return partition_key;
	}

	public void setPartition_key(String partition_key) {
		this.partition_key = partition_key;
	}

	public String getTable_space() {
		return table_space;
	}

	public void setTable_space(String table_space) {
		this.table_space = table_space;
	}

	public String getSchema_name() {
		return schema_name;
	}

	public void setSchema_name(String schema_name) {
		this.schema_name = schema_name;
	}

	public String getHost_name() {
		return host_name;
	}

	public void setHost_name(String host_name) {
		this.host_name = host_name;
	}

	public String getTarget_dir() {
		return target_dir;
	}

	public void setTarget_dir(String target_dir) {
		this.target_dir = target_dir;
	}

	public String getFile_delimiter() {
		return file_delimiter;
	}

	public void setFile_delimiter(String file_delimiter) {
		this.file_delimiter = file_delimiter;
	}

	public String getDelimiter_size() {
		return delimiter_size;
	}

	public void setDelimiter_size(String delimiter_size) {
		this.delimiter_size = delimiter_size;
	}

	public String getDis_type() {
		return dis_type;
	}

	public void setDis_type(String dis_type) {
		this.dis_type = dis_type;
	}

	public String getAf_action() {
		return af_action;
	}

	public void setAf_action(String af_action) {
		this.af_action = af_action;
	}

	public String getCfg_remark() {
		return cfg_remark;
	}

	public void setCfg_remark(String cfg_remark) {
		this.cfg_remark = cfg_remark;
	}


	public String getCur_creater() {
		return cur_creater;
	}

	public void setCur_creater(String cur_creater) {
		this.cur_creater = cur_creater;
	}

	public String getTeam_code() {
		return team_code;
	}

	public void setTeam_code(String team_code) {
		this.team_code = team_code;
	}


	public String getRedo_times() {
		return redo_times;
	}

	public void setRedo_times(String redo_times) {
		this.redo_times = redo_times;
	}

	public String getDate_col() {
		return date_col;
	}

	public void setDate_col(String date_col) {
		this.date_col = date_col;
	}

	public String getMap_num() {
		return map_num;
	}

	public void setMap_num(String map_num) {
		this.map_num = map_num;
	}


	public String getOver_time() {
		return over_time;
	}

	public void setOver_time(String over_time) {
		this.over_time = over_time;
	}

	public String getOffsetend() {
		return offsetend;
	}

	public void setOffsetend(String offsetend) {
		this.offsetend = offsetend;
	}

	public String getFtp_host() {
		return ftp_host;
	}

	public void setFtp_host(String ftp_host) {
		this.ftp_host = ftp_host;
	}

	public String getExp_file_name() {
		return exp_file_name;
	}

	public void setExp_file_name(String exp_file_name) {
		this.exp_file_name = exp_file_name;
	}

	public String getFtp_file_path() {
		return ftp_file_path;
	}

	public void setFtp_file_path(String ftp_file_path) {
		this.ftp_file_path = ftp_file_path;
	}

	public String getDis_level() {
		return dis_level;
	}

	public void setDis_level(String dis_level) {
		this.dis_level = dis_level;
	}

	public String getIs_temp() {
		return is_temp;
	}

	public void setIs_temp(String is_temp) {
		this.is_temp = is_temp;
	}

	
	
	

}

