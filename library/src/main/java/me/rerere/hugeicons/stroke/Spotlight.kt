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

val HugeIcons.Spotlight: ImageVector
    get() {
        if (_spotlight != null) {
            return _spotlight!!
        }
        _spotlight = ImageVector.Builder(
            name = "Spotlight",
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
            moveTo(8f, 2f)
            verticalLineTo(9f)
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
            moveTo(8f, 14f)
            lineTo(13f, 9f)
            lineTo(8.88388f, 4.88388f)
            curveTo(8.31794f, 4.31794f, 7.55036f, 4f, 6.75f, 4f)
            curveTo(5.94964f, 4f, 5.18206f, 4.31794f, 4.61612f, 4.88388f)
            lineTo(3.88388f, 5.61612f)
            curveTo(3.31794f, 6.18206f, 3f, 6.94964f, 3f, 7.75f)
            curveTo(3f, 8.55036f, 3.31794f, 9.31794f, 3.88388f, 9.88388f)
            lineTo(8f, 14f)
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
            moveTo(13f, 9f)
            lineTo(8f, 14f)
            lineTo(8.7623f, 17.0492f)
            curveTo(8.902f, 17.608f, 9.40407f, 18f, 9.98006f, 18f)
            curveTo(10.313f, 18f, 10.6322f, 17.8678f, 10.8677f, 17.6323f)
            lineTo(16.6323f, 11.8677f)
            curveTo(16.8678f, 11.6322f, 17f, 11.313f, 17f, 10.9801f)
            curveTo(17f, 10.4041f, 16.608f, 9.902f, 16.0492f, 9.7623f)
            lineTo(13f, 9f)
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
            moveTo(18f, 19f)
            lineTo(20f, 21f)
            moveTo(19f, 15f)
            horizontalLineTo(21f)
            moveTo(14f, 20f)
            verticalLineTo(22f)
        }
        }.build()

        return _spotlight!!
    }

private var _spotlight: ImageVector? = null
