package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TimeHalfPass: ImageVector
    get() {
        if (_timeHalfPass != null) {
            return _timeHalfPass!!
        }
        _timeHalfPass = ImageVector.Builder(
            name = "TimeHalfPass",
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
        moveTo(8.76938f, 2.5f)
        curveTo(8.4973f, 2.59728f, 8.23058f, 2.70543f, 7.96979f, 2.8239f)
        moveTo(5.42501f, 4.46566f)
        curveTo(5.19851f, 4.66428f, 4.98106f, 4.87255f, 4.77334f, 5.08979f)
        moveTo(3.03178f, 7.56476f)
        curveTo(2.84599f, 7.93804f, 2.68313f, 8.32421f, 2.54498f, 8.72152f)
        moveTo(2.01608f, 11.3914f)
        curveTo(1.99387f, 11.7808f, 1.99471f, 12.1778f, 2.01835f, 12.5673f)
        moveTo(2.56845f, 15.2658f)
        curveTo(2.70147f, 15.6396f, 2.85641f, 16.0035f, 3.03178f, 16.3558f)
        moveTo(4.69086f, 18.7435f)
        curveTo(4.93508f, 19.005f, 5.19323f, 19.2539f, 5.46415f, 19.4891f)
        moveTo(7.77635f, 21.0064f)
        curveTo(8.17073f, 21.1954f, 8.57927f, 21.3606f, 9f, 21.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 13.5f)
        curveTo(12.8284f, 13.5f, 13.5f, 12.8284f, 13.5f, 12f)
        curveTo(13.5f, 11.1716f, 12.8284f, 10.5f, 12f, 10.5f)
        moveTo(12f, 13.5f)
        curveTo(11.1716f, 13.5f, 10.5f, 12.8284f, 10.5f, 12f)
        curveTo(10.5f, 11.1716f, 11.1716f, 10.5f, 12f, 10.5f)
        moveTo(12f, 13.5f)
        verticalLineTo(16f)
        moveTo(12f, 10.5f)
        verticalLineTo(6f)
        }
        }.build()

        return _timeHalfPass!!
    }

private var _timeHalfPass: ImageVector? = null
