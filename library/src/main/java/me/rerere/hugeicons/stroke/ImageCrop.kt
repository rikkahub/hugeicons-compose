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

val HugeIcons.ImageCrop: ImageVector
    get() {
        if (_imageCrop != null) {
            return _imageCrop!!
        }
        _imageCrop = ImageVector.Builder(
            name = "ImageCrop",
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
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(22f, 20f)
            horizontalLineTo(10f)
            curveTo(7.17157f, 20f, 5.75736f, 20f, 4.87868f, 19.1213f)
            curveTo(4f, 18.2426f, 4f, 16.8284f, 4f, 14f)
            verticalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(6f, 20f)
            curveTo(9.68373f, 16.4365f, 13.8235f, 11.7106f, 20f, 15.2551f)
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
            moveTo(2f, 4f)
            lineTo(14f, 4f)
            curveTo(16.8284f, 4f, 18.2426f, 4f, 19.1213f, 4.87868f)
            curveTo(20f, 5.75736f, 20f, 7.17157f, 20f, 10f)
            lineTo(20f, 22f)
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
            moveTo(10f, 8.5f)
            arcTo(1.5f, 1.5f, 0f, true, false, 7f, 8.5f)
            arcTo(1.5f, 1.5f, 0f, true, false, 10f, 8.5f)
            close()
        }
        }.build()

        return _imageCrop!!
    }

private var _imageCrop: ImageVector? = null
