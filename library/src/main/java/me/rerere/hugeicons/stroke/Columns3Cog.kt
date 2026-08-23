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

val HugeIcons.Columns3Cog: ImageVector
    get() {
        if (_columns3Cog != null) {
            return _columns3Cog!!
        }
        _columns3Cog = ImageVector.Builder(
            name = "Columns3Cog",
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
            moveTo(20f, 17.5f)
            curveTo(20f, 18.8807f, 18.8807f, 20f, 17.5f, 20f)
            moveTo(20f, 17.5f)
            curveTo(20f, 16.1193f, 18.8807f, 15f, 17.5f, 15f)
            moveTo(20f, 17.5f)
            horizontalLineTo(21.5f)
            moveTo(17.5f, 20f)
            curveTo(16.1193f, 20f, 15f, 18.8807f, 15f, 17.5f)
            moveTo(17.5f, 20f)
            verticalLineTo(21.5f)
            moveTo(15f, 17.5f)
            curveTo(15f, 16.1193f, 16.1193f, 15f, 17.5f, 15f)
            moveTo(15f, 17.5f)
            horizontalLineTo(13.5f)
            moveTo(17.5f, 15f)
            verticalLineTo(13.5f)
            moveTo(19.2678f, 15.7322f)
            lineTo(20.3284f, 14.6716f)
            moveTo(15.7322f, 19.2678f)
            lineTo(14.6716f, 20.3284f)
            moveTo(19.2678f, 19.2678f)
            lineTo(20.3284f, 20.3284f)
            moveTo(15.7322f, 15.7322f)
            lineTo(14.6716f, 14.6716f)
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
            moveTo(20.4993f, 10.5f)
            curveTo(20.4912f, 6.91543f, 20.3921f, 5.02814f, 19.182f, 3.81802f)
            curveTo(17.864f, 2.5f, 15.7426f, 2.5f, 11.5f, 2.5f)
            curveTo(7.25736f, 2.5f, 5.13604f, 2.5f, 3.81802f, 3.81802f)
            curveTo(2.5f, 5.13604f, 2.5f, 7.25736f, 2.5f, 11.5f)
            curveTo(2.5f, 15.7426f, 2.5f, 17.864f, 3.81802f, 19.182f)
            curveTo(5.02814f, 20.3921f, 6.91543f, 20.4912f, 10.5f, 20.4993f)
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
            moveTo(8.5f, 3f)
            verticalLineTo(20f)
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
            moveTo(14.5f, 3f)
            verticalLineTo(10.5f)
        }
        }.build()

        return _columns3Cog!!
    }

private var _columns3Cog: ImageVector? = null
