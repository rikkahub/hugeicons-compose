package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Flower: ImageVector
    get() {
        if (_flower != null) {
            return _flower!!
        }
        _flower = ImageVector.Builder(
            name = "Flower",
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
        moveTo(14.4999f, 12.5f)
        curveTo(14.4999f, 13.8807f, 13.3807f, 15f, 11.9999f, 15f)
        curveTo(10.6192f, 15f, 9.49994f, 13.8807f, 9.49994f, 12.5f)
        curveTo(9.49994f, 11.1193f, 10.6192f, 10f, 11.9999f, 10f)
        curveTo(13.3807f, 10f, 14.4999f, 11.1193f, 14.4999f, 12.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9999f, 3f)
        curveTo(14.2091f, 3f, 15.998f, 4.91739f, 15.998f, 7.12653f)
        curveTo(16.3182f, 7.04393f, 16.6539f, 7f, 16.9999f, 7f)
        curveTo(19.2091f, 7f, 20.9999f, 8.79086f, 20.9999f, 11f)
        curveTo(20.9999f, 12.5964f, 20.0647f, 13.9745f, 18.7122f, 14.616f)
        curveTo(19.2071f, 15.2818f, 19.4999f, 16.1067f, 19.4999f, 17f)
        curveTo(19.4999f, 19.2091f, 17.7091f, 21f, 15.4999f, 21f)
        curveTo(13.9939f, 21f, 12.6823f, 20.1677f, 11.9999f, 18.938f)
        curveTo(11.3176f, 20.1677f, 10.006f, 21f, 8.49994f, 21f)
        curveTo(6.2908f, 21f, 4.49994f, 19.2091f, 4.49994f, 17f)
        curveTo(4.49994f, 16.1067f, 4.79277f, 15.2818f, 5.28767f, 14.616f)
        curveTo(3.93518f, 13.9745f, 2.99994f, 12.5964f, 2.99994f, 11f)
        curveTo(2.99994f, 8.79086f, 4.7908f, 7f, 6.99994f, 7f)
        curveTo(7.34595f, 7f, 7.68169f, 7.04393f, 8.0019f, 7.12652f)
        curveTo(8.0019f, 4.91738f, 9.7908f, 3f, 11.9999f, 3f)
        }
        }.build()

        return _flower!!
    }

private var _flower: ImageVector? = null
