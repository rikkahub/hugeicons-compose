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

val HugeIcons.AlarmClockOff: ImageVector
    get() {
        if (_alarmClockOff != null) {
            return _alarmClockOff!!
        }
        _alarmClockOff = ImageVector.Builder(
            name = "AlarmClockOff",
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
            moveTo(9.40379f, 4.40379f)
            curveTo(10.2222f, 4.14157f, 11.0946f, 4f, 12f, 4f)
            curveTo(16.6944f, 4f, 20.5f, 7.80558f, 20.5f, 12.5f)
            curveTo(20.5f, 13.4054f, 20.3584f, 14.2778f, 20.0962f, 15.0962f)
            moveTo(6.24476f, 6.24476f)
            curveTo(4.5573f, 7.79814f, 3.5f, 10.0256f, 3.5f, 12.5f)
            curveTo(3.5f, 17.1944f, 7.30558f, 21f, 12f, 21f)
            curveTo(14.4744f, 21f, 16.7019f, 19.9427f, 18.2552f, 18.2552f)
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
            moveTo(5.88f, 18.7031f)
            lineTo(3.5f, 21.0031f)
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
            moveTo(2f, 2f)
            lineTo(22f, 22f)
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
            moveTo(4f, 4f)
            lineTo(2f, 6f)
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
            moveTo(22f, 6f)
            lineTo(19f, 3f)
        }
        }.build()

        return _alarmClockOff!!
    }

private var _alarmClockOff: ImageVector? = null
