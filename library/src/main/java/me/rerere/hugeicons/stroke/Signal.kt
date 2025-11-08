package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Signal: ImageVector
    get() {
        if (_signal != null) {
            return _signal!!
        }
        _signal = ImageVector.Builder(
            name = "Signal",
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
        moveTo(12.0357f, 21.9286f)
        curveTo(17.5388f, 21.9286f, 22f, 17.4674f, 22f, 11.9643f)
        curveTo(22f, 6.46117f, 17.5388f, 2f, 12.0357f, 2f)
        curveTo(6.53258f, 2f, 2.07141f, 6.46117f, 2.07141f, 11.9643f)
        curveTo(2.07141f, 13.7792f, 1.72192f, 15.4808f, 2.56974f, 16.9464f)
        lineTo(2.07141f, 21.9286f)
        lineTo(7.05356f, 21.4304f)
        curveTo(8.51918f, 22.2782f, 10.2208f, 21.9286f, 12.0357f, 21.9286f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 19f)
        curveTo(15.866f, 19f, 19f, 15.866f, 19f, 12f)
        curveTo(19f, 8.13401f, 15.866f, 5f, 12f, 5f)
        curveTo(8.13401f, 5f, 5f, 8.13401f, 5f, 12f)
        curveTo(5f, 13.275f, 5.4044f, 14.4704f, 6f, 15.5f)
        lineTo(5f, 19f)
        lineTo(8.5f, 18f)
        curveTo(9.52961f, 18.5956f, 10.725f, 19f, 12f, 19f)
        }
        }.build()

        return _signal!!
    }

private var _signal: ImageVector? = null
