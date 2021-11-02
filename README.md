# KotlinSharedPreferences
kotlin class used to simplify shared preferences control

## Usage

### Minimal working example
- import class to your project

- get class instance in your activity:
```kotlin
val sharedDB = SharedPreferencesDB(this)
```

- save string 
```kotlin
sharedDB.putString("keyName", "string value")
```
- get string 
```kotlin
val string = sharedDB.getString("keyName", "defValue")
```

- save int 
```kotlin
sharedDB.putInt("keyName", 1)
```
- get int 
```kotlin
val integer = sharedDB.getInt("keyName", 0)
```

- save Float 
```kotlin
sharedDB.putFloat("keyName", 1f)
```
- get Float
```kotlin
val float = sharedDB.getFloat("keyName", 0f)
```

- save Double 
```kotlin
sharedDB.putDouble("keyName", 1.0)
```
- get Double
```kotlin
val double = sharedDB.getDouble("keyName", 0.0)
```

- save Long 
```kotlin
sharedDB.putLong("keyName", 1.0)
```
- get Long
```kotlin
val long = sharedDB.getLong("keyName", 0)
```

- save Boolean 
```kotlin
sharedDB.putBoolean("keyName", true)
```
- get Boolean
```kotlin
val boolean = sharedDB.getLong("keyName", false)
```

- get all saved data as : Map<String, *>
```kotlin
val map: Map<String, *> = sharedDB.getAll()
```

- remove data by keyName
```kotlin
sharedDB.remove(key)
```

- clear all data
```kotlin
sharedDB.clear()
```