package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.NotificationSnooze02: ImageVector
    get() {
        if (_notificationSnooze02 != null) {
            return _notificationSnooze02!!
        }
        _notificationSnooze02 = ImageVector.Builder(
            name = "NotificationSnooze02",
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
        moveTo(19f, 11f)
        verticalLineTo(18.5f)
        moveTo(5f, 18.5f)
        verticalLineTo(10f)
        curveTo(5f, 6.13401f, 8.13401f, 3f, 12f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.5f, 18.5f)
        horizontalLineTo(3.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 20.5f)
        curveTo(13.5f, 21.3284f, 12.8284f, 22f, 12f, 22f)
        moveTo(10.5f, 20.5f)
        curveTo(10.5f, 21.3284f, 11.1716f, 22f, 12f, 22f)
        moveTo(12f, 22f)
        verticalLineTo(20.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.016f, 2f)
        horizontalLineTo(18.6884f)
        curveTo(19.4611f, 2f, 19.8474f, 2f, 19.9503f, 2.24011f)
        curveTo(20.0532f, 2.48023f, 19.7903f, 2.76827f, 19.2646f, 3.34436f)
        lineTo(15.8469f, 6.65564f)
        curveTo(15.3211f, 7.23173f, 14.9131f, 7.51977f, 15.016f, 7.75989f)
        curveTo(15.1189f, 8f, 15.6504f, 8f, 16.423f, 8f)
        horizontalLineTo(20f)
        }
        }.build()

        return _notificationSnooze02!!
    }

private var _notificationSnooze02: ImageVector? = null
