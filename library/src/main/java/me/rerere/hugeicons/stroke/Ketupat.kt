package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Ketupat: ImageVector
    get() {
        if (_ketupat != null) {
            return _ketupat!!
        }
        _ketupat = ImageVector.Builder(
            name = "Ketupat",
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
        moveTo(17.7749f, 9.6488f)
        lineTo(15.8493f, 7.72321f)
        curveTo(14.0338f, 5.90774f, 13.1261f, 5f, 11.9981f, 5f)
        curveTo(10.8701f, 5f, 9.96237f, 5.90774f, 8.1469f, 7.72321f)
        lineTo(6.2213f, 9.6488f)
        curveTo(4.40583f, 11.4643f, 3.49809f, 12.372f, 3.49809f, 13.5f)
        curveTo(3.49809f, 14.628f, 4.40583f, 15.5357f, 6.2213f, 17.3512f)
        lineTo(8.1469f, 19.2768f)
        curveTo(9.96237f, 21.0923f, 10.8701f, 22f, 11.9981f, 22f)
        curveTo(13.1261f, 22f, 14.0338f, 21.0923f, 15.8493f, 19.2768f)
        lineTo(17.7749f, 17.3512f)
        curveTo(19.5904f, 15.5357f, 20.4981f, 14.628f, 20.4981f, 13.5f)
        curveTo(20.4981f, 12.372f, 19.5904f, 11.4643f, 17.7749f, 9.6488f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.7481f, 8.75f)
        lineTo(11.9981f, 13.5f)
        moveTo(11.9981f, 13.5f)
        lineTo(7.24809f, 18.25f)
        moveTo(11.9981f, 13.5f)
        lineTo(7.24809f, 8.75f)
        moveTo(11.9981f, 13.5f)
        lineTo(16.7481f, 18.25f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 2f)
        curveTo(12.6f, 2.24f, 12f, 4.3f, 12f, 5f)
        curveTo(11.8333f, 4.4f, 11f, 3.2f, 9f, 3.2f)
        }
        }.build()

        return _ketupat!!
    }

private var _ketupat: ImageVector? = null
