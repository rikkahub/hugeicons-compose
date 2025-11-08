package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowLeftDouble: ImageVector
    get() {
        if (_arrowLeftDouble != null) {
            return _arrowLeftDouble!!
        }
        _arrowLeftDouble = ImageVector.Builder(
            name = "ArrowLeftDouble",
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
        moveTo(11.5f, 18f)
        curveTo(11.5f, 18f, 5.50001f, 13.5811f, 5.5f, 12f)
        curveTo(5.49999f, 10.4188f, 11.5f, 6f, 11.5f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18.5f, 18f)
        curveTo(18.5f, 18f, 12.5f, 13.5811f, 12.5f, 12f)
        curveTo(12.5f, 10.4188f, 18.5f, 6f, 18.5f, 6f)
        }
        }.build()

        return _arrowLeftDouble!!
    }

private var _arrowLeftDouble: ImageVector? = null
