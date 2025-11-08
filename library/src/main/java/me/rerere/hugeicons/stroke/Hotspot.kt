package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Hotspot: ImageVector
    get() {
        if (_hotspot != null) {
            return _hotspot!!
        }
        _hotspot = ImageVector.Builder(
            name = "Hotspot",
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
        moveTo(4.00018f, 20.001f)
        curveTo(2.74436f, 18.3295f, 2.00018f, 16.2516f, 2.00018f, 14f)
        curveTo(2.00018f, 8.47715f, 6.47734f, 4f, 12.0002f, 4f)
        curveTo(17.523f, 4f, 22.0002f, 8.47715f, 22.0002f, 14f)
        curveTo(22.0002f, 16.2516f, 21.256f, 18.3295f, 20.0002f, 20.001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.52797f, 18f)
        curveTo(6.57789f, 16.9385f, 6.00018f, 15.5367f, 6.00018f, 14f)
        curveTo(6.00018f, 10.6863f, 8.68647f, 8f, 12.0002f, 8f)
        curveTo(15.3139f, 8f, 18.0002f, 10.6863f, 18.0002f, 14f)
        curveTo(18.0002f, 15.5367f, 17.4225f, 16.9385f, 16.4724f, 18f)
        }
        }.build()

        return _hotspot!!
    }

private var _hotspot: ImageVector? = null
