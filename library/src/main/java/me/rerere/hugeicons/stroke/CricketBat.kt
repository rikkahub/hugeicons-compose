package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CricketBat: ImageVector
    get() {
        if (_cricketBat != null) {
            return _cricketBat!!
        }
        _cricketBat = ImageVector.Builder(
            name = "CricketBat",
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
        moveTo(7f, 14.4733f)
        curveTo(7f, 14.9338f, 7f, 15.1641f, 7.08576f, 15.3711f)
        curveTo(7.17152f, 15.5782f, 7.33434f, 15.741f, 7.65998f, 16.0666f)
        lineTo(7.93335f, 16.34f)
        curveTo(8.25899f, 16.6657f, 8.42181f, 16.8285f, 8.62886f, 16.9142f)
        curveTo(8.83591f, 17f, 9.06617f, 17f, 9.52669f, 17f)
        horizontalLineTo(10.38f)
        curveTo(11.0708f, 17f, 11.4162f, 17f, 11.7267f, 16.8714f)
        curveTo(12.0373f, 16.7427f, 12.2815f, 16.4985f, 12.77f, 16.01f)
        lineTo(20.5434f, 8.23666f)
        curveTo(21.2858f, 7.49425f, 21.657f, 7.12305f, 21.8285f, 6.70896f)
        curveTo(22.0572f, 6.15683f, 22.0572f, 5.53647f, 21.8285f, 4.98435f)
        curveTo(21.657f, 4.57025f, 21.2858f, 4.19905f, 20.5434f, 3.45665f)
        curveTo(19.8009f, 2.71425f, 19.4297f, 2.34305f, 19.0157f, 2.17152f)
        curveTo(18.4635f, 1.94283f, 17.8432f, 1.94283f, 17.291f, 2.17152f)
        curveTo(16.8769f, 2.34305f, 16.5057f, 2.71425f, 15.7633f, 3.45665f)
        lineTo(7.98997f, 11.23f)
        curveTo(7.50151f, 11.7185f, 7.25728f, 11.9627f, 7.12864f, 12.2733f)
        curveTo(7f, 12.5838f, 7f, 12.9292f, 7f, 13.62f)
        verticalLineTo(14.4733f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.92517f, 15f)
        lineTo(2.42971f, 19.4955f)
        curveTo(1.85676f, 20.0684f, 1.85676f, 20.9973f, 2.42971f, 21.5703f)
        curveTo(3.00266f, 22.1432f, 3.93159f, 22.1432f, 4.50454f, 21.5703f)
        lineTo(9f, 17.0748f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.5f, 20f)
        lineTo(4f, 17.5f)
        }
        }.build()

        return _cricketBat!!
    }

private var _cricketBat: ImageVector? = null
