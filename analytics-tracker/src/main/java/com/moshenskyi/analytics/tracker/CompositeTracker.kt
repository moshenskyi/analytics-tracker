package com.moshenskyi.analytics.tracker

import com.moshenskyi.analytics.event.Event

class CompositeTracker(private val trackers: Set<AnalyticsTracker>) : AnalyticsTracker {

	override fun publish(event: Event) {
		trackers.forEach { it.publish(event) }
	}
}