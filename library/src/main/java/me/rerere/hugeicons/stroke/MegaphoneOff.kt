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

val HugeIcons.MegaphoneOff: ImageVector
    get() {
        if (_megaphoneOff != null) {
            return _megaphoneOff!!
        }
        _megaphoneOff = ImageVector.Builder(
            name = "MegaphoneOff",
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
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(1.99609f, 2f)
            lineTo(21.9961f, 22f)
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
            moveTo(10.5703f, 6.5f)
            lineTo(14.9221f, 4.41103f)
            curveTo(16.4493f, 3.67794f, 17.2129f, 3.3114f, 18.0642f, 3.5971f)
            curveTo(18.9156f, 3.88281f, 19.2078f, 4.49586f, 19.7922f, 5.72196f)
            curveTo(21.1971f, 8.66932f, 21.3721f, 11.9657f, 20.3174f, 15f)
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
            moveTo(7.49609f, 7.83269f)
            curveTo(7.21995f, 7.86593f, 6.93778f, 7.85078f, 6.65284f, 7.78695f)
            curveTo(6.28786f, 7.70519f, 6.10535f, 7.66431f, 5.9584f, 7.64752f)
            curveTo(4.13352f, 7.43913f, 2.99609f, 8.88344f, 2.99609f, 10.5443f)
            verticalLineTo(11.4558f)
            curveTo(2.99609f, 13.1166f, 4.13352f, 14.5609f, 5.9584f, 14.3525f)
            curveTo(6.10535f, 14.3357f, 6.28787f, 14.2948f, 6.65284f, 14.2131f)
            curveTo(7.21053f, 14.0882f, 7.7576f, 14.1497f, 8.26962f, 14.3955f)
            lineTo(14.9223f, 17.589f)
            curveTo(16.4495f, 18.3221f, 17.2131f, 18.6886f, 18.0645f, 18.4029f)
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
            moveTo(12.9961f, 17f)
            verticalLineTo(17.5f)
            curveTo(12.9961f, 18.7841f, 12.9961f, 19.4261f, 12.7721f, 19.7886f)
            curveTo(12.4734f, 20.2719f, 11.9272f, 20.545f, 11.3614f, 20.4939f)
            curveTo(10.937f, 20.4557f, 10.4234f, 20.0704f, 9.39609f, 19.3f)
            lineTo(8.19609f, 18.4f)
            curveTo(7.21863f, 17.6669f, 6.99609f, 17.2218f, 6.99609f, 16f)
            verticalLineTo(14.5f)
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
            moveTo(7.49609f, 14f)
            verticalLineTo(8f)
        }
        }.build()

        return _megaphoneOff!!
    }

private var _megaphoneOff: ImageVector? = null
