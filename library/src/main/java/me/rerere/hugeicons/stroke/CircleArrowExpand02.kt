package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CircleArrowExpand02: ImageVector
    get() {
        if (_circleArrowExpand02 != null) {
            return _circleArrowExpand02!!
        }
        _circleArrowExpand02 = ImageVector.Builder(
            name = "CircleArrowExpand02",
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
        moveTo(16.0633f, 16.0634f)
        curveTo(16.5806f, 15.5461f, 16.4946f, 13.3483f, 16.4946f, 13.3483f)
        moveTo(16.0633f, 16.0634f)
        curveTo(15.546f, 16.5808f, 13.3483f, 16.4946f, 13.3483f, 16.4946f)
        moveTo(16.0633f, 16.0634f)
        lineTo(13f, 13f)
        moveTo(7.93655f, 7.93661f)
        curveTo(8.45388f, 7.41928f, 10.6516f, 7.50537f, 10.6516f, 7.50537f)
        moveTo(7.93655f, 7.93661f)
        curveTo(7.41923f, 8.45394f, 7.50538f, 10.6516f, 7.50538f, 10.6516f)
        moveTo(7.93655f, 7.93661f)
        lineTo(11f, 11f)
        }
        }.build()

        return _circleArrowExpand02!!
    }

private var _circleArrowExpand02: ImageVector? = null
