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

val HugeIcons.FlagOff: ImageVector
    get() {
        if (_flagOff != null) {
            return _flagOff!!
        }
        _flagOff = ImageVector.Builder(
            name = "FlagOff",
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
            moveTo(4f, 12f)
            lineTo(4f, 21f)
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
            moveTo(8.00876f, 3.00876f)
            curveTo(9.16422f, 2.95225f, 10.4492f, 3.16236f, 11.7576f, 3.83892f)
            curveTo(13.4549f, 4.7166f, 15.2471f, 5.04124f, 17.021f, 4.84327f)
            curveTo(18.5627f, 4.67121f, 19.3335f, 4.58518f, 19.6667f, 4.88332f)
            curveTo(20f, 5.18146f, 20f, 5.82588f, 20f, 7.11473f)
            verticalLineTo(13.2898f)
            curveTo(20f, 13.409f, 20f, 13.4685f, 19.9895f, 13.5405f)
            curveTo(19.9503f, 13.8088f, 19.743f, 14.118f, 19.5096f, 14.2562f)
            curveTo(19.4471f, 14.2933f, 19.4107f, 14.3082f, 19.3381f, 14.3381f)
            moveTo(4.24191f, 4.24191f)
            curveTo(4.15535f, 4.30176f, 4.0746f, 4.3614f, 4f, 4.42024f)
            lineTo(4f, 12.1531f)
            curveTo(4f, 13.2018f, 4f, 13.7261f, 4.2098f, 13.8757f)
            curveTo(4.4196f, 14.0252f, 5.02221f, 13.8172f, 6.22741f, 13.4012f)
            curveTo(7.63078f, 12.9168f, 9.53498f, 12.8405f, 11.7576f, 13.9897f)
            curveTo(12.8503f, 14.5547f, 13.9344f, 14.8438f, 14.9505f, 14.9505f)
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
            moveTo(3f, 3f)
            lineTo(21f, 21f)
        }
        }.build()

        return _flagOff!!
    }

private var _flagOff: ImageVector? = null
