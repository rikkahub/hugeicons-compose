package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Table01: ImageVector
    get() {
        if (_table01 != null) {
            return _table01!!
        }
        _table01 = ImageVector.Builder(
            name = "Table01",
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
        moveTo(20f, 10f)
        curveTo(20f, 10f, 22.375f, 11.8222f, 21.375f, 14.6667f)
        curveTo(20.375f, 17.5111f, 21.375f, 19.4074f, 22f, 20f)
        moveTo(20f, 10f)
        horizontalLineTo(4f)
        moveTo(20f, 10f)
        verticalLineTo(4f)
        moveTo(4f, 10f)
        curveTo(4f, 10f, 1.625f, 11.8222f, 2.625f, 14.6667f)
        curveTo(3.625f, 17.5111f, 2.625f, 19.4074f, 2f, 20f)
        moveTo(4f, 10f)
        verticalLineTo(4f)
        moveTo(22f, 4f)
        horizontalLineTo(20.75f)
        horizontalLineTo(20f)
        moveTo(2f, 4f)
        horizontalLineTo(3.25f)
        horizontalLineTo(4f)
        moveTo(4f, 4f)
        horizontalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 7f)
        horizontalLineTo(13f)
        }
        }.build()

        return _table01!!
    }

private var _table01: ImageVector? = null
