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

val HugeIcons.CreativeMarket: ImageVector
    get() {
        if (_creativeMarket != null) {
            return _creativeMarket!!
        }
        _creativeMarket = ImageVector.Builder(
            name = "CreativeMarket",
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
            moveTo(10.7962f, 2.91338f)
            curveTo(11.4188f, 2.29077f, 12.2756f, 1.96039f, 13.1551f, 2.0038f)
            lineTo(18.7587f, 2.28039f)
            curveTo(20.3601f, 2.35944f, 21.6406f, 3.63993f, 21.7196f, 5.24131f)
            lineTo(21.9962f, 10.8449f)
            curveTo(22.0396f, 11.7244f, 21.7092f, 12.5811f, 21.0866f, 13.2037f)
            lineTo(13.5082f, 20.7822f)
            curveTo(11.8844f, 22.4059f, 9.25177f, 22.4059f, 7.62799f, 20.7822f)
            lineTo(3.21783f, 16.372f)
            curveTo(1.59406f, 14.7482f, 1.59406f, 12.1156f, 3.21783f, 10.4918f)
            lineTo(10.7962f, 2.91338f)
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
            moveTo(13.982f, 11.2064f)
            lineTo(11.0004f, 13f)
            moveTo(11.0004f, 13f)
            lineTo(8.01869f, 14.7936f)
            moveTo(11.0004f, 13f)
            lineTo(11.0187f, 16.5f)
            moveTo(11.0004f, 13f)
            lineTo(10.982f, 9.5f)
            moveTo(11.0004f, 13f)
            lineTo(14f, 14.7063f)
            moveTo(11.0004f, 13f)
            lineTo(8f, 11.2935f)
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
            moveTo(17.875f, 6.25f)
            horizontalLineTo(17.75f)
            moveTo(18f, 6.25f)
            curveTo(18f, 6.38807f, 17.8881f, 6.5f, 17.75f, 6.5f)
            curveTo(17.6119f, 6.5f, 17.5f, 6.38807f, 17.5f, 6.25f)
            curveTo(17.5f, 6.11193f, 17.6119f, 6f, 17.75f, 6f)
            curveTo(17.8881f, 6f, 18f, 6.11193f, 18f, 6.25f)
            close()
        }
        }.build()

        return _creativeMarket!!
    }

private var _creativeMarket: ImageVector? = null
