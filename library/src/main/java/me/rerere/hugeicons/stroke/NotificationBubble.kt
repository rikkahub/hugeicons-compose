package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.NotificationBubble: ImageVector
    get() {
        if (_notificationBubble != null) {
            return _notificationBubble!!
        }
        _notificationBubble = ImageVector.Builder(
            name = "NotificationBubble",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.5f, 11.9961f)
        curveTo(21.5f, 17.2428f, 17.2467f, 21.4961f, 12f, 21.4961f)
        curveTo(10.3446f, 21.4961f, 8.78814f, 21.0727f, 7.43293f, 20.3283f)
        curveTo(6.87976f, 20.0244f, 6.22839f, 19.9176f, 5.62966f, 20.1171f)
        lineTo(3.00001f, 20.9937f)
        lineTo(3.87695f, 18.3629f)
        curveTo(4.07645f, 17.7644f, 3.96974f, 17.1133f, 3.66622f, 16.5603f)
        curveTo(2.92279f, 15.2057f, 2.5f, 13.6503f, 2.5f, 11.9961f)
        curveTo(2.5f, 6.74939f, 6.75329f, 2.49609f, 12f, 2.49609f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.0001f, 9.49609f)
        curveTo(19.9331f, 9.49609f, 21.5001f, 7.92909f, 21.5001f, 5.99609f)
        curveTo(21.5001f, 4.06309f, 19.9331f, 2.49609f, 18.0001f, 2.49609f)
        curveTo(16.0671f, 2.49609f, 14.5001f, 4.06309f, 14.5001f, 5.99609f)
        curveTo(14.5001f, 7.92909f, 16.0671f, 9.49609f, 18.0001f, 9.49609f)
        }
        }.build()

        return _notificationBubble!!
    }

private var _notificationBubble: ImageVector? = null
