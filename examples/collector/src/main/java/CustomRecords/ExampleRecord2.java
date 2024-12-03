package CustomRecords;
import java.nio.BufferOverflowException;
import kieker.common.exception.RecordInstantiationException;
import kieker.common.record.flow.IFlowRecord;
import kieker.common.record.io.IValueDeserializer;
import kieker.common.record.io.IValueSerializer;
import kieker.common.record.AbstractMonitoringRecord;
		
public class ExampleRecord2 extends AbstractMonitoringRecord{
	
	/*
	* Declare monitoring Record Parameter here. The can be any primitive type.
	*
	*
	*/
	final private long trace;
	final private long spanId;
	final private String message;
	final private boolean flagd;
		
	public  static final int SIZE = /*
	*Compute the SIZE OF THE RECORD IN BYTES. 
	*
	*/
	;
		
	public static final Class<?>[] TYPES = {			long.class, 
				long.class, 
				String.class, 
				boolean.class, 
	};
		
	public static final String[] VALUE_NAMES = {			"trace", 
				"spanId", 
				"message", 
				"flagd", 
				};
		
	public ExampleRecord2( long trace,  long spanId,  String message,  boolean flagd  ){
		
		this.trace = trace;
		this.spanId = spanId;
		this.message = message;
		this.flagd = flagd;
	;
	}
	
	public ExampleRecord2(IValueDeserializer deserializer){
		this.trace = deserializer.getLong();
		this.spanId = deserializer.getLong();
		this.message = deserializer.getString();
		this.flagd = deserializer.getBoolean();
	}
		
	@Override
	public void serialize(IValueSerializer serializer) throws BufferOverflowException {
		serializer.putLong(this.trace);
		serializer.putLong(this.spanId);
		serializer.putString(this.message);
		serializer.putBoolean(this.flagd);
	}
		
	@Override
	public Class<?>[] getValueTypes() {
		// TODO Auto-generated method stub
		return this.TYPES;
	}
			
			
			
	@Override
	public String[] getValueNames() {
		// TODO Auto-generated method stub
		return this.VALUE_NAMES;
	}
			
			
			
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return SIZE;
	}
	
	
	
		
	@Override
	public String toString() {
		String result =  
		"trace:"+this.trace+
		"spanId:"+this.spanId+
		"message:"+this.message+
		"flagd:"+this.flagd;
		return result;
	}
		
	public long getTrace(){
		return this.trace;
	}
	
	
	public long getSpanId(){
		return this.spanId;
	}
	
	
	public String getMessage(){
		return this.message;
	}
	
	
	public boolean getFlagd(){
		return this.flagd;
	}
	
	
		}
