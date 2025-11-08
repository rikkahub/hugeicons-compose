package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TankTop: ImageVector
    get() {
        if (_tankTop != null) {
            return _tankTop!!
        }
        _tankTop = ImageVector.Builder(
            name = "TankTop",
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
        moveTo(16.6168f, 1f)
        curveTo(16.8637f, 1.76959f, 17f, 2.6141f, 17f, 3.5f)
        curveTo(17f, 7.08985f, 14.7614f, 10f, 12f, 10f)
        curveTo(9.23858f, 10f, 7f, 7.08985f, 7f, 3.5f)
        curveTo(7f, 2.6141f, 7.13633f, 1.76959f, 7.3832f, 1f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5002f, 17f)
        curveTo(19.4331f, 17f, 21f, 15.4315f, 21f, 13.4966f)
        curveTo(21f, 12.2213f, 20.2104f, 11.4762f, 19.6921f, 10.4128f)
        curveTo(18.6981f, 8.37328f, 19.6776f, 5.84899f, 20.2997f, 3.71716f)
        curveTo(20.4253f, 3.28669f, 20.2309f, 2.8325f, 19.8419f, 2.61f)
        lineTo(17.2549f, 1.13018f)
        curveTo(17.0883f, 1.03491f, 16.898f, 0.988697f, 16.7067f, 1.00235f)
        curveTo(15.0599f, 1.11988f, 13.1608f, 1.53312f, 12f, 2.98622f)
        curveTo(10.8392f, 1.53312f, 8.94012f, 1.11988f, 7.29334f, 1.00235f)
        curveTo(7.102f, 0.988697f, 6.91166f, 1.03491f, 6.7451f, 1.13018f)
        lineTo(4.15808f, 2.61f)
        curveTo(3.76911f, 2.8325f, 3.57474f, 3.28669f, 3.70035f, 3.71716f)
        curveTo(4.32241f, 5.84899f, 5.30191f, 8.37328f, 4.30792f, 10.4128f)
        curveTo(3.78962f, 11.4762f, 3f, 12.2213f, 3f, 13.4966f)
        curveTo(3f, 15.4315f, 4.56694f, 17f, 6.49985f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 16.25f)
        curveTo(12.5235f, 15.632f, 11.661f, 15.5364f, 10f, 16.25f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 17f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 17f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 3f)
        curveTo(15.2742f, 3.45112f, 14f, 5.03024f, 14f, 6.90903f)
        curveTo(14f, 7.67442f, 14.2115f, 8.39008f, 14.5788f, 9f)
        moveTo(7f, 3f)
        curveTo(8.72577f, 3.45112f, 10f, 5.03024f, 10f, 6.90903f)
        curveTo(10f, 7.67442f, 9.78852f, 8.39008f, 9.4212f, 9f)
        }
        }.build()

        return _tankTop!!
    }

private var _tankTop: ImageVector? = null
