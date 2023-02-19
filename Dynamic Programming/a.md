### getJsonArray
**Syntax**
```java=
JsonArray getJsonArray(String name)
```

The array value to which the supplied name is mapped is returned. This is a shortcut for (JsonArray)get(name) to get the value.

**Parameters**:
* name -the name associated with the value to be returned
**Returns**:
the array value to which the given name is mapped, or null if there is no mapping for the name in this object.
**Throws**:
* ClassCastException - if the value mapped to the given name is not assignable to the JsonArray type

### getJsonObject
**Syntax**
```java=
JsonObject getJsonObject(String name)
```
The object value to which the given name is mapped is returned. This is a shortcut for (JsonObject)get(name) to return the value.
**Parameters:**
* name - the name associated with the value to be returned
**Returns:**
the object value to which the supplied name is mapped, or null if there is no mapping for the name in this object.
**Throws:**
* ClassCastException - if the value mapped to the supplied name is not assignable to the JsonObject type

### getJsonNumber
**Syntax**
```java=
JsonNumber getJsonNumber(String name)
```
The numeric value to which the provided name is mapped is returned. This is a quick way to acquire the value of (JsonNumber)get(name).
**Parameters:**
* name - the name associated with the value to be returned
**Returns:**
the numeric value to which the supplied name is mapped, or null if there is no mapping for the name in this object.
**Throws:**
* ClassCastException - if the value mapped to the supplied name is not assignable to the JsonNumber type

### getJsonString
**Syntax**
```java=
JsonString getJsonString(String name)
```
**Returns**
the string value that corresponds to the provided name This is a shortcut for (JsonString)get(name) to return the value.
**Parameters:**
* name - the name associated with the value to be returned
**Returns:**
the string value to which the supplied name is mapped, or null if there is no mapping for the name in this object.
**Throws:**
* ClassCastException - if the value mapped to the provided name is not assignable to the JsonString type

### getString
**Syntax**
```java=
String getString(String name)
```
A shortcut for getJsonString (name). getString()
**Parameters:**
* name - whose value is to be returned as a String
**Returns:**
the String value that corresponds to the provided name
**Throws:**
* NullPointerException - if there is no mapping for the supplied name
* ClassCastException - if the supplied name mapping's value is not assignable to JsonString

### getString
String getString(String name,
                 String defaultValue)
The string value of the corresponding JsonString mapping for the supplied name is returned. If a JsonString is discovered, its JsonString.getString() method is called. Otherwise, the default value supplied is returned.
**Parameters:**
* name - the name of the variable whose associated value is to be provided as a String.
* defaultValue - the default value to be returned
**Returns:**
the string value of the associated mapping for the name, or the default value
### getInt
**Syntax**
```java=
int getInt(String name)
```
A shortcut for getJsonNumber (name). intValue()
**Parameters:**
name - whose value is to be returned as an int
**Returns:**
the int value that corresponds to the provided name
**Throws:**
* NullPointerException - if no mapping exists for the provided name.
* ClassCastException - thrown if the value for the provided name mapping cannot be assigned to JsonNumber.

### getInt
**Syntax**
```java=
int getInt(String name,
           int defaultValue)
```
The int value of the related JsonNumber mapping for the supplied name is returned. If JsonNumber is discovered, JsonNumber.intValue() is returned. Otherwise, the default value supplied is returned.
**Parameters:**
* name - the name of the variable whose associated value is to be returned as an int
* defaultValue - the default value to be provided
**Returns:**
the int value of the name's associated mapping, or the default value
### getBoolean
**Syntax**
```java=
boolean getBoolean(String name)
```
Returns the boolean value of the related mapping for the supplied name. If the associated mapping is JsonValue. TRUE, then returns TRUE. If the associated mapping is JsonValue. FALSE, then returns false.
**Parameters:**
* name - whose associated boolean value is to be returned

**Returns:** 
the boolean value to which the supplied name is mapped 
**Throws:** 
* NullPointerException - if no mapping exists for the specified name
* ClassCastException -If the value for the supplied name mapping is not assignable to JsonValue. TRUE or JsonValue FALSE
### getBoolean
**Syntax**
```java=
 boolean getBoolean(String name, boolean defaultValue) 
 ```
The boolean value of the related mapping for the supplied name is returned. Returns true if the related mapping is JsonValue.TRUE. If the corresponding mapping is JsonValue. FALSE Then it returns false. Otherwise, the default value supplied is returned.
**Parameters:**
* name - the name of the variable whose associated value is to be returned as an int
* defaultValue - the default value to be returned
**Returns:**
The related mapping's boolean value for the name, or the default value
### isNull
**Syntax**
```java=
boolean isNull(String name)
```
If the related value for the supplied name is JsonValue.NULL, this function returns true.
**Parameters:**
* name - the name whose associated value is being examined. **Returns:**
    True if the associated value is JsonValue.NULL else false
**Throws:**
* NullPointerException - if the provided name does not contain any mappings