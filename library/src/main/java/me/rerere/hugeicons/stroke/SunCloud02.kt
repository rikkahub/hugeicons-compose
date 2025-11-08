package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SunCloud02: ImageVector
    get() {
        if (_sunCloud02 != null) {
            return _sunCloud02!!
        }
        _sunCloud02 = ImageVector.Builder(
            name = "SunCloud02",
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
        moveTo(17.4776f, 12.0001f)
        curveTo(17.485f, 12f, 17.4925f, 12f, 17.5f, 12f)
        curveTo(19.9853f, 12f, 22f, 14.0147f, 22f, 16.5f)
        curveTo(22f, 18.9853f, 19.9853f, 21f, 17.5f, 21f)
        horizontalLineTo(7f)
        curveTo(4.23858f, 21f, 2f, 18.7614f, 2f, 16f)
        curveTo(2f, 13.4003f, 3.98398f, 11.2641f, 6.52042f, 11.0227f)
        moveTo(17.4776f, 12.0001f)
        curveTo(17.4924f, 11.8354f, 17.5f, 11.6686f, 17.5f, 11.5f)
        curveTo(17.5f, 8.46243f, 15.0376f, 6f, 12f, 6f)
        curveTo(9.12324f, 6f, 6.76233f, 8.20862f, 6.52042f, 11.0227f)
        moveTo(17.4776f, 12.0001f)
        curveTo(17.3753f, 13.1345f, 16.9286f, 14.1696f, 16.2428f, 15f)
        moveTo(6.52042f, 11.0227f)
        curveTo(6.67826f, 11.0077f, 6.83823f, 11f, 7f, 11f)
        curveTo(8.12582f, 11f, 9.16474f, 11.3721f, 10.0005f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.95939f, 10.1937f)
        curveTo(2.21865f, 7.47179f, 3.85922f, 4.67397f, 6.6237f, 3.94463f)
        moveTo(2.95939f, 10.1937f)
        lineTo(2f, 10.4468f)
        moveTo(2.95939f, 10.1937f)
        curveTo(3.14359f, 10.8706f, 3.4577f, 11.479f, 3.86823f, 12f)
        moveTo(6.6237f, 3.94463f)
        lineTo(6.36663f, 3f)
        moveTo(6.6237f, 3.94463f)
        curveTo(8.66673f, 3.40563f, 10.7518f, 4.14719f, 12f, 5.66961f)
        moveTo(3.4765f, 6.32297f)
        lineTo(2.4644f, 5.74628f)
        moveTo(11.1407f, 3.45725f)
        lineTo(10.557f, 4.45494f)
        }
        }.build()

        return _sunCloud02!!
    }

private var _sunCloud02: ImageVector? = null
