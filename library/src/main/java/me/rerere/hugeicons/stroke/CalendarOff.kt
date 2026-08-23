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

val HugeIcons.CalendarOff: ImageVector
    get() {
        if (_calendarOff != null) {
            return _calendarOff!!
        }
        _calendarOff = ImageVector.Builder(
            name = "CalendarOff",
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
            moveTo(16f, 2f)
            verticalLineTo(6f)
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
            moveTo(9.00857f, 4.00857f)
            curveTo(9.60705f, 4f, 10.268f, 4f, 11f, 4f)
            horizontalLineTo(13f)
            curveTo(16.7712f, 4f, 18.6569f, 4f, 19.8284f, 5.17157f)
            curveTo(21f, 6.34315f, 21f, 8.22876f, 21f, 12f)
            verticalLineTo(14f)
            curveTo(21f, 14.732f, 21f, 15.393f, 20.9914f, 15.9914f)
            moveTo(4.73134f, 4.73134f)
            curveTo(4.52726f, 4.85573f, 4.34187f, 5.00127f, 4.17157f, 5.17157f)
            curveTo(3f, 6.34315f, 3f, 8.22876f, 3f, 12f)
            verticalLineTo(14f)
            curveTo(3f, 17.7712f, 3f, 19.6569f, 4.17157f, 20.8284f)
            curveTo(5.34315f, 22f, 7.22876f, 22f, 11f, 22f)
            horizontalLineTo(13f)
            curveTo(16.7712f, 22f, 18.6569f, 22f, 19.8284f, 20.8284f)
            curveTo(19.9987f, 20.6581f, 20.1443f, 20.4727f, 20.2687f, 20.2687f)
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
            moveTo(3f, 10f)
            horizontalLineTo(10f)
            moveTo(21f, 10f)
            horizontalLineTo(15f)
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
        }.build()

        return _calendarOff!!
    }

private var _calendarOff: ImageVector? = null
