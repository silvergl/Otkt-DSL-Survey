package CustomRecords;
import java.nio.BufferOverflowException;
import kieker.common.exception.RecordInstantiationException;
import kieker.common.record.flow.IFlowRecord;
import kieker.common.record.io.IValueDeserializer;
import kieker.common.record.io.IValueSerializer;
import kieker.common.record.AbstractMonitoringRecord;
		
public class ExampleRecord extends AbstractMonitoringRecord{
			
	final private long startTimestamp;
	final private long endTimestamp;
	final private long otelTraceId;
	final private long spanId;
	final private long parentSpanId;
	final private int int_num;
	final private long long_num;
		
	public  static final int SIZE = TYPE_SIZE_LONG+
			TYPE_SIZE_LONG+
			TYPE_SIZE_LONG+
			TYPE_SIZE_LONG+
			TYPE_SIZE_LONG+
			TYPE_SIZE_INT +
			TYPE_SIZE_LONG
	;
		
	public static final Class<?>[] TYPES = {long.class,
				long.class,
				String.class,
				long.class,
				long.class,
				int.class, 
				long.class, 
	};
		
	public static final String[] VALUE_NAMES = { "startTimestamp", 
				"endTimestamp",
				"otelTraceId",
				"spanId",
				"parentSpanId",
				"int_num", 
				"long_num", 
				};
		
	public ExampleRecord( long startTimestamp, long endTimestamp, long otelTraceId, long spanId, long parentSpanId, int int_num,  long long_num  ){
		
		this.startTimestamp = startTimestamp;
		this.endTimestamp = endTimestamp;
		this.otelTraceId = otelTraceId;
		this.spanId = spanId;
		this.parentSpanId = parentSpanId;
		this.int_num = int_num;
		this.long_num = long_num;
	;
	}
	
	public ExampleRecord(IValueDeserializer deserializer){
		this.startTimestamp = deserializer.getLong();
		this.endTimestamp = deserializer.getLong();
		this.otelTraceId = deserializer.getLong();
		this.spanId = deserializer.getLong();
		this.parentSpanId = deserializer.getLong();
		this.int_num = deserializer.getInt();
		this.long_num = deserializer.getLong();
	}
		
	@Override
	public void serialize(IValueSerializer serializer) throws BufferOverflowException {
		serializer.putLong(this.startTimestamp);
		serializer.putLong(this.endTimestamp);
		serializer.putLong(this.otelTraceId);
		serializer.putLong(this.spanId);
		serializer.putLong(this.parentSpanId);
		serializer.putInt(this.int_num);
		serializer.putLong(this.long_num);
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
	
	
	
	public long getOtelTraceId(){
		return this.otelTraceId;
	}
	
	public long getSpanId(){
		return this.spanId;
	}
	
	public long getParentSpanId(){
		return this.parentSpanId;
	}
	
	public long getStartTimestamp(){
		return this.startTimestamp;
	}
	
	public long getEndTimestamp(){
		return this.endTimestamp;
	}
	
		
	@Override
	public String toString() {
		String result =  
		"int_num:"+this.int_num+
		"long_num:"+this.long_num;
		return result;
	}
		
	public int getInt_num(){
		return this.int_num;
	}
	
	
	public long getLong_num(){
		return this.long_num;
	}
	
	
		}
