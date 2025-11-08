package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LockKey: ImageVector
    get() {
        if (_lockKey != null) {
            return _lockKey!!
        }
        _lockKey = ImageVector.Builder(
            name = "LockKey",
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
        moveTo(18f, 10.9971f)
        curveTo(17.6078f, 10.1968f, 16.5481f, 9.02153f, 14.3703f, 9.07154f)
        curveTo(14.3703f, 9.07154f, 12.6431f, 8.99652f, 10.6906f, 8.99652f)
        curveTo(8.73815f, 8.99652f, 7.82408f, 9.04224f, 6.25999f, 9.07154f)
        curveTo(5.25872f, 9.04653f, 3.35629f, 9.2716f, 2.48018f, 11.3472f)
        curveTo(1.90445f, 13.0976f, 1.87941f, 16.7736f, 2.22986f, 18.6241f)
        curveTo(2.30496f, 19.5744f, 2.80559f, 20.8998f, 4.35757f, 21.6f)
        curveTo(5.30878f, 22.1001f, 6.83573f, 21.9f, 7.9872f, 22.0001f)
        moveTo(5.98465f, 8.1963f)
        curveTo(5.93458f, 5.82065f, 5.83445f, 3.94514f, 8.58796f, 2.39472f)
        curveTo(9.51414f, 2.01962f, 10.8909f, 1.69453f, 12.5931f, 2.49475f)
        curveTo(14.3703f, 3.57004f, 14.5917f, 4.70802f, 14.7458f, 4.99543f)
        curveTo(15.1713f, 6.12074f, 14.9461f, 7.72117f, 14.9961f, 8.37135f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5f, 19.7351f)
        curveTo(15.5f, 20.9792f, 14.4911f, 21.9656f, 13.2552f, 21.9656f)
        curveTo(12.0194f, 21.9656f, 11f, 20.9792f, 11f, 19.7351f)
        curveTo(11f, 18.4911f, 12.0194f, 17.4915f, 13.2552f, 17.4915f)
        curveTo(14.4911f, 17.4915f, 15.5f, 18.4911f, 15.5f, 19.7351f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.2251f, 17.7909f)
        lineTo(17.2156f, 15.8482f)
        moveTo(22.0001f, 15.8482f)
        lineTo(20.3731f, 14.3089f)
        curveTo(19.6001f, 13.5692f, 18.9501f, 14.2149f, 18.6264f, 14.4906f)
        lineTo(17.2156f, 15.8482f)
        moveTo(17.2156f, 15.8482f)
        lineTo(18.8251f, 17.3936f)
        }
        }.build()

        return _lockKey!!
    }

private var _lockKey: ImageVector? = null
