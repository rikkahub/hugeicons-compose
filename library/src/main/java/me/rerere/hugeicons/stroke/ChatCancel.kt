package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ChatCancel: ImageVector
    get() {
        if (_chatCancel != null) {
            return _chatCancel!!
        }
        _chatCancel = ImageVector.Builder(
            name = "ChatCancel",
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
        moveTo(2f, 10.5f)
        curveTo(2f, 9.72921f, 2.01346f, 8.97679f, 2.03909f, 8.2503f)
        curveTo(2.12282f, 5.87683f, 2.16469f, 4.69009f, 3.13007f, 3.71745f)
        curveTo(4.09545f, 2.74481f, 5.3157f, 2.6926f, 7.7562f, 2.58819f)
        curveTo(9.09517f, 2.5309f, 10.5209f, 2.5f, 12f, 2.5f)
        curveTo(13.4791f, 2.5f, 14.9048f, 2.5309f, 16.2438f, 2.58819f)
        curveTo(18.6843f, 2.6926f, 19.9046f, 2.74481f, 20.8699f, 3.71745f)
        curveTo(21.8353f, 4.69009f, 21.8772f, 5.87683f, 21.9609f, 8.2503f)
        curveTo(21.9865f, 8.97679f, 22f, 9.72921f, 22f, 10.5f)
        curveTo(22f, 11.2708f, 21.9865f, 12.0232f, 21.9609f, 12.7497f)
        curveTo(21.8772f, 15.1232f, 21.8353f, 16.3099f, 20.8699f, 17.2826f)
        curveTo(19.9046f, 18.2552f, 18.6843f, 18.3074f, 16.2437f, 18.4118f)
        curveTo(15.5098f, 18.4432f, 14.7498f, 18.4667f, 13.9693f, 18.4815f)
        curveTo(13.2282f, 18.4955f, 12.8576f, 18.5026f, 12.532f, 18.6266f)
        curveTo(12.2064f, 18.7506f, 11.9325f, 18.9855f, 11.3845f, 19.4553f)
        lineTo(9.20503f, 21.3242f)
        curveTo(9.07273f, 21.4376f, 8.90419f, 21.5f, 8.72991f, 21.5f)
        curveTo(8.32679f, 21.5f, 8f, 21.1732f, 8f, 20.7701f)
        verticalLineTo(18.4219f)
        curveTo(7.91842f, 18.4186f, 7.83715f, 18.4153f, 7.75619f, 18.4118f)
        curveTo(5.31569f, 18.3074f, 4.09545f, 18.2552f, 3.13007f, 17.2825f)
        curveTo(2.16469f, 16.3099f, 2.12282f, 15.1232f, 2.03909f, 12.7497f)
        curveTo(2.01346f, 12.0232f, 2f, 11.2708f, 2f, 10.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 13.5f)
        lineTo(9f, 7.5f)
        moveTo(15f, 7.5f)
        lineTo(9f, 13.5f)
        }
        }.build()

        return _chatCancel!!
    }

private var _chatCancel: ImageVector? = null
