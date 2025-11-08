package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Energy: ImageVector
    get() {
        if (_energy != null) {
            return _energy!!
        }
        _energy = ImageVector.Builder(
            name = "Energy",
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
        moveTo(6.19351f, 11.3965f)
        lineTo(12.192f, 3.31186f)
        curveTo(12.6611f, 2.67957f, 13.5405f, 3.07311f, 13.5405f, 3.91536f)
        verticalLineTo(10.1729f)
        curveTo(13.5405f, 10.6775f, 13.8853f, 11.0865f, 14.3107f, 11.0865f)
        horizontalLineTo(17.2283f)
        curveTo(17.891f, 11.0865f, 18.2443f, 12.0134f, 17.8065f, 12.6035f)
        lineTo(11.808f, 20.6881f)
        curveTo(11.3389f, 21.3204f, 10.4595f, 20.9269f, 10.4595f, 20.0846f)
        verticalLineTo(13.8271f)
        curveTo(10.4595f, 13.3225f, 10.1147f, 12.9135f, 9.68931f, 12.9135f)
        horizontalLineTo(6.77173f)
        curveTo(6.10895f, 12.9135f, 5.75566f, 11.9866f, 6.19351f, 11.3965f)
        }
        }.build()

        return _energy!!
    }

private var _energy: ImageVector? = null
