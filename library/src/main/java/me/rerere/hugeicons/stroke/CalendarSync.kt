package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CalendarSync: ImageVector
    get() {
        if (_calendarSync != null) {
            return _calendarSync!!
        }
        _calendarSync = ImageVector.Builder(
            name = "CalendarSync",
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
        moveTo(12f, 22f)
        horizontalLineTo(11f)
        curveTo(7.22876f, 22f, 5.34315f, 22f, 4.17157f, 20.8284f)
        curveTo(3f, 19.6569f, 3f, 17.7712f, 3f, 14f)
        verticalLineTo(12f)
        curveTo(3f, 8.22876f, 3f, 6.34315f, 4.17157f, 5.17157f)
        curveTo(5.34315f, 4f, 7.22876f, 4f, 11f, 4f)
        horizontalLineTo(13f)
        curveTo(16.7712f, 4f, 18.6569f, 4f, 19.8284f, 5.17157f)
        curveTo(20.8915f, 6.23467f, 20.99f, 7.8857f, 20.9991f, 11f)
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
        moveTo(14.385f, 15.7855f)
        curveTo(15.0271f, 14.4342f, 16.4044f, 13.5f, 18f, 13.5f)
        curveTo(19.4806f, 13.5f, 20.7733f, 14.3044f, 21.4649f, 15.5f)
        moveTo(14.385f, 15.7855f)
        curveTo(14.6833f, 16f, 15.1502f, 16f, 16f, 16f)
        horizontalLineTo(17f)
        moveTo(14.385f, 15.7855f)
        curveTo(14.3524f, 15.762f, 14.3218f, 15.736f, 14.2929f, 15.7071f)
        curveTo(14f, 15.4142f, 14f, 14.9428f, 14f, 14f)
        verticalLineTo(13f)
        moveTo(21.615f, 19.2145f)
        curveTo(20.9729f, 20.5658f, 19.5956f, 21.5f, 18f, 21.5f)
        curveTo(16.5194f, 21.5f, 15.2267f, 20.6956f, 14.5351f, 19.5f)
        moveTo(21.615f, 19.2145f)
        curveTo(21.3166f, 19f, 20.8498f, 19f, 20f, 19f)
        horizontalLineTo(19f)
        moveTo(21.615f, 19.2145f)
        curveTo(21.6476f, 19.238f, 21.6782f, 19.264f, 21.7071f, 19.2929f)
        curveTo(22f, 19.5858f, 22f, 20.0572f, 22f, 21f)
        verticalLineTo(22f)
        }
        }.build()

        return _calendarSync!!
    }

private var _calendarSync: ImageVector? = null
