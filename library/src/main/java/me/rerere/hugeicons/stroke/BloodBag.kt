package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BloodBag: ImageVector
    get() {
        if (_bloodBag != null) {
            return _bloodBag!!
        }
        _bloodBag = ImageVector.Builder(
            name = "BloodBag",
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
        moveTo(5f, 7.37225f)
        curveTo(13f, 3.24278f, 11.5f, 10.0046f, 19f, 7.37228f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 9f)
        curveTo(5f, 6.19108f, 5f, 4.78661f, 5.67412f, 3.77772f)
        curveTo(5.96596f, 3.34096f, 6.34096f, 2.96596f, 6.77772f, 2.67412f)
        curveTo(7.78661f, 2f, 9.19108f, 2f, 12f, 2f)
        curveTo(14.8089f, 2f, 16.2134f, 2f, 17.2223f, 2.67412f)
        curveTo(17.659f, 2.96596f, 18.034f, 3.34096f, 18.3259f, 3.77772f)
        curveTo(19f, 4.78661f, 19f, 6.19108f, 19f, 9f)
        verticalLineTo(11f)
        curveTo(19f, 13.8089f, 19f, 15.2134f, 18.3259f, 16.2223f)
        curveTo(18.034f, 16.659f, 17.659f, 17.034f, 17.2223f, 17.3259f)
        curveTo(16.2134f, 18f, 14.8089f, 18f, 12f, 18f)
        curveTo(9.19108f, 18f, 7.78661f, 18f, 6.77772f, 17.3259f)
        curveTo(6.34096f, 17.034f, 5.96596f, 16.659f, 5.67412f, 16.2223f)
        curveTo(5f, 15.2134f, 5f, 13.8089f, 5f, 11f)
        verticalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.0142f, 10f)
        lineTo(10.5736f, 11.4876f)
        curveTo(9.79996f, 12.3003f, 9.81331f, 13.6088f, 10.587f, 14.4077f)
        curveTo(11.3739f, 15.2066f, 12.6411f, 15.1928f, 13.4148f, 14.3939f)
        curveTo(14.2017f, 13.5812f, 14.1884f, 12.2727f, 13.4148f, 11.4738f)
        lineTo(12.0142f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 22f)
        curveTo(10.2091f, 22f, 12f, 20.2091f, 12f, 18f)
        }
        }.build()

        return _bloodBag!!
    }

private var _bloodBag: ImageVector? = null
