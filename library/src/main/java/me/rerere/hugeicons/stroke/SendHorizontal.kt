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

val HugeIcons.SendHorizontal: ImageVector
    get() {
        if (_sendHorizontal != null) {
            return _sendHorizontal!!
        }
        _sendHorizontal = ImageVector.Builder(
            name = "SendHorizontal",
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
            moveTo(10.325f, 5.33455f)
            lineTo(16.1084f, 8.24495f)
            curveTo(19.3643f, 9.88342f, 20.9922f, 10.7027f, 20.9922f, 12f)
            curveTo(20.9922f, 13.2973f, 19.3643f, 14.1166f, 16.1084f, 15.7551f)
            lineTo(10.325f, 18.6655f)
            curveTo(6.63532f, 20.5223f, 4.79046f, 21.4507f, 3.7862f, 20.7851f)
            curveTo(3.57349f, 20.6441f, 3.38825f, 20.4651f, 3.23962f, 20.2569f)
            curveTo(2.53788f, 19.2741f, 3.3843f, 17.381f, 5.07715f, 13.5948f)
            curveTo(5.39957f, 12.8736f, 5.56078f, 12.5131f, 5.58462f, 12.1319f)
            curveTo(5.59011f, 12.044f, 5.59011f, 11.956f, 5.58462f, 11.8681f)
            curveTo(5.56078f, 11.4869f, 5.39957f, 11.1264f, 5.07715f, 10.4052f)
            curveTo(3.3843f, 6.61898f, 2.53788f, 4.72586f, 3.23962f, 3.74307f)
            curveTo(3.38825f, 3.53492f, 3.57349f, 3.35593f, 3.7862f, 3.21495f)
            curveTo(4.79046f, 2.54933f, 6.63532f, 3.47774f, 10.325f, 5.33455f)
            close()
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
            moveTo(9.49219f, 12f)
            horizontalLineTo(13.4922f)
        }
        }.build()

        return _sendHorizontal!!
    }

private var _sendHorizontal: ImageVector? = null
