package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TimeQuarter02: ImageVector
    get() {
        if (_timeQuarter02 != null) {
            return _timeQuarter02!!
        }
        _timeQuarter02 = ImageVector.Builder(
            name = "TimeQuarter02",
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
        moveTo(16f, 12f)
        horizontalLineTo(12f)
        lineTo(12f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 12f)
        curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.8475f, 4.17041f)
        curveTo(19.0217f, 4.3242f, 19.1911f, 4.48354f, 19.3555f, 4.648f)
        curveTo(19.5199f, 4.81246f, 19.6791f, 4.98203f, 19.8328f, 5.15629f)
        moveTo(15f, 2f)
        curveTo(15.4821f, 2.14255f, 15.9548f, 2.32634f, 16.4134f, 2.54664f)
        moveTo(21.4375f, 7.55457f)
        curveTo(21.6647f, 8.02313f, 21.8539f, 8.50663f, 22f, 9f)
        }
        }.build()

        return _timeQuarter02!!
    }

private var _timeQuarter02: ImageVector? = null
