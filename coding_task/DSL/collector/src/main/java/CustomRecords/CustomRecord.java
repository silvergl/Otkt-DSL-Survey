package CustomRecords;
import java.nio.BufferOverflowException;
import kieker.common.exception.RecordInstantiationException;
import kieker.common.record.flow.IFlowRecord;
import kieker.common.record.io.IValueDeserializer;
import kieker.common.record.io.IValueSerializer;
import kieker.common.record.AbstractMonitoringRecord;
		
public class CustomRecord extends AbstractMonitoringRecord{
			
	final private long timestamp;
	final private String helloWorld;
	final private int myNum;
	final private long spanId;
		
	public  static final int SIZE = 		
			TYPE_SIZE_LONG +
			TYPE_SIZE_STRING +
			TYPE_SIZE_INT +
			TYPE_SIZE_LONG
	;
		
	public static final Class<?>[] TYPES = {			long.class, 
				String.class, 
				int.class, 
				long.class, 
	};
		
	public static final String[] VALUE_NAMES = {			"timestamp", 
				"helloWorld", 
				"myNum", 
				"spanId", 
				};
		
	public CustomRecord( long timestamp,  String helloWorld,  int myNum,  long spanId  ){
		
		this.timestamp = timestamp;
		this.helloWorld = helloWorld;
		this.myNum = myNum;
		this.spanId = spanId;
	;
	}
	
	public CustomRecord(IValueDeserializer deserializer){
		this.timestamp = deserializer.getLong();
		this.helloWorld = deserializer.getString();
		this.myNum = deserializer.getInt();
		this.spanId = deserializer.getLong();
	}
		
	@Override
	public void serialize(IValueSerializer serializer) throws BufferOverflowException {
		serializer.putLong(this.timestamp);
		serializer.putString(this.helloWorld);
		serializer.putInt(this.myNum);
		serializer.putLong(this.spanId);
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
		"timestamp:"+this.timestamp+
		"helloWorld:"+this.helloWorld+
		"myNum:"+this.myNum+
		"spanId:"+this.spanId;
		return result;
	}
		
	public long getTimestamp(){
		return this.timestamp;
	}
	
	
	public String getHelloWorld(){
		return this.helloWorld;
	}
	
	
	public int getMyNum(){
		return this.myNum;
	}
	
	
	public long getSpanId(){
		return this.spanId;
	}
	
	
		}
