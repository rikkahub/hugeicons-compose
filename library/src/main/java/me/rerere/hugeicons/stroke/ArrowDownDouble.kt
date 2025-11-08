package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowDownDouble: ImageVector
    get() {
        if (_arrowDownDouble != null) {
            return _arrowDownDouble!!
        }
        _arrowDownDouble = ImageVector.Builder(
            name = "ArrowDownDouble",
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
        moveTo(17.9997f, 12.5f)
        curveTo(17.9997f, 12.5f, 13.5807f, 18.5f, 11.9996f, 18.5f)
        curveTo(10.4185f, 18.5f, 5.99966f, 12.5f, 5.99966f, 12.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.9997f, 5.50005f)
        curveTo(17.9997f, 5.50005f, 13.5807f, 11.5f, 11.9996f, 11.5f)
        curveTo(10.4185f, 11.5f, 5.99966f, 5.5f, 5.99966f, 5.5f)
        }
        }.build()

        return _arrowDownDouble!!
    }

private var _arrowDownDouble: ImageVector? = null
