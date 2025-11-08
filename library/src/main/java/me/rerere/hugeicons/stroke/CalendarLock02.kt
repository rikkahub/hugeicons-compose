package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CalendarLock02: ImageVector
    get() {
        if (_calendarLock02 != null) {
            return _calendarLock02!!
        }
        _calendarLock02 = ImageVector.Builder(
            name = "CalendarLock02",
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
        moveTo(16f, 2f)
        verticalLineTo(6f)
        moveTo(8f, 2f)
        verticalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 4f)
        horizontalLineTo(11f)
        curveTo(7.22876f, 4f, 5.34315f, 4f, 4.17157f, 5.17157f)
        curveTo(3f, 6.34315f, 3f, 8.22876f, 3f, 12f)
        verticalLineTo(14f)
        curveTo(3f, 17.7712f, 3f, 19.6569f, 4.17157f, 20.8284f)
        curveTo(5.34315f, 22f, 7.22876f, 22f, 11f, 22f)
        horizontalLineTo(13f)
        curveTo(16.7712f, 22f, 18.6569f, 22f, 19.8284f, 20.8284f)
        curveTo(21f, 19.6569f, 21f, 17.7712f, 21f, 14f)
        verticalLineTo(12f)
        curveTo(21f, 8.22876f, 21f, 6.34315f, 19.8284f, 5.17157f)
        curveTo(18.6569f, 4f, 16.7712f, 4f, 13f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 10f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.484f, 15f)
        verticalLineTo(14.0073f)
        curveTo(10.484f, 13.1748f, 11.1588f, 12.5f, 11.9912f, 12.5f)
        curveTo(12.8236f, 12.5f, 13.4985f, 13.1748f, 13.4985f, 14.0072f)
        verticalLineTo(15f)
        moveTo(10.5525f, 15.4987f)
        lineTo(13.4475f, 15.4977f)
        curveTo(14.3049f, 15.4977f, 15f, 16.1689f, 15f, 16.997f)
        verticalLineTo(17.9983f)
        curveTo(15f, 18.8264f, 14.3049f, 19.4976f, 13.4475f, 19.4976f)
        lineTo(10.5525f, 19.4986f)
        curveTo(9.69509f, 19.4986f, 9f, 18.8273f, 9f, 17.9993f)
        verticalLineTo(16.9979f)
        curveTo(9f, 16.1699f, 9.69509f, 15.4987f, 10.5525f, 15.4987f)
        }
        }.build()

        return _calendarLock02!!
    }

private var _calendarLock02: ImageVector? = null
