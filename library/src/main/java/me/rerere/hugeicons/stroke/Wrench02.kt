package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Wrench02: ImageVector
    get() {
        if (_wrench02 != null) {
            return _wrench02!!
        }
        _wrench02 = ImageVector.Builder(
            name = "Wrench02",
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
        moveTo(18f, 7.10593f)
        curveTo(17.9999f, 8.55778f, 16.5891f, 9.89558f, 14.4697f, 11.9901f)
        curveTo(13.1062f, 13.3376f, 10.8936f, 13.336f, 9.52937f, 11.9892f)
        curveTo(7.41145f, 9.8961f, 5.99988f, 8.55754f, 6f, 7.10568f)
        curveTo(6.00012f, 5.65383f, 6.3543f, 5.36258f, 9.60848f, 2.14658f)
        curveTo(9.92161f, 1.83445f, 10.4602f, 2.05389f, 10.4602f, 2.49338f)
        lineTo(10.4604f, 5.80524f)
        curveTo(10.4604f, 6.64587f, 11.1488f, 7.32849f, 11.9994f, 7.32842f)
        curveTo(12.85f, 7.32835f, 13.5396f, 6.64688f, 13.5398f, 5.80625f)
        lineTo(13.5405f, 2.49435f)
        curveTo(13.5406f, 2.05485f, 14.0793f, 1.83532f, 14.3924f, 2.14739f)
        curveTo(17.646f, 5.36287f, 18.0001f, 5.65408f, 18f, 7.10593f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 12f)
        lineTo(15f, 19.1652f)
        curveTo(15f, 20.7308f, 13.6569f, 22f, 12f, 22f)
        curveTo(10.3431f, 22f, 9f, 20.7308f, 9f, 19.1652f)
        lineTo(9f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.0063f, 18.9995f)
        lineTo(12f, 19.0059f)
        }
        }.build()

        return _wrench02!!
    }

private var _wrench02: ImageVector? = null
