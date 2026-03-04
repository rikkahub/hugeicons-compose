package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.EidMubarak: ImageVector
    get() {
        if (_eidMubarak != null) {
            return _eidMubarak!!
        }
        _eidMubarak = ImageVector.Builder(
            name = "EidMubarak",
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
        moveTo(2.5f, 11.8049f)
        curveTo(2.5f, 17.1594f, 6.84065f, 21.5f, 12.1951f, 21.5f)
        curveTo(16.601f, 21.5f, 20.3204f, 18.5611f, 21.5f, 14.5367f)
        curveTo(20.0791f, 15.5691f, 18.3306f, 16.1779f, 16.44f, 16.1779f)
        curveTo(11.6804f, 16.1779f, 7.82208f, 12.3196f, 7.82208f, 7.56005f)
        curveTo(7.82208f, 5.66937f, 8.43094f, 3.9209f, 9.46326f, 2.5f)
        curveTo(5.4389f, 3.67959f, 2.5f, 7.39904f, 2.5f, 11.8049f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.2503f, 8.5f)
        curveTo(10.8263f, 5.5f, 14.9612f, 4f, 15.9999f, 2.5f)
        curveTo(17.0388f, 4f, 21.1737f, 5.5f, 18.7497f, 8.5f)
        moveTo(13.2503f, 8.5f)
        horizontalLineTo(18.7497f)
        moveTo(13.2503f, 8.5f)
        verticalLineTo(15.5f)
        moveTo(18.7497f, 8.5f)
        verticalLineTo(15.5f)
        }
        }.build()

        return _eidMubarak!!
    }

private var _eidMubarak: ImageVector? = null
