package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.MoreVerticalSquare02: ImageVector
    get() {
        if (_moreVerticalSquare02 != null) {
            return _moreVerticalSquare02!!
        }
        _moreVerticalSquare02 = ImageVector.Builder(
            name = "MoreVerticalSquare02",
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
        moveTo(11.992f, 12f)
        horizontalLineTo(12.001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9842f, 16f)
        horizontalLineTo(11.9932f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9998f, 8f)
        horizontalLineTo(12.0088f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.48438f, 12f)
        curveTo(2.48438f, 7.52166f, 2.48438f, 5.28249f, 3.87562f, 3.89124f)
        curveTo(5.26686f, 2.5f, 7.50603f, 2.5f, 11.9844f, 2.5f)
        curveTo(16.4627f, 2.5f, 18.7019f, 2.5f, 20.0931f, 3.89124f)
        curveTo(21.4844f, 5.28249f, 21.4844f, 7.52166f, 21.4844f, 12f)
        curveTo(21.4844f, 16.4783f, 21.4844f, 18.7175f, 20.0931f, 20.1088f)
        curveTo(18.7019f, 21.5f, 16.4627f, 21.5f, 11.9844f, 21.5f)
        curveTo(7.50603f, 21.5f, 5.26686f, 21.5f, 3.87562f, 20.1088f)
        curveTo(2.48438f, 18.7175f, 2.48438f, 16.4783f, 2.48438f, 12f)
        }
        }.build()

        return _moreVerticalSquare02!!
    }

private var _moreVerticalSquare02: ImageVector? = null
