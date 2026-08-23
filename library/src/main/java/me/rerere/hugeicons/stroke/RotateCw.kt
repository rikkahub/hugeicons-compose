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

val HugeIcons.RotateCw: ImageVector
    get() {
        if (_rotateCw != null) {
            return _rotateCw!!
        }
        _rotateCw = ImageVector.Builder(
            name = "RotateCw",
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
            moveTo(19.9913f, 2f)
            verticalLineTo(5.13219f)
            curveTo(19.9913f, 5.42605f, 19.6241f, 5.55908f, 19.436f, 5.33333f)
            curveTo(17.6059f, 3.2875f, 14.9463f, 2f, 11.9862f, 2f)
            curveTo(6.46617f, 2f, 1.99132f, 6.47715f, 1.99132f, 12f)
            curveTo(1.99132f, 15.9582f, 4.28984f, 19.3793f, 7.6243f, 21f)
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
            moveTo(12.2583f, 22.0003f)
            curveTo(11.7914f, 22.0003f, 11.332f, 21.9691f, 10.8819f, 21.9086f)
            moveTo(21.7277f, 8.66699f)
            curveTo(21.8401f, 9.06418f, 21.9283f, 9.4656f, 21.9931f, 9.86925f)
            moveTo(21.9585f, 13.5383f)
            curveTo(21.8882f, 13.9384f, 21.7966f, 14.3345f, 21.6845f, 14.7247f)
            moveTo(20.1601f, 17.9966f)
            curveTo(19.9218f, 18.35f, 19.6635f, 18.6902f, 19.386f, 19.0149f)
            moveTo(16.5645f, 21.361f)
            curveTo(16.2108f, 21.5634f, 15.8426f, 21.7466f, 15.4608f, 21.9086f)
        }
        }.build()

        return _rotateCw!!
    }

private var _rotateCw: ImageVector? = null
