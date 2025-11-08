package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.NotificationSnooze01: ImageVector
    get() {
        if (_notificationSnooze01 != null) {
            return _notificationSnooze01!!
        }
        _notificationSnooze01 = ImageVector.Builder(
            name = "NotificationSnooze01",
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
        moveTo(15.5f, 18.5f)
        curveTo(15.5f, 20.433f, 13.933f, 22f, 12f, 22f)
        curveTo(10.067f, 22f, 8.5f, 20.433f, 8.5f, 18.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 11f)
        verticalLineTo(12.7558f)
        curveTo(19f, 13.5514f, 19.3161f, 14.3145f, 19.8787f, 14.8771f)
        lineTo(20.4819f, 15.4803f)
        curveTo(20.8136f, 15.8121f, 21f, 16.262f, 21f, 16.7311f)
        curveTo(21f, 17.708f, 20.208f, 18.5f, 19.2311f, 18.5f)
        horizontalLineTo(4.76887f)
        curveTo(3.79195f, 18.5f, 3f, 17.708f, 3f, 16.7311f)
        curveTo(3f, 16.262f, 3.18636f, 15.8121f, 3.51809f, 15.4803f)
        lineTo(4.12132f, 14.8771f)
        curveTo(4.68393f, 14.3145f, 5f, 13.5514f, 5f, 12.7558f)
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

        return _notificationSnooze01!!
    }

private var _notificationSnooze01: ImageVector? = null
