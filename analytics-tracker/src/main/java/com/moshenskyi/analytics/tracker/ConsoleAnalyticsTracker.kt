package com.moshenskyi.analytics.tracker

import com.moshenskyi.analytics.event.Event

class ConsoleAnalyticsTracker : AnalyticsTracker {

	override fun publish(event: Event) {
		println(event.toString())
	}

}