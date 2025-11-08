package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Iconjar: ImageVector
    get() {
        if (_iconjar != null) {
            return _iconjar!!
        }
        _iconjar = ImageVector.Builder(
            name = "Iconjar",
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
        moveTo(4.17911f, 15.9319f)
        lineTo(5.26287f, 19.3081f)
        curveTo(5.6795f, 20.6061f, 5.88782f, 21.255f, 6.40449f, 21.6275f)
        curveTo(6.92116f, 22.0001f, 7.61293f, 22.0001f, 8.99648f, 22.0001f)
        horizontalLineTo(15.0035f)
        curveTo(16.3871f, 22.0001f, 17.0788f, 22.0001f, 17.5955f, 21.6275f)
        curveTo(18.1122f, 21.255f, 18.3205f, 20.6061f, 18.7371f, 19.3081f)
        lineTo(19.8209f, 15.9319f)
        curveTo(20.3904f, 14.1577f, 19.5645f, 12.2395f, 17.873f, 11.4075f)
        curveTo(18.6821f, 10.91f, 19.0866f, 10.6613f, 19.2065f, 10.4717f)
        curveTo(19.5127f, 9.98757f, 19.3266f, 9.34921f, 18.8061f, 9.09831f)
        curveTo(18.6023f, 9.00006f, 18.1253f, 9.00006f, 17.1712f, 9.00006f)
        curveTo(16.2171f, 9.00009f, 14.9135f, 9.33644f, 15.7906f, 12.1645f)
        curveTo(16.9592f, 15.9319f, 15.9104f, 17.079f, 14.4226f, 17.2488f)
        curveTo(12.9348f, 17.4185f, 10.9873f, 15.9919f, 12.337f, 13.5034f)
        curveTo(13.8777f, 10.6627f, 11.7545f, 9.00012f, 10.6272f, 9.00012f)
        lineTo(6.82879f, 9.00006f)
        curveTo(5.87472f, 9.00006f, 5.39768f, 9.00006f, 5.19389f, 9.09831f)
        curveTo(4.67345f, 9.34921f, 4.48735f, 9.98757f, 4.79351f, 10.4717f)
        curveTo(4.91339f, 10.6613f, 5.31792f, 10.91f, 6.12697f, 11.4075f)
        curveTo(4.43546f, 12.2395f, 3.60962f, 14.1577f, 4.17911f, 15.9319f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.9987f, 3.02603f)
        curveTo(13.9987f, 2.17604f, 12.8279f, 2f, 12f, 2f)
        curveTo(11.1721f, 2f, 10.0013f, 2.17604f, 10.0013f, 3.02603f)
        curveTo(10.0013f, 3.52211f, 10.4001f, 4.13811f, 10.8968f, 4.56508f)
        horizontalLineTo(8.03364f)
        curveTo(6.80772f, 4.56508f, 5.4553f, 5.83138f, 5f, 7f)
        horizontalLineTo(19f)
        curveTo(18.5447f, 5.83138f, 17.1923f, 4.56508f, 15.9664f, 4.56508f)
        horizontalLineTo(13.1032f)
        curveTo(13.5999f, 4.13811f, 13.9987f, 3.52211f, 13.9987f, 3.02603f)
        }
        }.build()

        return _iconjar!!
    }

private var _iconjar: ImageVector? = null
