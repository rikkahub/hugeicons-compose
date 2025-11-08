package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Whisk: ImageVector
    get() {
        if (_whisk != null) {
            return _whisk!!
        }
        _whisk = ImageVector.Builder(
            name = "Whisk",
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
        moveTo(20.0209f, 11.0209f)
        curveTo(17.6875f, 13.3544f, 14.2194f, 13.6697f, 12.2749f, 11.7251f)
        curveTo(10.3303f, 9.78056f, 10.6456f, 6.31254f, 12.9791f, 3.97907f)
        curveTo(15.3125f, 1.64561f, 18.7806f, 1.33034f, 20.7251f, 3.27489f)
        curveTo(22.6697f, 5.21944f, 22.3544f, 8.68746f, 20.0209f, 11.0209f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.9226f, 8.92264f)
        curveTo(15.5655f, 11.2797f, 13.0178f, 12.5536f, 12.2321f, 11.7679f)
        curveTo(11.4464f, 10.9822f, 12.7203f, 8.43447f, 15.0774f, 6.07736f)
        curveTo(17.4345f, 3.72026f, 19.9822f, 2.44638f, 20.7679f, 3.23208f)
        curveTo(21.5536f, 4.01778f, 20.2797f, 6.56553f, 17.9226f, 8.92264f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.54773f, 18.636f)
        lineTo(4.63604f, 21.5477f)
        curveTo(4.03301f, 22.1508f, 3.0553f, 22.1508f, 2.45227f, 21.5477f)
        curveTo(1.84924f, 20.9447f, 1.84924f, 19.967f, 2.45227f, 19.364f)
        lineTo(5.36396f, 16.4523f)
        curveTo(5.96699f, 15.8492f, 6.9447f, 15.8492f, 7.54773f, 16.4523f)
        curveTo(8.15076f, 17.0553f, 8.15076f, 18.033f, 7.54773f, 18.636f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 16f)
        lineTo(12f, 12f)
        }
        }.build()

        return _whisk!!
    }

private var _whisk: ImageVector? = null
