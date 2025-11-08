package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Blender: ImageVector
    get() {
        if (_blender != null) {
            return _blender!!
        }
        _blender = ImageVector.Builder(
            name = "Blender",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.4626f, 4f)
        horizontalLineTo(8.2133f)
        moveTo(18.4626f, 4f)
        lineTo(17.4377f, 17f)
        horizontalLineTo(9f)
        lineTo(8.72577f, 11f)
        moveTo(18.4626f, 4f)
        horizontalLineTo(20f)
        moveTo(8.2133f, 4f)
        horizontalLineTo(6.35619f)
        curveTo(5.09456f, 4f, 4.46374f, 4f, 4.15636f, 4.40307f)
        curveTo(3.84899f, 4.80614f, 4.03026f, 5.39566f, 4.39278f, 6.5747f)
        lineTo(4.66786f, 7.4693f)
        curveTo(4.90028f, 8.22521f, 5.0165f, 8.60316f, 5.26185f, 8.90436f)
        curveTo(5.5072f, 9.20555f, 5.85836f, 9.40133f, 6.56065f, 9.79288f)
        lineTo(8.72577f, 11f)
        moveTo(8.2133f, 4f)
        lineTo(8.72577f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 2f)
        horizontalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.4668f, 17f)
        horizontalLineTo(9.05279f)
        curveTo(8.76014f, 17.9995f, 7.45643f, 20.7076f, 8.25559f, 21.634f)
        curveTo(8.57134f, 22f, 9.16523f, 22f, 10.353f, 22f)
        horizontalLineTo(16.5325f)
        curveTo(17.8279f, 22f, 18.4755f, 22f, 18.7911f, 21.5969f)
        curveTo(19.5834f, 20.5851f, 17.8973f, 17.9653f, 17.4668f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 8f)
        horizontalLineTo(15.5f)
        moveTo(17.5f, 11f)
        horizontalLineTo(15.5f)
        moveTo(17.5f, 14f)
        horizontalLineTo(15.5f)
        }
        }.build()

        return _blender!!
    }

private var _blender: ImageVector? = null
