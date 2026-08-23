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

val HugeIcons.AiBackgroundEraser: ImageVector
    get() {
        if (_aiBackgroundEraser != null) {
            return _aiBackgroundEraser!!
        }
        _aiBackgroundEraser = ImageVector.Builder(
            name = "AiBackgroundEraser",
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
            moveTo(5.15314f, 21.423f)
            curveTo(5.80958f, 19.5285f, 7.88395f, 18.1309f, 10.203f, 18.0276f)
            curveTo(10.453f, 18.0164f, 10.718f, 18.0071f, 11.0024f, 18f)
            lineTo(11.7984f, 18.0482f)
            curveTo(14.1392f, 18.1901f, 16.1952f, 19.5384f, 16.8487f, 21.423f)
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
            moveTo(10f, 4f)
            horizontalLineTo(13f)
            moveTo(20f, 11f)
            verticalLineTo(14f)
            moveTo(2f, 12f)
            verticalLineTo(14f)
            moveTo(6f, 4f)
            curveTo(3.79089f, 4f, 1.99989f, 5.79089f, 2f, 8f)
            moveTo(2f, 18.1953f)
            curveTo(2f, 20.2968f, 3.70362f, 22.0004f, 5.80515f, 22.0004f)
            horizontalLineTo(16.1948f)
            curveTo(18.2964f, 22.0004f, 20f, 20.2968f, 20f, 18.1953f)
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
            moveTo(13.5f, 12.5f)
            curveTo(13.5f, 13.8807f, 12.3807f, 15f, 11f, 15f)
            curveTo(9.61929f, 15f, 8.5f, 13.8807f, 8.5f, 12.5f)
            curveTo(8.5f, 11.1193f, 9.61929f, 10f, 11f, 10f)
            curveTo(12.3807f, 10f, 13.5f, 11.1193f, 13.5f, 12.5f)
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
            moveTo(19.5f, 2.9375f)
            verticalLineTo(4.5f)
            moveTo(19.5f, 4.5f)
            verticalLineTo(6.0625f)
            moveTo(19.5f, 4.5f)
            horizontalLineTo(18.25f)
            moveTo(19.5f, 4.5f)
            horizontalLineTo(20.75f)
            moveTo(22f, 4.5f)
            lineTo(20.9156f, 4.13852f)
            curveTo(20.4179f, 3.97263f, 20.0274f, 3.58211f, 19.8615f, 3.08443f)
            lineTo(19.5f, 2f)
            lineTo(19.1385f, 3.08443f)
            curveTo(18.9726f, 3.58211f, 18.5821f, 3.97263f, 18.0844f, 4.13852f)
            lineTo(17f, 4.5f)
            lineTo(18.0844f, 4.86148f)
            curveTo(18.5821f, 5.02737f, 18.9726f, 5.41789f, 19.1385f, 5.91557f)
            lineTo(19.5f, 7f)
            lineTo(19.8615f, 5.91557f)
            curveTo(20.0274f, 5.41789f, 20.4179f, 5.02737f, 20.9156f, 4.86148f)
            lineTo(22f, 4.5f)
            close()
        }
        }.build()

        return _aiBackgroundEraser!!
    }

private var _aiBackgroundEraser: ImageVector? = null
