package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CovidInfo: ImageVector
    get() {
        if (_covidInfo != null) {
            return _covidInfo!!
        }
        _covidInfo = ImageVector.Builder(
            name = "CovidInfo",
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
        moveTo(14.5269f, 15.0816f)
        curveTo(18.5281f, 12.0136f, 17.8948f, 8.61324f, 16.0422f, 7.51869f)
        curveTo(14.5897f, 6.66047f, 13.3219f, 7.00632f, 12.5603f, 7.55723f)
        curveTo(12.248f, 7.78311f, 12.0919f, 7.89605f, 12f, 7.89605f)
        curveTo(11.9081f, 7.89605f, 11.752f, 7.78311f, 11.4397f, 7.55723f)
        curveTo(10.6781f, 7.00632f, 9.41034f, 6.66047f, 7.95778f, 7.51869f)
        curveTo(6.11193f, 8.60928f, 5.64895f, 12.1138f, 9.61321f, 15.1813f)
        curveTo(10.37f, 15.7669f, 11.1711f, 16.2935f, 12f, 16.7713f)
        curveTo(13.7788f, 17.7965f, 16.4168f, 19f, 19f, 19f)
        moveTo(5f, 19f)
        curveTo(6.54872f, 19f, 8.11718f, 18.5674f, 9.50835f, 18f)
        }
        }.build()

        return _covidInfo!!
    }

private var _covidInfo: ImageVector? = null
