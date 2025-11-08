package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Time02: ImageVector
    get() {
        if (_time02 != null) {
            return _time02!!
        }
        _time02 = ImageVector.Builder(
            name = "Time02",
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
        moveTo(12f, 22f)
        curveTo(17.5228f, 22f, 22f, 17.5228f, 22f, 12f)
        curveTo(22f, 6.47715f, 17.5228f, 2f, 12f, 2f)
        curveTo(6.47715f, 2f, 2f, 6.47715f, 2f, 12f)
        curveTo(2f, 17.5228f, 6.47715f, 22f, 12f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.0078f, 10.5082f)
        curveTo(11.1794f, 10.5082f, 10.5078f, 11.1798f, 10.5078f, 12.0082f)
        curveTo(10.5078f, 12.8366f, 11.1794f, 13.5082f, 12.0078f, 13.5082f)
        curveTo(12.8362f, 13.5082f, 13.5078f, 12.8366f, 13.5078f, 12.0082f)
        curveTo(13.5078f, 11.1798f, 12.8362f, 10.5082f, 12.0078f, 10.5082f)
        moveTo(12.0078f, 10.5082f)
        verticalLineTo(6.99902f)
        moveTo(15.0147f, 15.0198f)
        lineTo(13.0661f, 13.0712f)
        }
        }.build()

        return _time02!!
    }

private var _time02: ImageVector? = null
