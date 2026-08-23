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

val HugeIcons.Bluetooth: ImageVector
    get() {
        if (_bluetooth != null) {
            return _bluetooth!!
        }
        _bluetooth = ImageVector.Builder(
            name = "Bluetooth",
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
            moveTo(12.4742f, 12f)
            lineTo(16.2428f, 9.05534f)
            curveTo(17.3189f, 8.21451f, 17.857f, 7.79409f, 17.9716f, 7.24865f)
            curveTo(18.0144f, 7.04517f, 18.0154f, 6.83493f, 17.9748f, 6.63101f)
            curveTo(17.8657f, 6.08438f, 17.332f, 5.65832f, 16.2645f, 4.8062f)
            curveTo(14.6552f, 3.52156f, 13.8505f, 2.87924f, 13.1738f, 3.01878f)
            curveTo(12.9267f, 3.06975f, 12.6962f, 3.18351f, 12.504f, 3.34942f)
            curveTo(11.9779f, 3.80362f, 11.9779f, 4.84315f, 11.9779f, 6.92221f)
            verticalLineTo(11.6122f)
            moveTo(12.4742f, 12f)
            lineTo(11.9779f, 12.3877f)
            moveTo(12.4742f, 12f)
            lineTo(16.2428f, 14.9446f)
            curveTo(17.319f, 15.7855f, 17.857f, 16.2059f, 17.9716f, 16.7513f)
            curveTo(18.0144f, 16.9548f, 18.0155f, 17.165f, 17.9748f, 17.369f)
            curveTo(17.8658f, 17.9156f, 17.332f, 18.3417f, 16.2645f, 19.1938f)
            curveTo(14.6552f, 20.4784f, 13.8505f, 21.1208f, 13.1738f, 20.9812f)
            curveTo(12.9266f, 20.9302f, 12.6962f, 20.8165f, 12.504f, 20.6506f)
            curveTo(11.9779f, 20.1964f, 11.9779f, 19.1568f, 11.9779f, 17.0778f)
            verticalLineTo(12.3877f)
            moveTo(12.4742f, 12f)
            lineTo(11.9779f, 11.6122f)
            moveTo(11.9779f, 12.3877f)
            lineTo(6.00452f, 17.055f)
            moveTo(11.9779f, 12.3877f)
            verticalLineTo(11.6122f)
            moveTo(11.9779f, 11.6122f)
            lineTo(6.00452f, 6.94494f)
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
            moveTo(5.37952f, 12f)
            horizontalLineTo(5.25452f)
            moveTo(18.8795f, 12f)
            horizontalLineTo(18.7545f)
            moveTo(5.50452f, 12f)
            curveTo(5.50452f, 12.1381f, 5.39259f, 12.25f, 5.25452f, 12.25f)
            curveTo(5.11645f, 12.25f, 5.00452f, 12.1381f, 5.00452f, 12f)
            curveTo(5.00452f, 11.8619f, 5.11645f, 11.75f, 5.25452f, 11.75f)
            curveTo(5.39259f, 11.75f, 5.50452f, 11.8619f, 5.50452f, 12f)
            close()
            moveTo(19.0045f, 12f)
            curveTo(19.0045f, 12.1381f, 18.8926f, 12.25f, 18.7545f, 12.25f)
            curveTo(18.6164f, 12.25f, 18.5045f, 12.1381f, 18.5045f, 12f)
            curveTo(18.5045f, 11.8619f, 18.6164f, 11.75f, 18.7545f, 11.75f)
            curveTo(18.8926f, 11.75f, 19.0045f, 11.8619f, 19.0045f, 12f)
            close()
        }
        }.build()

        return _bluetooth!!
    }

private var _bluetooth: ImageVector? = null
