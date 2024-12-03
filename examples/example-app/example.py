from opentelemetry import trace
from opentelemetry.sdk.trace import TracerProvider
from opentelemetry.sdk.trace.export import BatchSpanProcessor, SimpleSpanProcessor
from kiekerexporter import KiekerTcpExporter
from kiekerprocessor import IncrementAttributeSpanProcessor
# Set up the tracer provider and OTLP gRPC exporter
trace.set_tracer_provider(TracerProvider())

# Use the gRPC OTLP exporter (ensure the endpoint is correct for gRPC)
otlp_exporter = KiekerTcpExporter()

# Set up the span processor
span_processor = SimpleSpanProcessor(otlp_exporter)
span_processor_2 = IncrementAttributeSpanProcessor()
trace.get_tracer_provider().add_span_processor(span_processor)
trace.get_tracer_provider().add_span_processor(span_processor_2)

# Create a tracer
tracer = trace.get_tracer(__name__)

attributes = {
    "message": "Hello World!",
    "is_off": True,
    "int_num": 3,
    "branch_id": 2,
    "branching_outcome": 3,
    "long_num":34573070785363,
    "operation_signature" : "asdf",
    "session_id": "sjhi",
    "hostname":"buu",
    "eoi":0,
    "ess":1
    
    
}

# Create some spans to be exported
with tracer.start_as_current_span("example-span", attributes=attributes) as span:
    with tracer.start_as_current_span("example-span-bu", attributes=attributes) as child_span:
   # print(34662+3456778)
        print(span.get_span_context().span_id)
        print(span.parent)
        print(child_span.attributes["int_num"])
        print(child_span.attributes["long_num"])
        print(child_span.attributes["int_num"])
        print(child_span.attributes["int_num"])
        child_span.end()
        print("Example span created and exported")
    
    with tracer.start_as_current_span("example-span-bu2", attributes=attributes) as child_span2:
   # print(34662+3456778)
        print(span.get_span_context().span_id)
        print(span.parent)
        print(child_span.attributes["int_num"])
        print(child_span.attributes["long_num"])
        print(child_span.attributes["int_num"])
        print(child_span.attributes["int_num"])
        child_span2.end()
        print("Example span created and exported")
    
        with tracer.start_as_current_span("example-span-bu3", attributes=attributes) as child_span3:
   # print(34662+3456778)
            child_span3.end()
            print("Example span created and exported")
    span.end()

