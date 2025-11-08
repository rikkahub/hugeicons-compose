package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Mouse14: ImageVector
    get() {
        if (_mouse14 != null) {
            return _mouse14!!
        }
        _mouse14 = ImageVector.Builder(
            name = "Mouse14",
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
        moveTo(22f, 6.16705f)
        curveTo(21.5817f, 6.96357f, 20.6554f, 7.23648f, 19.931f, 6.77661f)
        lineTo(17.7448f, 5.38882f)
        curveTo(16.0959f, 4.34208f, 15.2714f, 3.81871f, 14.4634f, 4.05676f)
        curveTo(13.906f, 4.22097f, 13.5066f, 4.70326f, 13f, 5.58178f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.1851f, 18.9941f)
        curveTo(9.48005f, 21.4312f, 12.2743f, 19.1116f, 14.3687f, 15.5464f)
        curveTo(16.463f, 11.9811f, 17.1098f, 8.44303f, 12.8149f, 6.00594f)
        curveTo(8.51993f, 3.56885f, 5.72575f, 5.8884f, 3.63136f, 9.45367f)
        curveTo(1.53697f, 13.0189f, 0.890156f, 16.557f, 5.1851f, 18.9941f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.4883f, 7.99805f)
        lineTo(10.4883f, 9.7301f)
        }
        }.build()

        return _mouse14!!
    }

private var _mouse14: ImageVector? = null
