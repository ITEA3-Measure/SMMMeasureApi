package org.measure.smm.measure.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlEnum(String.class)	
public enum FieldType {
    u_text,
    u_keyword,
    u_long, 
    u_integer,
    u_short,
    u_byte, 
    u_double, 
    u_float,
    u_half_float, 
    u_scaled_float,
    u_date,
    u_boolean,
    u_binary,
    u_integer_range,
    u_float_range, 
    u_long_range, 
    u_double_range, 
    u_date_range,
    u_geo_point,
    u_geo_shape,
    u_ip,
    u_completion,
    u_token_count,
    u_murmur3; 
}
