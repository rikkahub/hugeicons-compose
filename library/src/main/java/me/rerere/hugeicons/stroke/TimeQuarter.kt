package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TimeQuarter: ImageVector
    get() {
        if (_timeQuarter != null) {
            return _timeQuarter!!
        }
        _timeQuarter = ImageVector.Builder(
            name = "TimeQuarter",
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
        moveTo(2f, 15f)
        curveTo(2.14277f, 15.4274f, 2.31023f, 15.8431f, 2.50062f, 16.2452f)
        moveTo(4.12547f, 18.7463f)
        curveTo(4.44158f, 19.1137f, 4.781f, 19.4596f, 5.14137f, 19.7814f)
        moveTo(9f, 22f)
        curveTo(8.55224f, 21.8557f, 8.11701f, 21.6824f, 7.69641f, 21.4822f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 13.5f)
        curveTo(12.8284f, 13.5f, 13.5f, 12.8284f, 13.5f, 12f)
        curveTo(13.5f, 11.1716f, 12.8284f, 10.5f, 12f, 10.5f)
        curveTo(11.1716f, 10.5f, 10.5f, 11.1716f, 10.5f, 12f)
        moveTo(12f, 13.5f)
        curveTo(11.1716f, 13.5f, 10.5f, 12.8284f, 10.5f, 12f)
        moveTo(12f, 13.5f)
        verticalLineTo(16f)
        moveTo(10.5f, 12f)
        horizontalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
        curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
        }
        }.build()

        return _timeQuarter!!
    }

private var _timeQuarter: ImageVector? = null
