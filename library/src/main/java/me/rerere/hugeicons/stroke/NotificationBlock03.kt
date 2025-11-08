package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.NotificationBlock03: ImageVector
    get() {
        if (_notificationBlock03 != null) {
            return _notificationBlock03!!
        }
        _notificationBlock03 = ImageVector.Builder(
            name = "NotificationBlock03",
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
        moveTo(19.5f, 19.0011f)
        lineTo(18.328f, 11.5f)
        moveTo(3.5f, 19.0011f)
        lineTo(5.15098f, 8.43407f)
        curveTo(5.63971f, 5.30601f, 8.33398f, 3f, 11.5f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.5f, 19f)
        curveTo(19.5f, 17.3431f, 15.9183f, 16f, 11.5f, 16f)
        curveTo(7.08172f, 16f, 3.5f, 17.3431f, 3.5f, 19f)
        curveTo(3.5f, 20.6569f, 7.08172f, 22f, 11.5f, 22f)
        curveTo(15.9183f, 22f, 19.5f, 20.6569f, 19.5f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5f, 19f)
        horizontalLineTo(10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 3.5f)
        lineTo(19f, 7.5f)
        moveTo(20.5f, 5.5f)
        curveTo(20.5f, 3.567f, 18.933f, 2f, 17f, 2f)
        curveTo(15.067f, 2f, 13.5f, 3.567f, 13.5f, 5.5f)
        curveTo(13.5f, 7.433f, 15.067f, 9f, 17f, 9f)
        curveTo(18.933f, 9f, 20.5f, 7.433f, 20.5f, 5.5f)
        }
        }.build()

        return _notificationBlock03!!
    }

private var _notificationBlock03: ImageVector? = null
