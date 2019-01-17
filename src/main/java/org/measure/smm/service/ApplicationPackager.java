package org.measure.smm.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.measure.smm.application.model.SMMApplication;
import org.measure.smm.measure.model.SMMMeasure;

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
	
	
	public static SMMApplication getApplicationDataFromZip(Path zipPath) throws JAXBException, ZipException, IOException {
		try (ZipFile zipFile = new ZipFile(zipPath.toFile())) {
			Enumeration<? extends ZipEntry> entries = zipFile.entries();
			while (entries.hasMoreElements()) {
				ZipEntry entry = entries.nextElement();
				if (entry.getName().equals(MEATADATAFILE)) {
					InputStream stream = zipFile.getInputStream(entry);
					JAXBContext context = JAXBContext.newInstance(SMMApplication.class);
					Unmarshaller um = context.createUnmarshaller();
					return (SMMApplication) um.unmarshal(stream);
				}
			}
		}
		return null;
	}
	
}
