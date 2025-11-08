package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Incognito: ImageVector
    get() {
        if (_incognito != null) {
            return _incognito!!
        }
        _incognito = ImageVector.Builder(
            name = "Incognito",
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
        moveTo(10f, 18f)
        curveTo(10f, 16.3431f, 8.65685f, 15f, 7f, 15f)
        curveTo(5.34315f, 15f, 4f, 16.3431f, 4f, 18f)
        curveTo(4f, 19.6569f, 5.34315f, 21f, 7f, 21f)
        curveTo(8.65685f, 21f, 10f, 19.6569f, 10f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 18f)
        curveTo(20f, 16.3431f, 18.6569f, 15f, 17f, 15f)
        curveTo(15.3431f, 15f, 14f, 16.3431f, 14f, 18f)
        curveTo(14f, 19.6569f, 15.3431f, 21f, 17f, 21f)
        curveTo(18.6569f, 21f, 20f, 19.6569f, 20f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 12f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 16.3411f)
        curveTo(13.9625f, 15.5328f, 13.0435f, 15f, 12f, 15f)
        curveTo(10.9565f, 15f, 10.0375f, 15.5328f, 9.5f, 16.3411f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 11.9999f)
        lineTo(4.66166f, 5.70273f)
        curveTo(4.75853f, 5.33563f, 4.80697f, 5.15208f, 4.85375f, 5.02195f)
        curveTo(5.53545f, 3.12561f, 7.7632f, 2.40097f, 9.37283f, 3.552f)
        curveTo(9.48328f, 3.63099f, 9.6247f, 3.75279f, 9.90752f, 3.99638f)
        curveTo(10.0699f, 4.13626f, 10.1511f, 4.2062f, 10.2264f, 4.26322f)
        curveTo(11.2822f, 5.06309f, 12.7178f, 5.06309f, 13.7736f, 4.26322f)
        curveTo(13.8489f, 4.2062f, 13.9301f, 4.13626f, 14.0925f, 3.99638f)
        curveTo(14.3753f, 3.75279f, 14.5167f, 3.63099f, 14.6272f, 3.552f)
        curveTo(16.2368f, 2.40097f, 18.4645f, 3.12561f, 19.1463f, 5.02195f)
        curveTo(19.193f, 5.15208f, 19.2415f, 5.33563f, 19.3383f, 5.70273f)
        lineTo(21f, 11.9999f)
        horizontalLineTo(3f)
        }
        }.build()

        return _incognito!!
    }

private var _incognito: ImageVector? = null
