package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.NotificationOff02: ImageVector
    get() {
        if (_notificationOff02 != null) {
            return _notificationOff02!!
        }
        _notificationOff02 = ImageVector.Builder(
            name = "NotificationOff02",
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
        moveTo(18f, 18f)
        horizontalLineTo(3.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 20f)
        curveTo(13.5f, 20.8284f, 12.8284f, 21.5f, 12f, 21.5f)
        moveTo(10.5f, 20f)
        curveTo(10.5f, 20.8284f, 11.1716f, 21.5f, 12f, 21.5f)
        moveTo(12f, 21.5f)
        verticalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 2f)
        lineTo(22f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 18f)
        verticalLineTo(9.5f)
        curveTo(5f, 8.20839f, 5.34981f, 6.99849f, 5.95987f, 5.95987f)
        moveTo(19f, 15f)
        verticalLineTo(9.5f)
        curveTo(19f, 5.63401f, 15.866f, 2.5f, 12f, 2.5f)
        curveTo(10.4497f, 2.5f, 9.01706f, 3.00399f, 7.85707f, 3.85707f)
        }
        }.build()

        return _notificationOff02!!
    }

private var _notificationOff02: ImageVector? = null
