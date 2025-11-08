package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BorderRight02: ImageVector
    get() {
        if (_borderRight02 != null) {
            return _borderRight02!!
        }
        _borderRight02 = ImageVector.Builder(
            name = "BorderRight02",
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
        moveTo(6.33333f, 2.75143f)
        curveTo(5.28498f, 2.94471f, 4.51342f, 3.28657f, 3.90345f, 3.89124f)
        curveTo(3.29347f, 4.49591f, 2.94861f, 5.26076f, 2.75363f, 6.3f)
        moveTo(14f, 2.50496f)
        curveTo(13.4105f, 2.5f, 12.7732f, 2.5f, 12.0833f, 2.5f)
        curveTo(11.3934f, 2.5f, 10.7562f, 2.5f, 10.1666f, 2.50496f)
        moveTo(2.505f, 10.1f)
        curveTo(2.5f, 10.6844f, 2.5f, 11.3161f, 2.5f, 12f)
        curveTo(2.5f, 12.6839f, 2.5f, 13.3156f, 2.505f, 13.9001f)
        moveTo(2.75363f, 17.7f)
        curveTo(2.94861f, 18.7392f, 3.29347f, 19.5041f, 3.90345f, 20.1088f)
        curveTo(4.51342f, 20.7134f, 5.28498f, 21.0553f, 6.33333f, 21.2486f)
        moveTo(14f, 21.495f)
        curveTo(13.4107f, 21.5f, 12.7729f, 21.5f, 12.0833f, 21.5f)
        curveTo(11.3935f, 21.5f, 10.7563f, 21.5f, 10.1668f, 21.495f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 2.5f)
        curveTo(18.5939f, 2.69854f, 19.399f, 3.04969f, 20.0355f, 3.6708f)
        curveTo(21.5f, 5.09987f, 21.5f, 7.39991f, 21.5f, 12f)
        curveTo(21.5f, 16.6001f, 21.5f, 18.9001f, 20.0355f, 20.3292f)
        curveTo(19.399f, 20.9503f, 18.5939f, 21.3015f, 17.5f, 21.5f)
        }
        }.build()

        return _borderRight02!!
    }

private var _borderRight02: ImageVector? = null
