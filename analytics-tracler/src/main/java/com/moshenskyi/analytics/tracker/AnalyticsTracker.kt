package com.moshenskyi.analytics.tracker

import com.moshenskyi.analytics.event.Event

interface AnalyticsTracker {

	fun publish(event: Event)

}