package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Sheriff01: ImageVector
    get() {
        if (_sheriff01 != null) {
            return _sheriff01!!
        }
        _sheriff01 = ImageVector.Builder(
            name = "Sheriff01",
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
        moveTo(2f, 8f)
        curveTo(5.47582f, 13.3333f, 18.5242f, 13.3333f, 22f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 10f)
        lineTo(7.125f, 2.9922f)
        curveTo(7.76866f, 0.869541f, 9.27521f, 2.71887f, 10.5965f, 3.33984f)
        curveTo(11.4745f, 3.75243f, 12.5255f, 3.75243f, 13.4035f, 3.33984f)
        curveTo(14.7248f, 2.71887f, 16.2313f, 0.869541f, 16.875f, 2.9922f)
        lineTo(19f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 11f)
        curveTo(19f, 13.808f, 18.6968f, 16.4602f, 16.4312f, 18.0121f)
        curveTo(14.5873f, 19.2751f, 10.8574f, 19.3382f, 10f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 11f)
        curveTo(5f, 13.808f, 5.30317f, 16.4602f, 7.56884f, 18.0121f)
        curveTo(9.41265f, 19.2751f, 13.1426f, 19.3382f, 14f, 22f)
        }
        }.build()

        return _sheriff01!!
    }

private var _sheriff01: ImageVector? = null
