package com.moshenskyi.analytics.event

abstract class Event(
	var eventName: String,
	var level: LogLevel? = null,
	var description: String? = null,
	var screenTag: String? = null,
	var attributes: Map<String, Any>
) {

	override fun toString(): String {
		return """Event [$eventName: $description]: (level = $level, screenTag: $screenTag, attributes: $attributes)"""
	}

}

enum class LogLevel {
	VERBOSE, DEBUG, INFO, WARN, ERROR
}
