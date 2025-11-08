package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.TvIssue: ImageVector
    get() {
        if (_tvIssue != null) {
            return _tvIssue!!
        }
        _tvIssue = ImageVector.Builder(
            name = "TvIssue",
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
        moveTo(2f, 14f)
        curveTo(2f, 10.2288f, 2f, 8.34315f, 3.17157f, 7.17157f)
        curveTo(4.34315f, 6f, 6.22876f, 6f, 10f, 6f)
        horizontalLineTo(14f)
        curveTo(17.7712f, 6f, 19.6569f, 6f, 20.8284f, 7.17157f)
        curveTo(22f, 8.34315f, 22f, 10.2288f, 22f, 14f)
        curveTo(22f, 17.7712f, 22f, 19.6569f, 20.8284f, 20.8284f)
        curveTo(19.6569f, 22f, 17.7712f, 22f, 14f, 22f)
        horizontalLineTo(10f)
        curveTo(6.22876f, 22f, 4.34315f, 22f, 3.17157f, 20.8284f)
        curveTo(2f, 19.6569f, 2f, 17.7712f, 2f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9998f, 18f)
        horizontalLineTo(12.0088f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 15f)
        lineTo(12f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 3f)
        lineTo(12f, 6f)
        lineTo(16f, 2f)
        }
        }.build()

        return _tvIssue!!
    }

private var _tvIssue: ImageVector? = null
