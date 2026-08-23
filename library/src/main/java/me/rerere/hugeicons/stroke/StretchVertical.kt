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

val HugeIcons.StretchVertical: ImageVector
    get() {
        if (_stretchVertical != null) {
            return _stretchVertical!!
        }
        _stretchVertical = ImageVector.Builder(
            name = "StretchVertical",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(7.99219f, 2f)
            curveTo(9.09676f, 2f, 9.99219f, 2.89543f, 9.99219f, 4f)
            lineTo(9.99219f, 20f)
            curveTo(9.99219f, 21.1046f, 9.09676f, 22f, 7.99219f, 22f)
            horizontalLineTo(5.99219f)
            curveTo(4.88762f, 22f, 3.99219f, 21.1046f, 3.99219f, 20f)
            lineTo(3.99219f, 4f)
            curveTo(3.99219f, 2.89543f, 4.88762f, 2f, 5.99219f, 2f)
            lineTo(7.99219f, 2f)
            close()
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
            moveTo(17.9922f, 2f)
            curveTo(19.0968f, 2f, 19.9922f, 2.89543f, 19.9922f, 4f)
            lineTo(19.9922f, 20f)
            curveTo(19.9922f, 21.1046f, 19.0968f, 22f, 17.9922f, 22f)
            horizontalLineTo(15.9922f)
            curveTo(14.8876f, 22f, 13.9922f, 21.1046f, 13.9922f, 20f)
            lineTo(13.9922f, 4f)
            curveTo(13.9922f, 2.89543f, 14.8876f, 2f, 15.9922f, 2f)
            lineTo(17.9922f, 2f)
            close()
        }
        }.build()

        return _stretchVertical!!
    }

private var _stretchVertical: ImageVector? = null
