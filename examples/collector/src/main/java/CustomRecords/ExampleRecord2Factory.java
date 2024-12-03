package CustomRecords;
import kieker.common.exception.RecordInstantiationException;
import kieker.common.record.factory.IRecordFactory;
import kieker.common.record.io.IValueDeserializer;
 public class ExampleRecord2Factory implements IRecordFactory<ExampleRecord2> {
	@Override
	public String[] getValueNames() {
		// TODO Auto-generated method stub
		return ExampleRecord2.VALUE_NAMES;
	}
			
	@Override
	public Class<?>[] getValueTypes() {
		// TODO Auto-generated method stub
		return ExampleRecord2.TYPES;
	}
			
				
	public int getRecordSizeInBytes() {
		// TODO Auto-generated method stub
		return ExampleRecord2.SIZE;
	}
			
	@Override
	public ExampleRecord2 create(IValueDeserializer deserializer) throws RecordInstantiationException {
		// TODO Auto-generated method stub
		return new ExampleRecord2(deserializer);
	}
}