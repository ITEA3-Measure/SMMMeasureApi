package org.measure.smm.remote;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RemoteMeasureInstanceList implements Serializable{

	private static final long serialVersionUID = 5065151522764343771L;
	
	private List<RemoteMeasureInstance> remoteInstances = new ArrayList<>();
	
	private List<RemoteMeasureExternal> singleExecutions = new ArrayList<>();
	
	public List<RemoteMeasureInstance> getRemoteInstances() {
		return remoteInstances;
	}

	public void setRemoteInstances(List<RemoteMeasureInstance> remoteInstances) {
		this.remoteInstances = remoteInstances;
	}

	public List<RemoteMeasureExternal> getSingleExecutions() {
		return singleExecutions;
	}

	public void setSingleExecutions(List<RemoteMeasureExternal> singleExecutions) {
		this.singleExecutions = singleExecutions;
	}
}
