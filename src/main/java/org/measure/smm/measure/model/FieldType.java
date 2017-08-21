package org.measure.smm.measure.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlEnum(String.class)	
public enum FieldType {
    u_text("Text"),
    u_keyword("Text"),
    u_long("0"), 
    u_integer("0"),
    u_short("0"),
    u_byte("0"), 
    u_double("0"), 
    u_float("0"),
    u_half_float("0"), 
    u_scaled_float("0"),
    u_date(new Date()),
    u_boolean(true),
    u_binary("0"),
    u_integer_range("0"),
    u_float_range("0"), 
    u_long_range("0"), 
    u_double_range("0"), 
    u_date_range("0"),
    u_geo_point("41.12,-71.34"),
    u_geo_shape("1m"),
    u_ip("0.0.0.0"),
    u_completion("Text"),
    u_token_count("0"),
    u_murmur3("Text");

	private Object instance;
	
	private FieldType(Object instance){
		this.instance = instance;
	}
	
	public Object getInstance() {
		return instance;
	} 
}
