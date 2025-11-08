package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BoxingGlove01: ImageVector
    get() {
        if (_boxingGlove01 != null) {
            return _boxingGlove01!!
        }
        _boxingGlove01 = ImageVector.Builder(
            name = "BoxingGlove01",
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
        moveTo(5.98148f, 11.2453f)
        curveTo(5.89446f, 13.9678f, 9.10256f, 17.3235f, 12.1105f, 18.3784f)
        moveTo(5.98148f, 11.2453f)
        curveTo(5.67692f, 11.768f, 2.56612f, 14.2618f, 2.51173f, 15.3182f)
        curveTo(2.24816f, 17.416f, 5.81222f, 21.357f, 8.56025f, 21.4915f)
        curveTo(9.58647f, 21.6371f, 11.0099f, 19.9102f, 12.4528f, 18.6272f)
        curveTo(13.2475f, 17.9205f, 14.3928f, 17.7571f, 18.9772f, 16.6194f)
        curveTo(20.6408f, 16.3303f, 22.6394f, 13.4607f, 19.6766f, 11.0283f)
        moveTo(5.98148f, 11.2453f)
        curveTo(6.9097f, 9.04414f, 8.51438f, 4.78884f, 11.6614f, 3.10843f)
        curveTo(12.9394f, 2.3823f, 16.2588f, 1.71372f, 19.5114f, 4.80592f)
        curveTo(20.6304f, 5.74702f, 22.5701f, 7.80848f, 20.7647f, 10.1836f)
        curveTo(19.561f, 11.5864f, 17.741f, 11.1803f, 17.5642f, 13.6064f)
        }
        }.build()

        return _boxingGlove01!!
    }

private var _boxingGlove01: ImageVector? = null
