# Aeronautical Information Exchange Model (AIXM) JAXB

Provides Java XML Bindings for the AIXM 5.1 Schema for use with the FAA SWIM FNS Service.


## Installing

  1. Clone this repository
  2. Run mvn clean install
  3. Add dependency to applicable project pom

```xml
	<dependency>
		<groupId>us.dot.faa.swim.jaxb.aixm</groupId>
		<artifactId>aixm-5.1</artifactId>
		<version>1.0</version>
	</dependency>
```

## UnMarshalling FNS AIXM Message


```java
	JAXBContext jaxbContext = JAXBContext.newInstance(AIXMBasicMessageType.class);
	Unmarshaller jaxbContext.createUnmarshaller();
	StringReader reader = new StringReader(fnsAixmMessage);
	AIXMBasicMessageType fnsAixmMessageType = null;
	try {
		fnsAixmMessageType = (AIXMBasicMessageType) JAXBIntrospector
				.getValue(jaxbContext.createUnmarshaller().unmarshal(reader));
	} catch (JAXBException e) {
		throw e;
	} finally {
		reader.close();
	}
```