package me.flavienlefebvre.androidwidgetsamples.xmlViews

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.widget.RemoteViews
import me.flavienlefebvre.androidwidgetsamples.R

class XMLWidgetProvider : AppWidgetProvider() {

	override fun onUpdate(context: Context, appWidgetManager: AppWidgetManager, appWidgetIds: IntArray) {
		super.onUpdate(context, appWidgetManager, appWidgetIds)

		appWidgetIds.forEach { appWidgetId ->
			updateWidgetWithId(context, appWidgetManager, appWidgetId)
		}
	}

	private fun updateWidgetWithId(context: Context, appWidgetManager: AppWidgetManager, appWidgetId: Int) {

		val remoteViews: RemoteViews = RemoteViews(context.packageName, R.layout.xml_widget_layout)

		appWidgetManager.updateAppWidget(appWidgetId, remoteViews)
	}
}