package CustomRecords;
import kieker.common.exception.RecordInstantiationException;
import kieker.common.record.factory.IRecordFactory;
import kieker.common.record.io.IValueDeserializer;
 public class ExampleRecordFactory implements IRecordFactory<ExampleRecord> {
	@Override
	public String[] getValueNames() {
		// TODO Auto-generated method stub
		return ExampleRecord.VALUE_NAMES;
	}
			
	@Override
	public Class<?>[] getValueTypes() {
		// TODO Auto-generated method stub
		return ExampleRecord.TYPES;
	}
			
				
	public int getRecordSizeInBytes() {
		// TODO Auto-generated method stub
		return ExampleRecord.SIZE;
	}
			
	@Override
	public ExampleRecord create(IValueDeserializer deserializer) throws RecordInstantiationException {
		// TODO Auto-generated method stub
		return new ExampleRecord(deserializer);
	}
}