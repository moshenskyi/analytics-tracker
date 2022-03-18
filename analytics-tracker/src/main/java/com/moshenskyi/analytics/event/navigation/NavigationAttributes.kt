package com.moshenskyi.analytics.event.navigation

import com.moshenskyi.analytics.event.Attributes

class NavigationAttributes(
	private val from: ScreenName,
	private val to: ScreenName,
	private val attr: Map<String, Any> = emptyMap(),
) : Attributes() {

	override val parameters: Map<String, Any>
		get() {
			return attr.toMutableMap().apply {
				putAll(
					mapOf(
						"from" to from,
						"to" to to
					)
				)
			}
		}

}

data class ScreenName(val name: String)
