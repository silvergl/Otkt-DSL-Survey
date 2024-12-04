Here is a cheat sheet for Opentelemetry.


To access an attribute of span object:
```
span.attributes["attribute_name"]
```
To access default parameters consider following:


```
span.start_time 
span.end_time
span.get_span_context().trace_id
span.get_span_context().span_id
span.parent.span_id
```

When serializing span_id's trace_id's  do not forget to use self.get_span_id(span_id)/self.get_parent_trace_id(trace_id) to convert the representation of the ids into kieker representation.

In order to serialize the values, the following code sample should be utilized. It is imperative to substitute the value in accordance with the specified instructions. It is of paramount importance to ensure that the value type aligns with the put_type statement. 
```
self.serializer.put_string(value)
self.serializer.put_long(value)
self.serializer.pot_boolean(value)
self.serialzer.put_int(value)
etc.
```
The order of these statements is important and should match the order in which the collector deserializes the record.
