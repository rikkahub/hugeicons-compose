package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Underpants02: ImageVector
    get() {
        if (_underpants02 != null) {
            return _underpants02!!
        }
        _underpants02 = ImageVector.Builder(
            name = "Underpants02",
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
        moveTo(21.9359f, 12.8119f)
        lineTo(20.9746f, 8.18614f)
        curveTo(20.6575f, 6.66014f, 20.4989f, 5.89714f, 19.9475f, 5.44857f)
        curveTo(19.3962f, 5f, 18.6169f, 5f, 17.0583f, 5f)
        horizontalLineTo(6.94174f)
        curveTo(5.38314f, 5f, 4.60384f, 5f, 4.05247f, 5.44857f)
        curveTo(3.50109f, 5.89714f, 3.34253f, 6.66014f, 3.02541f, 8.18614f)
        lineTo(2.06412f, 12.8119f)
        curveTo(1.86911f, 13.7503f, 2.08272f, 14.7586f, 3.20996f, 14.9718f)
        curveTo(3.87746f, 15.0981f, 4.5865f, 14.9574f, 5.26274f, 15.0369f)
        curveTo(6.77164f, 15.2142f, 8.12412f, 16.0187f, 8.96376f, 17.2382f)
        curveTo(9.69923f, 18.5906f, 10.405f, 19f, 12f, 19f)
        curveTo(13.595f, 19f, 14.3008f, 18.5906f, 15.0362f, 17.2382f)
        curveTo(15.8759f, 16.0187f, 17.2284f, 15.2142f, 18.7373f, 15.0369f)
        curveTo(19.4135f, 14.9574f, 20.1225f, 15.0981f, 20.79f, 14.9718f)
        curveTo(21.9173f, 14.7586f, 22.1309f, 13.7503f, 21.9359f, 12.8119f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 16f)
        lineTo(13.8914f, 8f)
        moveTo(8f, 16f)
        lineTo(10.1086f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.5f, 8f)
        horizontalLineTo(20.5f)
        }
        }.build()

        return _underpants02!!
    }

private var _underpants02: ImageVector? = null
