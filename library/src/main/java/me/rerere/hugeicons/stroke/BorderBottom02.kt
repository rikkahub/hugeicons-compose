package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BorderBottom02: ImageVector
    get() {
        if (_borderBottom02 != null) {
            return _borderBottom02!!
        }
        _borderBottom02 = ImageVector.Builder(
            name = "BorderBottom02",
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
        moveTo(21.2486f, 6.33333f)
        curveTo(21.0553f, 5.28498f, 20.7134f, 4.51342f, 20.1088f, 3.90345f)
        curveTo(19.5041f, 3.29347f, 18.7392f, 2.94861f, 17.7f, 2.75363f)
        moveTo(21.495f, 14f)
        curveTo(21.5f, 13.4105f, 21.5f, 12.7732f, 21.5f, 12.0833f)
        curveTo(21.5f, 11.3934f, 21.5f, 10.7562f, 21.495f, 10.1666f)
        moveTo(13.9f, 2.505f)
        curveTo(13.3156f, 2.5f, 12.6839f, 2.5f, 12f, 2.5f)
        curveTo(11.3161f, 2.5f, 10.6844f, 2.5f, 10.0999f, 2.505f)
        moveTo(6.3f, 2.75363f)
        curveTo(5.26076f, 2.94861f, 4.49591f, 3.29347f, 3.89124f, 3.90345f)
        curveTo(3.28657f, 4.51342f, 2.94471f, 5.28497f, 2.75143f, 6.33333f)
        moveTo(2.50495f, 14f)
        curveTo(2.5f, 13.4107f, 2.5f, 12.7729f, 2.5f, 12.0833f)
        curveTo(2.5f, 11.3935f, 2.5f, 10.7563f, 2.50495f, 10.1668f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.5f, 17.5f)
        curveTo(21.3015f, 18.5939f, 20.9503f, 19.399f, 20.3292f, 20.0355f)
        curveTo(18.9001f, 21.5f, 16.6001f, 21.5f, 12f, 21.5f)
        curveTo(7.39991f, 21.5f, 5.09987f, 21.5f, 3.6708f, 20.0355f)
        curveTo(3.04969f, 19.399f, 2.69854f, 18.5939f, 2.5f, 17.5f)
        }
        }.build()

        return _borderBottom02!!
    }

private var _borderBottom02: ImageVector? = null
