package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ChatFeedback01: ImageVector
    get() {
        if (_chatFeedback01 != null) {
            return _chatFeedback01!!
        }
        _chatFeedback01 = ImageVector.Builder(
            name = "ChatFeedback01",
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
        moveTo(7.5f, 8.5f)
        horizontalLineTo(16.5f)
        moveTo(7.5f, 12.5f)
        horizontalLineTo(13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 10.5f)
        curveTo(22f, 9.72921f, 21.9865f, 8.97679f, 21.9609f, 8.2503f)
        curveTo(21.8772f, 5.87683f, 21.8353f, 4.69009f, 20.8699f, 3.71745f)
        curveTo(19.9046f, 2.74481f, 18.6843f, 2.6926f, 16.2438f, 2.58819f)
        curveTo(14.9048f, 2.5309f, 13.4791f, 2.5f, 12f, 2.5f)
        curveTo(10.5209f, 2.5f, 9.09517f, 2.5309f, 7.7562f, 2.58819f)
        curveTo(5.3157f, 2.6926f, 4.09545f, 2.74481f, 3.13007f, 3.71745f)
        curveTo(2.16469f, 4.69009f, 2.12282f, 5.87683f, 2.03909f, 8.2503f)
        curveTo(2.01346f, 8.97679f, 2f, 9.72921f, 2f, 10.5f)
        curveTo(2f, 11.2708f, 2.01346f, 12.0232f, 2.03909f, 12.7497f)
        curveTo(2.12282f, 15.1232f, 2.16469f, 16.3099f, 3.13007f, 17.2826f)
        curveTo(4.09545f, 18.2552f, 5.31573f, 18.3074f, 7.7563f, 18.4118f)
        curveTo(8.4902f, 18.4432f, 9.25016f, 18.4667f, 10.0307f, 18.4815f)
        curveTo(10.7718f, 18.4955f, 11.1424f, 18.5026f, 11.468f, 18.6266f)
        curveTo(11.7936f, 18.7506f, 12.0675f, 18.9855f, 12.6155f, 19.4553f)
        lineTo(14.795f, 21.3242f)
        curveTo(14.9273f, 21.4376f, 15.0958f, 21.5f, 15.2701f, 21.5f)
        curveTo(15.6732f, 21.5f, 16f, 21.1732f, 16f, 20.7701f)
        verticalLineTo(18.4219f)
        curveTo(16.0816f, 18.4186f, 16.1629f, 18.4153f, 16.2438f, 18.4118f)
        curveTo(18.6843f, 18.3074f, 19.9046f, 18.2552f, 20.8699f, 17.2825f)
        curveTo(21.8353f, 16.3099f, 21.8772f, 15.1232f, 21.9609f, 12.7497f)
        curveTo(21.9865f, 12.0232f, 22f, 11.2708f, 22f, 10.5f)
        }
        }.build()

        return _chatFeedback01!!
    }

private var _chatFeedback01: ImageVector? = null
