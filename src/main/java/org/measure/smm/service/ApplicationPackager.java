package org.measure.smm.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.zip.ZipException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.measure.smm.measurementapplication.model.SMMApplication;

public class ApplicationPackager {

	public static final String MEATADATAFILE = "ApplicationMetadata.xml";

	public static SMMApplication getApplicationData(Path metadataPath) throws JAXBException, ZipException, IOException {
		if(metadataPath.toFile().exists()){
			JAXBContext context = JAXBContext.newInstance(SMMApplication.class);
			Unmarshaller um = context.createUnmarshaller();
			SMMApplication  application = (SMMApplication) um.unmarshal(new FileReader(metadataPath.toFile()));
			
			return application;
		}
		throw new FileNotFoundException();
	}
	
}
