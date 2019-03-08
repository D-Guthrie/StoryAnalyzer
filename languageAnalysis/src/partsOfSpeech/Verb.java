package partsOfSpeech;

import java.util.Date;

public abstract class Verb {
	private long objectId;
	
	private Date eventStart;
	private Date eventEnd;

	

	public long getObjectId() {
		return objectId;
	}
	
	public Date getEventStart() {
		return eventStart;
	}

	public Date getEventEnd() {
		return eventEnd;
	}
}
