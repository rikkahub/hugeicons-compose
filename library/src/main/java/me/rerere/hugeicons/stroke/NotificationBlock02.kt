package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.NotificationBlock02: ImageVector
    get() {
        if (_notificationBlock02 != null) {
            return _notificationBlock02!!
        }
        _notificationBlock02 = ImageVector.Builder(
            name = "NotificationBlock02",
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
        moveTo(18.5f, 12f)
        verticalLineTo(18.5f)
        moveTo(4.5f, 18.5f)
        verticalLineTo(10f)
        curveTo(4.5f, 6.13401f, 7.63401f, 3f, 11.5f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 18.5f)
        horizontalLineTo(3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 20.5f)
        curveTo(13f, 21.3284f, 12.3284f, 22f, 11.5f, 22f)
        moveTo(10f, 20.5f)
        curveTo(10f, 21.3284f, 10.6716f, 22f, 11.5f, 22f)
        moveTo(11.5f, 22f)
        verticalLineTo(20.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 3.5f)
        lineTo(19.5f, 7.5f)
        moveTo(21f, 5.5f)
        curveTo(21f, 3.567f, 19.433f, 2f, 17.5f, 2f)
        curveTo(15.567f, 2f, 14f, 3.567f, 14f, 5.5f)
        curveTo(14f, 7.433f, 15.567f, 9f, 17.5f, 9f)
        curveTo(19.433f, 9f, 21f, 7.433f, 21f, 5.5f)
        }
        }.build()

        return _notificationBlock02!!
    }

private var _notificationBlock02: ImageVector? = null
