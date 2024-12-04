package CustomRecords;
import java.nio.BufferOverflowException;
import kieker.common.exception.RecordInstantiationException;
import kieker.common.record.flow.IFlowRecord;
import kieker.common.record.io.IValueDeserializer;
import kieker.common.record.io.IValueSerializer;
import kieker.common.record.AbstractMonitoringRecord;
		
public class CustomRecord extends AbstractMonitoringRecord{
			
	final private int numeric;
	final private String text;
	final private boolean flag;
		
	public  static final int SIZE = 		
			TYPE_SIZE_INT +
			TYPE_SIZE_STRING +
			TYPE_SIZE_BOOLEAN
	;
		
	public static final Class<?>[] TYPES = {int.class, 
	String.class, 
	boolean.class, 
	};
		
	public static final String[] VALUE_NAMES = {"numeric", 
	"text", 
	"flag", 
	};
		
	public CustomRecord( int numeric,  String text,  boolean flag  ){
		
		this.numeric = numeric;
		this.text = text;
		this.flag = flag;
	;
	}
	
	public CustomRecord(IValueDeserializer deserializer){
		this.numeric = deserializer.getInt();
		this.text = deserializer.getString();
		this.flag = deserializer.getBoolean();
	}
		
	@Override
	public void serialize(IValueSerializer serializer) throws BufferOverflowException {
		serializer.putInt(this.numeric);
		serializer.putString(this.text);
		serializer.putBoolean(this.flag);
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
		"numeric:"+this.numeric+
		"text:"+this.text+
		"flag:"+this.flag;
		return result;
	}
		
	public int getNumeric(){
		return this.numeric;
	}
	
	
	public String getText(){
		return this.text;
	}
	
	
	public boolean getFlag(){
		return this.flag;
	}
	
	
		}
