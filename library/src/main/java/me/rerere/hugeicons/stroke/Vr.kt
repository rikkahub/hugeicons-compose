package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Vr: ImageVector
    get() {
        if (_vr != null) {
            return _vr!!
        }
        _vr = ImageVector.Builder(
            name = "Vr",
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
        moveTo(7f, 3f)
        horizontalLineTo(17f)
        curveTo(18.8692f, 3f, 19.8038f, 3f, 20.5f, 3.40192f)
        curveTo(20.9561f, 3.66523f, 21.3348f, 4.04394f, 21.5981f, 4.5f)
        curveTo(22f, 5.19615f, 22f, 6.13077f, 22f, 8f)
        curveTo(22f, 9.86923f, 22f, 10.8038f, 21.5981f, 11.5f)
        curveTo(21.3348f, 11.9561f, 20.9561f, 12.3348f, 20.5f, 12.5981f)
        curveTo(19.8038f, 13f, 18.8692f, 13f, 17f, 13f)
        horizontalLineTo(16.6063f)
        curveTo(15.9194f, 13f, 15.5759f, 13f, 15.2546f, 12.9286f)
        curveTo(14.8244f, 12.8331f, 14.4206f, 12.6439f, 14.0718f, 12.3746f)
        curveTo(13.8112f, 12.1734f, 13.5913f, 11.9096f, 13.1516f, 11.3819f)
        curveTo(12.8012f, 10.9614f, 12.626f, 10.7512f, 12.4249f, 10.6568f)
        curveTo(12.1557f, 10.5305f, 11.8443f, 10.5305f, 11.5751f, 10.6568f)
        curveTo(11.374f, 10.7512f, 11.1988f, 10.9614f, 10.8484f, 11.3819f)
        curveTo(10.4087f, 11.9096f, 10.1888f, 12.1734f, 9.92823f, 12.3746f)
        curveTo(9.57943f, 12.6439f, 9.17559f, 12.8331f, 8.74542f, 12.9286f)
        curveTo(8.42406f, 13f, 8.08061f, 13f, 7.39369f, 13f)
        horizontalLineTo(7f)
        curveTo(5.13077f, 13f, 4.19615f, 13f, 3.5f, 12.5981f)
        curveTo(3.04394f, 12.3348f, 2.66523f, 11.9561f, 2.40192f, 11.5f)
        curveTo(2f, 10.8038f, 2f, 9.86923f, 2f, 8f)
        curveTo(2f, 6.13077f, 2f, 5.19615f, 2.40192f, 4.5f)
        curveTo(2.66523f, 4.04394f, 3.04394f, 3.66523f, 3.5f, 3.40192f)
        curveTo(4.19615f, 3f, 5.13077f, 3f, 7f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 6f)
        horizontalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.1006f, 19f)
        lineTo(10.0803f, 17f)
        moveTo(12.1006f, 19f)
        lineTo(10.0803f, 21f)
        moveTo(12.1006f, 19f)
        curveTo(7.05072f, 19f, 2.8089f, 17f, 2f, 15f)
        moveTo(15.1311f, 18.7711f)
        curveTo(18.6024f, 18.2314f, 21.2663f, 16.7892f, 22f, 15f)
        }
        }.build()

        return _vr!!
    }

private var _vr: ImageVector? = null
