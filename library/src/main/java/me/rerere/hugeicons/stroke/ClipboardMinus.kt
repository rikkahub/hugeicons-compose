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

val HugeIcons.ClipboardMinus: ImageVector
    get() {
        if (_clipboardMinus != null) {
            return _clipboardMinus!!
        }
        _clipboardMinus = ImageVector.Builder(
            name = "ClipboardMinus",
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
            moveTo(14.5f, 2.00024f)
            horizontalLineTo(9.5f)
            curveTo(8.67157f, 2.00024f, 8f, 2.67182f, 8f, 3.50024f)
            curveTo(8f, 4.32867f, 8.67157f, 5.00024f, 9.5f, 5.00024f)
            horizontalLineTo(14.5f)
            curveTo(15.3284f, 5.00024f, 16f, 4.32867f, 16f, 3.50024f)
            curveTo(16f, 2.67182f, 15.3284f, 2.00024f, 14.5f, 2.00024f)
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
            moveTo(16f, 3.50024f)
            curveTo(17.5535f, 3.54706f, 18.48f, 3.72032f, 19.1213f, 4.36161f)
            curveTo(20f, 5.24028f, 20f, 6.65448f, 20f, 9.48287f)
            lineTo(20f, 15.9997f)
            curveTo(20f, 18.8281f, 20f, 20.2423f, 19.1213f, 21.121f)
            curveTo(18.2426f, 21.9997f, 16.8284f, 21.9997f, 14f, 21.9997f)
            lineTo(10f, 21.9997f)
            curveTo(7.17158f, 21.9997f, 5.75737f, 21.9997f, 4.87869f, 21.121f)
            curveTo(4.00001f, 20.2424f, 4.00001f, 18.8282f, 4f, 15.9997f)
            lineTo(4.00001f, 9.48293f)
            curveTo(4.00001f, 6.6545f, 4f, 5.24028f, 4.87868f, 4.3616f)
            curveTo(5.51997f, 3.72031f, 6.44651f, 3.54705f, 7.9999f, 3.50024f)
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
            moveTo(9.00391f, 13.0002f)
            horizontalLineTo(15.0039f)
        }
        }.build()

        return _clipboardMinus!!
    }

private var _clipboardMinus: ImageVector? = null
