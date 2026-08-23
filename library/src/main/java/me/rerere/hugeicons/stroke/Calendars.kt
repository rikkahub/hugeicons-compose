package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Calendars: ImageVector
    get() {
        if (_calendars != null) {
            return _calendars!!
        }
        _calendars = ImageVector.Builder(
            name = "Calendars",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(8f, 11.5002f)
            verticalLineTo(9.50024f)
            curveTo(8f, 6.67182f, 8f, 5.2576f, 8.87868f, 4.37892f)
            curveTo(9.75736f, 3.50024f, 11.1716f, 3.50024f, 14f, 3.50024f)
            horizontalLineTo(16f)
            curveTo(18.8284f, 3.50024f, 20.2426f, 3.50024f, 21.1213f, 4.37892f)
            curveTo(22f, 5.2576f, 22f, 6.67182f, 22f, 9.50024f)
            verticalLineTo(11.5002f)
            curveTo(22f, 14.3287f, 22f, 15.7429f, 21.1213f, 16.6216f)
            curveTo(20.2426f, 17.5002f, 18.8284f, 17.5002f, 16f, 17.5002f)
            horizontalLineTo(14f)
            curveTo(11.1716f, 17.5002f, 9.75736f, 17.5002f, 8.87868f, 16.6216f)
            curveTo(8f, 15.7429f, 8f, 14.3287f, 8f, 11.5002f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(4.5f, 8.14136f)
            curveTo(3.79231f, 8.25986f, 3.27972f, 8.47786f, 2.87868f, 8.8789f)
            curveTo(2f, 9.75758f, 2f, 11.1718f, 2f, 14.0002f)
            verticalLineTo(16.0002f)
            curveTo(2f, 18.8286f, 2f, 20.2429f, 2.87868f, 21.1215f)
            curveTo(3.75736f, 22.0002f, 5.17157f, 22.0002f, 8f, 22.0002f)
            horizontalLineTo(10f)
            curveTo(12.8284f, 22.0002f, 14.2426f, 22.0002f, 15.1213f, 21.1215f)
            curveTo(15.1607f, 21.0822f, 15.1982f, 21.0418f, 15.2341f, 21.0002f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(8f, 9.00024f)
            horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12f, 2.00024f)
            verticalLineTo(5.00024f)
            moveTo(18f, 2.00024f)
            verticalLineTo(5.00024f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(2f, 13.5002f)
            horizontalLineTo(4.5f)
        }
        }.build()

        return _calendars!!
    }

private var _calendars: ImageVector? = null
