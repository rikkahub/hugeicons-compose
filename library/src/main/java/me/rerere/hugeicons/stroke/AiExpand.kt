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

val HugeIcons.AiExpand: ImageVector
    get() {
        if (_aiExpand != null) {
            return _aiExpand!!
        }
        _aiExpand = ImageVector.Builder(
            name = "AiExpand",
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
            moveTo(21f, 14f)
            verticalLineTo(12f)
            curveTo(21f, 7.75736f, 21f, 5.63604f, 19.682f, 4.31802f)
            curveTo(18.364f, 3f, 16.2426f, 3f, 12f, 3f)
            curveTo(7.75736f, 3f, 5.63604f, 3f, 4.31802f, 4.31802f)
            curveTo(3f, 5.63604f, 3f, 7.75736f, 3f, 12f)
            curveTo(3f, 16.2426f, 3f, 18.364f, 4.31802f, 19.682f)
            curveTo(5.63604f, 21f, 7.75736f, 21f, 12f, 21f)
            horizontalLineTo(14f)
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
            moveTo(7.43934f, 12.5607f)
            curveTo(7.87868f, 13f, 8.58579f, 13f, 10f, 13f)
            curveTo(11.4142f, 13f, 12.1213f, 13f, 12.5607f, 12.5607f)
            curveTo(13f, 12.1213f, 13f, 11.4142f, 13f, 10f)
            curveTo(13f, 8.58579f, 13f, 7.87868f, 12.5607f, 7.43934f)
            curveTo(12.1213f, 7f, 11.4142f, 7f, 10f, 7f)
            curveTo(8.58579f, 7f, 7.87868f, 7f, 7.43934f, 7.43934f)
            curveTo(7f, 7.87868f, 7f, 8.58579f, 7f, 10f)
            curveTo(7f, 11.4142f, 7f, 12.1213f, 7.43934f, 12.5607f)
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
            moveTo(19.5f, 17.9375f)
            verticalLineTo(19.5f)
            moveTo(19.5f, 19.5f)
            verticalLineTo(21.0625f)
            moveTo(19.5f, 19.5f)
            horizontalLineTo(18.25f)
            moveTo(19.5f, 19.5f)
            horizontalLineTo(20.75f)
            moveTo(22f, 19.5f)
            lineTo(20.9156f, 19.1385f)
            curveTo(20.4179f, 18.9726f, 20.0274f, 18.5821f, 19.8615f, 18.0844f)
            lineTo(19.5f, 17f)
            lineTo(19.1385f, 18.0844f)
            curveTo(18.9726f, 18.5821f, 18.5821f, 18.9726f, 18.0844f, 19.1385f)
            lineTo(17f, 19.5f)
            lineTo(18.0844f, 19.8615f)
            curveTo(18.5821f, 20.0274f, 18.9726f, 20.4179f, 19.1385f, 20.9156f)
            lineTo(19.5f, 22f)
            lineTo(19.8615f, 20.9156f)
            curveTo(20.0274f, 20.4179f, 20.4179f, 20.0274f, 20.9156f, 19.8615f)
            lineTo(22f, 19.5f)
            close()
        }
        }.build()

        return _aiExpand!!
    }

private var _aiExpand: ImageVector? = null
