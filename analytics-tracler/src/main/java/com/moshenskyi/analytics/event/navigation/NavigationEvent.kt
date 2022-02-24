package com.moshenskyi.analytics.event.navigation

import com.moshenskyi.analytics.event.Event

private const val EVENT_NAME = "NavigationEvent"

class NavigationEvent(
	attr: NavigationAttributes,
) : Event(
	eventName = EVENT_NAME,
	attributes = attr.parameters
)
