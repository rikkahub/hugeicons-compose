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

val HugeIcons.TypeOutline: ImageVector
    get() {
        if (_typeOutline != null) {
            return _typeOutline!!
        }
        _typeOutline = ImageVector.Builder(
            name = "TypeOutline",
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
            moveTo(3f, 5.5f)
            verticalLineTo(6f)
            curveTo(3f, 6.82843f, 3.67157f, 7.5f, 4.5f, 7.5f)
            horizontalLineTo(4.66667f)
            curveTo(5.40305f, 7.5f, 6f, 6.90305f, 6f, 6.16667f)
            curveTo(6f, 5.79848f, 6.29848f, 5.5f, 6.66667f, 5.5f)
            horizontalLineTo(10.5f)
            lineTo(10.5005f, 18.5f)
            horizontalLineTo(9.50045f)
            curveTo(8.67203f, 18.5f, 8.00045f, 19.1716f, 8.00045f, 20f)
            curveTo(8.00045f, 20.8284f, 8.67203f, 21.5f, 9.50045f, 21.5f)
            horizontalLineTo(14.5005f)
            curveTo(15.3289f, 21.5f, 16.0005f, 20.8284f, 16.0005f, 20f)
            curveTo(16.0005f, 19.1716f, 15.3289f, 18.5f, 14.5005f, 18.5f)
            horizontalLineTo(13.5005f)
            lineTo(13.5f, 5.5f)
            horizontalLineTo(17.3333f)
            curveTo(17.7015f, 5.5f, 18f, 5.79848f, 18f, 6.16667f)
            curveTo(18f, 6.90305f, 18.597f, 7.5f, 19.3333f, 7.5f)
            horizontalLineTo(19.5f)
            curveTo(20.3284f, 7.5f, 21f, 6.82843f, 21f, 6f)
            verticalLineTo(5.5f)
            curveTo(21f, 3.84315f, 19.6569f, 2.5f, 18f, 2.5f)
            horizontalLineTo(6f)
            curveTo(4.34315f, 2.5f, 3f, 3.84315f, 3f, 5.5f)
            close()
        }
        }.build()

        return _typeOutline!!
    }

private var _typeOutline: ImageVector? = null
