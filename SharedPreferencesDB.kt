package com.app.sharedpreferences

import android.content.Context
import android.content.SharedPreferences
import java.lang.Exception
import android.os.Environment

/**
 * use this class to easy control shared preferences
 * 1-use key,value to save data
 * 2-use key to get data
 * 3-use key to remove specific data
 * 4-use clear to delete all data
 * @author Aymen Masmoudi[02.11.2021]
 */
class SharedPreferencesDB(context: Context) {

    private var sharedPreferences: SharedPreferences =
        context.getSharedPreferences("sharedData", Context.MODE_PRIVATE)

    /**
     * Put String value into SharedPreferences with 'key' and save
     * @param key SharedPreferences key
     * @param value String value to be added
     */
    fun putString(key: String, value: String){
        sharedPreferences.edit().putString(key, value).apply()
    }

    /**
     * Get String value from SharedPreferences at 'key'. If key not found, return "defValue"
     * @param key SharedPreferences key
     * @return String value at 'key' or "defValue" if not found
     */
    fun getString(key: String): String{
        return sharedPreferences.getString(key, "defValue")!!
    }

    /**
     * Put Int value into SharedPreferences with 'key' and save
     * @param key SharedPreferences key
     * @param value Int value to be added
     */
    fun putInt(key: String, value: Int){
        sharedPreferences.edit().putInt(key, value).apply()
    }

    /**
     * Get Int value from SharedPreferences at 'key'. If key not found, return 0
     * @param key SharedPreferences key
     * @return Int value at 'key' or 0 if not found
     */
    fun getInt(key: String): Int{
        return sharedPreferences.getInt(key, 0)
    }

    /**
     * Put Float value into SharedPreferences with 'key' and save
     * @param key SharedPreferences key
     * @param value Float value to be added
     */
    fun putFloat(key: String, value: Float){
        sharedPreferences.edit().putFloat(key, value).apply()
    }

    /**
     * Get Float value from SharedPreferences at 'key'. If key not found, return 0f
     * @param key SharedPreferences key
     * @return Float value at 'key' or 0f if not found
     */
    fun getFloat(key: String): Float{
        return sharedPreferences.getFloat(key, 0f)
    }

    /**
     * Put Double value into SharedPreferences with 'key' and save
     * @param key SharedPreferences key
     * @param value Double value to be added
     */
    fun putDouble(key: String, value: Double){
        putString(key, value.toString())
    }

    /**
     * Get Double value from SharedPreferences at 'key'. If key not found, return 0.0
     * @param key SharedPreferences key
     * @return Double value at 'key' or 0.0 if not found
     */
    fun getDouble(key: String): Double{
        return try {
            getString(key).toDouble()
        }catch (ex: Exception){
            0.0
        }
    }

    /**
     * Put Long value into SharedPreferences with 'key' and save
     * @param key SharedPreferences key
     * @param value Long value to be added
     */
    fun putLong(key: String, value: Long){
        sharedPreferences.edit().putLong(key, value).apply()
    }

    /**
     * Get Long value from SharedPreferences at 'key'. If key not found, return 0
     * @param key SharedPreferences key
     * @return Long value at 'key' or 0 if not found
     */
    fun getLong(key: String): Long{
        return sharedPreferences.getLong(key, 0)
    }

    /**
     * Put boolean value into SharedPreferences with 'key' and save
     * @param key SharedPreferences key
     * @param value boolean value to be added
     */
    fun putBoolean(key: String, value: Boolean){
        sharedPreferences.edit().putBoolean(key, value).apply()
    }

    /**
     * Get boolean value from SharedPreferences at 'key'. If key not found, return false
     * @param key SharedPreferences key
     * @return boolean value at 'key' or false if not found
     */
    fun getBoolean(key: String): Boolean{
        return sharedPreferences.getBoolean(key, false)
    }

    /**
     * Retrieve all values from SharedPreferences. Do not modify collection return by method
     * @return a Map representing a list of key/value pairs from SharedPreferences
     */
    fun getAll(): Map<String, *>{
        return sharedPreferences.all
    }

    /**
     * Remove SharedPreferences item with 'key'
     * @param key SharedPreferences key
     */
    fun remove(key: String) {
        sharedPreferences.edit().remove(key).apply()
    }

    /**
     * Clear SharedPreferences (remove everything)
     */
    fun clear() {
        sharedPreferences.edit().clear().apply();
    }


    /**
     * Check if external storage is writable or not
     * @return true if writable, false otherwise
     */
    fun isExternalStorageWritable(): Boolean {
        return Environment.MEDIA_MOUNTED == Environment.getExternalStorageState()
    }

    /**
     * Check if external storage is readable or not
     * @return true if readable, false otherwise
     */
    fun isExternalStorageReadable(): Boolean {
        val state = Environment.getExternalStorageState()
        return Environment.MEDIA_MOUNTED == state || Environment.MEDIA_MOUNTED_READ_ONLY == state
    }

}