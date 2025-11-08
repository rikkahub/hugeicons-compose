package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CalendarCheckOut01: ImageVector
    get() {
        if (_calendarCheckOut01 != null) {
            return _calendarCheckOut01!!
        }
        _calendarCheckOut01 = ImageVector.Builder(
            name = "CalendarCheckOut01",
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
        moveTo(21f, 15f)
        verticalLineTo(12f)
        curveTo(21f, 8.22876f, 21f, 6.34315f, 19.8284f, 5.17157f)
        curveTo(18.6569f, 4f, 16.7712f, 4f, 13f, 4f)
        horizontalLineTo(11f)
        curveTo(7.22876f, 4f, 5.34315f, 4f, 4.17157f, 5.17157f)
        curveTo(3f, 6.34315f, 3f, 8.22876f, 3f, 12f)
        verticalLineTo(14f)
        curveTo(3f, 17.7712f, 3f, 19.6569f, 4.17157f, 20.8284f)
        curveTo(5.34315f, 22f, 7.22876f, 22f, 11f, 22f)
        horizontalLineTo(12f)
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
        moveTo(18.5f, 22f)
        curveTo(19.0057f, 21.5085f, 21f, 20.2002f, 21f, 19.5f)
        curveTo(21f, 18.7998f, 19.0057f, 17.4915f, 18.5f, 17f)
        moveTo(20.5f, 19.5f)
        horizontalLineTo(14f)
        }
        }.build()

        return _calendarCheckOut01!!
    }

private var _calendarCheckOut01: ImageVector? = null
