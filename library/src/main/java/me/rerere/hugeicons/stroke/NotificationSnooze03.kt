package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.NotificationSnooze03: ImageVector
    get() {
        if (_notificationSnooze03 != null) {
            return _notificationSnooze03!!
        }
        _notificationSnooze03 = ImageVector.Builder(
            name = "NotificationSnooze03",
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
        moveTo(20f, 19.0011f)
        lineTo(18.7499f, 11f)
        moveTo(4f, 19.0011f)
        lineTo(5.65098f, 8.43407f)
        curveTo(6.13971f, 5.30601f, 8.83398f, 3f, 12f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 19f)
        curveTo(20f, 17.3431f, 16.4183f, 16f, 12f, 16f)
        curveTo(7.58172f, 16f, 4f, 17.3431f, 4f, 19f)
        curveTo(4f, 20.6569f, 7.58172f, 22f, 12f, 22f)
        curveTo(16.4183f, 22f, 20f, 20.6569f, 20f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 19f)
        horizontalLineTo(11f)
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
        curveTo(15.3212f, 7.23173f, 14.9131f, 7.51977f, 15.016f, 7.75989f)
        curveTo(15.1189f, 8f, 15.6504f, 8f, 16.423f, 8f)
        horizontalLineTo(20f)
        }
        }.build()

        return _notificationSnooze03!!
    }

private var _notificationSnooze03: ImageVector? = null
