Here is a cheat sheet for Opentelemetry and Kieker.


To access an attribute of span object:
```
span.attributes["attribute_name"]
```
To access default parameters:


```
span.start_time 
span.end_time
span.get_span_context().trace_id
span.get_span_context().span_id
span.parent.span_id
```

In order to serialize the values, the following code sample should be utilized. It is imperative to substitute the value in accordance with the specified instructions. It is of paramount importance to ensure that the value type aligns with the put_type statement. 
```
self.serializer.put_string(value)
self.serializer.put_long(value)
self.serializer.pot_boolean(value)
self.serialzer,put_int(value)
```
The order of these statements is important and should match the order in which the collector deserializes the record.

To conver trace_id and span_id into a shorter long, use 
```
self.get_span_id(span.get_span_context().span_id)
self.get_span_id(span.get_span_context().trace_id)
```

