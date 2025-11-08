package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Target02: ImageVector
    get() {
        if (_target02 != null) {
            return _target02!!
        }
        _target02 = ImageVector.Builder(
            name = "Target02",
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
        moveTo(17f, 12f)
        curveTo(17f, 14.7614f, 14.7614f, 17f, 12f, 17f)
        curveTo(9.23858f, 17f, 7f, 14.7614f, 7f, 12f)
        curveTo(7f, 9.23858f, 9.23858f, 7f, 12f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14f, 2.20004f)
        curveTo(13.3538f, 2.06886f, 12.6849f, 2f, 12f, 2f)
        curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        curveTo(22f, 11.3151f, 21.9311f, 10.6462f, 21.8f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.0303f, 11.9624f)
        lineTo(16.5832f, 7.40948f)
        moveTo(19.7404f, 4.3445f)
        lineTo(19.1872f, 2.35736f)
        curveTo(19.0853f, 2.02999f, 18.6914f, 1.89953f, 18.4259f, 2.1165f)
        curveTo(16.9898f, 3.29006f, 15.4254f, 4.87079f, 16.703f, 7.36407f)
        curveTo(19.2771f, 8.56442f, 20.7466f, 6.94572f, 21.8733f, 5.58518f)
        curveTo(22.0975f, 5.31448f, 21.9623f, 4.90755f, 21.6247f, 4.80993f)
        lineTo(19.7404f, 4.3445f)
        }
        }.build()

        return _target02!!
    }

private var _target02: ImageVector? = null
