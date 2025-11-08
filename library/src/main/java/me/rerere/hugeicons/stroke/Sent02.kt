package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Sent02: ImageVector
    get() {
        if (_sent02 != null) {
            return _sent02!!
        }
        _sent02 = ImageVector.Builder(
            name = "Sent02",
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
        moveTo(9.49811f, 15f)
        lineTo(16.9981f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.00634f, 7.67888f)
        lineTo(15.327f, 4.21881f)
        curveTo(18.3688f, 2.78111f, 19.8897f, 2.06226f, 20.8598f, 2.78341f)
        curveTo(21.8299f, 3.50455f, 21.5527f, 5.14799f, 20.9984f, 8.43486f)
        lineTo(20.0435f, 14.0968f)
        curveTo(19.6811f, 16.246f, 19.4998f, 17.3205f, 18.6989f, 17.7891f)
        curveTo(17.8979f, 18.2577f, 16.8574f, 17.8978f, 14.7765f, 17.178f)
        lineTo(8.41077f, 14.9762f)
        curveTo(4.51917f, 13.6301f, 2.57337f, 12.9571f, 2.50019f, 11.6365f)
        curveTo(2.427f, 10.3159f, 4.28678f, 9.43692f, 8.00634f, 7.67888f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.49811f, 15.5f)
        verticalLineTo(17.7274f)
        curveTo(9.49811f, 20.101f, 9.49811f, 21.2878f, 10.2083f, 21.4771f)
        curveTo(10.9185f, 21.6663f, 11.6664f, 20.6789f, 13.1622f, 18.7039f)
        lineTo(13.9981f, 17.5f)
        }
        }.build()

        return _sent02!!
    }

private var _sent02: ImageVector? = null
