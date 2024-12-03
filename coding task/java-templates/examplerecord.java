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
		
	public  static final int SIZE = 		/* Compute Size of the reocrd in bytes.*/
	;
		
	public static final Class<?>[] TYPES = {			/**Put here types of the record parameters. I.e. int.class/long.class etc.*/ 
	};
		
	public static final String[] VALUE_NAMES = {	/*Pt here the names of the record parameters*/
				};
		
	
	/*public ExampleRecord2( long trace,  long spanId,  String message,  boolean flagd  ){
		
		this.trace = trace;
		this.spanId = spanId;
		this.message = message;
		this.flagd = flagd;
	;
	}*/
	
	//Consider the comendet example to create a constructor that accepts values as arguments and assigns them to the fields of the constructor.
	
	
	
	
	
	/*
	public ExampleRecord2(IValueDeserializer deserializer){
		this.trace = deserializer.getLong();
		this.spanId = deserializer.getLong();
		this.message = deserializer.getString();
		this.flagd = deserializer.getBoolean();
	}*/
		
	//Consider the comendet example to create a constructor that  assigns  values to the monitoring parameters based on the provided deserializer.
	//Beware of the ordering!
		
		
		
	/*@Override
	public void serialize(IValueSerializer serializer) throws BufferOverflowException {
		serializer.putLong(this.trace);
		serializer.putLong(this.spanId);
		serializer.putString(this.message);
		serializer.putBoolean(this.flagd);
	}*/
	
//Consider the example above  to serialize   values  of the monitoring record parameters. It is bascially the same as the constructor with deserializer, but this time you serialize   the values yourself.
//Beware of the ordering! It must be the same as that of the constructer with deserializer/
	
	
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
	/*
	Put Getters for the monitoring parameters here! The order is not important.
	*/


	
	
		}
