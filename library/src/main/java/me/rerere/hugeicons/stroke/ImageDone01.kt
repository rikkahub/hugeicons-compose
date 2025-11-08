package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ImageDone01: ImageVector
    get() {
        if (_imageDone01 != null) {
            return _imageDone01!!
        }
        _imageDone01 = ImageVector.Builder(
            name = "ImageDone01",
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
        moveTo(11.5f, 3.00024f)
        curveTo(7.02164f, 3.00024f, 4.78247f, 3.00024f, 3.39123f, 4.39149f)
        curveTo(1.99998f, 5.78273f, 1.99998f, 8.0219f, 1.99998f, 12.5002f)
        curveTo(1.99998f, 16.9786f, 1.99998f, 19.2178f, 3.39123f, 20.609f)
        curveTo(4.78247f, 22.0002f, 7.02164f, 22.0002f, 11.5f, 22.0002f)
        curveTo(15.9783f, 22.0002f, 18.2175f, 22.0002f, 19.6087f, 20.609f)
        curveTo(21f, 19.2178f, 21f, 16.9786f, 21f, 12.5002f)
        curveTo(21f, 11.14f, 21f, 9.98632f, 20.961f, 9.00024f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.49998f, 21.5002f)
        curveTo(8.87244f, 16.2752f, 13.774f, 9.38425f, 20.9975f, 14.0426f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 6.00024f)
        curveTo(14f, 6.00024f, 15f, 6.00024f, 16f, 8.00024f)
        curveTo(16f, 8.00024f, 19.1765f, 3.00024f, 22f, 2.00024f)
        }
        }.build()

        return _imageDone01!!
    }

private var _imageDone01: ImageVector? = null
