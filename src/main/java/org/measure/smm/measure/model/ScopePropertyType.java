package org.measure.smm.measure.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlEnum(String.class)	
public enum ScopePropertyType {
	STRING,
	INTEGER,
	FLOAT,
	DATE,
	ENUM,
	PASSWORD;
}
