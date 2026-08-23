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

val HugeIcons.CloudRainWind: ImageVector
    get() {
        if (_cloudRainWind != null) {
            return _cloudRainWind!!
        }
        _cloudRainWind = ImageVector.Builder(
            name = "CloudRainWind",
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
            moveTo(17.4776f, 9.00005f)
            curveTo(17.485f, 9.00002f, 17.4925f, 9f, 17.5f, 9f)
            curveTo(19.9853f, 9f, 22f, 11.0147f, 22f, 13.5f)
            curveTo(22f, 15.0602f, 21.206f, 16.435f, 20f, 17.2422f)
            moveTo(16.9003f, 11f)
            curveTo(17.2119f, 10.3904f, 17.4131f, 9.71494f, 17.4776f, 9.00005f)
            curveTo(17.4924f, 8.83536f, 17.5f, 8.66856f, 17.5f, 8.5f)
            curveTo(17.5f, 5.46243f, 15.0376f, 3f, 12f, 3f)
            curveTo(9.12324f, 3f, 6.76233f, 5.20862f, 6.52042f, 8.0227f)
            moveTo(6.52042f, 8.0227f)
            curveTo(3.98398f, 8.26407f, 2f, 10.4003f, 2f, 13f)
            curveTo(2f, 14.6358f, 2.78555f, 16.0882f, 4f, 17.0004f)
            moveTo(6.52042f, 8.0227f)
            curveTo(6.67826f, 8.00768f, 6.83823f, 8f, 7f, 8f)
            curveTo(7.78232f, 8f, 8.52268f, 8.17967f, 9.18206f, 8.5f)
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
            moveTo(10.1992f, 22f)
            lineTo(12.1992f, 17f)
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
            moveTo(9f, 15f)
            lineTo(7f, 20f)
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
            moveTo(17f, 15f)
            lineTo(15f, 20f)
        }
        }.build()

        return _cloudRainWind!!
    }

private var _cloudRainWind: ImageVector? = null
