package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowRightDouble: ImageVector
    get() {
        if (_arrowRightDouble != null) {
            return _arrowRightDouble!!
        }
        _arrowRightDouble = ImageVector.Builder(
            name = "ArrowRightDouble",
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
        moveTo(12.5f, 18f)
        curveTo(12.5f, 18f, 18.5f, 13.5811f, 18.5f, 12f)
        curveTo(18.5f, 10.4188f, 12.5f, 6f, 12.5f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.50005f, 18f)
        curveTo(5.50005f, 18f, 11.5f, 13.5811f, 11.5f, 12f)
        curveTo(11.5f, 10.4188f, 5.5f, 6f, 5.5f, 6f)
        }
        }.build()

        return _arrowRightDouble!!
    }

private var _arrowRightDouble: ImageVector? = null
