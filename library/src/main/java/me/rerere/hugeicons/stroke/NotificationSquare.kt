package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.NotificationSquare: ImageVector
    get() {
        if (_notificationSquare != null) {
            return _notificationSquare!!
        }
        _notificationSquare = ImageVector.Builder(
            name = "NotificationSquare",
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
        moveTo(11.5f, 3.5f)
        horizontalLineTo(10.5f)
        curveTo(6.72876f, 3.5f, 4.84315f, 3.5f, 3.67157f, 4.67157f)
        curveTo(2.5f, 5.84315f, 2.5f, 7.72876f, 2.5f, 11.5f)
        verticalLineTo(13.5f)
        curveTo(2.5f, 17.2712f, 2.5f, 19.1569f, 3.67157f, 20.3284f)
        curveTo(4.84315f, 21.5f, 6.72876f, 21.5f, 10.5f, 21.5f)
        lineTo(12.5f, 21.5f)
        curveTo(16.2712f, 21.5f, 18.1569f, 21.5f, 19.3284f, 20.3284f)
        curveTo(20.5f, 19.1569f, 20.5f, 17.2712f, 20.5f, 13.5f)
        verticalLineTo(12.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.5f, 6f)
        curveTo(21.5f, 7.933f, 19.933f, 9.5f, 18f, 9.5f)
        curveTo(16.067f, 9.5f, 14.5f, 7.933f, 14.5f, 6f)
        curveTo(14.5f, 4.067f, 16.067f, 2.5f, 18f, 2.5f)
        curveTo(19.933f, 2.5f, 21.5f, 4.067f, 21.5f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 12.5f)
        horizontalLineTo(11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 16.5f)
        horizontalLineTo(15.5f)
        }
        }.build()

        return _notificationSquare!!
    }

private var _notificationSquare: ImageVector? = null
