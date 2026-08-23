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

val HugeIcons.ZodiacLibra: ImageVector
    get() {
        if (_zodiacLibra != null) {
            return _zodiacLibra!!
        }
        _zodiacLibra = ImageVector.Builder(
            name = "ZodiacLibra",
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
            moveTo(3f, 15f)
            horizontalLineTo(5.95405f)
            curveTo(6.95019f, 15f, 7.44825f, 15f, 7.59776f, 14.7899f)
            curveTo(7.74728f, 14.5798f, 7.54483f, 13.9962f, 7.13995f, 12.8291f)
            curveTo(6.9567f, 12.3008f, 6.85714f, 11.7335f, 6.85714f, 11.1429f)
            curveTo(6.85714f, 8.30254f, 9.15968f, 6f, 12f, 6f)
            curveTo(14.8403f, 6f, 17.1429f, 8.30254f, 17.1429f, 11.1429f)
            curveTo(17.1429f, 11.7335f, 17.0433f, 12.3008f, 16.8601f, 12.8291f)
            curveTo(16.4552f, 13.9962f, 16.2527f, 14.5798f, 16.4022f, 14.7899f)
            curveTo(16.5517f, 15f, 17.0498f, 15f, 18.0459f, 15f)
            horizontalLineTo(21f)
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
            moveTo(3f, 18f)
            horizontalLineTo(21f)
        }
        }.build()

        return _zodiacLibra!!
    }

private var _zodiacLibra: ImageVector? = null
