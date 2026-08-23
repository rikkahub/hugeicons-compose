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

val HugeIcons.Shrub: ImageVector
    get() {
        if (_shrub != null) {
            return _shrub!!
        }
        _shrub = ImageVector.Builder(
            name = "Shrub",
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
            moveTo(18.29f, 9.40341f)
            curveTo(17.9812f, 9.13772f, 17.8268f, 9.00487f, 17.8073f, 8.98685f)
            curveTo(17.3223f, 8.5387f, 17.3496f, 8.59819f, 17.3262f, 7.93822f)
            curveTo(17.3253f, 7.91168f, 17.3253f, 7.71882f, 17.3253f, 7.33309f)
            curveTo(17.3253f, 4.38757f, 14.9375f, 1.99976f, 11.9919f, 1.99976f)
            curveTo(9.04642f, 1.99976f, 6.65861f, 4.38757f, 6.65861f, 7.33309f)
            curveTo(6.65861f, 7.71882f, 6.65861f, 7.91169f, 6.65767f, 7.93822f)
            curveTo(6.6343f, 8.59819f, 6.6616f, 8.5387f, 6.17656f, 8.98685f)
            curveTo(6.15706f, 9.00487f, 6.00266f, 9.13772f, 5.69385f, 9.40341f)
            curveTo(4.65181f, 10.3f, 3.99194f, 11.6284f, 3.99194f, 13.1109f)
            curveTo(3.99194f, 15.8109f, 6.18077f, 17.9998f, 8.88083f, 17.9998f)
            curveTo(11.2923f, 17.9998f, 12.6915f, 17.9998f, 15.1031f, 17.9998f)
            curveTo(17.8031f, 17.9998f, 19.9919f, 15.8109f, 19.9919f, 13.1109f)
            curveTo(19.9919f, 11.6284f, 19.3321f, 10.3f, 18.29f, 9.40341f)
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
            moveTo(11.9919f, 7.49976f)
            verticalLineTo(21.9998f)
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
            moveTo(9.49194f, 9.99976f)
            lineTo(11.9919f, 12.4998f)
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
            moveTo(14.4919f, 12.9998f)
            lineTo(11.9919f, 15.4998f)
        }
        }.build()

        return _shrub!!
    }

private var _shrub: ImageVector? = null
