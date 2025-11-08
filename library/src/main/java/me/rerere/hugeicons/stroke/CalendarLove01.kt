package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CalendarLove01: ImageVector
    get() {
        if (_calendarLove01 != null) {
            return _calendarLove01!!
        }
        _calendarLove01 = ImageVector.Builder(
            name = "CalendarLove01",
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
        curveTo(21f, 6.34315f, 21f, 8.22876f, 21f, 12f)
        verticalLineTo(12.5f)
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
        moveTo(17f, 22f)
        curveTo(17f, 22f, 21f, 20.1471f, 21f, 17.1389f)
        curveTo(21f, 15.9576f, 20.1579f, 15f, 19f, 15f)
        curveTo(18.0526f, 15f, 17.4211f, 15.4118f, 17f, 16.2353f)
        curveTo(16.5789f, 15.4118f, 15.9474f, 15f, 15f, 15f)
        curveTo(13.8421f, 15f, 13f, 15.9576f, 13f, 17.1389f)
        curveTo(13f, 20.1471f, 17f, 22f, 17f, 22f)
        }
        }.build()

        return _calendarLove01!!
    }

private var _calendarLove01: ImageVector? = null
