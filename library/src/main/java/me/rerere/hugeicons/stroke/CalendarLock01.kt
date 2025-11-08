package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CalendarLock01: ImageVector
    get() {
        if (_calendarLock01 != null) {
            return _calendarLock01!!
        }
        _calendarLock01 = ImageVector.Builder(
            name = "CalendarLock01",
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
        moveTo(21f, 12f)
        curveTo(21f, 8.22876f, 21f, 6.34315f, 19.8284f, 5.17157f)
        curveTo(18.6569f, 4f, 16.7712f, 4f, 13f, 4f)
        horizontalLineTo(11f)
        curveTo(7.22876f, 4f, 5.34315f, 4f, 4.17157f, 5.17157f)
        curveTo(3f, 6.34315f, 3f, 8.22876f, 3f, 12f)
        verticalLineTo(14f)
        curveTo(3f, 17.7712f, 3f, 19.6569f, 4.17157f, 20.8284f)
        curveTo(5.34315f, 22f, 7.22876f, 22f, 11f, 22f)
        horizontalLineTo(11.5f)
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
        moveTo(15.7355f, 16.1747f)
        lineTo(15.7354f, 14.7843f)
        curveTo(15.7354f, 14.5789f, 15.744f, 14.371f, 15.8176f, 14.1792f)
        curveTo(16.0136f, 13.6688f, 16.5326f, 13f, 17.4776f, 13f)
        curveTo(18.4225f, 13f, 18.962f, 13.6688f, 19.1579f, 14.1792f)
        curveTo(19.2315f, 14.371f, 19.2401f, 14.5789f, 19.2401f, 14.7843f)
        lineTo(19.2401f, 16.1747f)
        moveTo(15.805f, 21.9976f)
        horizontalLineTo(19.191f)
        curveTo(20.1878f, 21.9976f, 20.9959f, 21.191f, 20.9959f, 20.196f)
        verticalLineTo(18.1947f)
        curveTo(20.9959f, 17.1997f, 20.1878f, 16.3931f, 19.191f, 16.3931f)
        horizontalLineTo(15.805f)
        curveTo(14.8081f, 16.3931f, 14f, 17.1997f, 14f, 18.1947f)
        verticalLineTo(20.196f)
        curveTo(14f, 21.191f, 14.8081f, 21.9976f, 15.805f, 21.9976f)
        }
        }.build()

        return _calendarLock01!!
    }

private var _calendarLock01: ImageVector? = null
