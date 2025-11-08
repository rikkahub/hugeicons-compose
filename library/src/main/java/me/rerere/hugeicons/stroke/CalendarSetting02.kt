package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CalendarSetting02: ImageVector
    get() {
        if (_calendarSetting02 != null) {
            return _calendarSetting02!!
        }
        _calendarSetting02 = ImageVector.Builder(
            name = "CalendarSetting02",
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
        moveTo(12f, 18f)
        lineTo(12f, 19.5f)
        moveTo(12f, 18f)
        curveTo(12.737f, 18f, 13.3809f, 17.6013f, 13.7278f, 17.0079f)
        moveTo(12f, 18f)
        curveTo(11.263f, 18f, 10.6191f, 17.6013f, 10.2722f, 17.0079f)
        moveTo(12f, 14f)
        lineTo(12f, 12.5f)
        moveTo(12f, 14f)
        curveTo(12.737f, 14f, 13.3809f, 14.3987f, 13.7278f, 14.9921f)
        moveTo(12f, 14f)
        curveTo(11.263f, 14f, 10.6191f, 14.3987f, 10.2722f, 14.9921f)
        moveTo(15f, 14.25f)
        lineTo(13.7278f, 14.9921f)
        moveTo(9f, 17.75f)
        lineTo(10.2722f, 17.0079f)
        moveTo(15f, 17.75f)
        lineTo(13.7278f, 17.0079f)
        moveTo(9f, 14.25f)
        lineTo(10.2722f, 14.9921f)
        moveTo(13.7278f, 17.0079f)
        curveTo(13.9009f, 16.7119f, 14f, 16.3676f, 14f, 16f)
        curveTo(14f, 15.6324f, 13.9009f, 15.288f, 13.7278f, 14.9921f)
        moveTo(10.2722f, 14.9921f)
        curveTo(10.0992f, 15.288f, 10f, 15.6324f, 10f, 16f)
        curveTo(10f, 16.3676f, 10.0991f, 16.712f, 10.2722f, 17.0079f)
        }
        }.build()

        return _calendarSetting02!!
    }

private var _calendarSetting02: ImageVector? = null
