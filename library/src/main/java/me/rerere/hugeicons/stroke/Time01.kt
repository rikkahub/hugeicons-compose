package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Time01: ImageVector
    get() {
        if (_time01 != null) {
            return _time01!!
        }
        _time01 = ImageVector.Builder(
            name = "Time01",
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
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
        curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
        curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
        curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
        curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
        curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
        curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
        curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
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

        return _time01!!
    }

private var _time01: ImageVector? = null
