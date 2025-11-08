package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.HomeWifi: ImageVector
    get() {
        if (_homeWifi != null) {
            return _homeWifi!!
        }
        _homeWifi = ImageVector.Builder(
            name = "HomeWifi",
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
        moveTo(19.7292f, 11.9f)
        curveTo(20.0103f, 9.95968f, 20.1398f, 8.96204f, 19.7823f, 8.07444f)
        curveTo(19.4131f, 7.15801f, 18.5941f, 6.53099f, 16.956f, 5.27696f)
        lineTo(15.7322f, 4.34f)
        curveTo(13.6945f, 2.78f, 12.6756f, 2f, 11.5f, 2f)
        curveTo(10.3244f, 2f, 9.30555f, 2.78f, 7.26784f, 4.34f)
        lineTo(6.04397f, 5.27696f)
        curveTo(4.40592f, 6.53099f, 3.5869f, 7.15801f, 3.21774f, 8.07444f)
        curveTo(2.84858f, 8.99087f, 2.99862f, 10.0246f, 3.29868f, 12.0921f)
        lineTo(3.55456f, 13.8552f)
        curveTo(3.97994f, 16.786f, 4.19263f, 18.2515f, 5.18535f, 19.1257f)
        curveTo(6.17807f, 20f, 7.62938f, 20f, 10.532f, 20f)
        horizontalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 16.4778f)
        curveTo(14.1488f, 15.5431f, 15.5209f, 15f, 16.9946f, 15f)
        curveTo(18.4729f, 15f, 19.849f, 15.5466f, 21f, 16.4866f)
        moveTo(19.1743f, 19f)
        curveTo(18.5182f, 18.5909f, 17.7779f, 18.3607f, 16.9946f, 18.3607f)
        curveTo(16.2152f, 18.3607f, 15.4784f, 18.5886f, 14.8248f, 18.9938f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 22f)
        horizontalLineTo(17.0064f)
        }
        }.build()

        return _homeWifi!!
    }

private var _homeWifi: ImageVector? = null
