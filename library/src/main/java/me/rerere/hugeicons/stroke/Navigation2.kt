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

val HugeIcons.Navigation2: ImageVector
    get() {
        if (_navigation2 != null) {
            return _navigation2!!
        }
        _navigation2 = ImageVector.Builder(
            name = "Navigation2",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(9.15858f, 7.1499f)
            lineTo(5.88425f, 14.6171f)
            curveTo(4.33136f, 18.1585f, 3.55491f, 19.9292f, 4.2651f, 20.64f)
            curveTo(4.35565f, 20.7306f, 4.45769f, 20.8098f, 4.5688f, 20.8756f)
            curveTo(5.44023f, 21.3918f, 7.05803f, 20.2738f, 10.2936f, 18.0379f)
            curveTo(11.0739f, 17.4987f, 11.464f, 17.2291f, 11.9067f, 17.2031f)
            curveTo(11.9689f, 17.1995f, 12.0313f, 17.1995f, 12.0935f, 17.2031f)
            curveTo(12.5362f, 17.2291f, 12.9263f, 17.4987f, 13.7066f, 18.0379f)
            curveTo(16.9421f, 20.2738f, 18.5598f, 21.3917f, 19.4312f, 20.8755f)
            curveTo(19.5424f, 20.8097f, 19.6444f, 20.7305f, 19.735f, 20.6399f)
            curveTo(20.4451f, 19.9291f, 19.6687f, 18.1584f, 18.1158f, 14.6172f)
            lineTo(14.8415f, 7.14995f)
            curveTo(13.6283f, 4.38332f, 13.0217f, 3.00001f, 12f, 3f)
            curveTo(10.9783f, 2.99999f, 10.3717f, 4.38329f, 9.15858f, 7.1499f)
            close()
        }
        }.build()

        return _navigation2!!
    }

private var _navigation2: ImageVector? = null
