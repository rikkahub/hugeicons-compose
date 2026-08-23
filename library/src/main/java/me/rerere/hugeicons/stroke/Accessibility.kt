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

val HugeIcons.Accessibility: ImageVector
    get() {
        if (_accessibility != null) {
            return _accessibility!!
        }
        _accessibility = ImageVector.Builder(
            name = "Accessibility",
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
            moveTo(9f, 9.98098f)
            lineTo(9.30668f, 9.52623f)
            curveTo(10.1254f, 8.31219f, 10.5348f, 7.70516f, 11.1776f, 7.48717f)
            curveTo(11.8203f, 7.26917f, 12.5205f, 7.49988f, 13.9208f, 7.96129f)
            lineTo(14.8388f, 8.2638f)
            curveTo(15.8614f, 8.60073f, 16.3726f, 8.7692f, 16.5481f, 9.18793f)
            curveTo(16.7236f, 9.60666f, 16.4825f, 10.0832f, 16.0005f, 11.0361f)
            lineTo(14.0228f, 14.9461f)
            moveTo(14.0228f, 14.9461f)
            horizontalLineTo(16.0319f)
            curveTo(17.3949f, 14.9461f, 18.0764f, 14.9461f, 18.3746f, 15.3883f)
            curveTo(18.6729f, 15.8305f, 18.4108f, 16.4524f, 17.8865f, 17.696f)
            lineTo(16.5342f, 20.9043f)
            moveTo(14.0228f, 14.9461f)
            horizontalLineTo(13.8075f)
            curveTo(12.3309f, 14.9461f, 11.5926f, 14.9461f, 11.2991f, 14.4694f)
            curveTo(11.0055f, 13.9927f, 11.3446f, 13.3445f, 12.0228f, 12.0479f)
            lineTo(14.0228f, 8.22408f)
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
            moveTo(16.5f, 6f)
            curveTo(17.3284f, 6f, 18f, 5.32843f, 18f, 4.5f)
            curveTo(18f, 3.67157f, 17.3284f, 3f, 16.5f, 3f)
            curveTo(15.6716f, 3f, 15f, 3.67157f, 15f, 4.5f)
            curveTo(15f, 5.32843f, 15.6716f, 6f, 16.5f, 6f)
            close()
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
            moveTo(8f, 12.4668f)
            curveTo(6.51828f, 13.2031f, 5.5f, 14.7322f, 5.5f, 16.499f)
            curveTo(5.5f, 18.9843f, 7.51472f, 20.999f, 10f, 20.999f)
            curveTo(11.5602f, 20.999f, 12.935f, 20.205f, 13.7422f, 18.999f)
        }
        }.build()

        return _accessibility!!
    }

private var _accessibility: ImageVector? = null
