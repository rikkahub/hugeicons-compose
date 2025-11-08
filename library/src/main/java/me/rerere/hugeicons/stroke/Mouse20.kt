package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Mouse20: ImageVector
    get() {
        if (_mouse20 != null) {
            return _mouse20!!
        }
        _mouse20 = ImageVector.Builder(
            name = "Mouse20",
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
        moveTo(12f, 6f)
        verticalLineTo(2.5f)
        moveTo(12f, 12f)
        verticalLineTo(10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.32948f, 4.4758f)
        curveTo(8.3873f, 4.23124f, 9.44531f, 3.70349f, 10.5038f, 2.89255f)
        curveTo(11.2805f, 2.29747f, 11.6689f, 1.99993f, 12.0012f, 2f)
        curveTo(12.3334f, 2.00007f, 12.7219f, 2.29794f, 13.4988f, 2.89369f)
        curveTo(14.5555f, 3.70396f, 15.6126f, 4.23133f, 16.6698f, 4.47578f)
        curveTo(17.4472f, 4.65552f, 17.8358f, 4.74538f, 18.0319f, 4.92956f)
        curveTo(18.228f, 5.11373f, 18.3175f, 5.40051f, 18.4964f, 5.97405f)
        curveTo(20.7629f, 13.2374f, 19.2955f, 19.4907f, 13.0181f, 21.7565f)
        curveTo(12.5682f, 21.9188f, 12.3433f, 22f, 12.0018f, 22f)
        curveTo(11.6603f, 22f, 11.4354f, 21.9188f, 10.9855f, 21.7565f)
        curveTo(4.70756f, 19.4907f, 3.23607f, 13.2373f, 5.50297f, 5.97386f)
        curveTo(5.68195f, 5.4004f, 5.77144f, 5.11367f, 5.96751f, 4.92951f)
        curveTo(6.16359f, 4.74535f, 6.55222f, 4.6555f, 7.32948f, 4.4758f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 7.5f)
        curveTo(10.5f, 7.03406f, 10.5f, 6.80109f, 10.5761f, 6.61732f)
        curveTo(10.6776f, 6.37229f, 10.8723f, 6.17761f, 11.1173f, 6.07612f)
        curveTo(11.3011f, 6f, 11.5341f, 6f, 12f, 6f)
        curveTo(12.4659f, 6f, 12.6989f, 6f, 12.8827f, 6.07612f)
        curveTo(13.1277f, 6.17761f, 13.3224f, 6.37229f, 13.4239f, 6.61732f)
        curveTo(13.5f, 6.80109f, 13.5f, 7.03406f, 13.5f, 7.5f)
        verticalLineTo(8.5f)
        curveTo(13.5f, 8.96594f, 13.5f, 9.19891f, 13.4239f, 9.38268f)
        curveTo(13.3224f, 9.62771f, 13.1277f, 9.82239f, 12.8827f, 9.92388f)
        curveTo(12.6989f, 10f, 12.4659f, 10f, 12f, 10f)
        curveTo(11.5341f, 10f, 11.3011f, 10f, 11.1173f, 9.92388f)
        curveTo(10.8723f, 9.82239f, 10.6776f, 9.62771f, 10.5761f, 9.38268f)
        curveTo(10.5f, 9.19891f, 10.5f, 8.96594f, 10.5f, 8.5f)
        verticalLineTo(7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 17f)
        curveTo(14.0126f, 17.6704f, 13.4275f, 18.2232f, 12.7332f, 18.6351f)
        curveTo(12.4273f, 18.8166f, 12.2743f, 18.9074f, 12f, 18.9074f)
        curveTo(11.7257f, 18.9074f, 11.5727f, 18.8166f, 11.2668f, 18.6351f)
        curveTo(10.5725f, 18.2232f, 9.98741f, 17.6704f, 9.5f, 17f)
        }
        }.build()

        return _mouse20!!
    }

private var _mouse20: ImageVector? = null
