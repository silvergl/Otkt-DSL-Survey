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
trace.get_tracer_provider().add_span_processor(span_processor)


# Create a tracer
tracer = trace.get_tracer(__name__)

attributes = {
    "long_num1":423567,
    "message":"helloWorld",
    "int_num": 1
}

# Create some spans to be exported
with tracer.start_as_current_span("Foo", attributes=attributes) as span:
    with tracer.start_as_current_span("Foo", attributes=attributes) as child_span:
   # print(34662+3456778)

        child_span.end()
        print("Example span created and exported")
    
    with tracer.start_as_current_span("Foo", attributes=attributes) as child_span2:
   # print(34662+3456778)

        child_span2.end()
        print("Example span created and exported")
    
        with tracer.start_as_current_span("Foo", attributes=attributes) as child_span3:
   # print(34662+3456778)
            child_span3.end()
            print("Example span created and exported")
    span.end()

