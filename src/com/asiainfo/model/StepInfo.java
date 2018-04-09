package com.asiainfo.model;

public class StepInfo {
	private String id;
	private String unit_id;
	private String unit_code;
	private String step_idx;
	private String step_label;
	private String step_inst;
	private String step_type;
	private String next_step_idx;
	private String pre_step_idx;
	private String ignore_err_idx;
	private String parent_step_idx;
	private String step_cfg_val;
	private String required_props;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUnit_id() {
		return unit_id;
	}
	public void setUnit_id(String unit_id) {
		this.unit_id = unit_id;
	}
	public String getUnit_code() {
		return unit_code;
	}
	public void setUnit_code(String unit_code) {
		this.unit_code = unit_code;
	}
	public String getStep_idx() {
		return step_idx;
	}
	public void setStep_idx(String step_idx) {
		this.step_idx = step_idx;
	}
	public String getStep_label() {
		return step_label;
	}
	public void setStep_label(String step_label) {
		this.step_label = step_label;
	}
	public String getStep_inst() {
		return step_inst;
	}
	public void setStep_inst(String step_inst) {
		this.step_inst = step_inst;
	}
	public String getStep_type() {
		return step_type;
	}
	public void setStep_type(String step_type) {
		this.step_type = step_type;
	}
	public String getNext_step_idx() {
		return next_step_idx;
	}
	public void setNext_step_idx(String next_step_idx) {
		this.next_step_idx = next_step_idx;
	}
	public String getPre_step_idx() {
		return pre_step_idx;
	}
	public void setPre_step_idx(String pre_step_idx) {
		this.pre_step_idx = pre_step_idx;
	}
	public String getIgnore_err_idx() {
		return ignore_err_idx;
	}
	public void setIgnore_err_idx(String ignore_err_idx) {
		this.ignore_err_idx = ignore_err_idx;
	}
	public String getParent_step_idx() {
		return parent_step_idx;
	}
	public void setParent_step_idx(String parent_step_idx) {
		this.parent_step_idx = parent_step_idx;
	}
	public String getStep_cfg_val() {
		return step_cfg_val;
	}
	public void setStep_cfg_val(String step_cfg_val) {
		this.step_cfg_val = step_cfg_val;
	}
	public String getRequired_props() {
		return required_props;
	}
	public void setRequired_props(String required_props) {
		this.required_props = required_props;
	}


	@Override
	public String toString() {
		return "StepInfo{" +
				"id='" + id + '\'' +
				", unit_id='" + unit_id + '\'' +
				", unit_code='" + unit_code + '\'' +
				", step_idx='" + step_idx + '\'' +
				", step_label='" + step_label + '\'' +
				", step_inst='" + step_inst + '\'' +
				", step_type='" + step_type + '\'' +
				", next_step_idx='" + next_step_idx + '\'' +
				", pre_step_idx='" + pre_step_idx + '\'' +
				", ignore_err_idx='" + ignore_err_idx + '\'' +
				", parent_step_idx='" + parent_step_idx + '\'' +
				", step_cfg_val='" + step_cfg_val + '\'' +
				", required_props='" + required_props + '\'' +
				'}';
	}
}
