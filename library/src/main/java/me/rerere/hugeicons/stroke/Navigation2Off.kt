package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Navigation2Off: ImageVector
    get() {
        if (_navigation2Off != null) {
            return _navigation2Off!!
        }
        _navigation2Off = ImageVector.Builder(
            name = "Navigation2Off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(10.0879f, 5.08785f)
            curveTo(10.7594f, 3.69594f, 11.2753f, 2.99999f, 12f, 3f)
            curveTo(13.0217f, 3.00001f, 13.6283f, 4.38332f, 14.8414f, 7.14995f)
            lineTo(16.9433f, 11.9433f)
            moveTo(8.54625f, 8.54625f)
            lineTo(5.88422f, 14.6171f)
            curveTo(4.33132f, 18.1585f, 3.55488f, 19.9292f, 4.26507f, 20.64f)
            curveTo(4.35562f, 20.7306f, 4.45766f, 20.8098f, 4.56877f, 20.8756f)
            curveTo(5.4402f, 21.3918f, 7.058f, 20.2738f, 10.2936f, 18.0379f)
            curveTo(11.0738f, 17.4987f, 11.464f, 17.2291f, 11.9067f, 17.2031f)
            curveTo(11.9689f, 17.1995f, 12.0312f, 17.1995f, 12.0934f, 17.2031f)
            curveTo(12.5362f, 17.2291f, 12.9263f, 17.4987f, 13.7066f, 18.0379f)
            curveTo(16.942f, 20.2738f, 18.5598f, 21.3917f, 19.4312f, 20.8755f)
            curveTo(19.5423f, 20.8097f, 19.6444f, 20.7305f, 19.735f, 20.6399f)
            curveTo(19.8937f, 20.481f, 19.9782f, 20.2691f, 19.9963f, 19.9963f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(3f, 3f)
            lineTo(21f, 21f)
        }
        }.build()

        return _navigation2Off!!
    }

private var _navigation2Off: ImageVector? = null
