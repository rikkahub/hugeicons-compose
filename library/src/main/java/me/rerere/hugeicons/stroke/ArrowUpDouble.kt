package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowUpDouble: ImageVector
    get() {
        if (_arrowUpDouble != null) {
            return _arrowUpDouble!!
        }
        _arrowUpDouble = ImageVector.Builder(
            name = "ArrowUpDouble",
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
        moveTo(18f, 11.5f)
        curveTo(18f, 11.5f, 13.5811f, 5.50001f, 12f, 5.5f)
        curveTo(10.4188f, 5.49999f, 6f, 11.5f, 6f, 11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 18.5f)
        curveTo(18f, 18.5f, 13.5811f, 12.5f, 12f, 12.5f)
        curveTo(10.4188f, 12.5f, 6f, 18.5f, 6f, 18.5f)
        }
        }.build()

        return _arrowUpDouble!!
    }

private var _arrowUpDouble: ImageVector? = null
