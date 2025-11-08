package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ChatNotification: ImageVector
    get() {
        if (_chatNotification != null) {
            return _chatNotification!!
        }
        _chatNotification = ImageVector.Builder(
            name = "ChatNotification",
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
        moveTo(12.0045f, 10.5f)
        horizontalLineTo(12.0135f)
        moveTo(16f, 10.5f)
        horizontalLineTo(16.009f)
        moveTo(8.009f, 10.5f)
        horizontalLineTo(8.01797f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.9693f, 2.51851f)
        curveTo(13.3258f, 2.50631f, 12.6684f, 2.5f, 12f, 2.5f)
        curveTo(10.5209f, 2.5f, 9.09517f, 2.5309f, 7.7562f, 2.58819f)
        curveTo(5.3157f, 2.6926f, 4.09545f, 2.74481f, 3.13007f, 3.71745f)
        curveTo(2.16469f, 4.69009f, 2.12282f, 5.87683f, 2.03909f, 8.2503f)
        curveTo(2.01346f, 8.97679f, 2f, 9.72921f, 2f, 10.5f)
        curveTo(2f, 11.2708f, 2.01346f, 12.0232f, 2.03909f, 12.7497f)
        curveTo(2.12282f, 15.1232f, 2.16469f, 16.3099f, 3.13007f, 17.2825f)
        curveTo(4.09545f, 18.2552f, 5.31569f, 18.3074f, 7.75619f, 18.4118f)
        curveTo(7.83715f, 18.4153f, 7.91842f, 18.4186f, 8f, 18.4219f)
        verticalLineTo(20.7701f)
        curveTo(8f, 21.1732f, 8.32679f, 21.5f, 8.72991f, 21.5f)
        curveTo(8.90419f, 21.5f, 9.07273f, 21.4376f, 9.20503f, 21.3242f)
        lineTo(11.3845f, 19.4553f)
        curveTo(11.9325f, 18.9855f, 12.2064f, 18.7506f, 12.532f, 18.6266f)
        curveTo(12.8576f, 18.5026f, 13.2282f, 18.4955f, 13.9693f, 18.4815f)
        curveTo(14.7498f, 18.4667f, 15.5098f, 18.4432f, 16.2437f, 18.4118f)
        curveTo(18.6843f, 18.3074f, 19.9046f, 18.2552f, 20.8699f, 17.2826f)
        curveTo(21.8353f, 16.3099f, 21.8772f, 15.1232f, 21.9609f, 12.7497f)
        curveTo(21.9865f, 12.0232f, 22f, 11.2708f, 22f, 10.5f)
        curveTo(22f, 10.3324f, 21.9994f, 10.1657f, 21.9981f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22.0001f, 5f)
        curveTo(22.0001f, 6.38071f, 20.8808f, 7.5f, 19.5001f, 7.5f)
        curveTo(18.1193f, 7.5f, 17.0001f, 6.38071f, 17.0001f, 5f)
        curveTo(17.0001f, 3.61929f, 18.1193f, 2.5f, 19.5001f, 2.5f)
        curveTo(20.8808f, 2.5f, 22.0001f, 3.61929f, 22.0001f, 5f)
        }
        }.build()

        return _chatNotification!!
    }

private var _chatNotification: ImageVector? = null
