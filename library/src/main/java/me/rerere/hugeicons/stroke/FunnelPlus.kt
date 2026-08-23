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

val HugeIcons.FunnelPlus: ImageVector
    get() {
        if (_funnelPlus != null) {
            return _funnelPlus!!
        }
        _funnelPlus = ImageVector.Builder(
            name = "FunnelPlus",
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
            moveTo(13.0865f, 3.25f)
            horizontalLineTo(4.70156f)
            curveTo(4.04901f, 3.25f, 3.72274f, 3.25f, 3.45594f, 3.32523f)
            curveTo(2.78716f, 3.5138f, 2.26448f, 4.03513f, 2.07542f, 4.70218f)
            curveTo(2f, 4.96829f, 2f, 5.29373f, 2f, 5.94459f)
            curveTo(2f, 6.27352f, 2f, 6.43798f, 2.02465f, 6.59312f)
            curveTo(2.08578f, 6.9779f, 2.25853f, 7.33639f, 2.52157f, 7.62437f)
            curveTo(2.62764f, 7.74049f, 2.75639f, 7.84323f, 3.01391f, 8.04871f)
            lineTo(7.99878f, 12.0263f)
            curveTo(8.7364f, 12.6149f, 9.10521f, 12.9092f, 9.30261f, 13.3188f)
            curveTo(9.5f, 13.7285f, 9.5f, 14.1995f, 9.5f, 15.1417f)
            verticalLineTo(17.8708f)
            curveTo(9.5f, 19.5514f, 9.5f, 20.3917f, 10.0382f, 20.6712f)
            curveTo(10.5764f, 20.9507f, 11.2666f, 20.4688f, 12.6469f, 19.5051f)
            lineTo(12.7938f, 19.4025f)
            curveTo(13.6299f, 18.8188f, 14.0479f, 18.5269f, 14.274f, 18.0939f)
            curveTo(14.5f, 17.6609f, 14.5f, 17.1519f, 14.5f, 16.134f)
            verticalLineTo(15.1417f)
            curveTo(14.5f, 14.1995f, 14.5f, 13.7285f, 14.6974f, 13.3188f)
            curveTo(14.8948f, 12.9092f, 15.2636f, 12.6149f, 16.0012f, 12.0263f)
            lineTo(17f, 11.2293f)
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
            moveTo(18.995f, 3f)
            verticalLineTo(9f)
            moveTo(22f, 5.995f)
            lineTo(16f, 5.995f)
        }
        }.build()

        return _funnelPlus!!
    }

private var _funnelPlus: ImageVector? = null
