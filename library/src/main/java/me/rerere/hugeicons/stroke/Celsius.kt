package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Celsius: ImageVector
    get() {
        if (_celsius != null) {
            return _celsius!!
        }
        _celsius = ImageVector.Builder(
            name = "Celsius",
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
        moveTo(21f, 7f)
        curveTo(20.9557f, 6.3469f, 20.8561f, 5.88667f, 20.6321f, 5.5f)
        curveTo(20.3679f, 5.04394f, 19.9878f, 4.66523f, 19.5301f, 4.40192f)
        curveTo(18.8315f, 4f, 17.8936f, 4f, 16.0177f, 4f)
        curveTo(14.1419f, 4f, 13.2039f, 4f, 12.5053f, 4.40192f)
        curveTo(12.0476f, 4.66523f, 11.6676f, 5.04394f, 11.4033f, 5.5f)
        curveTo(11f, 6.19615f, 11f, 7.13077f, 11f, 9f)
        verticalLineTo(15f)
        curveTo(11f, 16.8692f, 11f, 17.8038f, 11.4033f, 18.5f)
        curveTo(11.6676f, 18.9561f, 12.0476f, 19.3348f, 12.5053f, 19.5981f)
        curveTo(13.2039f, 20f, 14.1419f, 20f, 16.0177f, 20f)
        curveTo(17.8936f, 20f, 18.8315f, 20f, 19.5301f, 19.5981f)
        curveTo(19.9878f, 19.3348f, 20.3679f, 18.9561f, 20.6321f, 18.5f)
        curveTo(20.8561f, 18.1133f, 20.9557f, 17.6531f, 21f, 17f)
        }
        }.build()

        return _celsius!!
    }

private var _celsius: ImageVector? = null
