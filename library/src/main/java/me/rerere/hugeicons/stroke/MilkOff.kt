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

val HugeIcons.MilkOff: ImageVector
    get() {
        if (_milkOff != null) {
            return _milkOff!!
        }
        _milkOff = ImageVector.Builder(
            name = "MilkOff",
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
            moveTo(1.99219f, 2f)
            lineTo(21.9922f, 22f)
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
            moveTo(15.2397f, 4.92311f)
            curveTo(16.5647f, 7.35227f, 17.5642f, 9.45539f, 17.8847f, 12f)
            moveTo(15.2397f, 4.92311f)
            curveTo(15.0768f, 4.97298f, 13.9938f, 5f, 13.9938f, 5f)
            moveTo(15.2397f, 4.92311f)
            curveTo(15.8893f, 4.7243f, 16.3575f, 4.16227f, 16.3575f, 3.5f)
            curveTo(16.3575f, 2.67157f, 15.6249f, 2f, 14.7211f, 2f)
            horizontalLineTo(9.26657f)
            curveTo(8.78193f, 2f, 8.3465f, 2.19313f, 8.04688f, 2.5f)
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
            moveTo(17.9749f, 18f)
            curveTo(17.9281f, 19.5534f, 17.7548f, 20.48f, 17.1135f, 21.1213f)
            curveTo(16.2348f, 22f, 14.8206f, 22f, 11.9922f, 22f)
            curveTo(9.16376f, 22f, 7.74955f, 22f, 6.87087f, 21.1213f)
            curveTo(5.99219f, 20.2426f, 5.99219f, 18.8284f, 5.99219f, 16f)
            verticalLineTo(13.7771f)
            curveTo(5.99219f, 11.6006f, 6.44579f, 9.79621f, 7.19742f, 8f)
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
            moveTo(6.49219f, 12f)
            lineTo(13.9922f, 14f)
        }
        }.build()

        return _milkOff!!
    }

private var _milkOff: ImageVector? = null
