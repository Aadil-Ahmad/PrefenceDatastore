package com.extel.prefencedatastore

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.map

class PreferenceDatastore (context: Context){

    val Context.dataStore : DataStore<Preferences> by preferencesDataStore("DATA_STORE")
    val pref = context.dataStore

    companion object{
        var userName = stringPreferencesKey("USER_NAME")
        var userNumber = stringPreferencesKey("USER_NUMBER")
        var userAge = intPreferencesKey("USER_AGE")
    }

    suspend fun setDetails(userDetails: UserDetails){
        pref.edit {
            it[userName] = userDetails.userName
            it[userNumber] = userDetails.userNumber
            it[userAge] = userDetails.userAge
        }
    }

     fun getDetails() = pref.data.map {
         UserDetails(
             userName = it[userName]?:"",
             userNumber = it[userNumber]?:"",
             userAge = it[userAge]?:0
         )
     }
}