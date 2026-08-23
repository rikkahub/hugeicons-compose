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

val HugeIcons.Milk: ImageVector
    get() {
        if (_milk != null) {
            return _milk!!
        }
        _milk = ImageVector.Builder(
            name = "Milk",
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
            moveTo(15.2381f, 4.92311f)
            curveTo(15.8876f, 4.7243f, 16.3558f, 4.16227f, 16.3558f, 3.5f)
            curveTo(16.3558f, 2.67157f, 15.6232f, 2f, 14.7195f, 2f)
            horizontalLineTo(9.26491f)
            curveTo(8.36118f, 2f, 7.62855f, 2.67157f, 7.62855f, 3.5f)
            curveTo(7.62855f, 4.15311f, 8.0839f, 4.70873f, 8.71946f, 4.91465f)
            curveTo(8.89007f, 4.96992f, 9.99219f, 5f, 9.99219f, 5f)
            moveTo(8.71946f, 4.91465f)
            curveTo(7.09893f, 7.88562f, 5.99219f, 10.3773f, 5.99219f, 13.7771f)
            verticalLineTo(16f)
            curveTo(5.99219f, 18.8284f, 5.99219f, 20.2426f, 6.87087f, 21.1213f)
            curveTo(7.74955f, 22f, 9.16376f, 22f, 11.9922f, 22f)
            curveTo(14.8206f, 22f, 16.2348f, 22f, 17.1135f, 21.1213f)
            curveTo(17.9922f, 20.2426f, 17.9922f, 18.8284f, 17.9922f, 16f)
            verticalLineTo(13.7771f)
            curveTo(17.9922f, 10.3773f, 16.8586f, 7.89408f, 15.2381f, 4.92311f)
            moveTo(15.2381f, 4.92311f)
            curveTo(15.0751f, 4.97298f, 13.9922f, 5f, 13.9922f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(5.99219f, 12f)
            lineTo(17.9922f, 15f)
        }
        }.build()

        return _milk!!
    }

private var _milk: ImageVector? = null
