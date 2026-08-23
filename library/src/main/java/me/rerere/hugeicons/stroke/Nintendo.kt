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

val HugeIcons.Nintendo: ImageVector
    get() {
        if (_nintendo != null) {
            return _nintendo!!
        }
        _nintendo = ImageVector.Builder(
            name = "Nintendo",
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
            moveTo(16f, 19.5f)
            horizontalLineTo(8f)
            curveTo(5.17157f, 19.5f, 3.75736f, 19.5f, 2.87868f, 18.5586f)
            curveTo(2f, 17.6171f, 2f, 16.1019f, 2f, 13.0714f)
            verticalLineTo(10.9286f)
            curveTo(2f, 7.89811f, 2f, 6.38288f, 2.87868f, 5.44144f)
            curveTo(3.75736f, 4.5f, 5.17157f, 4.5f, 8f, 4.5f)
            horizontalLineTo(16f)
            curveTo(18.8284f, 4.5f, 20.2426f, 4.5f, 21.1213f, 5.44144f)
            curveTo(22f, 6.38288f, 22f, 7.89811f, 22f, 10.9286f)
            verticalLineTo(13.0714f)
            curveTo(22f, 16.1019f, 22f, 17.6171f, 21.1213f, 18.5586f)
            curveTo(20.2426f, 19.5f, 18.8284f, 19.5f, 16f, 19.5f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(17f, 4.5f)
            verticalLineTo(19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(7f, 4.5f)
            verticalLineTo(19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(4.625f, 8.5f)
            horizontalLineTo(4.5f)
            moveTo(4.75f, 8.5f)
            curveTo(4.75f, 8.63807f, 4.63807f, 8.75f, 4.5f, 8.75f)
            curveTo(4.36193f, 8.75f, 4.25f, 8.63807f, 4.25f, 8.5f)
            curveTo(4.25f, 8.36193f, 4.36193f, 8.25f, 4.5f, 8.25f)
            curveTo(4.63807f, 8.25f, 4.75f, 8.36193f, 4.75f, 8.5f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(19.625f, 15.5f)
            horizontalLineTo(19.5f)
            moveTo(19.75f, 15.5f)
            curveTo(19.75f, 15.6381f, 19.6381f, 15.75f, 19.5f, 15.75f)
            curveTo(19.3619f, 15.75f, 19.25f, 15.6381f, 19.25f, 15.5f)
            curveTo(19.25f, 15.3619f, 19.3619f, 15.25f, 19.5f, 15.25f)
            curveTo(19.6381f, 15.25f, 19.75f, 15.3619f, 19.75f, 15.5f)
            close()
        }
        }.build()

        return _nintendo!!
    }

private var _nintendo: ImageVector? = null
