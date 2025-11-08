package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Plant04: ImageVector
    get() {
        if (_plant04 != null) {
            return _plant04!!
        }
        _plant04 = ImageVector.Builder(
            name = "Plant04",
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
        moveTo(12f, 12f)
        verticalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 12f)
        verticalLineTo(13f)
        horizontalLineTo(15f)
        curveTo(18.3137f, 13f, 21f, 10.3137f, 21f, 7f)
        verticalLineTo(6f)
        horizontalLineTo(18f)
        curveTo(14.6863f, 6f, 12f, 8.68629f, 12f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 10f)
        verticalLineTo(11f)
        horizontalLineTo(9f)
        curveTo(5.68629f, 11f, 3f, 8.31371f, 3f, 5f)
        verticalLineTo(4f)
        horizontalLineTo(6f)
        curveTo(9.31371f, 4f, 12f, 6.68629f, 12f, 10f)
        }
        }.build()

        return _plant04!!
    }

private var _plant04: ImageVector? = null
