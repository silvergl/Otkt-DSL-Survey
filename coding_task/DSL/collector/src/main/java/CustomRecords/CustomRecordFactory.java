package CustomRecords;
import kieker.common.exception.RecordInstantiationException;
import kieker.common.record.factory.IRecordFactory;
import kieker.common.record.io.IValueDeserializer;
 public class CustomRecordFactory implements IRecordFactory<CustomRecord> {
	@Override
	public String[] getValueNames() {
		// TODO Auto-generated method stub
		return CustomRecord.VALUE_NAMES;
	}
			
	@Override
	public Class<?>[] getValueTypes() {
		// TODO Auto-generated method stub
		return CustomRecord.TYPES;
	}
			
				
	public int getRecordSizeInBytes() {
		// TODO Auto-generated method stub
		return CustomRecord.SIZE;
	}
			
	@Override
	public CustomRecord create(IValueDeserializer deserializer) throws RecordInstantiationException {
		// TODO Auto-generated method stub
		return new CustomRecord(deserializer);
	}
}