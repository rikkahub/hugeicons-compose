package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Link02: ImageVector
    get() {
        if (_link02 != null) {
            return _link02!!
        }
        _link02 = ImageVector.Builder(
            name = "Link02",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(14.9961f, 17f)
            horizontalLineTo(16.9961f)
            curveTo(19.7575f, 17f, 21.9961f, 14.7614f, 21.9961f, 12f)
            curveTo(21.9961f, 9.23858f, 19.7575f, 7f, 16.9961f, 7f)
            horizontalLineTo(14.9961f)
            moveTo(8.99609f, 17f)
            horizontalLineTo(6.99609f)
            curveTo(4.23467f, 17f, 1.99609f, 14.7614f, 1.99609f, 12f)
            curveTo(1.99609f, 9.23858f, 4.23467f, 7f, 6.99609f, 7f)
            horizontalLineTo(8.99609f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(8.49609f, 12f)
            horizontalLineTo(15.4961f)
        }
        }.build()

        return _link02!!
    }

private var _link02: ImageVector? = null
