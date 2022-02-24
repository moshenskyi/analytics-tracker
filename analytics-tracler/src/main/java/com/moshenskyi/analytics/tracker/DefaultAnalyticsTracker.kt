package com.moshenskyi.analytics.tracker

import android.util.Log
import com.moshenskyi.analytics.event.Event
import com.moshenskyi.analytics.event.LogLevel

class DefaultAnalyticsTracker : AnalyticsTracker {

	override fun publish(event: Event) {
		when (event.level) {
			LogLevel.VERBOSE -> Log.v(event.screenTag, event.toString())
			LogLevel.DEBUG -> Log.d(event.screenTag, event.toString())
			LogLevel.INFO -> Log.i(event.screenTag, event.toString())
			LogLevel.WARN -> Log.w(event.screenTag, event.toString())
			LogLevel.ERROR -> Log.e(event.screenTag, event.toString())
		}
	}

}