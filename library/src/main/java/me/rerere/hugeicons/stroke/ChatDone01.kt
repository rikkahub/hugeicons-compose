package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ChatDone01: ImageVector
    get() {
        if (_chatDone01 != null) {
            return _chatDone01!!
        }
        _chatDone01 = ImageVector.Builder(
            name = "ChatDone01",
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
        moveTo(12.0045f, 11f)
        horizontalLineTo(12.0135f)
        moveTo(8.00903f, 11f)
        horizontalLineTo(8.018f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 3f)
        curveTo(10.5209f, 3f, 9.09517f, 3.0309f, 7.7562f, 3.08819f)
        curveTo(5.3157f, 3.1926f, 4.09545f, 3.24481f, 3.13007f, 4.21745f)
        curveTo(2.16469f, 5.19009f, 2.12282f, 6.37683f, 2.03909f, 8.7503f)
        curveTo(2.01346f, 9.47679f, 2f, 10.2292f, 2f, 11f)
        curveTo(2f, 11.7708f, 2.01346f, 12.5232f, 2.03909f, 13.2497f)
        curveTo(2.12282f, 15.6232f, 2.16469f, 16.8099f, 3.13007f, 17.7825f)
        curveTo(4.09545f, 18.7552f, 5.31569f, 18.8074f, 7.75619f, 18.9118f)
        curveTo(7.83715f, 18.9153f, 7.91842f, 18.9186f, 8f, 18.9219f)
        verticalLineTo(21.2701f)
        curveTo(8f, 21.6732f, 8.32679f, 22f, 8.72991f, 22f)
        curveTo(8.90419f, 22f, 9.07273f, 21.9376f, 9.20503f, 21.8242f)
        lineTo(11.3845f, 19.9553f)
        curveTo(11.9325f, 19.4855f, 12.2064f, 19.2506f, 12.532f, 19.1266f)
        curveTo(12.8576f, 19.0026f, 13.2282f, 18.9955f, 13.9693f, 18.9815f)
        curveTo(14.7498f, 18.9667f, 15.5098f, 18.9432f, 16.2437f, 18.9118f)
        curveTo(18.6843f, 18.8074f, 19.9046f, 18.7552f, 20.8699f, 17.7826f)
        curveTo(21.8353f, 16.8099f, 21.8772f, 15.6232f, 21.9609f, 13.2497f)
        curveTo(21.9865f, 12.5232f, 22f, 11.7708f, 22f, 11f)
        curveTo(22f, 10.2292f, 21.9865f, 9.47679f, 21.9609f, 8.7503f)
        curveTo(21.9372f, 8.07936f, 21.9169f, 7.50325f, 21.8781f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 5.33333f)
        curveTo(15f, 5.33333f, 16f, 5.33333f, 17f, 7f)
        curveTo(17f, 7f, 19.1765f, 2.83333f, 22f, 2f)
        }
        }.build()

        return _chatDone01!!
    }

private var _chatDone01: ImageVector? = null
