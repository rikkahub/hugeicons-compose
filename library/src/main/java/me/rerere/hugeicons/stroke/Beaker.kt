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

val HugeIcons.Beaker: ImageVector
    get() {
        if (_beaker != null) {
            return _beaker!!
        }
        _beaker = ImageVector.Builder(
            name = "Beaker",
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
            moveTo(4.5f, 15f)
            verticalLineTo(7f)
            curveTo(4.5f, 5.11438f, 4.5f, 4.17157f, 5.09022f, 3.58579f)
            curveTo(5.68044f, 3f, 6.63039f, 3f, 8.53029f, 3f)
            horizontalLineTo(16.9829f)
            curveTo(17.2627f, 3f, 17.4027f, 3f, 17.5366f, 3.0179f)
            curveTo(17.8831f, 3.06423f, 18.2114f, 3.19923f, 18.4895f, 3.40964f)
            curveTo(18.5969f, 3.49096f, 18.6958f, 3.58915f, 18.8937f, 3.78554f)
            curveTo(19.1753f, 4.06497f, 19.316f, 4.20469f, 19.3881f, 4.3434f)
            curveTo(19.5779f, 4.70893f, 19.5228f, 5.15251f, 19.2494f, 5.46144f)
            curveTo(19.1456f, 5.57867f, 18.9749f, 5.68033f, 18.6335f, 5.88365f)
            lineTo(18.3706f, 6.04017f)
            curveTo(18.0955f, 6.20402f, 17.9579f, 6.28594f, 17.8568f, 6.39759f)
            curveTo(17.7589f, 6.50566f, 17.6859f, 6.63361f, 17.6429f, 6.77254f)
            curveTo(17.5984f, 6.91605f, 17.5984f, 7.07528f, 17.5984f, 7.39374f)
            verticalLineTo(15f)
            curveTo(17.5984f, 17.8284f, 17.5984f, 19.2426f, 16.7131f, 20.1213f)
            curveTo(15.8278f, 21f, 14.4029f, 21f, 11.553f, 21f)
            horizontalLineTo(10.5454f)
            curveTo(7.69559f, 21f, 6.27067f, 21f, 5.38533f, 20.1213f)
            curveTo(4.5f, 19.2426f, 4.5f, 17.8284f, 4.5f, 15f)
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
            moveTo(4.5f, 14f)
            horizontalLineTo(17.5f)
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
            moveTo(5f, 10.5f)
            lineTo(7f, 10.5f)
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
            moveTo(5f, 7f)
            lineTo(7f, 7f)
        }
        }.build()

        return _beaker!!
    }

private var _beaker: ImageVector? = null
