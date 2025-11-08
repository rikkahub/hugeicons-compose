package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Lamp: ImageVector
    get() {
        if (_lamp != null) {
            return _lamp!!
        }
        _lamp = ImageVector.Builder(
            name = "Lamp",
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
        moveTo(12f, 2f)
        curveTo(13.6348f, 2f, 14.4522f, 2f, 15.1648f, 2.28954f)
        curveTo(15.5483f, 2.44535f, 15.9052f, 2.66072f, 16.2227f, 2.92783f)
        curveTo(16.8128f, 3.42423f, 17.1996f, 4.15077f, 17.9732f, 5.60384f)
        lineTo(18.7735f, 7.10708f)
        curveTo(20.174f, 9.73759f, 20.8743f, 11.0528f, 20.2973f, 12.0264f)
        curveTo(19.7203f, 13f, 18.2406f, 13f, 15.2811f, 13f)
        horizontalLineTo(8.71885f)
        curveTo(5.75941f, 13f, 4.27968f, 13f, 3.7027f, 12.0264f)
        curveTo(3.12572f, 11.0528f, 3.82597f, 9.73758f, 5.22647f, 7.10708f)
        lineTo(6.02681f, 5.60384f)
        curveTo(6.80043f, 4.15076f, 7.18725f, 3.42423f, 7.77728f, 2.92783f)
        curveTo(8.09479f, 2.66072f, 8.45174f, 2.44535f, 8.83521f, 2.28954f)
        curveTo(9.54784f, 2f, 10.3652f, 2f, 12f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 13f)
        verticalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.45585f, 20.2991f)
        curveTo(9.72509f, 19.8443f, 9.85972f, 19.6168f, 10.0568f, 19.4477f)
        curveTo(10.2568f, 19.276f, 10.5028f, 19.1476f, 10.7739f, 19.0733f)
        curveTo(11.0411f, 19f, 11.3421f, 19f, 11.944f, 19f)
        horizontalLineTo(12.0562f)
        curveTo(12.6582f, 19f, 12.9592f, 19f, 13.2263f, 19.0733f)
        curveTo(13.4976f, 19.1476f, 13.7436f, 19.2761f, 13.9437f, 19.4479f)
        curveTo(14.1407f, 19.617f, 14.2753f, 19.8445f, 14.5444f, 20.2994f)
        curveTo(14.8656f, 20.8422f, 15.0262f, 21.1136f, 14.9965f, 21.3346f)
        curveTo(14.9666f, 21.5571f, 14.8206f, 21.7567f, 14.5984f, 21.8787f)
        curveTo(14.3777f, 22f, 14.0186f, 22f, 13.3003f, 22f)
        horizontalLineTo(10.6999f)
        curveTo(9.98144f, 22f, 9.6222f, 22f, 9.40146f, 21.8787f)
        curveTo(9.17933f, 21.7566f, 9.03337f, 21.557f, 9.00349f, 21.3346f)
        curveTo(8.97379f, 21.1135f, 9.13448f, 20.8421f, 9.45585f, 20.2991f)
        }
        }.build()

        return _lamp!!
    }

private var _lamp: ImageVector? = null
